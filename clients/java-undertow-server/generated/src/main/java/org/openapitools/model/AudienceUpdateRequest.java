/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
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
import org.openapitools.model.AudienceRule;
import org.openapitools.model.AudienceUpdateOperationType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AudienceUpdateRequest   {
  
  private String adAccountId;
  private String name;
  private AudienceRule rule;
  private String description;
  private AudienceUpdateOperationType operationType = AudienceUpdateOperationType.UPDATE;

  /**
   * Ad account ID.
   */
  public AudienceUpdateRequest adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Audience name.
   */
  public AudienceUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "string", value = "Audience name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   */
  public AudienceUpdateRequest rule(AudienceRule rule) {
    this.rule = rule;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rule")
  public AudienceRule getRule() {
    return rule;
  }
  public void setRule(AudienceRule rule) {
    this.rule = rule;
  }

  /**
   * Audience description.
   */
  public AudienceUpdateRequest description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "string", value = "Audience description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   */
  public AudienceUpdateRequest operationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("operation_type")
  public AudienceUpdateOperationType getOperationType() {
    return operationType;
  }
  public void setOperationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceUpdateRequest audienceUpdateRequest = (AudienceUpdateRequest) o;
    return Objects.equals(adAccountId, audienceUpdateRequest.adAccountId) &&
        Objects.equals(name, audienceUpdateRequest.name) &&
        Objects.equals(rule, audienceUpdateRequest.rule) &&
        Objects.equals(description, audienceUpdateRequest.description) &&
        Objects.equals(operationType, audienceUpdateRequest.operationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, name, rule, description, operationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceUpdateRequest {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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
}

