package org.raoulscode;

import java.time.LocalDate;
import java.util.ArrayList;

public class LeaveRequest {
    private int requestId;
    private Employee employee;
    private         LocalDate startDate;
    private  LocalDate endDate;
    private String status;
    private String reason;

    public LeaveRequest(int requestId, Employee employee, LocalDate  startDate, LocalDate  endDate, String status, String reason) {
        this.requestId = requestId;
        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.reason = reason;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate  getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate  startDate) {
        this.startDate = startDate;
    }

    public LocalDate  getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate  endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
   public boolean processRequest(){
        System.out.println("Processing genereic leave request...");
        return true;
   }

    private ArrayList<StatusChange> statusHistory = new ArrayList<>();

    // Inner class to track status changes
    public class StatusChange {
        private String oldStatus;
        private String newStatus;
        private LocalDate changeDate;
        private String changedBy;

        public StatusChange(String oldStatus, String newStatus,
                            LocalDate changeDate, String changedBy) {
            this.oldStatus = oldStatus;
            this.newStatus = newStatus;
            this.changeDate = changeDate;
            this.changedBy = changedBy;
        }

        // Getters for the fields
        // ...
    }

    // Method to change status and record the change
    public void changeStatus(String newStatus, String changedBy) {
        String oldStatus = this.status;
        this.status = newStatus;


        // Create a new status change record
        StatusChange change = new StatusChange(
                oldStatus, newStatus, LocalDate.now(), changedBy);
        statusHistory.add(change);
    }

}