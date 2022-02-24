package com.javaclass.Springboot_MobileWallet;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "mobilewallet")
public class MobileWallet implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id

    private long id;

    @Column(name = "emailAddress")
    private String emailAddress;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "dateOfBirth")
    private String dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "secretword")
    private String secretword;

    @Column(name = "address")
    private String address;

    @Column(name = "bankVerificationNumber")
    private String bankVerificationNumber;

    @Column(name = "referralCode")
    private String referralCode;

    @Column(name = "accountType")
    private String accountType;

    public MobileWallet() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSecretword() {
        return secretword;
    }

    public void setSecretword(String secretword) {
        this.secretword = secretword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankVerificationNumber() {
        return bankVerificationNumber;
    }

    public void setBankVerificationNumber(String bankVerificationNumber) {
        this.bankVerificationNumber = bankVerificationNumber;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public MobileWallet(long id, String emailAddress, String firstName, String lastName, String phoneNumber, String dateOfBirth, String gender, String secretword, String address, String bankVerificationNumber, String referralCode, String accountType) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.secretword = secretword;
        this.address = address;
        this.bankVerificationNumber = bankVerificationNumber;
        this.referralCode = referralCode;
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "mobilewallet{" +
                "id=" + id +
                ", emailAddress='" + emailAddress + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", secretword='" + secretword + '\'' +
                ", address='" + address + '\'' +
                ", bankVerificationNumber='" + bankVerificationNumber + '\'' +
                ", referralCode='" + referralCode + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}