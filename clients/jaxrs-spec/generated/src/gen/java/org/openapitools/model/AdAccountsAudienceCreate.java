package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdAccountsAudienceRule;
import org.openapitools.model.AudienceType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("AdAccountsAudienceCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountsAudienceCreate   {
  private String adAccountId;
  private AudienceType audienceType;
  private String description;
  private String name;
  private AdAccountsAudienceRule rule;

  public AdAccountsAudienceCreate() {
  }

  /**
   * Ad account ID.
   **/
  public AdAccountsAudienceCreate adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(value = "Ad account ID.")
  @JsonProperty("ad_account_id")
   @Pattern(regexp="^\\d+$")public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
   **/
  public AdAccountsAudienceCreate audienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
    return this;
  }

  
  @ApiModelProperty(value = "[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR")
  @JsonProperty("audience_type")
  public AudienceType getAudienceType() {
    return audienceType;
  }

  @JsonProperty("audience_type")
  public void setAudienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
  }

  /**
   * Audience description.
   **/
  public AdAccountsAudienceCreate description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Audience description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Audience name.
   **/
  public AdAccountsAudienceCreate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Audience name.")
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
  public AdAccountsAudienceCreate rule(AdAccountsAudienceRule rule) {
    this.rule = rule;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rule")
  @Valid public AdAccountsAudienceRule getRule() {
    return rule;
  }

  @JsonProperty("rule")
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
