package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ObjectiveType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CampaignResponseAllOf1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-07T10:48:11.625089Z[Etc/UTC]")
public class CampaignResponseAllOf1   {

  @JsonProperty("objective_type")
  private ObjectiveType objectiveType;

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("updated_time")
  private Integer updatedTime;

  @JsonProperty("type")
  private String type;

  public CampaignResponseAllOf1 objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  /**
   * Get objectiveType
   * @return objectiveType
  */
  @Valid 
  @Schema(name = "objective_type", required = false)
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignResponseAllOf1 createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Campaign creation time. Unix timestamp in seconds.
   * @return createdTime
  */
  
  @Schema(name = "created_time", example = "1432744744", description = "Campaign creation time. Unix timestamp in seconds.", required = false)
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public CampaignResponseAllOf1 updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * UTC timestamp. Last update time.
   * @return updatedTime
  */
  
  @Schema(name = "updated_time", example = "1432744744", description = "UTC timestamp. Last update time.", required = false)
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public CampaignResponseAllOf1 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Always \"campaign\".
   * @return type
  */
  
  @Schema(name = "type", example = "campaign", description = "Always \"campaign\".", required = false)
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
    return Objects.equals(this.objectiveType, campaignResponseAllOf1.objectiveType) &&
        Objects.equals(this.createdTime, campaignResponseAllOf1.createdTime) &&
        Objects.equals(this.updatedTime, campaignResponseAllOf1.updatedTime) &&
        Objects.equals(this.type, campaignResponseAllOf1.type);
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

