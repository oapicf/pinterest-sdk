package org.openapitools.model;

import org.openapitools.model.AudienceCreateRequest1AudienceType;
import org.openapitools.model.AudienceRule;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AudienceCreateRequest  {
  
 /**
  * Ad account ID.
  */
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  private String adAccountId;

 /**
  * Audience name.
  */
  @ApiModelProperty(example = "string", required = true, value = "Audience name.")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AudienceRule rule;

 /**
  * Audience description.
  */
  @ApiModelProperty(example = "string", value = "Audience description.")
  private String description;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AudienceCreateRequest1AudienceType audienceType;
 /**
  * Ad account ID.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public AudienceCreateRequest adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * Audience name.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public AudienceCreateRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get rule
  * @return rule
  */
  @JsonProperty("rule")
  @NotNull
  public AudienceRule getRule() {
    return rule;
  }

  /**
   * Sets the <code>rule</code> property.
   */
 public void setRule(AudienceRule rule) {
    this.rule = rule;
  }

  /**
   * Sets the <code>rule</code> property.
   */
  public AudienceCreateRequest rule(AudienceRule rule) {
    this.rule = rule;
    return this;
  }

 /**
  * Audience description.
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public AudienceCreateRequest description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get audienceType
  * @return audienceType
  */
  @JsonProperty("audience_type")
  @NotNull
  public AudienceCreateRequest1AudienceType getAudienceType() {
    return audienceType;
  }

  /**
   * Sets the <code>audienceType</code> property.
   */
 public void setAudienceType(AudienceCreateRequest1AudienceType audienceType) {
    this.audienceType = audienceType;
  }

  /**
   * Sets the <code>audienceType</code> property.
   */
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

