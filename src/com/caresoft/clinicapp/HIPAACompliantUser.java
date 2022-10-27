package com.caresoft.clinicapp;

public interface HIPAACompliantUser {
    abstract boolean assignPin(Integer pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
}

