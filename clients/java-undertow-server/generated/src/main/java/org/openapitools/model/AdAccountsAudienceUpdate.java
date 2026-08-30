/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdAccountsAudienceRule;
import org.openapitools.model.AudienceType;
import org.openapitools.model.AudienceUpdateOperationType;



/**
 * Resource create or update operation model.
 */

@ApiModel(description = "Resource create or update operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountsAudienceUpdate   {
  
  private String adAccountId;
  private AudienceType audienceType;
  private String description;
  private String name;
  private AudienceUpdateOperationType operationType;
  private AdAccountsAudienceRule rule;

  /**
   * Ad account ID.
   */
  public AdAccountsAudienceUpdate adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(value = "Ad account ID.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   */
  public AdAccountsAudienceUpdate audienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
    return this;
  }

  
  @ApiModelProperty(value = "[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR")
  @JsonProperty("audience_type")
  public AudienceType getAudienceType() {
    return audienceType;
  }
  public void setAudienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
  }

  /**
   * Audience description.
   */
  public AdAccountsAudienceUpdate description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Audience description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Audience name.
   */
  public AdAccountsAudienceUpdate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Audience name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Audience operation type (update or remove). Only valid in update request body.
   */
  public AdAccountsAudienceUpdate operationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  
  @ApiModelProperty(value = "Audience operation type (update or remove). Only valid in update request body.")
  @JsonProperty("operation_type")
  public AudienceUpdateOperationType getOperationType() {
    return operationType;
  }
  public void setOperationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
  }

  /**
   */
  public AdAccountsAudienceUpdate rule(AdAccountsAudienceRule rule) {
    this.rule = rule;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rule")
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
    return Objects.equals(adAccountId, adAccountsAudienceUpdate.adAccountId) &&
        Objects.equals(audienceType, adAccountsAudienceUpdate.audienceType) &&
        Objects.equals(description, adAccountsAudienceUpdate.description) &&
        Objects.equals(name, adAccountsAudienceUpdate.name) &&
        Objects.equals(operationType, adAccountsAudienceUpdate.operationType) &&
        Objects.equals(rule, adAccountsAudienceUpdate.rule);
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

