package in.tpk.streamsscenarios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class City {
	String name;
	int population;

	public City(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	@Override
	public String toString() {
		return name + "(" + population + ")";
	} 
}

public class StreamsOnCityData {

	public static void main(String[] args) {
List<City> cityList = Arrays.asList(new City("Delhi",12000),new City("Mumbai", 800000),
        new City("Bangalore", 450000),
        new City("Hyderabad", 1200000),
        new City("Chennai", 60000));
//1. City with the second highest population

City citywith2ndHighestPopulation = cityList.stream()
.sorted(Comparator.comparingInt(City::getPopulation).reversed())
.skip(1)
.findFirst()
.orElse(null);

System.out.println(citywith2ndHighestPopulation);

//2. Group by first character of name, then max population in each group

Map<Character,City> maxByInitial = cityList.stream()
.collect(Collectors.groupingBy(
		s->s.getName().charAt(0),
		Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(City::getPopulation)),
				Optional::get)));

System.out.println(maxByInitial);

//3. Average population of top 3 most populated cities

Double top3AveragePopulation = cityList.stream().sorted(Comparator.comparingInt(City::getPopulation).reversed()).limit(3)
.collect(Collectors.averagingInt(City::getPopulation));
System.out.println(top3AveragePopulation);

//4. Map of population range -> city names

Map<String, List<String>> byRange = cityList.stream().collect(Collectors.groupingBy(c->{
	int p=c.getPopulation();
	if(p<=100000)
		return "0-100k";
	else if (p<=500000)
		return "100k-500k";
	else if (p<=1000000)
		return "500k-1M";
	else 
		return "1M+";
},
		Collectors.mapping(City::getName, Collectors.toList())
));
System.out.println(byRange);

//5. Using reduce: String of cities ordered by population
// Expected output: Hyderabad(1200000) > Mumbai(800000) > Bangalore(450000) > Chennai(60000) > Delhi(12000)

String populatioChain = cityList.stream().sorted(Comparator.comparingInt(City::getPopulation).reversed()).map(c->c.getName()+"("+c.getPopulation()+")").
reduce((a,b)->a+">"+b).orElse("");
System.out.println(populatioChain);

 }

}
