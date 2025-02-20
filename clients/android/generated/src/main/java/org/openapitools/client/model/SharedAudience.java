/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.OperationType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SharedAudience {
  
  @SerializedName("audience_id")
  private String audienceId = null;
  @SerializedName("operation_type")
  private OperationType operationType = null;
  @SerializedName("recipient_account_ids")
  private List<String> recipientAccountIds = null;

  /**
   * Unique identifier of an audience
   **/
  @ApiModelProperty(required = true, value = "Unique identifier of an audience")
  public String getAudienceId() {
    return audienceId;
  }
  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OperationType getOperationType() {
    return operationType;
  }
  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  /**
   * List of ad account IDs to share with or revoke from.
   **/
  @ApiModelProperty(required = true, value = "List of ad account IDs to share with or revoke from.")
  public List<String> getRecipientAccountIds() {
    return recipientAccountIds;
  }
  public void setRecipientAccountIds(List<String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedAudience sharedAudience = (SharedAudience) o;
    return (this.audienceId == null ? sharedAudience.audienceId == null : this.audienceId.equals(sharedAudience.audienceId)) &&
        (this.operationType == null ? sharedAudience.operationType == null : this.operationType.equals(sharedAudience.operationType)) &&
        (this.recipientAccountIds == null ? sharedAudience.recipientAccountIds == null : this.recipientAccountIds.equals(sharedAudience.recipientAccountIds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.audienceId == null ? 0: this.audienceId.hashCode());
    result = 31 * result + (this.operationType == null ? 0: this.operationType.hashCode());
    result = 31 * result + (this.recipientAccountIds == null ? 0: this.recipientAccountIds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedAudience {\n");
    
    sb.append("  audienceId: ").append(audienceId).append("\n");
    sb.append("  operationType: ").append(operationType).append("\n");
    sb.append("  recipientAccountIds: ").append(recipientAccountIds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
