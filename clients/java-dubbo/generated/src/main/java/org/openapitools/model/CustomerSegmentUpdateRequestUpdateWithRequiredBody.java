package org.openapitools.model;

import org.openapitools.model.AudienceUpdateOperationType;
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
public class CustomerSegmentUpdateRequestUpdateWithRequiredBody implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
   */
  @JsonProperty("audience_ids")
  private List<String> audienceIds = new ArrayList<>();

  /**
   * Customer segment ID.
   */
  @JsonProperty("id")
  private String id;

  @JsonProperty("operation_type")
  private AudienceUpdateOperationType operationType;

  /**
   * Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
   * @return audienceIds
   */
  public List<String> getAudienceIds() {
    return audienceIds;
  }

  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  /**
   * Customer segment ID.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * 
   * @return operationType
   */
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
