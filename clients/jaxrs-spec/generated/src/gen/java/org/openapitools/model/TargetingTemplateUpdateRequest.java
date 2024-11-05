package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TargetingTemplateUpdateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingTemplateUpdateRequest   {
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static OperationTypeEnum fromString(String s) {
        for (OperationTypeEnum b : OperationTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private OperationTypeEnum operationType;
  private String id;

  /**
   **/
  public TargetingTemplateUpdateRequest operationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation_type")
  @NotNull public OperationTypeEnum getOperationType() {
    return operationType;
  }

  @JsonProperty("operation_type")
  public void setOperationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
  }

  /**
   * Targeting template ID
   **/
  public TargetingTemplateUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "643", required = true, value = "Targeting template ID")
  @JsonProperty("id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

