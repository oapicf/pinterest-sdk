package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OperationType;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class SharedAudience   {
  
  private String audienceId;

  private OperationType operationType;

  private List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds = new ArrayList<>();

  /**
   * Unique identifier of an audience
   **/
  public SharedAudience audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  
  @ApiModelProperty(example = "2542621871096", required = true, value = "Unique identifier of an audience")
  @JsonProperty("audience_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAudienceId() {
    return audienceId;
  }
  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }


  /**
   **/
  public SharedAudience operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation_type")
  @NotNull
  public OperationType getOperationType() {
    return operationType;
  }
  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }


  /**
   * List of ad account IDs to share with or revoke from.
   **/
  public SharedAudience recipientAccountIds(List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of ad account IDs to share with or revoke from.")
  @JsonProperty("recipient_account_ids")
  @NotNull
  public List<@Pattern(regexp = "^\\d+$")String> getRecipientAccountIds() {
    return recipientAccountIds;
  }
  public void setRecipientAccountIds(List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
  }

  public SharedAudience addRecipientAccountIdsItem(String recipientAccountIdsItem) {
    if (this.recipientAccountIds == null) {
      this.recipientAccountIds = new ArrayList<>();
    }
    this.recipientAccountIds.add(recipientAccountIdsItem);
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
    SharedAudience sharedAudience = (SharedAudience) o;
    return Objects.equals(this.audienceId, sharedAudience.audienceId) &&
        Objects.equals(this.operationType, sharedAudience.operationType) &&
        Objects.equals(this.recipientAccountIds, sharedAudience.recipientAccountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, operationType, recipientAccountIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedAudience {\n");
    
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    recipientAccountIds: ").append(toIndentedString(recipientAccountIds)).append("\n");
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

