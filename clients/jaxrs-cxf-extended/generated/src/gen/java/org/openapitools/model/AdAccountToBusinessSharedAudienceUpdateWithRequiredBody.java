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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
@ApiModel(description="Resource create or update operation model with required body fields (no OptionalProperties).")

public class AdAccountToBusinessSharedAudienceUpdateWithRequiredBody  {
  
 /**
  * Unique identifier of an audience
  */
  @ApiModelProperty(example = "2542621871096", required = true, value = "Unique identifier of an audience")
  private String audienceId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OperationType operationType;

 /**
  * Business IDs to share with or revoke from (request) / that received the audience (response).
  */
  @ApiModelProperty(required = true, value = "Business IDs to share with or revoke from (request) / that received the audience (response).")
  private List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds = new ArrayList<>();
 /**
  * Unique identifier of an audience
  * @return audienceId
  */
  @JsonProperty("audience_id")
  @NotNull
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
  public AdAccountToBusinessSharedAudienceUpdateWithRequiredBody audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

 /**
  * Get operationType
  * @return operationType
  */
  @JsonProperty("operation_type")
  @NotNull
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
  public AdAccountToBusinessSharedAudienceUpdateWithRequiredBody operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

 /**
  * Business IDs to share with or revoke from (request) / that received the audience (response).
  * @return recipientBusinessIds
  */
  @JsonProperty("recipient_business_ids")
  @NotNull
  public List<@Pattern(regexp = "^\\d+$")String> getRecipientBusinessIds() {
    return recipientBusinessIds;
  }

  /**
   * Sets the <code>recipientBusinessIds</code> property.
   */
 public void setRecipientBusinessIds(List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
  }

  /**
   * Sets the <code>recipientBusinessIds</code> property.
   */
  public AdAccountToBusinessSharedAudienceUpdateWithRequiredBody recipientBusinessIds(List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
    return this;
  }

  /**
   * Adds a new item to the <code>recipientBusinessIds</code> list.
   */
  public AdAccountToBusinessSharedAudienceUpdateWithRequiredBody addRecipientBusinessIdsItem(String recipientBusinessIdsItem) {
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
    AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody = (AdAccountToBusinessSharedAudienceUpdateWithRequiredBody) o;
    return Objects.equals(this.audienceId, adAccountToBusinessSharedAudienceUpdateWithRequiredBody.audienceId) &&
        Objects.equals(this.operationType, adAccountToBusinessSharedAudienceUpdateWithRequiredBody.operationType) &&
        Objects.equals(this.recipientBusinessIds, adAccountToBusinessSharedAudienceUpdateWithRequiredBody.recipientBusinessIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, operationType, recipientBusinessIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountToBusinessSharedAudienceUpdateWithRequiredBody {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

