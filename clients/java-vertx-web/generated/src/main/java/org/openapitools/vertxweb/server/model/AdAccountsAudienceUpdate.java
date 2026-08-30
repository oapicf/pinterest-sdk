package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AdAccountsAudienceRule;
import org.openapitools.vertxweb.server.model.AudienceType;
import org.openapitools.vertxweb.server.model.AudienceUpdateOperationType;

/**
 * Resource create or update operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdAccountsAudienceUpdate   {
  
  private String adAccountId;
  private AudienceType audienceType;
  private String description;
  private String name;
  private AudienceUpdateOperationType operationType;
  private AdAccountsAudienceRule rule;

  public AdAccountsAudienceUpdate () {

  }

  public AdAccountsAudienceUpdate (String adAccountId, AudienceType audienceType, String description, String name, AudienceUpdateOperationType operationType, AdAccountsAudienceRule rule) {
    this.adAccountId = adAccountId;
    this.audienceType = audienceType;
    this.description = description;
    this.name = name;
    this.operationType = operationType;
    this.rule = rule;
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

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("operation_type")
  public AudienceUpdateOperationType getOperationType() {
    return operationType;
  }
  public void setOperationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
  }

    
  @JsonProperty("rule")
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
    AdAccountsAudienceUpdate adAccountsAudienceUpdate = (AdAccountsAudienceUpdate) o;
    return Objects.equals(adAccountId, adAccountsAudienceUpdate.adAccountId) &&
        Objects.equals(audienceType, adAccountsAudienceUpdate.audienceType) &&
        Objects.equals(description, adAccountsAudienceUpdate.description) &&
        Objects.equals(name, adAccountsAudienceUpdate.name) &&
        Objects.equals(operationType, adAccountsAudienceUpdate.operationType) &&
        Objects.equals(rule, adAccountsAudienceUpdate.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, audienceType, description, name, operationType, rule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountsAudienceUpdate {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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
