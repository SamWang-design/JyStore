package com.harry.jystore.entity;



import lombok.Data;

import javax.persistence.Column;
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

   @Column
   private String nickname;
   @Column
   private String email;
   @Column
   private String pswd;
   @Column
   private String createTime;
   @Column
   private String last_login_time;
   @Column
   private int status;
   @Column
   private String username;
   @Column
   private String gender;
   @Column
   private String address;
   @Column
   private String phone;

}
