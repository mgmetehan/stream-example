package com.mgmetehan.streamexample;

import com.mgmetehan.streamexample.model.Animal;
import com.mgmetehan.streamexample.model.Gender;
import com.mgmetehan.streamexample.model.Habitat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class main {

    private List<Animal> getAnimals() {
        return Arrays.asList(
                new Animal("Lion", 5, Gender.MALE, Habitat.SAVANNAH, Arrays.asList("Meat")),
                new Animal("Elephant", 12, Gender.FEMALE, Habitat.FOREST, Arrays.asList("Vegetables", "Fruits")),
                new Animal("Giraffe", 11, Gender.MALE, Habitat.SAVANNAH, Arrays.asList("Leaves")),
                new Animal("Penguin", 3, Gender.FEMALE, Habitat.ICEBERG, Arrays.asList("Fish")),
                new Animal("Kangaroo", 6, Gender.MALE, Habitat.OUTBACK, Arrays.asList("Grass")),
                new Animal("Dolphin", 10, Gender.FEMALE, Habitat.OCEAN, Arrays.asList("Fish")),
                new Animal("Tiger", 4, Gender.MALE, Habitat.JUNGLE, Arrays.asList("Meat")),
                new Animal("Panda", 7, Gender.FEMALE, Habitat.MOUNTAIN, Arrays.asList("Bamboo")),
                new Animal("Cheetah", 8, Gender.FEMALE, Habitat.SAVANNAH, Arrays.asList("Meat")),
                new Animal("Gorilla", 9, Gender.MALE, Habitat.JUNGLE, Arrays.asList("Fruits")),
                new Animal("Owl", 2, Gender.FEMALE, Habitat.FOREST, Arrays.asList("Rodents"))
        );
    }

    private static void printStream(List<Animal> filteredAnimals) {
        filteredAnimals.forEach(animal -> System.out.println(animal.getName() + "-" +
                animal.getAge() + "-" + animal.getGender() + "-" + animal.getHabitat()));
    }

    public static void main(String[] args) {
        main main = new main();
        List<Animal> animals = main.getAnimals();

        // Print the filtered animals
        //printStream(main.filter(animals));
        //printStream(main.map(animals));
        //System.out.println(main.flatMap(animals));
        //main.distinct(animals);
        //main.sorted(animals);
        //main.peek(animals);
        //main.filter(animals);
        //main.limit(animals);
        //main.skip(animals);
        //main.takeWhile();
        //main.dropWhile();
        //main.count(animals);
        //main.forEach(animals);
        //main.toArray(animals);
        //main.min(animals);
        //main.max(animals);
        //main.anyMatch(animals);
        //main.allMatch(animals);
        //main.noneMatch(animals);
        //main.findFirst(animals);
        //main.findAny(animals);
        //main.reduce(animals);
        main.collect(animals);
    }

    private void filter(List<Animal> animals) {
        var collect = animals.stream()
                .filter(animal -> animal.getAge() > 5)
                .filter(animal -> animal.getHabitat().equals(Habitat.SAVANNAH))
                .collect(Collectors.toList());

        collect.forEach(animal -> System.out.println(animal.getName() + "-" +
                animal.getAge() + "-" + animal.getGender() + "-" + animal.getHabitat()));
    }

    private void map(List<Animal> animals) {
        var collect = animals.stream()
                .filter(animal -> animal.getHabitat().equals(Habitat.FOREST))
                .map(animal -> new Animal(animal.getName(), animal.getAge() * 10, animal.getGender(), animal.getHabitat(), animal.getFavoriteFoods()))
                .collect(Collectors.toList());

        collect.forEach(animal -> System.out.println(animal.getName() + "-" +
                animal.getAge() + "-" + animal.getGender() + "-" + animal.getHabitat()));
    }

    private void flatMap(List<Animal> animals) {
        var collect = animals.stream()
                .filter(animal -> animal.getGender().equals(Gender.MALE))
                .map(Animal::getFavoriteFoods)
                .flatMap(strings -> strings.stream())
                .collect(Collectors.joining(","));

        System.out.println(collect);
    }

    private void distinct(List<Animal> animals) {
        long originalListCount = animals.stream()
                .map(Animal::getHabitat)
                .count();
        System.out.println("Original List Count:" + originalListCount);

        var distinctListCount = animals.stream()
                .map(Animal::getHabitat)
                .distinct()
                .count();

        System.out.println("Distinct List:" + distinctListCount);
    }

    private void sorted(List<Animal> animals) {
        System.out.println("Original List:");
        animals.forEach(animal -> System.out.print("-" + (animal.getName() +
                animal.getAge())));

        var collect = animals.stream()
                .sorted(Comparator.comparing(Animal::getAge))
                //.sorted((a1, a2) -> a1.getAge() - a2.getAge())
                .collect(Collectors.toList());

        System.out.println("\nSorted List:");
        collect.forEach(animal -> System.out.print("-" + (animal.getName() +
                animal.getAge())));
    }

    private void peek(List<Animal> animals) {
        System.out.println("Original List:");
        animals.forEach(animal -> System.out.print(animal.getName() + "-"));

        var collect = animals.stream()
                .peek(animal -> animal.setName(animal.getName().toUpperCase()))
                //.peek(animal -> System.out.println(animal.getName()))
                .collect(Collectors.toList());

        System.out.println("\nPeeked List:");
        collect.forEach(animal -> System.out.print(animal.getName() + "-"));
    }

    private void limit(List<Animal> animals) {
        System.out.println("Original List:");
        animals.forEach(animal -> System.out.print(animal.getName() + "-"));

        var collect = animals.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("\nLimited List:");
        collect.forEach(animal -> System.out.print(animal.getName() + "-"));
    }

    private void skip(List<Animal> animals) {
        System.out.println("Original List:");
        animals.forEach(animal -> System.out.print(animal.getName() + "-"));

        var collect = animals.stream()
                .skip(3)
                .collect(Collectors.toList());

        System.out.println("\nSkipped List:");
        collect.forEach(animal -> System.out.print(animal.getName() + "-"));
    }

    private void takeWhile() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> result = numbers.stream()
                .takeWhile(n -> n < 5)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    private void dropWhile() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> result = numbers.stream()
                .dropWhile(n -> n < 5)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    private void count(List<Animal> animals) {
        long count = animals.stream()
                .count();

        System.out.println(count);
    }

    private void forEach(List<Animal> animals) {
        animals.stream()
                .forEach(animal -> System.out.print(animal.getName() + "-"));
    }

    private void toArray(List<Animal> animals) {
        Animal[] animalsArray = animals.stream()
                .filter(animal -> animal.getAge() > 10)
                .toArray(Animal[]::new);

        Arrays.stream(animalsArray)
                .forEach(animal -> System.out.print(animal.getName() + "-"));
    }

    private void min(List<Animal> animals) {
        var collect = animals.stream()
                .min(Comparator.comparing(Animal::getAge))
                .orElseThrow();

        System.out.println(collect.getName() + "-" + collect.getAge());
    }

    private void max(List<Animal> animals) {
        var collect = animals.stream()
                .max(Comparator.comparing(Animal::getAge))
                .orElseThrow();

        System.out.println(collect.getName() + "-" + collect.getAge());
    }

    private void anyMatch(List<Animal> animals) {
        boolean anyMatch = animals.stream()
                .anyMatch(animal -> animal.getAge() > 10);

        System.out.println(anyMatch);
    }

    private void allMatch(List<Animal> animals) {
        boolean allMatch = animals.stream()
                .allMatch(animal -> animal.getAge() > 10);

        System.out.println(allMatch);
    }

    private void noneMatch(List<Animal> animals) {
        boolean noneMatch = animals.stream()
                .noneMatch(animal -> animal.getAge() > 10);

        System.out.println(noneMatch);
    }

    private void findFirst(List<Animal> animals) {
        var collect = animals.stream()
                .findFirst()
                .orElseThrow();

        System.out.println(collect.getName() + "-" + collect.getAge());
    }

    private void findAny(List<Animal> animals) {
        var collect = animals.stream()
                .findAny()
                .orElseThrow();

        System.out.println(collect.getName() + "-" + collect.getAge());
    }

    private void reduce(List<Animal> animals) {
        var collect = animals.stream()
                .map(Animal::getAge)
                .reduce(0,(Integer::sum));

        System.out.println(collect);
    }

    private void collect(List<Animal> animals) {
        var collect = animals.stream()
                .map(Animal::getAge)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
