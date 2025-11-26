package com.codesimcoe.tci;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "my_table")
public class MyEntity extends PanacheEntity {
}
