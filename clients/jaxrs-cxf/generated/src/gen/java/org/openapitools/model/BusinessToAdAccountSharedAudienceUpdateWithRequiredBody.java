package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OperationType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
@ApiModel(description="Resource create or update operation model with required body fields (no OptionalProperties).")

public class BusinessToAdAccountSharedAudienceUpdateWithRequiredBody  {
  
 /**
  * Unique identifier of an audience
  */
  @ApiModelProperty(example = "2542621871096", required = true, value = "Unique identifier of an audience")

  private String audienceId;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private OperationType operationType;

 /**
  * Ad account IDs to share with or revoke from (request) / that received the audience (response).
  */
  @ApiModelProperty(required = true, value = "Ad account IDs to share with or revoke from (request) / that received the audience (response).")

  private List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds = new ArrayList<>();
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

  public BusinessToAdAccountSharedAudienceUpdateWithRequiredBody audienceId(String audienceId) {
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

  public BusinessToAdAccountSharedAudienceUpdateWithRequiredBody operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

 /**
   * Ad account IDs to share with or revoke from (request) / that received the audience (response).
   * @return recipientAccountIds
  **/
  @JsonProperty("recipient_account_ids")
  @NotNull
  public List<@Pattern(regexp = "^\\d+$")String> getRecipientAccountIds() {
    return recipientAccountIds;
  }

  public void setRecipientAccountIds(List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
  }

  public BusinessToAdAccountSharedAudienceUpdateWithRequiredBody recipientAccountIds(List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
    return this;
  }

  public BusinessToAdAccountSharedAudienceUpdateWithRequiredBody addRecipientAccountIdsItem(String recipientAccountIdsItem) {
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
    BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody = (BusinessToAdAccountSharedAudienceUpdateWithRequiredBody) o;
    return Objects.equals(this.audienceId, businessToAdAccountSharedAudienceUpdateWithRequiredBody.audienceId) &&
        Objects.equals(this.operationType, businessToAdAccountSharedAudienceUpdateWithRequiredBody.operationType) &&
        Objects.equals(this.recipientAccountIds, businessToAdAccountSharedAudienceUpdateWithRequiredBody.recipientAccountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, operationType, recipientAccountIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessToAdAccountSharedAudienceUpdateWithRequiredBody {\n");
    
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

