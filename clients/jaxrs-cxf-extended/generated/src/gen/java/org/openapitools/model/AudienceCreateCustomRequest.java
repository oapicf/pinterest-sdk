package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AudienceDataParty;
import org.openapitools.model.AudienceRule;
import org.openapitools.model.AudienceSharingType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AudienceCreateCustomRequest  {
  
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

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AudienceSharingType sharingType;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AudienceDataParty dataParty;

  @ApiModelProperty(example = "DLX Demographics", value = "")
  private String category;
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
  public AudienceCreateCustomRequest adAccountId(String adAccountId) {
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
  public AudienceCreateCustomRequest name(String name) {
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
  public AudienceCreateCustomRequest rule(AudienceRule rule) {
    this.rule = rule;
    return this;
  }

 /**
  * Get sharingType
  * @return sharingType
  */
  @JsonProperty("sharing_type")
  @NotNull
  public AudienceSharingType getSharingType() {
    return sharingType;
  }

  /**
   * Sets the <code>sharingType</code> property.
   */
 public void setSharingType(AudienceSharingType sharingType) {
    this.sharingType = sharingType;
  }

  /**
   * Sets the <code>sharingType</code> property.
   */
  public AudienceCreateCustomRequest sharingType(AudienceSharingType sharingType) {
    this.sharingType = sharingType;
    return this;
  }

 /**
  * Get dataParty
  * @return dataParty
  */
  @JsonProperty("data_party")
  @NotNull
  public AudienceDataParty getDataParty() {
    return dataParty;
  }

  /**
   * Sets the <code>dataParty</code> property.
   */
 public void setDataParty(AudienceDataParty dataParty) {
    this.dataParty = dataParty;
  }

  /**
   * Sets the <code>dataParty</code> property.
   */
  public AudienceCreateCustomRequest dataParty(AudienceDataParty dataParty) {
    this.dataParty = dataParty;
    return this;
  }

 /**
  * Get category
  * @return category
  */
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  /**
   * Sets the <code>category</code> property.
   */
 public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Sets the <code>category</code> property.
   */
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

