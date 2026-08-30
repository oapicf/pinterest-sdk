package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AdAccountsAudienceRule;
import com.prokarma.pkmst.model.AudienceType;
import com.prokarma.pkmst.model.AudienceUpdateOperationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Resource create or update operation model.
 */
@ApiModel(description = "Resource create or update operation model.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountsAudienceUpdate   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("audience_type")
  private AudienceType audienceType;

  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  @JsonProperty("operation_type")
  private AudienceUpdateOperationType operationType;

  @JsonProperty("rule")
  private AdAccountsAudienceRule rule;

  public AdAccountsAudienceUpdate adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Ad account ID.
   * @return adAccountId
   */
  @ApiModelProperty(value = "Ad account ID.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdAccountsAudienceUpdate audienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
    return this;
  }

  /**
   * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   * @return audienceType
   */
  @ApiModelProperty(value = "[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR")
  public AudienceType getAudienceType() {
    return audienceType;
  }

  public void setAudienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
  }

  public AdAccountsAudienceUpdate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Audience description.
   * @return description
   */
  @ApiModelProperty(value = "Audience description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdAccountsAudienceUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Audience name.
   * @return name
   */
  @ApiModelProperty(value = "Audience name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdAccountsAudienceUpdate operationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Audience operation type (update or remove). Only valid in update request body.
   * @return operationType
   */
  @ApiModelProperty(value = "Audience operation type (update or remove). Only valid in update request body.")
  public AudienceUpdateOperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
  }

  public AdAccountsAudienceUpdate rule(AdAccountsAudienceRule rule) {
    this.rule = rule;
    return this;
  }

  /**
   * Get rule
   * @return rule
   */
  @ApiModelProperty(value = "")
  public AdAccountsAudienceRule getRule() {
    return rule;
  }

  public void setRule(AdAccountsAudienceRule rule) {
    this.rule = rule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccountsAudienceUpdate adAccountsAudienceUpdate = (AdAccountsAudienceUpdate) o;
    return Objects.equals(this.adAccountId, adAccountsAudienceUpdate.adAccountId) &&
        Objects.equals(this.audienceType, adAccountsAudienceUpdate.audienceType) &&
        Objects.equals(this.description, adAccountsAudienceUpdate.description) &&
        Objects.equals(this.name, adAccountsAudienceUpdate.name) &&
        Objects.equals(this.operationType, adAccountsAudienceUpdate.operationType) &&
        Objects.equals(this.rule, adAccountsAudienceUpdate.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, audienceType, description, name, operationType, rule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountsAudienceUpdate {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

