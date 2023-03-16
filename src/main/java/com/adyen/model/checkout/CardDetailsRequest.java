/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.checkout.JSON;

/**
 * CardDetailsRequest
 */

public class CardDetailsRequest {
  public static final String SERIALIZED_NAME_CARD_NUMBER = "cardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_ENCRYPTED_CARD_NUMBER = "encryptedCardNumber";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_CARD_NUMBER)
  private String encryptedCardNumber;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_SUPPORTED_BRANDS = "supportedBrands";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_BRANDS)
  private List<String> supportedBrands = null;

  public CardDetailsRequest() { 
  }

  public CardDetailsRequest cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * A minimum of the first 8 digits of the card number and a maximum of the full card number. 11 digits gives the best result.   You must be [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide) to collect raw card data.
   * @return cardNumber
  **/
  @ApiModelProperty(required = true, value = "A minimum of the first 8 digits of the card number and a maximum of the full card number. 11 digits gives the best result.   You must be [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide) to collect raw card data.")

  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public CardDetailsRequest countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The shopper country.  Format: [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) Example: NL or DE
   * @return countryCode
  **/
  @ApiModelProperty(value = "The shopper country.  Format: [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) Example: NL or DE")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public CardDetailsRequest encryptedCardNumber(String encryptedCardNumber) {
    
    this.encryptedCardNumber = encryptedCardNumber;
    return this;
  }

   /**
   * The encrypted card number.
   * @return encryptedCardNumber
  **/
  @ApiModelProperty(value = "The encrypted card number.")

  public String getEncryptedCardNumber() {
    return encryptedCardNumber;
  }


  public void setEncryptedCardNumber(String encryptedCardNumber) {
    this.encryptedCardNumber = encryptedCardNumber;
  }


  public CardDetailsRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account identifier, with which you want to process the transaction.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account identifier, with which you want to process the transaction.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public CardDetailsRequest supportedBrands(List<String> supportedBrands) {
    
    this.supportedBrands = supportedBrands;
    return this;
  }

  public CardDetailsRequest addSupportedBrandsItem(String supportedBrandsItem) {
    if (this.supportedBrands == null) {
      this.supportedBrands = new ArrayList<>();
    }
    this.supportedBrands.add(supportedBrandsItem);
    return this;
  }

   /**
   * The card brands you support. This is the [&#x60;brands&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods__resParam_paymentMethods-brands) array from your [&#x60;/paymentMethods&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response.   If not included, our API uses the ones configured for your merchant account and, if provided, the country code.
   * @return supportedBrands
  **/
  @ApiModelProperty(value = "The card brands you support. This is the [`brands`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods__resParam_paymentMethods-brands) array from your [`/paymentMethods`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response.   If not included, our API uses the ones configured for your merchant account and, if provided, the country code.")

  public List<String> getSupportedBrands() {
    return supportedBrands;
  }


  public void setSupportedBrands(List<String> supportedBrands) {
    this.supportedBrands = supportedBrands;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardDetailsRequest cardDetailsRequest = (CardDetailsRequest) o;
    return Objects.equals(this.cardNumber, cardDetailsRequest.cardNumber) &&
        Objects.equals(this.countryCode, cardDetailsRequest.countryCode) &&
        Objects.equals(this.encryptedCardNumber, cardDetailsRequest.encryptedCardNumber) &&
        Objects.equals(this.merchantAccount, cardDetailsRequest.merchantAccount) &&
        Objects.equals(this.supportedBrands, cardDetailsRequest.supportedBrands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, countryCode, encryptedCardNumber, merchantAccount, supportedBrands);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardDetailsRequest {\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    encryptedCardNumber: ").append(toIndentedString(encryptedCardNumber)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    supportedBrands: ").append(toIndentedString(supportedBrands)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("cardNumber");
    openapiFields.add("countryCode");
    openapiFields.add("encryptedCardNumber");
    openapiFields.add("merchantAccount");
    openapiFields.add("supportedBrands");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cardNumber");
    openapiRequiredFields.add("merchantAccount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CardDetailsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CardDetailsRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardDetailsRequest is not found in the empty JSON string", CardDetailsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CardDetailsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CardDetailsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CardDetailsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field cardNumber
      if (jsonObj.get("cardNumber") != null && !jsonObj.get("cardNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardNumber").toString()));
      }
      // validate the optional field countryCode
      if (jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      // validate the optional field encryptedCardNumber
      if (jsonObj.get("encryptedCardNumber") != null && !jsonObj.get("encryptedCardNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encryptedCardNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encryptedCardNumber").toString()));
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("supportedBrands") != null && !jsonObj.get("supportedBrands").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportedBrands` to be an array in the JSON string but got `%s`", jsonObj.get("supportedBrands").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardDetailsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardDetailsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardDetailsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardDetailsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CardDetailsRequest>() {
           @Override
           public void write(JsonWriter out, CardDetailsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardDetailsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CardDetailsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardDetailsRequest
  * @throws IOException if the JSON string is invalid with respect to CardDetailsRequest
  */
  public static CardDetailsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardDetailsRequest.class);
  }

 /**
  * Convert an instance of CardDetailsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

