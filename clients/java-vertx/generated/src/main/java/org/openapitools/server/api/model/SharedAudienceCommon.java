package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.OperationType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SharedAudienceCommon   {
  
  private String audienceId;
  private OperationType operationType;

  public SharedAudienceCommon () {

  }

  public SharedAudienceCommon (String audienceId, OperationType operationType) {
    this.audienceId = audienceId;
    this.operationType = operationType;
  }

    
  @JsonProperty("audience_id")
  public String getAudienceId() {
    return audienceId;
  }
  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

    
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
    return Objects.equals(audienceId, sharedAudienceCommon.audienceId) &&
        Objects.equals(operationType, sharedAudienceCommon.operationType);
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
