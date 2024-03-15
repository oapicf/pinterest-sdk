package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AudienceRule;
import org.openapitools.vertxweb.server.model.AudienceUpdateOperationType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AudienceUpdateRequest   {
  
  private String adAccountId;
  private String name;
  private AudienceRule rule;
  private String description;
  private AudienceUpdateOperationType operationType = AudienceUpdateOperationType.UPDATE;

  public AudienceUpdateRequest () {

  }

  public AudienceUpdateRequest (String adAccountId, String name, AudienceRule rule, String description, AudienceUpdateOperationType operationType) {
    this.adAccountId = adAccountId;
    this.name = name;
    this.rule = rule;
    this.description = description;
    this.operationType = operationType;
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

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("operation_type")
  public AudienceUpdateOperationType getOperationType() {
    return operationType;
  }
  public void setOperationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceUpdateRequest audienceUpdateRequest = (AudienceUpdateRequest) o;
    return Objects.equals(adAccountId, audienceUpdateRequest.adAccountId) &&
        Objects.equals(name, audienceUpdateRequest.name) &&
        Objects.equals(rule, audienceUpdateRequest.rule) &&
        Objects.equals(description, audienceUpdateRequest.description) &&
        Objects.equals(operationType, audienceUpdateRequest.operationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, name, rule, description, operationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceUpdateRequest {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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
