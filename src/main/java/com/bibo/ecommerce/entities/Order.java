package com.bibo.ecommerce.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name="tb_orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private String deliveryAddress;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Email(message = "Invalid Email")
    private String customerEmail;

    private BigDecimal totalAmount;

    public enum Status{
        PENDING,
        PREPARATION,
        DELIVERY,
        DELIVERED;

    }
}


