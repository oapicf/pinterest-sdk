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
import org.openapitools.model.AudienceUpdateOperationType;



/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

@ApiModel(description = "Resource create or update operation model with required body fields (no OptionalProperties).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerSegmentUpdateRequestUpdateWithRequiredBody   {
  
  private List<String> audienceIds = new ArrayList<>();
  private String id;
  private AudienceUpdateOperationType operationType;

  /**
   * Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
   */
  public CustomerSegmentUpdateRequestUpdateWithRequiredBody audienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
    return this;
  }

  
  @ApiModelProperty(value = "Audience IDs to update the customer segment to. Only applicable for UPDATE operations.")
  @JsonProperty("audience_ids")
  public List<String> getAudienceIds() {
    return audienceIds;
  }
  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  /**
   * Customer segment ID.
   */
  public CustomerSegmentUpdateRequestUpdateWithRequiredBody id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Customer segment ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   */
  public CustomerSegmentUpdateRequestUpdateWithRequiredBody operationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation_type")
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
    return Objects.equals(audienceIds, customerSegmentUpdateRequestUpdateWithRequiredBody.audienceIds) &&
        Objects.equals(id, customerSegmentUpdateRequestUpdateWithRequiredBody.id) &&
        Objects.equals(operationType, customerSegmentUpdateRequestUpdateWithRequiredBody.operationType);
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

