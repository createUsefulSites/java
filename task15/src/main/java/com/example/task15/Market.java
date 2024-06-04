package com.example.Task15;
import jakarta.persistence.*;


@Entity
@Table(name = "markets")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")

    private String name;
    @Column(name = "address")

    private String address;

    // Конструктор без параметров (необходим для JPA)
    public Market() {
    }

    // Конструктор с параметрами
    public Market(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Геттер для id
    public Long getId() {
        return id;
    }

    // Сеттер для id (обычно не используется, так как id генерируется автоматически)
    public void setId(Long id) {
        this.id = id;
    }

    // Геттер для name
    public String getName() {
        return name;
    }

    // Сеттер для name
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для address
    public String getAddress() {
        return address;
    }

    // Сеттер для address
    public void setAddress(String address) {
        this.address = address;
    }
}

