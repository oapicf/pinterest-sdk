package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.TargetingSpecAppType;
import org.openapitools.vertxweb.server.model.TargetingSpecListOperation;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetingSpecOperationAppType   {
  


  public enum FieldEnum {
    APPTYPE("APPTYPE");

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
  private TargetingSpecListOperation operation;
  private List<TargetingSpecAppType> values = new ArrayList<>();

  public TargetingSpecOperationAppType () {

  }

  public TargetingSpecOperationAppType (FieldEnum field, TargetingSpecListOperation operation, List<TargetingSpecAppType> values) {
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
  public TargetingSpecListOperation getOperation() {
    return operation;
  }
  public void setOperation(TargetingSpecListOperation operation) {
    this.operation = operation;
  }

    
  @JsonProperty("values")
  public List<TargetingSpecAppType> getValues() {
    return values;
  }
  public void setValues(List<TargetingSpecAppType> values) {
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
    TargetingSpecOperationAppType targetingSpecOperationAppType = (TargetingSpecOperationAppType) o;
    return Objects.equals(field, targetingSpecOperationAppType.field) &&
        Objects.equals(operation, targetingSpecOperationAppType.operation) &&
        Objects.equals(values, targetingSpecOperationAppType.values);
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
