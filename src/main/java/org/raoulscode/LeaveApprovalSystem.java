package org.raoulscode;

import java.util.LinkedList;
import java.util.Queue;

public class LeaveApprovalSystem {
    private Queue<LeaveRequest> pendingRequests = new LinkedList<>();

    public void addPendindRequest(LeaveRequest request){
   pendingRequests.add(request);
    }
    public LeaveRequest getNextPendingRequest(){
        return pendingRequests.poll();
    }

    public int getPendingRequestCount(){
        return pendingRequests.size();
    }
    public boolean hasPendingRequests(){
        return !pendingRequests.isEmpty();
    }
}