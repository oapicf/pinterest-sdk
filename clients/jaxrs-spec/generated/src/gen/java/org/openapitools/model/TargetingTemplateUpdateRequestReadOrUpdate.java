package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AudienceUpdateOperationType;
import org.openapitools.model.TargetingSpecOptimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("TargetingTemplateUpdateRequestReadOrUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingTemplateUpdateRequestReadOrUpdate   {
  private String id;
  private AudienceUpdateOperationType operationType;
  private TargetingSpecOptimal targetingAttributes;

  public TargetingTemplateUpdateRequestReadOrUpdate() {
  }

  @JsonCreator
  public TargetingTemplateUpdateRequestReadOrUpdate(
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "operation_type") AudienceUpdateOperationType operationType
  ) {
    this.id = id;
    this.operationType = operationType;
  }

  /**
   * Targeting template ID
   **/
  public TargetingTemplateUpdateRequestReadOrUpdate id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "643", required = true, value = "Targeting template ID")
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public TargetingTemplateUpdateRequestReadOrUpdate operationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "operation_type")
  @NotNull public AudienceUpdateOperationType getOperationType() {
    return operationType;
  }

  @JsonProperty(required = true, value = "operation_type")
  public void setOperationType(AudienceUpdateOperationType operationType) {
    this.operationType = operationType;
  }

  /**
   * targeting profile attributes
   **/
  public TargetingTemplateUpdateRequestReadOrUpdate targetingAttributes(TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
    return this;
  }

  
  @ApiModelProperty(value = "targeting profile attributes")
  @JsonProperty("targeting_attributes")
  @Valid public TargetingSpecOptimal getTargetingAttributes() {
    return targetingAttributes;
  }

  @JsonProperty("targeting_attributes")
  public void setTargetingAttributes(TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
