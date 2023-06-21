/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.balanceplatform.BulkAddress;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
import java.util.logging.Level;
import java.util.logging.Logger;

import com.adyen.model.balanceplatform.JSON;

/**
 * CardConfiguration
 */

public class CardConfiguration {
  public static final String SERIALIZED_NAME_ACTIVATION = "activation";
  @SerializedName(SERIALIZED_NAME_ACTIVATION)
  private String activation;

  public static final String SERIALIZED_NAME_ACTIVATION_URL = "activationUrl";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_URL)
  private String activationUrl;

  public static final String SERIALIZED_NAME_BULK_ADDRESS = "bulkAddress";
  @SerializedName(SERIALIZED_NAME_BULK_ADDRESS)
  private BulkAddress bulkAddress;

  public static final String SERIALIZED_NAME_CARD_IMAGE_ID = "cardImageId";
  @SerializedName(SERIALIZED_NAME_CARD_IMAGE_ID)
  private String cardImageId;

  public static final String SERIALIZED_NAME_CARRIER = "carrier";
  @SerializedName(SERIALIZED_NAME_CARRIER)
  private String carrier;

  public static final String SERIALIZED_NAME_CARRIER_IMAGE_ID = "carrierImageId";
  @SerializedName(SERIALIZED_NAME_CARRIER_IMAGE_ID)
  private String carrierImageId;

  public static final String SERIALIZED_NAME_CONFIGURATION_PROFILE_ID = "configurationProfileId";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_PROFILE_ID)
  private String configurationProfileId;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_ENVELOPE = "envelope";
  @SerializedName(SERIALIZED_NAME_ENVELOPE)
  private String envelope;

  public static final String SERIALIZED_NAME_INSERT = "insert";
  @SerializedName(SERIALIZED_NAME_INSERT)
  private String insert;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_LOGO_IMAGE_ID = "logoImageId";
  @SerializedName(SERIALIZED_NAME_LOGO_IMAGE_ID)
  private String logoImageId;

  public static final String SERIALIZED_NAME_PIN_MAILER = "pinMailer";
  @SerializedName(SERIALIZED_NAME_PIN_MAILER)
  private String pinMailer;

  public static final String SERIALIZED_NAME_SHIPMENT_METHOD = "shipmentMethod";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_METHOD)
  private String shipmentMethod;

  public CardConfiguration() { 
  }

  public CardConfiguration activation(String activation) {
    
    this.activation = activation;
    return this;
  }

   /**
   * Overrides the activation label design ID defined in the &#x60;configurationProfileId&#x60;. The activation label is attached to the card and contains the activation instructions.
   * @return activation
  **/
  @ApiModelProperty(value = "Overrides the activation label design ID defined in the `configurationProfileId`. The activation label is attached to the card and contains the activation instructions.")

  public String getActivation() {
    return activation;
  }


  public void setActivation(String activation) {
    this.activation = activation;
  }


  public CardConfiguration activationUrl(String activationUrl) {
    
    this.activationUrl = activationUrl;
    return this;
  }

   /**
   * Your app&#39;s URL, if you want to activate cards through your app. For example, **my-app://ref1236a7d**. A QR code is created based on this URL, and is included in the carrier. Before you use this field, reach out to your Adyen contact to set up the QR code process.   Maximum length: 255 characters.
   * @return activationUrl
  **/
  @ApiModelProperty(value = "Your app's URL, if you want to activate cards through your app. For example, **my-app://ref1236a7d**. A QR code is created based on this URL, and is included in the carrier. Before you use this field, reach out to your Adyen contact to set up the QR code process.   Maximum length: 255 characters.")

  public String getActivationUrl() {
    return activationUrl;
  }


  public void setActivationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
  }


  public CardConfiguration bulkAddress(BulkAddress bulkAddress) {
    
    this.bulkAddress = bulkAddress;
    return this;
  }

   /**
   * Get bulkAddress
   * @return bulkAddress
  **/
  @ApiModelProperty(value = "")

  public BulkAddress getBulkAddress() {
    return bulkAddress;
  }


  public void setBulkAddress(BulkAddress bulkAddress) {
    this.bulkAddress = bulkAddress;
  }


  public CardConfiguration cardImageId(String cardImageId) {
    
    this.cardImageId = cardImageId;
    return this;
  }

   /**
   * The ID of the card image. This is the image that will be printed on the full front of the card.
   * @return cardImageId
  **/
  @ApiModelProperty(value = "The ID of the card image. This is the image that will be printed on the full front of the card.")

  public String getCardImageId() {
    return cardImageId;
  }


  public void setCardImageId(String cardImageId) {
    this.cardImageId = cardImageId;
  }


  public CardConfiguration carrier(String carrier) {
    
    this.carrier = carrier;
    return this;
  }

   /**
   * Overrides the carrier design ID defined in the &#x60;configurationProfileId&#x60;. The carrier is the letter or packaging to which the card is attached.
   * @return carrier
  **/
  @ApiModelProperty(value = "Overrides the carrier design ID defined in the `configurationProfileId`. The carrier is the letter or packaging to which the card is attached.")

  public String getCarrier() {
    return carrier;
  }


  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }


  public CardConfiguration carrierImageId(String carrierImageId) {
    
    this.carrierImageId = carrierImageId;
    return this;
  }

   /**
   * The ID of the carrier image. This is the image that will printed on the letter to which the card is attached.
   * @return carrierImageId
  **/
  @ApiModelProperty(value = "The ID of the carrier image. This is the image that will printed on the letter to which the card is attached.")

  public String getCarrierImageId() {
    return carrierImageId;
  }


  public void setCarrierImageId(String carrierImageId) {
    this.carrierImageId = carrierImageId;
  }


  public CardConfiguration configurationProfileId(String configurationProfileId) {
    
    this.configurationProfileId = configurationProfileId;
    return this;
  }

   /**
   * The ID of the card configuration profile that contains the settings of the card. For example, the envelope and PIN mailer designs or the logistics company handling the shipment. All the settings in the profile are applied to the card, unless you provide other fields to override them.  For example, send the &#x60;shipmentMethod&#x60; to override the logistics company defined in the card configuration profile.
   * @return configurationProfileId
  **/
  @ApiModelProperty(required = true, value = "The ID of the card configuration profile that contains the settings of the card. For example, the envelope and PIN mailer designs or the logistics company handling the shipment. All the settings in the profile are applied to the card, unless you provide other fields to override them.  For example, send the `shipmentMethod` to override the logistics company defined in the card configuration profile.")

  public String getConfigurationProfileId() {
    return configurationProfileId;
  }


  public void setConfigurationProfileId(String configurationProfileId) {
    this.configurationProfileId = configurationProfileId;
  }


  public CardConfiguration currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The three-letter [ISO-4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the card. For example, **EUR**.
   * @return currency
  **/
  @ApiModelProperty(value = "The three-letter [ISO-4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the card. For example, **EUR**.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public CardConfiguration envelope(String envelope) {
    
    this.envelope = envelope;
    return this;
  }

   /**
   * Overrides the envelope design ID defined in the &#x60;configurationProfileId&#x60;. 
   * @return envelope
  **/
  @ApiModelProperty(value = "Overrides the envelope design ID defined in the `configurationProfileId`. ")

  public String getEnvelope() {
    return envelope;
  }


  public void setEnvelope(String envelope) {
    this.envelope = envelope;
  }


  public CardConfiguration insert(String insert) {
    
    this.insert = insert;
    return this;
  }

   /**
   * Overrides the insert design ID defined in the &#x60;configurationProfileId&#x60;. An insert is any additional material, such as marketing materials, that are shipped together with the card.
   * @return insert
  **/
  @ApiModelProperty(value = "Overrides the insert design ID defined in the `configurationProfileId`. An insert is any additional material, such as marketing materials, that are shipped together with the card.")

  public String getInsert() {
    return insert;
  }


  public void setInsert(String insert) {
    this.insert = insert;
  }


  public CardConfiguration language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * The two-letter [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code of the card. For example, **en**.
   * @return language
  **/
  @ApiModelProperty(value = "The two-letter [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code of the card. For example, **en**.")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public CardConfiguration logoImageId(String logoImageId) {
    
    this.logoImageId = logoImageId;
    return this;
  }

   /**
   * The ID of the logo image. This is the image that will be printed on the partial front of the card, such as a logo on the upper right corner.
   * @return logoImageId
  **/
  @ApiModelProperty(value = "The ID of the logo image. This is the image that will be printed on the partial front of the card, such as a logo on the upper right corner.")

  public String getLogoImageId() {
    return logoImageId;
  }


  public void setLogoImageId(String logoImageId) {
    this.logoImageId = logoImageId;
  }


  public CardConfiguration pinMailer(String pinMailer) {
    
    this.pinMailer = pinMailer;
    return this;
  }

   /**
   * Overrides the PIN mailer design ID defined in the &#x60;configurationProfileId&#x60;. The PIN mailer is the letter on which the PIN is printed.
   * @return pinMailer
  **/
  @ApiModelProperty(value = "Overrides the PIN mailer design ID defined in the `configurationProfileId`. The PIN mailer is the letter on which the PIN is printed.")

  public String getPinMailer() {
    return pinMailer;
  }


  public void setPinMailer(String pinMailer) {
    this.pinMailer = pinMailer;
  }


  public CardConfiguration shipmentMethod(String shipmentMethod) {
    
    this.shipmentMethod = shipmentMethod;
    return this;
  }

   /**
   * Overrides the logistics company defined in the &#x60;configurationProfileId&#x60;.
   * @return shipmentMethod
  **/
  @ApiModelProperty(value = "Overrides the logistics company defined in the `configurationProfileId`.")

  public String getShipmentMethod() {
    return shipmentMethod;
  }


  public void setShipmentMethod(String shipmentMethod) {
    this.shipmentMethod = shipmentMethod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardConfiguration cardConfiguration = (CardConfiguration) o;
    return Objects.equals(this.activation, cardConfiguration.activation) &&
        Objects.equals(this.activationUrl, cardConfiguration.activationUrl) &&
        Objects.equals(this.bulkAddress, cardConfiguration.bulkAddress) &&
        Objects.equals(this.cardImageId, cardConfiguration.cardImageId) &&
        Objects.equals(this.carrier, cardConfiguration.carrier) &&
        Objects.equals(this.carrierImageId, cardConfiguration.carrierImageId) &&
        Objects.equals(this.configurationProfileId, cardConfiguration.configurationProfileId) &&
        Objects.equals(this.currency, cardConfiguration.currency) &&
        Objects.equals(this.envelope, cardConfiguration.envelope) &&
        Objects.equals(this.insert, cardConfiguration.insert) &&
        Objects.equals(this.language, cardConfiguration.language) &&
        Objects.equals(this.logoImageId, cardConfiguration.logoImageId) &&
        Objects.equals(this.pinMailer, cardConfiguration.pinMailer) &&
        Objects.equals(this.shipmentMethod, cardConfiguration.shipmentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activation, activationUrl, bulkAddress, cardImageId, carrier, carrierImageId, configurationProfileId, currency, envelope, insert, language, logoImageId, pinMailer, shipmentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardConfiguration {\n");
    sb.append("    activation: ").append(toIndentedString(activation)).append("\n");
    sb.append("    activationUrl: ").append(toIndentedString(activationUrl)).append("\n");
    sb.append("    bulkAddress: ").append(toIndentedString(bulkAddress)).append("\n");
    sb.append("    cardImageId: ").append(toIndentedString(cardImageId)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    carrierImageId: ").append(toIndentedString(carrierImageId)).append("\n");
    sb.append("    configurationProfileId: ").append(toIndentedString(configurationProfileId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    envelope: ").append(toIndentedString(envelope)).append("\n");
    sb.append("    insert: ").append(toIndentedString(insert)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    logoImageId: ").append(toIndentedString(logoImageId)).append("\n");
    sb.append("    pinMailer: ").append(toIndentedString(pinMailer)).append("\n");
    sb.append("    shipmentMethod: ").append(toIndentedString(shipmentMethod)).append("\n");
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
    openapiFields.add("activation");
    openapiFields.add("activationUrl");
    openapiFields.add("bulkAddress");
    openapiFields.add("cardImageId");
    openapiFields.add("carrier");
    openapiFields.add("carrierImageId");
    openapiFields.add("configurationProfileId");
    openapiFields.add("currency");
    openapiFields.add("envelope");
    openapiFields.add("insert");
    openapiFields.add("language");
    openapiFields.add("logoImageId");
    openapiFields.add("pinMailer");
    openapiFields.add("shipmentMethod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("configurationProfileId");
  }

  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    validateJsonObject(jsonObj, false);
  }
 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @param strictValidation reject (new) fields missing from the specifications
  * @throws IOException if the JSON Object is invalid with respect to CardConfiguration
  */
  public static void validateJsonObject(JsonObject jsonObj, boolean strictValidation) throws IOException {
      if (jsonObj == null) {
        if (CardConfiguration.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardConfiguration is not found in the empty JSON string", CardConfiguration.openapiRequiredFields.toString()));
        }
      }
      if (strictValidation) {
          Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
          // check to see if the JSON string contains additional fields
          for (Entry<String, JsonElement> entry : entries) {
            if (!CardConfiguration.openapiFields.contains(entry.getKey())) {
              throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CardConfiguration` properties.", entry.getKey()));
            }
          }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CardConfiguration.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field activation
      if (jsonObj.get("activation") != null && !jsonObj.get("activation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activation").toString()));
      }
      // validate the optional field activationUrl
      if (jsonObj.get("activationUrl") != null && !jsonObj.get("activationUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activationUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activationUrl").toString()));
      }
      // validate the optional field `bulkAddress`
      if (jsonObj.getAsJsonObject("bulkAddress") != null) {
        BulkAddress.validateJsonObject(jsonObj.getAsJsonObject("bulkAddress"));
      }
      // validate the optional field cardImageId
      if (jsonObj.get("cardImageId") != null && !jsonObj.get("cardImageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardImageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardImageId").toString()));
      }
      // validate the optional field carrier
      if (jsonObj.get("carrier") != null && !jsonObj.get("carrier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrier").toString()));
      }
      // validate the optional field carrierImageId
      if (jsonObj.get("carrierImageId") != null && !jsonObj.get("carrierImageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierImageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierImageId").toString()));
      }
      // validate the optional field configurationProfileId
      if (jsonObj.get("configurationProfileId") != null && !jsonObj.get("configurationProfileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationProfileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationProfileId").toString()));
      }
      // validate the optional field currency
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the optional field envelope
      if (jsonObj.get("envelope") != null && !jsonObj.get("envelope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `envelope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("envelope").toString()));
      }
      // validate the optional field insert
      if (jsonObj.get("insert") != null && !jsonObj.get("insert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `insert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("insert").toString()));
      }
      // validate the optional field language
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      // validate the optional field logoImageId
      if (jsonObj.get("logoImageId") != null && !jsonObj.get("logoImageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoImageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoImageId").toString()));
      }
      // validate the optional field pinMailer
      if (jsonObj.get("pinMailer") != null && !jsonObj.get("pinMailer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pinMailer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pinMailer").toString()));
      }
      // validate the optional field shipmentMethod
      if (jsonObj.get("shipmentMethod") != null && !jsonObj.get("shipmentMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipmentMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipmentMethod").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<CardConfiguration>() {
           @Override
           public void write(JsonWriter out, CardConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardConfiguration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CardConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardConfiguration
  * @throws IOException if the JSON string is invalid with respect to CardConfiguration
  */
  public static CardConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardConfiguration.class);
  }

 /**
  * Convert an instance of CardConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
