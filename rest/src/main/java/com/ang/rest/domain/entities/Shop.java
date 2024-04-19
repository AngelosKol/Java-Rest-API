package com.ang.rest.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "shops")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shop_id_seq")
    @EqualsAndHashCode.Include
    private Long id;

    private String name;


    @OneToMany(mappedBy = "shop")
    private Set<Transaction> transactions;

}
