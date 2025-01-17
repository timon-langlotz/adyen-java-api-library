/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.legalentitymanagement.Individual;
import com.adyen.model.legalentitymanagement.LegalEntityAssociation;
import com.adyen.model.legalentitymanagement.LegalEntityCapability;
import com.adyen.model.legalentitymanagement.Organization;
import com.adyen.model.legalentitymanagement.SoleProprietorship;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * LegalEntityInfoRequiredType
 */
@JsonPropertyOrder({
  LegalEntityInfoRequiredType.JSON_PROPERTY_CAPABILITIES,
  LegalEntityInfoRequiredType.JSON_PROPERTY_ENTITY_ASSOCIATIONS,
  LegalEntityInfoRequiredType.JSON_PROPERTY_INDIVIDUAL,
  LegalEntityInfoRequiredType.JSON_PROPERTY_ORGANIZATION,
  LegalEntityInfoRequiredType.JSON_PROPERTY_REFERENCE,
  LegalEntityInfoRequiredType.JSON_PROPERTY_SOLE_PROPRIETORSHIP,
  LegalEntityInfoRequiredType.JSON_PROPERTY_TYPE
})

public class LegalEntityInfoRequiredType {
  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  private Map<String, LegalEntityCapability> capabilities = null;

  public static final String JSON_PROPERTY_ENTITY_ASSOCIATIONS = "entityAssociations";
  private List<LegalEntityAssociation> entityAssociations = null;

  public static final String JSON_PROPERTY_INDIVIDUAL = "individual";
  private Individual individual;

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private Organization organization;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_SOLE_PROPRIETORSHIP = "soleProprietorship";
  private SoleProprietorship soleProprietorship;

  /**
   * The type of legal entity.   Possible values: **individual**, **organization**, or **soleProprietorship**.
   */
  public enum TypeEnum {
    INDIVIDUAL("individual"),
    
    ORGANIZATION("organization"),
    
    SOLEPROPRIETORSHIP("soleProprietorship"),
    
    TRUST("trust"),
    
    UNINCORPORATEDPARTNERSHIP("unincorporatedPartnership");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public LegalEntityInfoRequiredType() { 
  }

  public LegalEntityInfoRequiredType capabilities(Map<String, LegalEntityCapability> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public LegalEntityInfoRequiredType putCapabilitiesItem(String key, LegalEntityCapability capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new HashMap<>();
    }
    this.capabilities.put(key, capabilitiesItem);
    return this;
  }

   /**
   * Contains key-value pairs that specify the actions that the legal entity can do in your platform.The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability.
   * @return capabilities
  **/
  @ApiModelProperty(value = "Contains key-value pairs that specify the actions that the legal entity can do in your platform.The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability.")
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, LegalEntityCapability> getCapabilities() {
    return capabilities;
  }


  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapabilities(Map<String, LegalEntityCapability> capabilities) {
    this.capabilities = capabilities;
  }


  public LegalEntityInfoRequiredType entityAssociations(List<LegalEntityAssociation> entityAssociations) {
    this.entityAssociations = entityAssociations;
    return this;
  }

  public LegalEntityInfoRequiredType addEntityAssociationsItem(LegalEntityAssociation entityAssociationsItem) {
    if (this.entityAssociations == null) {
      this.entityAssociations = new ArrayList<>();
    }
    this.entityAssociations.add(entityAssociationsItem);
    return this;
  }

   /**
   * List of legal entities associated with the current legal entity. For example, ultimate beneficial owners associated with an organization through ownership or control, or as signatories.
   * @return entityAssociations
  **/
  @ApiModelProperty(value = "List of legal entities associated with the current legal entity. For example, ultimate beneficial owners associated with an organization through ownership or control, or as signatories.")
  @JsonProperty(JSON_PROPERTY_ENTITY_ASSOCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LegalEntityAssociation> getEntityAssociations() {
    return entityAssociations;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ASSOCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityAssociations(List<LegalEntityAssociation> entityAssociations) {
    this.entityAssociations = entityAssociations;
  }


  public LegalEntityInfoRequiredType individual(Individual individual) {
    this.individual = individual;
    return this;
  }

   /**
   * Get individual
   * @return individual
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDIVIDUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Individual getIndividual() {
    return individual;
  }


  @JsonProperty(JSON_PROPERTY_INDIVIDUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndividual(Individual individual) {
    this.individual = individual;
  }


  public LegalEntityInfoRequiredType organization(Organization organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Organization getOrganization() {
    return organization;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganization(Organization organization) {
    this.organization = organization;
  }


  public LegalEntityInfoRequiredType reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the legal entity, maximum 150 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the legal entity, maximum 150 characters.")
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


  public LegalEntityInfoRequiredType soleProprietorship(SoleProprietorship soleProprietorship) {
    this.soleProprietorship = soleProprietorship;
    return this;
  }

   /**
   * Get soleProprietorship
   * @return soleProprietorship
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOLE_PROPRIETORSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SoleProprietorship getSoleProprietorship() {
    return soleProprietorship;
  }


  @JsonProperty(JSON_PROPERTY_SOLE_PROPRIETORSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoleProprietorship(SoleProprietorship soleProprietorship) {
    this.soleProprietorship = soleProprietorship;
  }


  public LegalEntityInfoRequiredType type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of legal entity.   Possible values: **individual**, **organization**, or **soleProprietorship**.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of legal entity.   Possible values: **individual**, **organization**, or **soleProprietorship**.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this LegalEntityInfoRequiredType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalEntityInfoRequiredType legalEntityInfoRequiredType = (LegalEntityInfoRequiredType) o;
    return Objects.equals(this.capabilities, legalEntityInfoRequiredType.capabilities) &&
        Objects.equals(this.entityAssociations, legalEntityInfoRequiredType.entityAssociations) &&
        Objects.equals(this.individual, legalEntityInfoRequiredType.individual) &&
        Objects.equals(this.organization, legalEntityInfoRequiredType.organization) &&
        Objects.equals(this.reference, legalEntityInfoRequiredType.reference) &&
        Objects.equals(this.soleProprietorship, legalEntityInfoRequiredType.soleProprietorship) &&
        Objects.equals(this.type, legalEntityInfoRequiredType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, entityAssociations, individual, organization, reference, soleProprietorship, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalEntityInfoRequiredType {\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    entityAssociations: ").append(toIndentedString(entityAssociations)).append("\n");
    sb.append("    individual: ").append(toIndentedString(individual)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    soleProprietorship: ").append(toIndentedString(soleProprietorship)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of LegalEntityInfoRequiredType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LegalEntityInfoRequiredType
   * @throws JsonProcessingException if the JSON string is invalid with respect to LegalEntityInfoRequiredType
   */
  public static LegalEntityInfoRequiredType fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, LegalEntityInfoRequiredType.class);
  }
/**
  * Convert an instance of LegalEntityInfoRequiredType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

