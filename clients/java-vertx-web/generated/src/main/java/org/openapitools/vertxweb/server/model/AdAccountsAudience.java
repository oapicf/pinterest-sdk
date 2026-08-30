package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AdAccountsAudienceRule;
import org.openapitools.vertxweb.server.model.AudienceStatus;
import org.openapitools.vertxweb.server.model.AudienceType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdAccountsAudience   {
  
  private String adAccountId;
  private AudienceType audienceType;
  private String createdByCompanyName;
  private Integer createdTimestamp;
  private String description;
  private String id;
  private Boolean isNca;
  private String name;
  private AdAccountsAudienceRule rule;
  private Integer size;
  private AudienceStatus status;
  private String type;
  private Integer updatedTimestamp;

  public AdAccountsAudience () {

  }

  public AdAccountsAudience (String adAccountId, AudienceType audienceType, String createdByCompanyName, Integer createdTimestamp, String description, String id, Boolean isNca, String name, AdAccountsAudienceRule rule, Integer size, AudienceStatus status, String type, Integer updatedTimestamp) {
    this.adAccountId = adAccountId;
    this.audienceType = audienceType;
    this.createdByCompanyName = createdByCompanyName;
    this.createdTimestamp = createdTimestamp;
    this.description = description;
    this.id = id;
    this.isNca = isNca;
    this.name = name;
    this.rule = rule;
    this.size = size;
    this.status = status;
    this.type = type;
    this.updatedTimestamp = updatedTimestamp;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("audience_type")
  public AudienceType getAudienceType() {
    return audienceType;
  }
  public void setAudienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
  }

    
  @JsonProperty("created_by_company_name")
  public String getCreatedByCompanyName() {
    return createdByCompanyName;
  }
  public void setCreatedByCompanyName(String createdByCompanyName) {
    this.createdByCompanyName = createdByCompanyName;
  }

    
  @JsonProperty("created_timestamp")
  public Integer getCreatedTimestamp() {
    return createdTimestamp;
  }
  public void setCreatedTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("is_nca")
  public Boolean getIsNca() {
    return isNca;
  }
  public void setIsNca(Boolean isNca) {
    this.isNca = isNca;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("rule")
  public AdAccountsAudienceRule getRule() {
    return rule;
  }
  public void setRule(AdAccountsAudienceRule rule) {
    this.rule = rule;
  }

    
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

    
  @JsonProperty("status")
  public AudienceStatus getStatus() {
    return status;
  }
  public void setStatus(AudienceStatus status) {
    this.status = status;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("updated_timestamp")
  public Integer getUpdatedTimestamp() {
    return updatedTimestamp;
  }
  public void setUpdatedTimestamp(Integer updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccountsAudience adAccountsAudience = (AdAccountsAudience) o;
    return Objects.equals(adAccountId, adAccountsAudience.adAccountId) &&
        Objects.equals(audienceType, adAccountsAudience.audienceType) &&
        Objects.equals(createdByCompanyName, adAccountsAudience.createdByCompanyName) &&
        Objects.equals(createdTimestamp, adAccountsAudience.createdTimestamp) &&
        Objects.equals(description, adAccountsAudience.description) &&
        Objects.equals(id, adAccountsAudience.id) &&
        Objects.equals(isNca, adAccountsAudience.isNca) &&
        Objects.equals(name, adAccountsAudience.name) &&
        Objects.equals(rule, adAccountsAudience.rule) &&
        Objects.equals(size, adAccountsAudience.size) &&
        Objects.equals(status, adAccountsAudience.status) &&
        Objects.equals(type, adAccountsAudience.type) &&
        Objects.equals(updatedTimestamp, adAccountsAudience.updatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, audienceType, createdByCompanyName, createdTimestamp, description, id, isNca, name, rule, size, status, type, updatedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountsAudience {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    createdByCompanyName: ").append(toIndentedString(createdByCompanyName)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isNca: ").append(toIndentedString(isNca)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
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
