package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AudienceDataParty;
import org.openapitools.vertxweb.server.model.AudienceRule;
import org.openapitools.vertxweb.server.model.AudienceSharingType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AudienceCreateCustomRequest   {
  
  private String adAccountId;
  private String name;
  private AudienceRule rule;
  private AudienceSharingType sharingType;
  private AudienceDataParty dataParty;
  private String category;

  public AudienceCreateCustomRequest () {

  }

  public AudienceCreateCustomRequest (String adAccountId, String name, AudienceRule rule, AudienceSharingType sharingType, AudienceDataParty dataParty, String category) {
    this.adAccountId = adAccountId;
    this.name = name;
    this.rule = rule;
    this.sharingType = sharingType;
    this.dataParty = dataParty;
    this.category = category;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("rule")
  public AudienceRule getRule() {
    return rule;
  }
  public void setRule(AudienceRule rule) {
    this.rule = rule;
  }

    
  @JsonProperty("sharing_type")
  public AudienceSharingType getSharingType() {
    return sharingType;
  }
  public void setSharingType(AudienceSharingType sharingType) {
    this.sharingType = sharingType;
  }

    
  @JsonProperty("data_party")
  public AudienceDataParty getDataParty() {
    return dataParty;
  }
  public void setDataParty(AudienceDataParty dataParty) {
    this.dataParty = dataParty;
  }

    
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
