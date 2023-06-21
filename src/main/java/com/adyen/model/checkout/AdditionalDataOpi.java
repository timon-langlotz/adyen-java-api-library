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

import com.adyen.model.checkout.JSON;

/**
 * AdditionalDataOpi
 */

public class AdditionalDataOpi {
  public static final String SERIALIZED_NAME_OPI_INCLUDE_TRANS_TOKEN = "opi.includeTransToken";
  @SerializedName(SERIALIZED_NAME_OPI_INCLUDE_TRANS_TOKEN)
  private String opiIncludeTransToken;

  public AdditionalDataOpi() { 
  }

  public AdditionalDataOpi opiIncludeTransToken(String opiIncludeTransToken) {
    
    this.opiIncludeTransToken = opiIncludeTransToken;
    return this;
  }

   /**
   * Optional boolean indicator. Set to **true** if you want an ecommerce transaction to return an &#x60;opi.transToken&#x60; as additional data in the response.  You can store this Oracle Payment Interface token in your Oracle Opera database. For more information and required settings, see [Oracle Opera](https://docs.adyen.com/plugins/oracle-opera#opi-token-ecommerce).
   * @return opiIncludeTransToken
  **/
  @ApiModelProperty(value = "Optional boolean indicator. Set to **true** if you want an ecommerce transaction to return an `opi.transToken` as additional data in the response.  You can store this Oracle Payment Interface token in your Oracle Opera database. For more information and required settings, see [Oracle Opera](https://docs.adyen.com/plugins/oracle-opera#opi-token-ecommerce).")

  public String getOpiIncludeTransToken() {
    return opiIncludeTransToken;
  }


  public void setOpiIncludeTransToken(String opiIncludeTransToken) {
    this.opiIncludeTransToken = opiIncludeTransToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataOpi additionalDataOpi = (AdditionalDataOpi) o;
    return Objects.equals(this.opiIncludeTransToken, additionalDataOpi.opiIncludeTransToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opiIncludeTransToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataOpi {\n");
    sb.append("    opiIncludeTransToken: ").append(toIndentedString(opiIncludeTransToken)).append("\n");
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
    openapiFields.add("opi.includeTransToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(AdditionalDataOpi.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalDataOpi
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalDataOpi.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalDataOpi is not found in the empty JSON string", AdditionalDataOpi.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalDataOpi.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `AdditionalDataOpi` properties.", entry.getKey()));
        }
      }
      // validate the optional field opi.includeTransToken
      if (jsonObj.get("opi.includeTransToken") != null && !jsonObj.get("opi.includeTransToken").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `opi.includeTransToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("opi.includeTransToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalDataOpi.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalDataOpi' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalDataOpi> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalDataOpi.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalDataOpi>() {
           @Override
           public void write(JsonWriter out, AdditionalDataOpi value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalDataOpi read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdditionalDataOpi given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdditionalDataOpi
  * @throws IOException if the JSON string is invalid with respect to AdditionalDataOpi
  */
  public static AdditionalDataOpi fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalDataOpi.class);
  }

 /**
  * Convert an instance of AdditionalDataOpi to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
