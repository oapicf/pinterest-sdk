package org.openapitools.model;

import org.openapitools.model.OperationType;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
public class AdAccountToBusinessSharedAudienceUpdateWithRequiredBody implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Unique identifier of an audience
   */
  @JsonProperty("audience_id")
  private String audienceId;

  @JsonProperty("operation_type")
  private OperationType operationType;

  /**
   * Business IDs to share with or revoke from (request) / that received the audience (response).
   */
  @JsonProperty("recipient_business_ids")
  private List<String> recipientBusinessIds = new ArrayList<>();

  /**
   * Unique identifier of an audience
   * @return audienceId
   */
  public String getAudienceId() {
    return audienceId;
  }

  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  /**
   * 
   * @return operationType
   */
  public OperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  /**
   * Business IDs to share with or revoke from (request) / that received the audience (response).
   * @return recipientBusinessIds
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
