package com.javaclass.Springboot_MobileWallet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface MobileWalletRepository extends JpaRepository<MobileWallet, Integer> {

    }


