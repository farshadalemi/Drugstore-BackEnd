package ir.farshadalemi.DrugStore.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "supplement")
@Data
public class supplement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private float price;

    @Column(name = "in_stock")
    private int in_stock;

    @Column(name = "type")
    private String type;

    @Column(name = "delete_flag")
    private int delete_flag;

    @Column(name = "status")
    private int status;
}
