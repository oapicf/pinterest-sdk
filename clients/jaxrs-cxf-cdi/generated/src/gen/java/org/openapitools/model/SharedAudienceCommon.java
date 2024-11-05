package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OperationType;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class SharedAudienceCommon   {
  
  private String audienceId;

  private OperationType operationType;

  /**
   * Unique identifier of an audience
   **/
  public SharedAudienceCommon audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  
  @ApiModelProperty(example = "2542621871096", value = "Unique identifier of an audience")
  @JsonProperty("audience_id")
 @Pattern(regexp="^\\d+$")  public String getAudienceId() {
    return audienceId;
  }
  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }


  /**
   **/
  public SharedAudienceCommon operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("operation_type")
  public OperationType getOperationType() {
    return operationType;
  }
  public void setOperationType(OperationType operationType) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

