package ve.com.thisisalexis.kitchener.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import ve.com.thisisalexis.kitchener.repository.RecipeReposotory;

@Service
public class RecipeServiceImpl implements RecipeService {
	
	@Autowired
	private RecipeReposotory recipeRepository;

	public RecipeServiceImpl() {
		super();
	}
	
}
