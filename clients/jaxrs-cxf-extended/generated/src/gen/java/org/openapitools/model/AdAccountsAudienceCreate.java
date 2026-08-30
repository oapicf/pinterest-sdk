package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdAccountsAudienceRule;
import org.openapitools.model.AudienceType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class AdAccountsAudienceCreate  {
  
 /**
  * Ad account ID.
  */
  @ApiModelProperty(value = "Ad account ID.")
  private String adAccountId;

 /**
  * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
  */
  @ApiModelProperty(value = "[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR")
  @Valid
  private AudienceType audienceType;

 /**
  * Audience description.
  */
  @ApiModelProperty(value = "Audience description.")
  private String description;

 /**
  * Audience name.
  */
  @ApiModelProperty(value = "Audience name.")
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private AdAccountsAudienceRule rule;
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
  public AdAccountsAudienceCreate adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
  * @return audienceType
  */
  @JsonProperty("audience_type")
  public AudienceType getAudienceType() {
    return audienceType;
  }

  /**
   * Sets the <code>audienceType</code> property.
   */
 public void setAudienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
  }

  /**
   * Sets the <code>audienceType</code> property.
   */
  public AdAccountsAudienceCreate audienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
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
  public AdAccountsAudienceCreate description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Audience name.
  * @return name
  */
  @JsonProperty("name")
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
  public AdAccountsAudienceCreate name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get rule
  * @return rule
  */
  @JsonProperty("rule")
  public AdAccountsAudienceRule getRule() {
    return rule;
  }

  /**
   * Sets the <code>rule</code> property.
   */
 public void setRule(AdAccountsAudienceRule rule) {
    this.rule = rule;
  }

  /**
   * Sets the <code>rule</code> property.
   */
  public AdAccountsAudienceCreate rule(AdAccountsAudienceRule rule) {
    this.rule = rule;
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
    AdAccountsAudienceCreate adAccountsAudienceCreate = (AdAccountsAudienceCreate) o;
    return Objects.equals(this.adAccountId, adAccountsAudienceCreate.adAccountId) &&
        Objects.equals(this.audienceType, adAccountsAudienceCreate.audienceType) &&
        Objects.equals(this.description, adAccountsAudienceCreate.description) &&
        Objects.equals(this.name, adAccountsAudienceCreate.name) &&
        Objects.equals(this.rule, adAccountsAudienceCreate.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, audienceType, description, name, rule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountsAudienceCreate {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

