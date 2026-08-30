package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TargetingSpecListOperation;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class TargetingSpecOperationLocale   {
  

public enum FieldEnum {

    @JsonProperty("LOCALE") LOCALE(String.valueOf("LOCALE"));


    private String value;

    FieldEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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

  private List<String> values = new ArrayList<>();

  /**
   **/
  public TargetingSpecOperationLocale field(FieldEnum field) {
    this.field = field;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("field")
  @NotNull
  public FieldEnum getField() {
    return field;
  }
  public void setField(FieldEnum field) {
    this.field = field;
  }


  /**
   **/
  public TargetingSpecOperationLocale operation(TargetingSpecListOperation operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  @NotNull
  public TargetingSpecListOperation getOperation() {
    return operation;
  }
  public void setOperation(TargetingSpecListOperation operation) {
    this.operation = operation;
  }


  /**
   **/
  public TargetingSpecOperationLocale values(List<String> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("values")
  @NotNull
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  public TargetingSpecOperationLocale addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
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
    TargetingSpecOperationLocale targetingSpecOperationLocale = (TargetingSpecOperationLocale) o;
    return Objects.equals(this.field, targetingSpecOperationLocale.field) &&
        Objects.equals(this.operation, targetingSpecOperationLocale.operation) &&
        Objects.equals(this.values, targetingSpecOperationLocale.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operation, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSpecOperationLocale {\n");
    
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

