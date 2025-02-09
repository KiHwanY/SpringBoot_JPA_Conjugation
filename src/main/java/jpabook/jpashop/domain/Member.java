package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;
    @Embedded // 내장 타입
    private Address address;
    @OneToMany(mappedBy = "member") // 연관관계 주인 설정 -> FK
    private List<Order> orders = new ArrayList<>();


}
