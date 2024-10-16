package CardapioApi.APi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FoodDTO {

    private Long id;
    private String title;
    private String image_path;
    private int price;
    private int quantidade_estoque;

}
