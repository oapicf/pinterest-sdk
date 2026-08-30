package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TargetingSpecListOperation;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingSpecOperationGeo  {
  
public enum FieldEnum {

GEO(String.valueOf("GEO"));


    private String value;

    FieldEnum (String v) {
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

  @ApiModelProperty(required = true, value = "")

  private FieldEnum field;

  @ApiModelProperty(required = true, value = "")

  private TargetingSpecListOperation operation;

  @ApiModelProperty(required = true, value = "")

  private List<String> values = new ArrayList<>();
 /**
   * Get field
   * @return field
  **/
  @JsonProperty("field")
  public String getField() {
    if (field == null) {
      return null;
    }
    return field.value();
  }

  public void setField(FieldEnum field) {
    this.field = field;
  }

  public TargetingSpecOperationGeo field(FieldEnum field) {
    this.field = field;
    return this;
  }

 /**
   * Get operation
   * @return operation
  **/
  @JsonProperty("operation")
  public TargetingSpecListOperation getOperation() {
    return operation;
  }

  public void setOperation(TargetingSpecListOperation operation) {
    this.operation = operation;
  }

  public TargetingSpecOperationGeo operation(TargetingSpecListOperation operation) {
    this.operation = operation;
    return this;
  }

 /**
   * Get values
   * @return values
  **/
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public TargetingSpecOperationGeo values(List<String> values) {
    this.values = values;
    return this;
  }

  public TargetingSpecOperationGeo addValuesItem(String valuesItem) {
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
    TargetingSpecOperationGeo targetingSpecOperationGeo = (TargetingSpecOperationGeo) o;
    return Objects.equals(this.field, targetingSpecOperationGeo.field) &&
        Objects.equals(this.operation, targetingSpecOperationGeo.operation) &&
        Objects.equals(this.values, targetingSpecOperationGeo.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operation, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSpecOperationGeo {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

