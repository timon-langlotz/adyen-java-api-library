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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * CheckoutUtilityResponse
 */
@JsonPropertyOrder({
  CheckoutUtilityResponse.JSON_PROPERTY_ORIGIN_KEYS
})

public class CheckoutUtilityResponse {
  public static final String JSON_PROPERTY_ORIGIN_KEYS = "originKeys";
  private Map<String, String> originKeys = null;

  public CheckoutUtilityResponse() { 
  }

  public CheckoutUtilityResponse originKeys(Map<String, String> originKeys) {
    this.originKeys = originKeys;
    return this;
  }

  public CheckoutUtilityResponse putOriginKeysItem(String key, String originKeysItem) {
    if (this.originKeys == null) {
      this.originKeys = new HashMap<>();
    }
    this.originKeys.put(key, originKeysItem);
    return this;
  }

   /**
   * The list of origin keys for all requested domains. For each list item, the key is the domain and the value is the origin key.
   * @return originKeys
  **/
  @ApiModelProperty(value = "The list of origin keys for all requested domains. For each list item, the key is the domain and the value is the origin key.")
  @JsonProperty(JSON_PROPERTY_ORIGIN_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getOriginKeys() {
    return originKeys;
  }


  @JsonProperty(JSON_PROPERTY_ORIGIN_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginKeys(Map<String, String> originKeys) {
    this.originKeys = originKeys;
  }


  /**
   * Return true if this CheckoutUtilityResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutUtilityResponse checkoutUtilityResponse = (CheckoutUtilityResponse) o;
    return Objects.equals(this.originKeys, checkoutUtilityResponse.originKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutUtilityResponse {\n");
    sb.append("    originKeys: ").append(toIndentedString(originKeys)).append("\n");
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
   * Create an instance of CheckoutUtilityResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CheckoutUtilityResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to CheckoutUtilityResponse
   */
  public static CheckoutUtilityResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CheckoutUtilityResponse.class);
  }
/**
  * Convert an instance of CheckoutUtilityResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

