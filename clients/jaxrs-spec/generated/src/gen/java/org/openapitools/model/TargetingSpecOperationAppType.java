package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TargetingSpecAppType;
import org.openapitools.model.TargetingSpecListOperation;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("TargetingSpecOperationAppType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingSpecOperationAppType   {
  public enum FieldEnum {

    APPTYPE(String.valueOf("APPTYPE"));


    private String value;

    FieldEnum (String v) {
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
    public static FieldEnum fromString(String s) {
        for (FieldEnum b : FieldEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static FieldEnum fromValue(String value) {
        for (FieldEnum b : FieldEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private FieldEnum field;
  private TargetingSpecListOperation operation;
  private @Valid List<TargetingSpecAppType> values = new ArrayList<>();

  public TargetingSpecOperationAppType() {
  }

  @JsonCreator
  public TargetingSpecOperationAppType(
    @JsonProperty(required = true, value = "field") FieldEnum field,
    @JsonProperty(required = true, value = "operation") TargetingSpecListOperation operation,
    @JsonProperty(required = true, value = "values") List<TargetingSpecAppType> values
  ) {
    this.field = field;
    this.operation = operation;
    this.values = values;
  }

  /**
   **/
  public TargetingSpecOperationAppType field(FieldEnum field) {
    this.field = field;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "field")
  @NotNull public FieldEnum getField() {
    return field;
  }

  @JsonProperty(required = true, value = "field")
  public void setField(FieldEnum field) {
    this.field = field;
  }

  /**
   **/
  public TargetingSpecOperationAppType operation(TargetingSpecListOperation operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "operation")
  @NotNull public TargetingSpecListOperation getOperation() {
    return operation;
  }

  @JsonProperty(required = true, value = "operation")
  public void setOperation(TargetingSpecListOperation operation) {
    this.operation = operation;
  }

  /**
   **/
  public TargetingSpecOperationAppType values(List<TargetingSpecAppType> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "values")
  @NotNull public List<TargetingSpecAppType> getValues() {
    return values;
  }

  @JsonProperty(required = true, value = "values")
  public void setValues(List<TargetingSpecAppType> values) {
    this.values = values;
  }

  public TargetingSpecOperationAppType addValuesItem(TargetingSpecAppType valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }

    this.values.add(valuesItem);
    return this;
  }

  public TargetingSpecOperationAppType removeValuesItem(TargetingSpecAppType valuesItem) {
    if (valuesItem != null && this.values != null) {
      this.values.remove(valuesItem);
    }

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
    TargetingSpecOperationAppType targetingSpecOperationAppType = (TargetingSpecOperationAppType) o;
    return Objects.equals(this.field, targetingSpecOperationAppType.field) &&
        Objects.equals(this.operation, targetingSpecOperationAppType.operation) &&
        Objects.equals(this.values, targetingSpecOperationAppType.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operation, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSpecOperationAppType {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
