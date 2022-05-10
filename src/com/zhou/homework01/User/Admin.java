package com.zhou.homework01.User;

public class Admin extends Emp {

    public Admin(String name, String empID, String pwd, String fingerInfo, String faceInfo) {
        super(name, empID, pwd, fingerInfo, faceInfo);
        setEmpType(Emp.TYPE_ADM);

    }
}
