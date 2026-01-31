package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.TargetingSpecShoppingRetargeting;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetingSpecOperationShoppingRetargeting   {
  


  public enum FieldEnum {
    SHOPPING_RETARGETING("SHOPPING_RETARGETING");

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private FieldEnum field;


  public enum OperationEnum {
    SET("SET");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private OperationEnum operation;
  private List<TargetingSpecShoppingRetargeting> values;

  public TargetingSpecOperationShoppingRetargeting () {

  }

  public TargetingSpecOperationShoppingRetargeting (FieldEnum field, OperationEnum operation, List<TargetingSpecShoppingRetargeting> values) {
    this.field = field;
    this.operation = operation;
    this.values = values;
  }

    
  @JsonProperty("field")
  public FieldEnum getField() {
    return field;
  }
  public void setField(FieldEnum field) {
    this.field = field;
  }

    
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

    
  @JsonProperty("values")
  public List<TargetingSpecShoppingRetargeting> getValues() {
    return values;
  }
  public void setValues(List<TargetingSpecShoppingRetargeting> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingSpecOperationShoppingRetargeting targetingSpecOperationShoppingRetargeting = (TargetingSpecOperationShoppingRetargeting) o;
    return Objects.equals(field, targetingSpecOperationShoppingRetargeting.field) &&
        Objects.equals(operation, targetingSpecOperationShoppingRetargeting.operation) &&
        Objects.equals(values, targetingSpecOperationShoppingRetargeting.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operation, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSpecOperationShoppingRetargeting {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
