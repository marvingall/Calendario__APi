package CardapioApi.APi.domainModel;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "food", schema = "cardapio")
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @Column(name = "image_path")
    private String image_path;

    @NotNull
    private int price;

    private int quantidade_estoque;

    public Food(Long id, String title, String image_path, int price, int quantidade_estoque) {

        this.id = id;
        this.title = title;
        this.image_path = image_path;
        this.price = price;
        this.quantidade_estoque = quantidade_estoque;

    }

}
