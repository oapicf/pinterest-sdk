package apimodels;

import apimodels.ObjectiveType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * CampaignResponseAllOf1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-07T06:39:52.689511Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignResponseAllOf1   {
  @JsonProperty("objective_type")
  @Valid

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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

