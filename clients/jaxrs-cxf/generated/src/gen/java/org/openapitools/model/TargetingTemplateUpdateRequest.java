package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingTemplateUpdateRequest  {
  
public enum OperationTypeEnum {

REMOVE(String.valueOf("REMOVE"));


    private String value;

    OperationTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OperationTypeEnum fromValue(String value) {
        for (OperationTypeEnum b : OperationTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private OperationTypeEnum operationType;

  @ApiModelProperty(example = "643", required = true, value = "Targeting template ID")
 /**
   * Targeting template ID
  **/
  private String id;
 /**
   * Get operationType
   * @return operationType
  **/
  @JsonProperty("operation_type")
  @NotNull
  public String getOperationType() {
    if (operationType == null) {
      return null;
    }
    return operationType.value();
  }

  public void setOperationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
  }

  public TargetingTemplateUpdateRequest operationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
    return this;
  }

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

  public TargetingTemplateUpdateRequest id(String id) {
    this.id = id;
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
    TargetingTemplateUpdateRequest targetingTemplateUpdateRequest = (TargetingTemplateUpdateRequest) o;
    return Objects.equals(this.operationType, targetingTemplateUpdateRequest.operationType) &&
        Objects.equals(this.id, targetingTemplateUpdateRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTemplateUpdateRequest {\n");
    
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

