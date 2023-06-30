/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * BankAccount
 */
@JsonPropertyOrder({
  BankAccount.JSON_PROPERTY_BANK_ACCOUNT_NUMBER,
  BankAccount.JSON_PROPERTY_BANK_CITY,
  BankAccount.JSON_PROPERTY_BANK_LOCATION_ID,
  BankAccount.JSON_PROPERTY_BANK_NAME,
  BankAccount.JSON_PROPERTY_BIC,
  BankAccount.JSON_PROPERTY_COUNTRY_CODE,
  BankAccount.JSON_PROPERTY_IBAN,
  BankAccount.JSON_PROPERTY_OWNER_NAME,
  BankAccount.JSON_PROPERTY_TAX_ID
})

public class BankAccount {
  public static final String JSON_PROPERTY_BANK_ACCOUNT_NUMBER = "bankAccountNumber";
  private String bankAccountNumber;

  public static final String JSON_PROPERTY_BANK_CITY = "bankCity";
  private String bankCity;

  public static final String JSON_PROPERTY_BANK_LOCATION_ID = "bankLocationId";
  private String bankLocationId;

  public static final String JSON_PROPERTY_BANK_NAME = "bankName";
  private String bankName;

  public static final String JSON_PROPERTY_BIC = "bic";
  private String bic;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_IBAN = "iban";
  private String iban;

  public static final String JSON_PROPERTY_OWNER_NAME = "ownerName";
  private String ownerName;

  public static final String JSON_PROPERTY_TAX_ID = "taxId";
  private String taxId;

  public BankAccount() { 
  }

  public BankAccount bankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

   /**
   * The bank account number (without separators).
   * @return bankAccountNumber
  **/
  @ApiModelProperty(value = "The bank account number (without separators).")
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankAccountNumber() {
    return bankAccountNumber;
  }


  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }


  public BankAccount bankCity(String bankCity) {
    this.bankCity = bankCity;
    return this;
  }

   /**
   * The bank city.
   * @return bankCity
  **/
  @ApiModelProperty(value = "The bank city.")
  @JsonProperty(JSON_PROPERTY_BANK_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankCity() {
    return bankCity;
  }


  @JsonProperty(JSON_PROPERTY_BANK_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankCity(String bankCity) {
    this.bankCity = bankCity;
  }


  public BankAccount bankLocationId(String bankLocationId) {
    this.bankLocationId = bankLocationId;
    return this;
  }

   /**
   * The location id of the bank. The field value is &#x60;nil&#x60; in most cases.
   * @return bankLocationId
  **/
  @ApiModelProperty(value = "The location id of the bank. The field value is `nil` in most cases.")
  @JsonProperty(JSON_PROPERTY_BANK_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankLocationId() {
    return bankLocationId;
  }


  @JsonProperty(JSON_PROPERTY_BANK_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankLocationId(String bankLocationId) {
    this.bankLocationId = bankLocationId;
  }


  public BankAccount bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * The name of the bank.
   * @return bankName
  **/
  @ApiModelProperty(value = "The name of the bank.")
  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankName() {
    return bankName;
  }


  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public BankAccount bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * The [Business Identifier Code](https://en.wikipedia.org/wiki/ISO_9362) (BIC) is the SWIFT address assigned to a bank. The field value is &#x60;nil&#x60; in most cases.
   * @return bic
  **/
  @ApiModelProperty(value = "The [Business Identifier Code](https://en.wikipedia.org/wiki/ISO_9362) (BIC) is the SWIFT address assigned to a bank. The field value is `nil` in most cases.")
  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBic() {
    return bic;
  }


  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBic(String bic) {
    this.bic = bic;
  }


  public BankAccount countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country code where the bank is located.  A valid value is an ISO two-character country code (e.g. &#39;NL&#39;).
   * @return countryCode
  **/
  @ApiModelProperty(value = "Country code where the bank is located.  A valid value is an ISO two-character country code (e.g. 'NL').")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public BankAccount iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * The [International Bank Account Number](https://en.wikipedia.org/wiki/International_Bank_Account_Number) (IBAN).
   * @return iban
  **/
  @ApiModelProperty(value = "The [International Bank Account Number](https://en.wikipedia.org/wiki/International_Bank_Account_Number) (IBAN).")
  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIban() {
    return iban;
  }


  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIban(String iban) {
    this.iban = iban;
  }


  public BankAccount ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * The name of the bank account holder. If you submit a name with non-Latin characters, we automatically replace some of them with corresponding Latin characters to meet the FATF recommendations. For example: * χ12 is converted to ch12. * üA is converted to euA. * Peter Møller is converted to Peter Mller, because banks don&#39;t accept &#39;ø&#39;. After replacement, the ownerName must have at least three alphanumeric characters (A-Z, a-z, 0-9), and at least one of them must be a valid Latin character (A-Z, a-z). For example: * John17 - allowed. * J17 - allowed. * 171 - not allowed. * John-7 - allowed. &gt; If provided details don&#39;t match the required format, the response returns the error message: 203 &#39;Invalid bank account holder name&#39;.
   * @return ownerName
  **/
  @ApiModelProperty(value = "The name of the bank account holder. If you submit a name with non-Latin characters, we automatically replace some of them with corresponding Latin characters to meet the FATF recommendations. For example: * χ12 is converted to ch12. * üA is converted to euA. * Peter Møller is converted to Peter Mller, because banks don't accept 'ø'. After replacement, the ownerName must have at least three alphanumeric characters (A-Z, a-z, 0-9), and at least one of them must be a valid Latin character (A-Z, a-z). For example: * John17 - allowed. * J17 - allowed. * 171 - not allowed. * John-7 - allowed. > If provided details don't match the required format, the response returns the error message: 203 'Invalid bank account holder name'.")
  @JsonProperty(JSON_PROPERTY_OWNER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwnerName() {
    return ownerName;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  public BankAccount taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

   /**
   * The bank account holder&#39;s tax ID.
   * @return taxId
  **/
  @ApiModelProperty(value = "The bank account holder's tax ID.")
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxId() {
    return taxId;
  }


  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  /**
   * Return true if this BankAccount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccount bankAccount = (BankAccount) o;
    return Objects.equals(this.bankAccountNumber, bankAccount.bankAccountNumber) &&
        Objects.equals(this.bankCity, bankAccount.bankCity) &&
        Objects.equals(this.bankLocationId, bankAccount.bankLocationId) &&
        Objects.equals(this.bankName, bankAccount.bankName) &&
        Objects.equals(this.bic, bankAccount.bic) &&
        Objects.equals(this.countryCode, bankAccount.countryCode) &&
        Objects.equals(this.iban, bankAccount.iban) &&
        Objects.equals(this.ownerName, bankAccount.ownerName) &&
        Objects.equals(this.taxId, bankAccount.taxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountNumber, bankCity, bankLocationId, bankName, bic, countryCode, iban, ownerName, taxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccount {\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    bankCity: ").append(toIndentedString(bankCity)).append("\n");
    sb.append("    bankLocationId: ").append(toIndentedString(bankLocationId)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

/**
   * Create an instance of BankAccount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BankAccount
   * @throws JsonProcessingException if the JSON string is invalid with respect to BankAccount
   */
  public static BankAccount fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BankAccount.class);
  }
/**
  * Convert an instance of BankAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

