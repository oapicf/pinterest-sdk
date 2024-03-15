package org.openapitools.model;

import org.openapitools.model.AudienceCreateRequest1AudienceType;
import org.openapitools.model.AudienceRule;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AudienceCreateRequest  {
  
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
 /**
   * Ad account ID.
  **/
  private String adAccountId;

  @ApiModelProperty(example = "string", required = true, value = "Audience name.")
 /**
   * Audience name.
  **/
  private String name;

  @ApiModelProperty(required = true, value = "")
  private AudienceRule rule;

  @ApiModelProperty(example = "string", value = "Audience description.")
 /**
   * Audience description.
  **/
  private String description;

  @ApiModelProperty(required = true, value = "")
  private AudienceCreateRequest1AudienceType audienceType;
 /**
   * Ad account ID.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AudienceCreateRequest adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * Audience name.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AudienceCreateRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get rule
   * @return rule
  **/
  @JsonProperty("rule")
  public AudienceRule getRule() {
    return rule;
  }

  public void setRule(AudienceRule rule) {
    this.rule = rule;
  }

  public AudienceCreateRequest rule(AudienceRule rule) {
    this.rule = rule;
    return this;
  }

 /**
   * Audience description.
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AudienceCreateRequest description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get audienceType
   * @return audienceType
  **/
  @JsonProperty("audience_type")
  public AudienceCreateRequest1AudienceType getAudienceType() {
    return audienceType;
  }

  public void setAudienceType(AudienceCreateRequest1AudienceType audienceType) {
    this.audienceType = audienceType;
  }

  public AudienceCreateRequest audienceType(AudienceCreateRequest1AudienceType audienceType) {
    this.audienceType = audienceType;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceCreateRequest audienceCreateRequest = (AudienceCreateRequest) o;
    return Objects.equals(this.adAccountId, audienceCreateRequest.adAccountId) &&
        Objects.equals(this.name, audienceCreateRequest.name) &&
        Objects.equals(this.rule, audienceCreateRequest.rule) &&
        Objects.equals(this.description, audienceCreateRequest.description) &&
        Objects.equals(this.audienceType, audienceCreateRequest.audienceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, name, rule, description, audienceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceCreateRequest {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

