package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AudienceUpdateOperationType;
import org.openapitools.model.TargetingSpecOptimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingTemplateUpdateRequestReadOrUpdate  {
  
 /**
  * Targeting template ID
  */
  @ApiModelProperty(example = "643", required = true, value = "Targeting template ID")

  private String id;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private AudienceUpdateOperationType operationType;

 /**
  * targeting profile attributes
  */
  @ApiModelProperty(value = "targeting profile attributes")

  @Valid

  private TargetingSpecOptimal targetingAttributes;
 /**
   * Targeting template ID
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TargetingTemplateUpdateRequestReadOrUpdate id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get operationType
   * @return operationType
  **/
  @JsonProperty("operation_type")
  @NotNull
  public AudienceUpdateOperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
  }

  public TargetingTemplateUpdateRequestReadOrUpdate operationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

 /**
   * targeting profile attributes
   * @return targetingAttributes
  **/
  @JsonProperty("targeting_attributes")
  public TargetingSpecOptimal getTargetingAttributes() {
    return targetingAttributes;
  }

  public void setTargetingAttributes(TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  public TargetingTemplateUpdateRequestReadOrUpdate targetingAttributes(TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
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
    TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate = (TargetingTemplateUpdateRequestReadOrUpdate) o;
    return Objects.equals(this.id, targetingTemplateUpdateRequestReadOrUpdate.id) &&
        Objects.equals(this.operationType, targetingTemplateUpdateRequestReadOrUpdate.operationType) &&
        Objects.equals(this.targetingAttributes, targetingTemplateUpdateRequestReadOrUpdate.targetingAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operationType, targetingAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTemplateUpdateRequestReadOrUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    targetingAttributes: ").append(toIndentedString(targetingAttributes)).append("\n");
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

