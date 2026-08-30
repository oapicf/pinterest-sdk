package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OperationType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

@Schema(name = "BusinessToBusinessSharedAudienceUpdateWithRequiredBody", description = "Resource create or update operation model with required body fields (no OptionalProperties).")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessToBusinessSharedAudienceUpdateWithRequiredBody {

  private String audienceId;

  private OperationType operationType;

  @Valid
  private List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds = new ArrayList<>();

  public BusinessToBusinessSharedAudienceUpdateWithRequiredBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BusinessToBusinessSharedAudienceUpdateWithRequiredBody(String audienceId, OperationType operationType, List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds) {
    this.audienceId = audienceId;
    this.operationType = operationType;
    this.recipientBusinessIds = recipientBusinessIds;
  }

  public BusinessToBusinessSharedAudienceUpdateWithRequiredBody audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

  /**
   * Unique identifier of an audience
   * @return audienceId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "audience_id", example = "2542621871096", description = "Unique identifier of an audience", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("audience_id")
  public String getAudienceId() {
    return audienceId;
  }

  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  public BusinessToBusinessSharedAudienceUpdateWithRequiredBody operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Get operationType
   * @return operationType
   */
  @NotNull @Valid 
  @Schema(name = "operation_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation_type")
  public OperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  public BusinessToBusinessSharedAudienceUpdateWithRequiredBody recipientBusinessIds(List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
    return this;
  }

  public BusinessToBusinessSharedAudienceUpdateWithRequiredBody addRecipientBusinessIdsItem(String recipientBusinessIdsItem) {
    if (this.recipientBusinessIds == null) {
      this.recipientBusinessIds = new ArrayList<>();
    }
    this.recipientBusinessIds.add(recipientBusinessIdsItem);
    return this;
  }

  /**
   * Business IDs to share with or revoke from (request) / that received the audience (response).
   * @return recipientBusinessIds
   */
  @NotNull 
  @Schema(name = "recipient_business_ids", description = "Business IDs to share with or revoke from (request) / that received the audience (response).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recipient_business_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getRecipientBusinessIds() {
    return recipientBusinessIds;
  }

  public void setRecipientBusinessIds(List<@Pattern(regexp = "^\\d+$")String> recipientBusinessIds) {
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

