package com.example.springsecurity.entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.web.service.annotation.GetExchange;

@Entity
@Table(name="tb_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleID;
    private String name;

    public Long getRoleID() {
        return roleID;
    }

    public void setRoleID(Long roleID) {
        this.roleID = roleID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public enum Values{
        BASIC(1L),
        ADMIN(2L);



        Values(Long roleId) {
           this.RoleId=roleId;
        }

        public Long getRoleId() {
            return RoleId;
        }

        Long RoleId;
    }
}
