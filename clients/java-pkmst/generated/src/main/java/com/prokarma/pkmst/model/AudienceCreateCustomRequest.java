package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AudienceDataParty;
import com.prokarma.pkmst.model.AudienceRule;
import com.prokarma.pkmst.model.AudienceSharingType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AudienceCreateCustomRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudienceCreateCustomRequest   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("rule")
  private AudienceRule rule;

  @JsonProperty("sharing_type")
  private AudienceSharingType sharingType;

  @JsonProperty("data_party")
  private AudienceDataParty dataParty;

  @JsonProperty("category")
  private String category;

  public AudienceCreateCustomRequest adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * Ad account ID.
   * @return adAccountId
  **/
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AudienceCreateCustomRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Audience name.
   * @return name
  **/
  @ApiModelProperty(example = "string", required = true, value = "Audience name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AudienceCreateCustomRequest rule(AudienceRule rule) {
    this.rule = rule;
    return this;
  }

   /**
   * Get rule
   * @return rule
  **/
  @ApiModelProperty(required = true, value = "")
  public AudienceRule getRule() {
    return rule;
  }

  public void setRule(AudienceRule rule) {
    this.rule = rule;
  }

  public AudienceCreateCustomRequest sharingType(AudienceSharingType sharingType) {
    this.sharingType = sharingType;
    return this;
  }

   /**
   * Get sharingType
   * @return sharingType
  **/
  @ApiModelProperty(required = true, value = "")
  public AudienceSharingType getSharingType() {
    return sharingType;
  }

  public void setSharingType(AudienceSharingType sharingType) {
    this.sharingType = sharingType;
  }

  public AudienceCreateCustomRequest dataParty(AudienceDataParty dataParty) {
    this.dataParty = dataParty;
    return this;
  }

   /**
   * Get dataParty
   * @return dataParty
  **/
  @ApiModelProperty(required = true, value = "")
  public AudienceDataParty getDataParty() {
    return dataParty;
  }

  public void setDataParty(AudienceDataParty dataParty) {
    this.dataParty = dataParty;
  }

  public AudienceCreateCustomRequest category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(example = "DLX Demographics", value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceCreateCustomRequest audienceCreateCustomRequest = (AudienceCreateCustomRequest) o;
    return Objects.equals(this.adAccountId, audienceCreateCustomRequest.adAccountId) &&
        Objects.equals(this.name, audienceCreateCustomRequest.name) &&
        Objects.equals(this.rule, audienceCreateCustomRequest.rule) &&
        Objects.equals(this.sharingType, audienceCreateCustomRequest.sharingType) &&
        Objects.equals(this.dataParty, audienceCreateCustomRequest.dataParty) &&
        Objects.equals(this.category, audienceCreateCustomRequest.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, name, rule, sharingType, dataParty, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceCreateCustomRequest {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    sharingType: ").append(toIndentedString(sharingType)).append("\n");
    sb.append("    dataParty: ").append(toIndentedString(dataParty)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

