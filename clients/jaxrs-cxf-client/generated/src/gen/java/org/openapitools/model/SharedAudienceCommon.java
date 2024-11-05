package org.openapitools.model;

import org.openapitools.model.OperationType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SharedAudienceCommon  {
  
  @ApiModelProperty(example = "2542621871096", value = "Unique identifier of an audience")
 /**
   * Unique identifier of an audience
  **/
  private String audienceId;

  @ApiModelProperty(value = "")
  private OperationType operationType;
 /**
   * Unique identifier of an audience
   * @return audienceId
  **/
  @JsonProperty("audience_id")
  public String getAudienceId() {
    return audienceId;
  }

  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  public SharedAudienceCommon audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

 /**
   * Get operationType
   * @return operationType
  **/
  @JsonProperty("operation_type")
  public OperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  public SharedAudienceCommon operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedAudienceCommon sharedAudienceCommon = (SharedAudienceCommon) o;
    return Objects.equals(this.audienceId, sharedAudienceCommon.audienceId) &&
        Objects.equals(this.operationType, sharedAudienceCommon.operationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, operationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedAudienceCommon {\n");
    
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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

