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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 **/
@ApiModel(description = "Resource create or update operation model with required body fields (no OptionalProperties).")
@JsonTypeName("BusinessToBusinessSharedAudienceUpdateWithRequiredBody")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessToBusinessSharedAudienceUpdateWithRequiredBody   {
  private String audienceId;
  private OperationType operationType;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds = new ArrayList<>();

  public BusinessToBusinessSharedAudienceUpdateWithRequiredBody() {
  }

  @JsonCreator
  public BusinessToBusinessSharedAudienceUpdateWithRequiredBody(
    @JsonProperty(required = true, value = "audience_id") String audienceId,
    @JsonProperty(required = true, value = "operation_type") OperationType operationType,
    @JsonProperty(required = true, value = "recipient_business_ids") List< @Pattern(regexp="^\\d+$")String> recipientBusinessIds
  ) {
    this.audienceId = audienceId;
    this.operationType = operationType;
    this.recipientBusinessIds = recipientBusinessIds;
  }

  /**
   * Unique identifier of an audience
   **/
  public BusinessToBusinessSharedAudienceUpdateWithRequiredBody audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  
  @ApiModelProperty(example = "2542621871096", required = true, value = "Unique identifier of an audience")
  @JsonProperty(required = true, value = "audience_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getAudienceId() {
    return audienceId;
  }

  @JsonProperty(required = true, value = "audience_id")
  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  /**
   **/
  public BusinessToBusinessSharedAudienceUpdateWithRequiredBody operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "operation_type")
  @NotNull public OperationType getOperationType() {
    return operationType;
  }

  @JsonProperty(required = true, value = "operation_type")
  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  /**
   * Business IDs to share with or revoke from (request) / that received the audience (response).
   **/
  public BusinessToBusinessSharedAudienceUpdateWithRequiredBody recipientBusinessIds(List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Business IDs to share with or revoke from (request) / that received the audience (response).")
  @JsonProperty(required = true, value = "recipient_business_ids")
  @NotNull public List< @Pattern(regexp="^\\d+$")String> getRecipientBusinessIds() {
    return recipientBusinessIds;
  }

  @JsonProperty(required = true, value = "recipient_business_ids")
  public void setRecipientBusinessIds(List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
  }

  public BusinessToBusinessSharedAudienceUpdateWithRequiredBody addRecipientBusinessIdsItem(String recipientBusinessIdsItem) {
    if (this.recipientBusinessIds == null) {
      this.recipientBusinessIds = new ArrayList<>();
    }

    this.recipientBusinessIds.add(recipientBusinessIdsItem);
    return this;
  }

  public BusinessToBusinessSharedAudienceUpdateWithRequiredBody removeRecipientBusinessIdsItem(String recipientBusinessIdsItem) {
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
    BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody = (BusinessToBusinessSharedAudienceUpdateWithRequiredBody) o;
    return Objects.equals(this.audienceId, businessToBusinessSharedAudienceUpdateWithRequiredBody.audienceId) &&
        Objects.equals(this.operationType, businessToBusinessSharedAudienceUpdateWithRequiredBody.operationType) &&
        Objects.equals(this.recipientBusinessIds, businessToBusinessSharedAudienceUpdateWithRequiredBody.recipientBusinessIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, operationType, recipientBusinessIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessToBusinessSharedAudienceUpdateWithRequiredBody {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
