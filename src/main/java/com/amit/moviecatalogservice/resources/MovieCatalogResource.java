package com.amit.moviecatalogservice.resources;

import java.util.Collections;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.amit.moviecatalogservice.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
  
  @RequestMapping("/{userId}")
  public List<CatalogItem> getcatalog(@PathVariable("userId") String userId){
    
    return Collections.singletonList(
        new CatalogItem("Transformers", "test", 4)
    );
  }

}
