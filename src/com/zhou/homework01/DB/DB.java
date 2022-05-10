package com.zhou.homework01.DB;

import com.zhou.homework01.User.Admin;
import com.zhou.homework01.User.Emp;

public class DB {
    public static Emp[] emps = new Emp[4];

    static {
        emps[0] = new Emp("张三", "1001", "1001", "finger_1001", "face_1001");
        emps[1] = new Emp("张三", "1002", "1002", "finger_1002", "face_1002");
        emps[2] = new Emp("张三", "1003", "1003", "finger_1003", "face_1003");
        emps[3] = new Admin("admin", "999", "admin", "finger_admin", "face_admin");
    }
}
