/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

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

import com.adyen.model.management.JSON;

/**
 * TerminalActionScheduleDetail
 */

public class TerminalActionScheduleDetail {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TERMINAL_ID = "terminalId";
  @SerializedName(SERIALIZED_NAME_TERMINAL_ID)
  private String terminalId;

  public TerminalActionScheduleDetail() { 
  }

  public TerminalActionScheduleDetail id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the action on the specified terminal.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the action on the specified terminal.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TerminalActionScheduleDetail terminalId(String terminalId) {
    
    this.terminalId = terminalId;
    return this;
  }

   /**
   * The unique ID of the terminal that the action applies to.
   * @return terminalId
  **/
  @ApiModelProperty(value = "The unique ID of the terminal that the action applies to.")

  public String getTerminalId() {
    return terminalId;
  }


  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalActionScheduleDetail terminalActionScheduleDetail = (TerminalActionScheduleDetail) o;
    return Objects.equals(this.id, terminalActionScheduleDetail.id) &&
        Objects.equals(this.terminalId, terminalActionScheduleDetail.terminalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, terminalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalActionScheduleDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("terminalId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(TerminalActionScheduleDetail.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TerminalActionScheduleDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TerminalActionScheduleDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TerminalActionScheduleDetail is not found in the empty JSON string", TerminalActionScheduleDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TerminalActionScheduleDetail.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `TerminalActionScheduleDetail` properties.", entry.getKey()));
        }
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field terminalId
      if (jsonObj.get("terminalId") != null && !jsonObj.get("terminalId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `terminalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminalId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerminalActionScheduleDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerminalActionScheduleDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerminalActionScheduleDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerminalActionScheduleDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<TerminalActionScheduleDetail>() {
           @Override
           public void write(JsonWriter out, TerminalActionScheduleDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerminalActionScheduleDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TerminalActionScheduleDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TerminalActionScheduleDetail
  * @throws IOException if the JSON string is invalid with respect to TerminalActionScheduleDetail
  */
  public static TerminalActionScheduleDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerminalActionScheduleDetail.class);
  }

 /**
  * Convert an instance of TerminalActionScheduleDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
