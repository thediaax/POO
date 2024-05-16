import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Pessoa {

    private int codigo;
    private String nome;
    private String fone;
    private String email;
    private int idade;

    
}
