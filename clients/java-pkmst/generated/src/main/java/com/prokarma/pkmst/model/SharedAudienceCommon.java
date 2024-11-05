package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OperationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * SharedAudienceCommon
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SharedAudienceCommon   {
  @JsonProperty("audience_id")
  private String audienceId;

  @JsonProperty("operation_type")
  private OperationType operationType;

  public SharedAudienceCommon audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  /**
   * Unique identifier of an audience
   * @return audienceId
   */
  @ApiModelProperty(example = "2542621871096", value = "Unique identifier of an audience")
  public String getAudienceId() {
    return audienceId;
  }

  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  public SharedAudienceCommon operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Get operationType
   * @return operationType
   */
  @ApiModelProperty(value = "")
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

