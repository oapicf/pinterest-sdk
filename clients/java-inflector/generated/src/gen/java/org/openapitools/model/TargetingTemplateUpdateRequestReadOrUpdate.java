package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AudienceUpdateOperationType;
import org.openapitools.model.TargetingSpecOptimal;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingTemplateUpdateRequestReadOrUpdate   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("operation_type")
  private AudienceUpdateOperationType operationType;

  @JsonProperty("targeting_attributes")
  private TargetingSpecOptimal targetingAttributes;

  /**
   * Targeting template ID
   **/
  public TargetingTemplateUpdateRequestReadOrUpdate id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "643", required = true, value = "Targeting template ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
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
  @JsonProperty("operation_type")
  public AudienceUpdateOperationType getOperationType() {
    return operationType;
  }
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
  public TargetingSpecOptimal getTargetingAttributes() {
    return targetingAttributes;
  }
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
    return Objects.equals(id, targetingTemplateUpdateRequestReadOrUpdate.id) &&
        Objects.equals(operationType, targetingTemplateUpdateRequestReadOrUpdate.operationType) &&
        Objects.equals(targetingAttributes, targetingTemplateUpdateRequestReadOrUpdate.targetingAttributes);
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

