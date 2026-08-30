/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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



/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

@ApiModel(description = "Resource create or update operation model with required body fields (no OptionalProperties).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountToBusinessSharedAudienceUpdateWithRequiredBody   {
  
  private String audienceId;
  private OperationType operationType;
  private List<String> recipientBusinessIds = new ArrayList<>();

  /**
   * Unique identifier of an audience
   */
  public AdAccountToBusinessSharedAudienceUpdateWithRequiredBody audienceId(String audienceId) {
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
   */
  public AdAccountToBusinessSharedAudienceUpdateWithRequiredBody operationType(OperationType operationType) {
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
   * Business IDs to share with or revoke from (request) / that received the audience (response).
   */
  public AdAccountToBusinessSharedAudienceUpdateWithRequiredBody recipientBusinessIds(List<String> recipientBusinessIds) {
    this.recipientBusinessIds = recipientBusinessIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Business IDs to share with or revoke from (request) / that received the audience (response).")
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
    AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody = (AdAccountToBusinessSharedAudienceUpdateWithRequiredBody) o;
    return Objects.equals(audienceId, adAccountToBusinessSharedAudienceUpdateWithRequiredBody.audienceId) &&
        Objects.equals(operationType, adAccountToBusinessSharedAudienceUpdateWithRequiredBody.operationType) &&
        Objects.equals(recipientBusinessIds, adAccountToBusinessSharedAudienceUpdateWithRequiredBody.recipientBusinessIds);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

