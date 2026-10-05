package org.raoulscode;

public interface Approvable {
    Boolean approve(String approverName);
    boolean deny(String approveName,String reason);
}