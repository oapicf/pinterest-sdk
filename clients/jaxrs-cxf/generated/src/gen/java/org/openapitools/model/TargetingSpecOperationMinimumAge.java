package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingSpecOperationMinimumAge  {
  
public enum FieldEnum {

MINIMUM_AGE(String.valueOf("MINIMUM_AGE"));


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

  @ApiModelProperty(required = true, value = "")

  private FieldEnum field;

public enum OperationEnum {

SET(String.valueOf("SET"));


    private String value;

    OperationEnum (String v) {
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

  private String value;
 /**
   * Get field
   * @return field
  **/
  @JsonProperty("field")
  @NotNull
  public String getField() {
    if (field == null) {
      return null;
    }
    return field.value();
  }

  public void setField(FieldEnum field) {
    this.field = field;
  }

  public TargetingSpecOperationMinimumAge field(FieldEnum field) {
    this.field = field;
    return this;
  }

 /**
   * Get operation
   * @return operation
  **/
  @JsonProperty("operation")
  @NotNull
  public String getOperation() {
    if (operation == null) {
      return null;
    }
    return operation.value();
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public TargetingSpecOperationMinimumAge operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

 /**
   * Get value
   * @return value
  **/
  @JsonProperty("value")
  @NotNull
 @Pattern(regexp="^\\d+\\+?$")  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TargetingSpecOperationMinimumAge value(String value) {
    this.value = value;
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
    TargetingSpecOperationMinimumAge targetingSpecOperationMinimumAge = (TargetingSpecOperationMinimumAge) o;
    return Objects.equals(this.field, targetingSpecOperationMinimumAge.field) &&
        Objects.equals(this.operation, targetingSpecOperationMinimumAge.operation) &&
        Objects.equals(this.value, targetingSpecOperationMinimumAge.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operation, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSpecOperationMinimumAge {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

