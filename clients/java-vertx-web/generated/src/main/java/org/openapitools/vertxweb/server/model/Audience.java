package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AudienceRule;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Audience   {
  
  private String adAccountId;
  private String id;
  private String name;
  private String audienceType;
  private String description;
  private AudienceRule rule;
  private Integer size;
  private String status;
  private String type;
  private Integer createdTimestamp;
  private Integer updatedTimestamp;

  public Audience () {

  }

  public Audience (String adAccountId, String id, String name, String audienceType, String description, AudienceRule rule, Integer size, String status, String type, Integer createdTimestamp, Integer updatedTimestamp) {
    this.adAccountId = adAccountId;
    this.id = id;
    this.name = name;
    this.audienceType = audienceType;
    this.description = description;
    this.rule = rule;
    this.size = size;
    this.status = status;
    this.type = type;
    this.createdTimestamp = createdTimestamp;
    this.updatedTimestamp = updatedTimestamp;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("audience_type")
  public String getAudienceType() {
    return audienceType;
  }
  public void setAudienceType(String audienceType) {
    this.audienceType = audienceType;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("rule")
  public AudienceRule getRule() {
    return rule;
  }
  public void setRule(AudienceRule rule) {
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
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("created_timestamp")
  public Integer getCreatedTimestamp() {
    return createdTimestamp;
  }
  public void setCreatedTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
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
    Audience audience = (Audience) o;
    return Objects.equals(adAccountId, audience.adAccountId) &&
        Objects.equals(id, audience.id) &&
        Objects.equals(name, audience.name) &&
        Objects.equals(audienceType, audience.audienceType) &&
        Objects.equals(description, audience.description) &&
        Objects.equals(rule, audience.rule) &&
        Objects.equals(size, audience.size) &&
        Objects.equals(status, audience.status) &&
        Objects.equals(type, audience.type) &&
        Objects.equals(createdTimestamp, audience.createdTimestamp) &&
        Objects.equals(updatedTimestamp, audience.updatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, id, name, audienceType, description, rule, size, status, type, createdTimestamp, updatedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Audience {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
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
