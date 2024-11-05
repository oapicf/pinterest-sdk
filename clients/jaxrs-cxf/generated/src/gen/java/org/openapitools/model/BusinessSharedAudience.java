package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OperationType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BusinessSharedAudience  {
  
  @ApiModelProperty(example = "2542621871096", required = true, value = "Unique identifier of an audience")
 /**
   * Unique identifier of an audience
  **/
  private String audienceId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OperationType operationType;

  @ApiModelProperty(required = true, value = "List of business IDs to share with or revoke from.")
 /**
   * List of business IDs to share with or revoke from.
  **/
  private List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds = new ArrayList<>();
 /**
   * Unique identifier of an audience
   * @return audienceId
  **/
  @JsonProperty("audience_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAudienceId() {
    return audienceId;
  }

  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  public BusinessSharedAudience audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

 /**
   * Get operationType
   * @return operationType
  **/
  @JsonProperty("operation_type")
  @NotNull
  public OperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  public BusinessSharedAudience operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

 /**
   * List of business IDs to share with or revoke from.
   * @return recipientBusinessIds
  **/
  @JsonProperty("recipient_business_ids")
  @NotNull
  public List<@Pattern(regexp = "^\\d+$")String> getRecipientBusinessIds() {
    return recipientBusinessIds;
  }

  public void setRecipientBusinessIds(List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
  }

  public BusinessSharedAudience recipientBusinessIds(List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
    return this;
  }

  public BusinessSharedAudience addRecipientBusinessIdsItem(String recipientBusinessIdsItem) {
    this.recipientBusinessIds.add(recipientBusinessIdsItem);
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
    BusinessSharedAudience businessSharedAudience = (BusinessSharedAudience) o;
    return Objects.equals(this.audienceId, businessSharedAudience.audienceId) &&
        Objects.equals(this.operationType, businessSharedAudience.operationType) &&
        Objects.equals(this.recipientBusinessIds, businessSharedAudience.recipientBusinessIds);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

