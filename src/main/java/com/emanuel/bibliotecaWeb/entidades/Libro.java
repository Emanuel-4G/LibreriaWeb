
package com.emanuel.bibliotecaWeb.entidades;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
@Data
@Entity
@Table(name="libros")
public class Libro implements Serializable {
    private String id;
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private Long ibn;
    @NotEmpty
    private String titulo;
    private Integer anio;
    @NotEmpty
    private Integer ejemplares;
    private Integer ejemplaresPrestados;
    private Integer ejemplaresRestantes;
    private Boolean alta;
    @NotEmpty
    @OneToMany
    private Autor autor;
    @OneToMany
    @NotEmpty
    private Editorial editorial;
    
}
