package com.ye.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String useran;
    private String username;
    private String userpwd;
    private String usermail;
    private String userbirthday;
    private String userage;
    private String usernumber;

}
