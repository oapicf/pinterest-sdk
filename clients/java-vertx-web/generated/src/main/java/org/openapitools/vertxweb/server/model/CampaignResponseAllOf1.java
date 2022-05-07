package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ObjectiveType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignResponseAllOf1   {
  
  private ObjectiveType objectiveType;
  private Integer createdTime;
  private Integer updatedTime;
  private String type;

  public CampaignResponseAllOf1 () {

  }

  public CampaignResponseAllOf1 (ObjectiveType objectiveType, Integer createdTime, Integer updatedTime, String type) {
    this.objectiveType = objectiveType;
    this.createdTime = createdTime;
    this.updatedTime = updatedTime;
    this.type = type;
  }

    
  @JsonProperty("objective_type")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignResponseAllOf1 campaignResponseAllOf1 = (CampaignResponseAllOf1) o;
    return Objects.equals(objectiveType, campaignResponseAllOf1.objectiveType) &&
        Objects.equals(createdTime, campaignResponseAllOf1.createdTime) &&
        Objects.equals(updatedTime, campaignResponseAllOf1.updatedTime) &&
        Objects.equals(type, campaignResponseAllOf1.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectiveType, createdTime, updatedTime, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignResponseAllOf1 {\n");
    
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
