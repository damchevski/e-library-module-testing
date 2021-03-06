package Testing;

import java.util.Random;

public class Country {

    private Long id;

    private String name;

    private String continent;

    public Country(){}

    public Country(String name, String continent){
        this.id = new Random().nextLong();
        this.name = name;
        this.continent = continent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
