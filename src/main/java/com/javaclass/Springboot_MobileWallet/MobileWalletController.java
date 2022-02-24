package com.javaclass.Springboot_MobileWallet;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;












        @RestController
        @RequestMapping("/")
        public class MobileWalletController {

            @Autowired
            MobileWalletRepository mobileWalletRepository;


            @GetMapping("/accounts-details")
            public List<MobileWallet> getAllAccounts() {
                List<MobileWallet> allAccountlist = mobileWalletRepository.findAll();
                return allAccountlist;

            }


            @RequestMapping(value = "/account/{id}", method= RequestMethod.GET ,  produces = "application/json")
            public MobileWallet showProduct(@PathVariable Integer id, Model model){
                MobileWallet mobileWallet = mobileWalletRepository.getById(id);
                return mobileWallet;

            }
            @PostMapping("/create-account")
            public MobileWallet createAccount(@RequestBody MobileWallet account) {

                MobileWallet savedAccount = mobileWalletRepository.save(account);

                return savedAccount;

            }




            @ApiOperation(value = "Update a product")
            @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = "application/json")
            public ResponseEntity updateProduct(@PathVariable Integer id, @RequestBody MobileWallet accountDetails){
                MobileWallet account = mobileWalletRepository.findById(id).get();


                account.setFirstName(accountDetails.getFirstName());
                account.setLastName(accountDetails.getLastName());
                account.setPhoneNumber(accountDetails.getPhoneNumber());
                account.setEmailAddress(accountDetails.getEmailAddress());
                account.setBankVerificationNumber(accountDetails.getBankVerificationNumber());
                account.setDateOfBirth(accountDetails.getDateOfBirth());
                account.setSecretword(accountDetails.getSecretword());
                account.setId(accountDetails.getId());
                account.setAccountType(accountDetails.getAccountType());
                account.setAddress(accountDetails.getAddress());
                account.setGender(accountDetails.getGender());
                account.setReferralCode(accountDetails.getReferralCode());

                final MobileWallet updatedAccount = mobileWalletRepository.save(account);
                return ResponseEntity.ok(updatedAccount);
            }

            @ApiOperation(value = "Delete a product")
            @RequestMapping(value="/account/{id}", method = RequestMethod.DELETE, produces = "application/json")
            public ResponseEntity delete(@PathVariable Integer id) {
                MobileWallet account = mobileWalletRepository.findById(id).get();

                mobileWalletRepository.delete(account);
                Map<String, Boolean> response = new HashMap<>();
                response.put("deleted", Boolean.TRUE);
                return new ResponseEntity("Product deleted successfully", HttpStatus.OK);


            }

        }



