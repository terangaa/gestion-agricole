package sn.agriculture.gestion_agricole.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Parcelle {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private double superficie;

 @ManyToOne
 @JoinColumn(name = "agriculteur_id")
 @JsonBackReference
    private Agriculteur agriculteur;

 @OneToMany(mappedBy = "parcelle", cascade = CascadeType.ALL)
 @JsonManagedReference
    private List<Culture> cultures;
}
