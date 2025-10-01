package com.mehedi.blooddonation.modules.inventory.model;

import com.mehedi.blooddonation.modules.bloodbank.model.BloodBank;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "blood_inventory", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"bank_id", "blood_type"})
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BloodInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id")
    private Long inventoryId;

    @ManyToOne
    @JoinColumn(name = "bank_id", nullable = false)
    private BloodBank bloodBank;

    @Column(name = "blood_type", nullable = false, length = 5)
    private String bloodType;

    @Column(name = "units")
    private Integer units = 0;
}
