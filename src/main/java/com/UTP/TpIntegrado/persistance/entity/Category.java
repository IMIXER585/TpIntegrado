package com.UTP.TpIntegrado.persistance.entity;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String prioritylevel;
    private String category;
    private String description;
    private LocalDateTime registeredDate;

    /*
    @OneToMany(mappedBy = "category")
    @ToString.Exclude
    @JsonIgnore
    private List<Incident> incident;

     */
}