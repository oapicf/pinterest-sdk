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

/**
 * Resource create operation model.
 */
@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountsAudienceCreate   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("audience_type")
  private AudienceType audienceType;

  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  @JsonProperty("rule")
  private AdAccountsAudienceRule rule;

  public AdAccountsAudienceCreate adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * Ad account ID.
   * @return adAccountId
  **/
  @ApiModelProperty(value = "Ad account ID.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdAccountsAudienceCreate audienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
    return this;
  }

   /**
   * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   * @return audienceType
  **/
  @ApiModelProperty(value = "[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR")
  public AudienceType getAudienceType() {
    return audienceType;
  }

  public void setAudienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
  }

  public AdAccountsAudienceCreate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Audience description.
   * @return description
  **/
  @ApiModelProperty(value = "Audience description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdAccountsAudienceCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Audience name.
   * @return name
  **/
  @ApiModelProperty(value = "Audience name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdAccountsAudienceCreate rule(AdAccountsAudienceRule rule) {
    this.rule = rule;
    return this;
  }

   /**
   * Get rule
   * @return rule
  **/
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

