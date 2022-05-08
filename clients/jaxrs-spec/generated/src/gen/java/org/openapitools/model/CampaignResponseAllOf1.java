package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ObjectiveType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CampaignResponse_allOf_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class CampaignResponseAllOf1   {
  
  private @Valid ObjectiveType objectiveType;
  private @Valid Integer createdTime;
  private @Valid Integer updatedTime;
  private @Valid String type;

  /**
   **/
  public CampaignResponseAllOf1 objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("objective_type")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  @JsonProperty("objective_type")
  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

/**
   * Campaign creation time. Unix timestamp in seconds.
   **/
  public CampaignResponseAllOf1 createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  

  
  @ApiModelProperty(example = "1432744744", value = "Campaign creation time. Unix timestamp in seconds.")
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  @JsonProperty("created_time")
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

/**
   * UTC timestamp. Last update time.
   **/
  public CampaignResponseAllOf1 updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  

  
  @ApiModelProperty(example = "1432744744", value = "UTC timestamp. Last update time.")
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  @JsonProperty("updated_time")
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

/**
   * Always \&quot;campaign\&quot;.
   **/
  public CampaignResponseAllOf1 type(String type) {
    this.type = type;
    return this;
  }

  

  
  @ApiModelProperty(example = "campaign", value = "Always \"campaign\".")
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
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

