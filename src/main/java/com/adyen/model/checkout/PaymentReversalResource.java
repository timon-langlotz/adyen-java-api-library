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
 * PaymentReversalResource
 */
@JsonPropertyOrder({
  PaymentReversalResource.JSON_PROPERTY_MERCHANT_ACCOUNT,
  PaymentReversalResource.JSON_PROPERTY_PAYMENT_PSP_REFERENCE,
  PaymentReversalResource.JSON_PROPERTY_PSP_REFERENCE,
  PaymentReversalResource.JSON_PROPERTY_REFERENCE,
  PaymentReversalResource.JSON_PROPERTY_STATUS
})

public class PaymentReversalResource {
  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_PAYMENT_PSP_REFERENCE = "paymentPspReference";
  private String paymentPspReference;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  /**
   * The status of your request. This will always have the value **received**.
   */
  public enum StatusEnum {
    RECEIVED("received");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public PaymentReversalResource() { 
  }

  public PaymentReversalResource merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account that is used to process the payment.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account that is used to process the payment.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantAccount() {
    return merchantAccount;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public PaymentReversalResource paymentPspReference(String paymentPspReference) {
    this.paymentPspReference = paymentPspReference;
    return this;
  }

   /**
   * The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment to reverse. 
   * @return paymentPspReference
  **/
  @ApiModelProperty(required = true, value = "The [`pspReference`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment to reverse. ")
  @JsonProperty(JSON_PROPERTY_PAYMENT_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentPspReference() {
    return paymentPspReference;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentPspReference(String paymentPspReference) {
    this.paymentPspReference = paymentPspReference;
  }


  public PaymentReversalResource pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

   /**
   * Adyen&#39;s 16-character reference associated with the reversal request.
   * @return pspReference
  **/
  @ApiModelProperty(required = true, value = "Adyen's 16-character reference associated with the reversal request.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPspReference() {
    return pspReference;
  }


  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public PaymentReversalResource reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the reversal request.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the reversal request.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public PaymentReversalResource status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of your request. This will always have the value **received**.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of your request. This will always have the value **received**.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Return true if this PaymentReversalResource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentReversalResource paymentReversalResource = (PaymentReversalResource) o;
    return Objects.equals(this.merchantAccount, paymentReversalResource.merchantAccount) &&
        Objects.equals(this.paymentPspReference, paymentReversalResource.paymentPspReference) &&
        Objects.equals(this.pspReference, paymentReversalResource.pspReference) &&
        Objects.equals(this.reference, paymentReversalResource.reference) &&
        Objects.equals(this.status, paymentReversalResource.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantAccount, paymentPspReference, pspReference, reference, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentReversalResource {\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    paymentPspReference: ").append(toIndentedString(paymentPspReference)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
   * Create an instance of PaymentReversalResource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentReversalResource
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentReversalResource
   */
  public static PaymentReversalResource fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentReversalResource.class);
  }
/**
  * Convert an instance of PaymentReversalResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

