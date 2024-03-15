package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AudienceRule;
import org.openapitools.model.AudienceUpdateOperationType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AudienceUpdateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceUpdateRequest   {
  private @Valid String adAccountId;
  private @Valid String name;
  private @Valid AudienceRule rule;
  private @Valid String description;
  private @Valid AudienceUpdateOperationType operationType = AudienceUpdateOperationType.UPDATE;

  /**
   * Ad account ID.
   **/
  public AudienceUpdateRequest adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Audience name.
   **/
  public AudienceUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "string", value = "Audience name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public AudienceUpdateRequest rule(AudienceRule rule) {
    this.rule = rule;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rule")
  public AudienceRule getRule() {
    return rule;
  }

  @JsonProperty("rule")
  public void setRule(AudienceRule rule) {
    this.rule = rule;
  }

  /**
   * Audience description.
   **/
  public AudienceUpdateRequest description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "string", value = "Audience description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public AudienceUpdateRequest operationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("operation_type")
  public AudienceUpdateOperationType getOperationType() {
    return operationType;
  }

  @JsonProperty("operation_type")
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

