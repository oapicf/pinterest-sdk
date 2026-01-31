package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AudienceRule;
import org.openapitools.vertxweb.server.model.AudienceType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AudienceCreateRequest   {
  
  private String adAccountId;
  private String name;
  private AudienceRule rule;
  private AudienceType audienceType;
  private String description;

  public AudienceCreateRequest () {

  }

  public AudienceCreateRequest (String adAccountId, String name, AudienceRule rule, AudienceType audienceType, String description) {
    this.adAccountId = adAccountId;
    this.name = name;
    this.rule = rule;
    this.audienceType = audienceType;
    this.description = description;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceCreateRequest audienceCreateRequest = (AudienceCreateRequest) o;
    return Objects.equals(adAccountId, audienceCreateRequest.adAccountId) &&
        Objects.equals(name, audienceCreateRequest.name) &&
        Objects.equals(rule, audienceCreateRequest.rule) &&
        Objects.equals(audienceType, audienceCreateRequest.audienceType) &&
        Objects.equals(description, audienceCreateRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, name, rule, audienceType, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceCreateRequest {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
