package apimodels;

import apimodels.OperationType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BusinessToAdAccountSharedAudienceUpdateWithRequiredBody   {
  @JsonProperty("audience_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String audienceId;

  @JsonProperty("operation_type")
  @NotNull
@Valid

  private OperationType operationType;

  @JsonProperty("recipient_account_ids")
  @NotNull

  private List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds = new ArrayList<>();

  public BusinessToAdAccountSharedAudienceUpdateWithRequiredBody audienceId(String audienceId) {
    this.audienceId = audienceId;
    return this;
  }

   /**
   * Unique identifier of an audience
   * @return audienceId
  **/
  public String getAudienceId() {
    return audienceId;
  }

  public void setAudienceId(String audienceId) {
    this.audienceId = audienceId;
  }

  public BusinessToAdAccountSharedAudienceUpdateWithRequiredBody operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/
  public OperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  public BusinessToAdAccountSharedAudienceUpdateWithRequiredBody recipientAccountIds(List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds) {
    this.recipientAccountIds = recipientAccountIds;
    return this;
  }

  public BusinessToAdAccountSharedAudienceUpdateWithRequiredBody addRecipientAccountIdsItem(String recipientAccountIdsItem) {
    if (this.recipientAccountIds == null) {
      this.recipientAccountIds = new ArrayList<>();
    }
    this.recipientAccountIds.add(recipientAccountIdsItem);
    return this;
  }

   /**
   * Ad account IDs to share with or revoke from (request) / that received the audience (response).
   * @return recipientAccountIds
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getRecipientAccountIds() {
    return recipientAccountIds;
  }

  public void setRecipientAccountIds(List<@Pattern(regexp = "^\\d+$")String> recipientAccountIds) {
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
    BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody = (BusinessToAdAccountSharedAudienceUpdateWithRequiredBody) o;
    return Objects.equals(audienceId, businessToAdAccountSharedAudienceUpdateWithRequiredBody.audienceId) &&
        Objects.equals(operationType, businessToAdAccountSharedAudienceUpdateWithRequiredBody.operationType) &&
        Objects.equals(recipientAccountIds, businessToAdAccountSharedAudienceUpdateWithRequiredBody.recipientAccountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceId, operationType, recipientAccountIds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

