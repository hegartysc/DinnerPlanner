package org.example;


import org.example.Elements.Recipe;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    static ArrayList<Recipe> recipes = new ArrayList<>();
    static File[] files;

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello and welcome!");

        readFiles();

        int randomNumb = randomNumber();

        Recipe recipe = pickRecipe(randomNumb);

        System.out.println("Todays Recipe: ");
        System.out.println(recipe.getName());
        System.out.println("Ingredients Needed: ");
        System.out.println(recipe.getIngredients());
    }

    private static void readFiles() throws FileNotFoundException {
        File directory = new File("src/main/java/org/example/CookBook-Recipes-YML");
        files = directory.listFiles((pathname) -> pathname.getName().endsWith(".yml"));

        assert files != null;
        for (File file : files) {
            InputStream inputStream = new FileInputStream(file);
            Yaml yaml = new Yaml(new Constructor(Recipe.class, new LoaderOptions()));
            recipes.add(yaml.load(inputStream));
        }
    }

    private static int randomNumber() {
        return  new Random().nextInt(files.length);
    }

    private static Recipe pickRecipe(int randomNumb) {
        return recipes.get(randomNumb);
    }

    private void MapTags() {

    }

    private void MapNutritionalInfo() {

    }

    private void MapIngredients() {

    }

    private void MapDirections() {

    }
}
