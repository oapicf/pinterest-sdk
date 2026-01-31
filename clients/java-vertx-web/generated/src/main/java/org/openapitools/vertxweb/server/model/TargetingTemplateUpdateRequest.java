package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.TargetingSpec;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetingTemplateUpdateRequest   {
  
  private String id;


  public enum OperationTypeEnum {
    REMOVE("REMOVE"),
    UPDATE("UPDATE");

    private String value;

    OperationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private OperationTypeEnum operationType;
  private TargetingSpec targetingAttributes;

  public TargetingTemplateUpdateRequest () {

  }

  public TargetingTemplateUpdateRequest (String id, OperationTypeEnum operationType, TargetingSpec targetingAttributes) {
    this.id = id;
    this.operationType = operationType;
    this.targetingAttributes = targetingAttributes;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("operation_type")
  public OperationTypeEnum getOperationType() {
    return operationType;
  }
  public void setOperationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
  }

    
  @JsonProperty("targeting_attributes")
  public TargetingSpec getTargetingAttributes() {
    return targetingAttributes;
  }
  public void setTargetingAttributes(TargetingSpec targetingAttributes) {
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
    TargetingTemplateUpdateRequest targetingTemplateUpdateRequest = (TargetingTemplateUpdateRequest) o;
    return Objects.equals(id, targetingTemplateUpdateRequest.id) &&
        Objects.equals(operationType, targetingTemplateUpdateRequest.operationType) &&
        Objects.equals(targetingAttributes, targetingTemplateUpdateRequest.targetingAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operationType, targetingAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTemplateUpdateRequest {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
