package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OperationType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessSharedAudience   {
  @JsonProperty("audience_id")
  private String audienceId;

  @JsonProperty("operation_type")
  private OperationType operationType;

  @JsonProperty("recipient_business_ids")
  private List<String> recipientBusinessIds = new ArrayList<>();

  /**
   * Unique identifier of an audience
   **/
  public BusinessSharedAudience audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  
  @ApiModelProperty(example = "2542621871096", required = true, value = "Unique identifier of an audience")
  @JsonProperty("audience_id")
  public String getAudienceId() {
    return audienceId;
  }
  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  /**
   **/
  public BusinessSharedAudience operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation_type")
  public OperationType getOperationType() {
    return operationType;
  }
  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  /**
   * List of business IDs to share with or revoke from.
   **/
  public BusinessSharedAudience recipientBusinessIds(List<String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of business IDs to share with or revoke from.")
  @JsonProperty("recipient_business_ids")
  public List<String> getRecipientBusinessIds() {
    return recipientBusinessIds;
  }
  public void setRecipientBusinessIds(List<String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessSharedAudience businessSharedAudience = (BusinessSharedAudience) o;
    return Objects.equals(audienceId, businessSharedAudience.audienceId) &&
        Objects.equals(operationType, businessSharedAudience.operationType) &&
        Objects.equals(recipientBusinessIds, businessSharedAudience.recipientBusinessIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, operationType, recipientBusinessIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessSharedAudience {\n");
    
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    recipientBusinessIds: ").append(toIndentedString(recipientBusinessIds)).append("\n");
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

