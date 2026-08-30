package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AudienceUpdateOperationType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
@ApiModel(description="Resource create or update operation model with required body fields (no OptionalProperties).")

public class CustomerSegmentUpdateRequestUpdateWithRequiredBody  {
  
 /**
  * Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
  */
  @ApiModelProperty(value = "Audience IDs to update the customer segment to. Only applicable for UPDATE operations.")
  private List<String> audienceIds = new ArrayList<>();

 /**
  * Customer segment ID.
  */
  @ApiModelProperty(required = true, value = "Customer segment ID.")
  private String id;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AudienceUpdateOperationType operationType;
 /**
  * Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
  * @return audienceIds
  */
  @JsonProperty("audience_ids")
  public List<String> getAudienceIds() {
    return audienceIds;
  }

  /**
   * Sets the <code>audienceIds</code> property.
   */
 public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  /**
   * Sets the <code>audienceIds</code> property.
   */
  public CustomerSegmentUpdateRequestUpdateWithRequiredBody audienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
    return this;
  }

  /**
   * Adds a new item to the <code>audienceIds</code> list.
   */
  public CustomerSegmentUpdateRequestUpdateWithRequiredBody addAudienceIdsItem(String audienceIdsItem) {
    this.audienceIds.add(audienceIdsItem);
    return this;
  }

 /**
  * Customer segment ID.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CustomerSegmentUpdateRequestUpdateWithRequiredBody id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get operationType
  * @return operationType
  */
  @JsonProperty("operation_type")
  @NotNull
  public AudienceUpdateOperationType getOperationType() {
    return operationType;
  }

  /**
   * Sets the <code>operationType</code> property.
   */
 public void setOperationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
  }

  /**
   * Sets the <code>operationType</code> property.
   */
  public CustomerSegmentUpdateRequestUpdateWithRequiredBody operationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

