package CardapioApi.APi.controller;

import CardapioApi.APi.domainModel.Food;
import CardapioApi.APi.dtos.FoodDTO;
import CardapioApi.APi.dtos.FoodRepository;
import CardapioApi.APi.mapper.FoodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @PostMapping
    public void saveFood(@RequestBody FoodDTO data) {

        Food dataFood = new Food();
        dataFood.setTitle(data.getTitle());
        dataFood.setImage_path(data.getImage_path());
        dataFood.setPrice(data.getPrice());
        dataFood.setQuantidade_estoque(data.getQuantidade_estoque());

        foodRepository.save(dataFood);
    }

    @GetMapping
    public List<FoodDTO> getAllFood(){

        List<Food> foodList = foodRepository.findAll();

        return foodList.stream().map(FoodMapper::toDTO).collect(Collectors.toList());
    }

}
