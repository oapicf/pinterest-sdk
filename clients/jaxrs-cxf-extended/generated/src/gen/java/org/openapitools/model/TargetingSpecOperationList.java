package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingSpecOperationList  {
  
  @ApiModelProperty(required = true, value = "")
  private String field;

public enum OperationEnum {

    @JsonProperty("SET") SET(String.valueOf("SET")),
    @JsonProperty("ADD") ADD(String.valueOf("ADD")),
    @JsonProperty("REMOVE") REMOVE(String.valueOf("REMOVE"));

    private String value;

    OperationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
        for (OperationEnum b : OperationEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private OperationEnum operation;

  @ApiModelProperty(required = true, value = "")
  private List<String> values;
 /**
  * Get field
  * @return field
  */
  @JsonProperty("field")
  @NotNull
  public String getField() {
    return field;
  }

  /**
   * Sets the <code>field</code> property.
   */
 public void setField(String field) {
    this.field = field;
  }

  /**
   * Sets the <code>field</code> property.
   */
  public TargetingSpecOperationList field(String field) {
    this.field = field;
    return this;
  }

 /**
  * Get operation
  * @return operation
  */
  @JsonProperty("operation")
  @NotNull
  public String getOperation() {
    return operation == null ? null : operation.value();
  }

  /**
   * Sets the <code>operation</code> property.
   */
 public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  /**
   * Sets the <code>operation</code> property.
   */
  public TargetingSpecOperationList operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

 /**
  * Get values
  * @return values
  */
  @JsonProperty("values")
  @NotNull
  public List<String> getValues() {
    return values;
  }

  /**
   * Sets the <code>values</code> property.
   */
 public void setValues(List<String> values) {
    this.values = values;
  }

  /**
   * Sets the <code>values</code> property.
   */
  public TargetingSpecOperationList values(List<String> values) {
    this.values = values;
    return this;
  }

  /**
   * Adds a new item to the <code>values</code> list.
   */
  public TargetingSpecOperationList addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
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
    TargetingSpecOperationList targetingSpecOperationList = (TargetingSpecOperationList) o;
    return Objects.equals(this.field, targetingSpecOperationList.field) &&
        Objects.equals(this.operation, targetingSpecOperationList.operation) &&
        Objects.equals(this.values, targetingSpecOperationList.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operation, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSpecOperationList {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

