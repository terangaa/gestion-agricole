package sn.agriculture.gestion_agricole.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Culture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private LocalDate dateDebut;

    @ManyToOne
    @JoinColumn(name = "parcelle_id")
    @JsonBackReference
    private Parcelle parcelle;

    @OneToMany(mappedBy = "culture")
    private List<SuiviCulture> suivis;
}

