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
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_seq")
    @EqualsAndHashCode.Include
    private Long id;

    private String name;

    private Integer price;

    @ManyToMany( fetch = FetchType.LAZY, mappedBy = "products")
    private Set<Transaction> transactions;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}