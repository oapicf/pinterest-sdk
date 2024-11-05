package org.openapitools.model;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("BusinessSharedAudience")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessSharedAudience   {
  private String audienceId;
  private OperationType operationType;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds = new ArrayList<>();

  /**
   * Unique identifier of an audience
   **/
  public BusinessSharedAudience audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  
  @ApiModelProperty(example = "2542621871096", required = true, value = "Unique identifier of an audience")
  @JsonProperty("audience_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getAudienceId() {
    return audienceId;
  }

  @JsonProperty("audience_id")
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
  @NotNull public OperationType getOperationType() {
    return operationType;
  }

  @JsonProperty("operation_type")
  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  /**
   * List of business IDs to share with or revoke from.
   **/
  public BusinessSharedAudience recipientBusinessIds(List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of business IDs to share with or revoke from.")
  @JsonProperty("recipient_business_ids")
  @NotNull public List< @Pattern(regexp="^\\d+$")String> getRecipientBusinessIds() {
    return recipientBusinessIds;
  }

  @JsonProperty("recipient_business_ids")
  public void setRecipientBusinessIds(List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
  }

  public BusinessSharedAudience addRecipientBusinessIdsItem(String recipientBusinessIdsItem) {
    if (this.recipientBusinessIds == null) {
      this.recipientBusinessIds = new ArrayList<>();
    }

    this.recipientBusinessIds.add(recipientBusinessIdsItem);
    return this;
  }

  public BusinessSharedAudience removeRecipientBusinessIdsItem(String recipientBusinessIdsItem) {
    if (recipientBusinessIdsItem != null && this.recipientBusinessIds != null) {
      this.recipientBusinessIds.remove(recipientBusinessIdsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

