package weg.Funcionario.e.Endereco.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Rua" , nullable = false)
    private String Rua;

    @Column(name = "Numero_endereço" , nullable = false )
    private int numero;

    Funcionario funcionario;
}
