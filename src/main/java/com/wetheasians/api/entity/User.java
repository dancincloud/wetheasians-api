package com.wetheasians.api.entity;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * Client user class
 *
 * @author Joseph Yuanhao Li
 * @date 8/18/21 12:48 AM
 */

@Slf4j
@Builder
@Entity
@Data
//@EntityListeners(AuditingEntityListener.class)
@Table(name = "wta_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //columnDefinition = "varchar(50) NOT NULL"
    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password",  nullable = false)
    private String password;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "locked", columnDefinition = "boolean default false")
    private Boolean locked;

    @CreatedDate
    @Column(name = "createAt")
    private Date createAt;

    @LastModifiedDate
    @Column(name = "updateAt")
    private Date updateAt;

//    public User(){}
//
//    public User(String email, String password) {
//        this.email = email;
//        this.password = password;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getNickname() {
//        return nickname;
//    }
//
//    public void setNickname(String nickname) {
//        this.nickname = nickname;
//    }
//
//    public Boolean getLocked() {
//        return locked;
//    }
//
//    public void setLocked(Boolean locked) {
//        this.locked = locked;
//    }
//
//    public Date getCreateAt() {
//        return createAt;
//    }
//
//    public void setCreateAt(Date createAt) {
//        this.createAt = createAt;
//    }
//
//    public Date getUpdateAt() {
//        return updateAt;
//    }
//
//    public void setUpdateAt(Date updateAt) {
//        this.updateAt = updateAt;
//    }
}
