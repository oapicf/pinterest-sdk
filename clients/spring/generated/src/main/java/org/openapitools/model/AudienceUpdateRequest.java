package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AudienceRule;
import org.openapitools.model.AudienceUpdateOperationType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AudienceUpdateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceUpdateRequest {

  private String adAccountId;

  private String name;

  private AudienceRule rule;

  private String description;

  private AudienceUpdateOperationType operationType = AudienceUpdateOperationType.UPDATE;

  public AudienceUpdateRequest adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Ad account ID.
   * @return adAccountId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "549755885175", description = "Ad account ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AudienceUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Audience name.
   * @return name
  */
  
  @Schema(name = "name", example = "string", description = "Audience name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AudienceUpdateRequest rule(AudienceRule rule) {
    this.rule = rule;
    return this;
  }

  /**
   * Get rule
   * @return rule
  */
  @Valid 
  @Schema(name = "rule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rule")
  public AudienceRule getRule() {
    return rule;
  }

  public void setRule(AudienceRule rule) {
    this.rule = rule;
  }

  public AudienceUpdateRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Audience description.
   * @return description
  */
  
  @Schema(name = "description", example = "string", description = "Audience description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AudienceUpdateRequest operationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Get operationType
   * @return operationType
  */
  @Valid 
  @Schema(name = "operation_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.adAccountId, audienceUpdateRequest.adAccountId) &&
        Objects.equals(this.name, audienceUpdateRequest.name) &&
        Objects.equals(this.rule, audienceUpdateRequest.rule) &&
        Objects.equals(this.description, audienceUpdateRequest.description) &&
        Objects.equals(this.operationType, audienceUpdateRequest.operationType);
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

