package org.raoulscode;

import java.util.*;

public class LeaveTrackingSystem {

    private HashMap<Integer,Employee> employeeBYID = new HashMap<>();
    private HashMap<Integer, LeaveRequest> requestById = new HashMap<>();

    private ArrayList<LeaveRequest> allLeaveRequests = new ArrayList<>();

    private HashSet<String> leaveTypes = new HashSet<>();

    private Queue<LeaveRequest> pendingApprovals = new LinkedList<>();

 private HashSet<String> departmentswithpendingrequests = new HashSet<>();

 private HashMap<Integer, Employee> employeeDirectory = new HashMap<>();

 public void addEmployee(Employee employee){
     employeeDirectory.put(employee.getEmployeeeId(), employee);
 }
public boolean removeEmployee(int employeeId){
     if(employeeDirectory.containsKey(employeeId)){
         employeeDirectory.remove(employeeId);
         return true;
     }
     return  false;
}
 public  void updateDepartmentsWithPendingRequests(){
     departmentswithpendingrequests.clear();

     for(LeaveRequest request : allLeaveRequests){
         if(request.getStatus().equals("pending")){
             departmentswithpendingrequests.add(request.getEmployee().getDepartment());
         }
     }
 }
 public boolean haspendingRequest(String department){
     return departmentswithpendingrequests.contains(department);
 }


}