package com.krzywdek19.ecommerce.model;

import com.krzywdek19.ecommerce.domain.AccountStatus;
import com.krzywdek19.ecommerce.domain.USER_ROLE;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sellerName;
    private String mobile;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    @Embedded
    private BusinessDetails businessDetails = new BusinessDetails();
    @Embedded
    private BankDetails bankDetails = new BankDetails();
    @OneToOne(cascade = CascadeType.ALL)
    private Address pickupAddress = new Address();
    private String GSTIN;
    private USER_ROLE role;
    private boolean isEmailVerified = false;
    private AccountStatus accountStatus = AccountStatus.PENDING_VERIFICATION;
}
