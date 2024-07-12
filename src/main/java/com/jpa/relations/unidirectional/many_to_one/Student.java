package com.jpa.relations.unidirectional.many_to_one;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "uni_student_many_to_one")
@Table(name = "uni_student_many_to_one")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Muchos estudiantes en una escuela
    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

}
