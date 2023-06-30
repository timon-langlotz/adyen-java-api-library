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
import com.adyen.model.checkout.BankAccount;
import com.adyen.model.checkout.Card;
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
 * StoredDetails
 */
@JsonPropertyOrder({
  StoredDetails.JSON_PROPERTY_BANK,
  StoredDetails.JSON_PROPERTY_CARD,
  StoredDetails.JSON_PROPERTY_EMAIL_ADDRESS
})

public class StoredDetails {
  public static final String JSON_PROPERTY_BANK = "bank";
  private BankAccount bank;

  public static final String JSON_PROPERTY_CARD = "card";
  private Card card;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "emailAddress";
  private String emailAddress;

  public StoredDetails() { 
  }

  public StoredDetails bank(BankAccount bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BankAccount getBank() {
    return bank;
  }


  @JsonProperty(JSON_PROPERTY_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBank(BankAccount bank) {
    this.bank = bank;
  }


  public StoredDetails card(Card card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Card getCard() {
    return card;
  }


  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCard(Card card) {
    this.card = card;
  }


  public StoredDetails emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email associated with stored payment details.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The email associated with stored payment details.")
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  /**
   * Return true if this StoredDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredDetails storedDetails = (StoredDetails) o;
    return Objects.equals(this.bank, storedDetails.bank) &&
        Objects.equals(this.card, storedDetails.card) &&
        Objects.equals(this.emailAddress, storedDetails.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bank, card, emailAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredDetails {\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
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
   * Create an instance of StoredDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StoredDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to StoredDetails
   */
  public static StoredDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, StoredDetails.class);
  }
/**
  * Convert an instance of StoredDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

