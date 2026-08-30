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
import org.openapitools.model.AudienceUpdateOperationType;

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
@ApiModel(description = "Resource create or update operation model with required body fields (no OptionalProperties).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerSegmentUpdateRequestUpdateWithRequiredBody   {
  @JsonProperty("audience_ids")
  private List<String> audienceIds = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("operation_type")
  private AudienceUpdateOperationType operationType;

  public CustomerSegmentUpdateRequestUpdateWithRequiredBody audienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
    return this;
  }

  public CustomerSegmentUpdateRequestUpdateWithRequiredBody addAudienceIdsItem(String audienceIdsItem) {
    if (this.audienceIds == null) {
      this.audienceIds = new ArrayList<>();
    }
    this.audienceIds.add(audienceIdsItem);
    return this;
  }

   /**
   * Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
   * @return audienceIds
  **/
  @ApiModelProperty(value = "Audience IDs to update the customer segment to. Only applicable for UPDATE operations.")
  public List<String> getAudienceIds() {
    return audienceIds;
  }

  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  public CustomerSegmentUpdateRequestUpdateWithRequiredBody id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Customer segment ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Customer segment ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerSegmentUpdateRequestUpdateWithRequiredBody operationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/
  @ApiModelProperty(required = true, value = "")
  public AudienceUpdateOperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody = (CustomerSegmentUpdateRequestUpdateWithRequiredBody) o;
    return Objects.equals(this.audienceIds, customerSegmentUpdateRequestUpdateWithRequiredBody.audienceIds) &&
        Objects.equals(this.id, customerSegmentUpdateRequestUpdateWithRequiredBody.id) &&
        Objects.equals(this.operationType, customerSegmentUpdateRequestUpdateWithRequiredBody.operationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceIds, id, operationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerSegmentUpdateRequestUpdateWithRequiredBody {\n");
    
    sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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

