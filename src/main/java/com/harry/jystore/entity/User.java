package com.harry.jystore.entity;



import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Data
@Table(name = "u_user")
@Entity
public class User {
   @Id
   private Integer id;

   private String nickname;
   private String email;
   private String pswd;
   private String createTime;
   private String last_login_time;
   private int status;
   private String username;
   private String gender;
   private String address;
   private String phone;

}
