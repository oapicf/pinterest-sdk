package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OperationType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SharedAudienceCommon  {
  
 /**
  * Unique identifier of an audience
  */
  @ApiModelProperty(example = "2542621871096", value = "Unique identifier of an audience")
  private String audienceId;

  @ApiModelProperty(value = "")
  @Valid
  private OperationType operationType;
 /**
  * Unique identifier of an audience
  * @return audienceId
  */
  @JsonProperty("audience_id")
 @Pattern(regexp="^\\d+$")  public String getAudienceId() {
    return audienceId;
  }

  /**
   * Sets the <code>audienceId</code> property.
   */
 public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  /**
   * Sets the <code>audienceId</code> property.
   */
  public SharedAudienceCommon audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

 /**
  * Get operationType
  * @return operationType
  */
  @JsonProperty("operation_type")
  public OperationType getOperationType() {
    return operationType;
  }

  /**
   * Sets the <code>operationType</code> property.
   */
 public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  /**
   * Sets the <code>operationType</code> property.
   */
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

