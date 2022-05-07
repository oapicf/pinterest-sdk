package org.openapitools.model;

import org.openapitools.model.ObjectiveType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignResponseAllOf1  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ObjectiveType objectiveType;

 /**
  * Campaign creation time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1432744744", value = "Campaign creation time. Unix timestamp in seconds.")
  private Integer createdTime;

 /**
  * UTC timestamp. Last update time.
  */
  @ApiModelProperty(example = "1432744744", value = "UTC timestamp. Last update time.")
  private Integer updatedTime;

 /**
  * Always \"campaign\".
  */
  @ApiModelProperty(example = "campaign", value = "Always \"campaign\".")
  private String type;
 /**
  * Get objectiveType
  * @return objectiveType
  */
  @JsonProperty("objective_type")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  /**
   * Sets the <code>objectiveType</code> property.
   */
 public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   * Sets the <code>objectiveType</code> property.
   */
  public CampaignResponseAllOf1 objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

 /**
  * Campaign creation time. Unix timestamp in seconds.
  * @return createdTime
  */
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
 public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
  public CampaignResponseAllOf1 createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * UTC timestamp. Last update time.
  * @return updatedTime
  */
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
 public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
  public CampaignResponseAllOf1 updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

 /**
  * Always \&quot;campaign\&quot;.
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public CampaignResponseAllOf1 type(String type) {
    this.type = type;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

