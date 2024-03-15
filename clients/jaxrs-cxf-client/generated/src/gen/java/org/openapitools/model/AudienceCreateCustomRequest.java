package org.openapitools.model;

import org.openapitools.model.AudienceDataParty;
import org.openapitools.model.AudienceRule;
import org.openapitools.model.AudienceSharingType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AudienceCreateCustomRequest  {
  
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

  @ApiModelProperty(required = true, value = "")
  private AudienceSharingType sharingType;

  @ApiModelProperty(required = true, value = "")
  private AudienceDataParty dataParty;

  @ApiModelProperty(example = "DLX Demographics", value = "")
  private String category;
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

  public AudienceCreateCustomRequest adAccountId(String adAccountId) {
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

  public AudienceCreateCustomRequest name(String name) {
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

  public AudienceCreateCustomRequest rule(AudienceRule rule) {
    this.rule = rule;
    return this;
  }

 /**
   * Get sharingType
   * @return sharingType
  **/
  @JsonProperty("sharing_type")
  public AudienceSharingType getSharingType() {
    return sharingType;
  }

  public void setSharingType(AudienceSharingType sharingType) {
    this.sharingType = sharingType;
  }

  public AudienceCreateCustomRequest sharingType(AudienceSharingType sharingType) {
    this.sharingType = sharingType;
    return this;
  }

 /**
   * Get dataParty
   * @return dataParty
  **/
  @JsonProperty("data_party")
  public AudienceDataParty getDataParty() {
    return dataParty;
  }

  public void setDataParty(AudienceDataParty dataParty) {
    this.dataParty = dataParty;
  }

  public AudienceCreateCustomRequest dataParty(AudienceDataParty dataParty) {
    this.dataParty = dataParty;
    return this;
  }

 /**
   * Get category
   * @return category
  **/
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public AudienceCreateCustomRequest category(String category) {
    this.category = category;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

