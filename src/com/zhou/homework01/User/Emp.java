package com.zhou.homework01.User;

public class Emp extends Guest {
    public static final int TYPE_EMP=1;
    public static final int TYPE_ADM=2;
    private String empID;
    private String pwd;
    private String fingerInfo;
    private String faceInfo;
    private int empType=TYPE_EMP;



    public Emp(String name, String empID, String pwd, String fingerInfo, String faceInfo) {
        super(name);
        this.empID = empID;
        this.pwd = pwd;
        this.fingerInfo = fingerInfo;
        this.faceInfo = faceInfo;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getFingerInfo() {
        return fingerInfo;
    }

    public void setFingerInfo(String fingerInfo) {
        this.fingerInfo = fingerInfo;
    }

    public String getFaceInfo() {
        return faceInfo;
    }

    public void setFaceInfo(String faceInfo) {
        this.faceInfo = faceInfo;
    }

    public int getEmpType() {
        return empType;
    }

    public void setEmpType(int empType) {
        this.empType = empType;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empID='" + empID + '\'' +
                ", pwd='" + pwd + '\'' +
                ", fingerInfo='" + fingerInfo + '\'' +
                ", faceInfo='" + faceInfo + '\'' +
                ", empType=" + empType +
                '}';
    }
}
