package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AudienceDataParty;
import org.openapitools.model.AudienceRule;
import org.openapitools.model.AudienceSharingType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

  /**
   * Ad account ID.
   **/
  public AudienceCreateCustomRequest adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "Ad account ID.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Audience name.
   **/
  public AudienceCreateCustomRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "string", required = true, value = "Audience name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public AudienceCreateCustomRequest rule(AudienceRule rule) {
    this.rule = rule;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("rule")
  public AudienceRule getRule() {
    return rule;
  }
  public void setRule(AudienceRule rule) {
    this.rule = rule;
  }

  /**
   **/
  public AudienceCreateCustomRequest sharingType(AudienceSharingType sharingType) {
    this.sharingType = sharingType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sharing_type")
  public AudienceSharingType getSharingType() {
    return sharingType;
  }
  public void setSharingType(AudienceSharingType sharingType) {
    this.sharingType = sharingType;
  }

  /**
   **/
  public AudienceCreateCustomRequest dataParty(AudienceDataParty dataParty) {
    this.dataParty = dataParty;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data_party")
  public AudienceDataParty getDataParty() {
    return dataParty;
  }
  public void setDataParty(AudienceDataParty dataParty) {
    this.dataParty = dataParty;
  }

  /**
   **/
  public AudienceCreateCustomRequest category(String category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(example = "DLX Demographics", value = "")
  @JsonProperty("category")
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
    return Objects.equals(adAccountId, audienceCreateCustomRequest.adAccountId) &&
        Objects.equals(name, audienceCreateCustomRequest.name) &&
        Objects.equals(rule, audienceCreateCustomRequest.rule) &&
        Objects.equals(sharingType, audienceCreateCustomRequest.sharingType) &&
        Objects.equals(dataParty, audienceCreateCustomRequest.dataParty) &&
        Objects.equals(category, audienceCreateCustomRequest.category);
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

