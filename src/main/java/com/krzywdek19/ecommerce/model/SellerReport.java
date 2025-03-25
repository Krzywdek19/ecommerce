package com.krzywdek19.ecommerce.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class SellerReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Seller seller;
    private Long totalEarnings = 0L;
    private Long totalSales = 0L;
    private Long totalRefunds = 0L;
    private Long totalTaxes = 0L;
    private Long netEarnings = 0L;
    private Long totalOrders = 0L;
    private Long canceledOrders = 0L;
    private Long totalTransactions = 0L;
}
