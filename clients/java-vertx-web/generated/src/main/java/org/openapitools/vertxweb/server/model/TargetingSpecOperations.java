package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.TargetingSpecOperationAgeBucket;
import org.openapitools.vertxweb.server.model.TargetingSpecOperationAppType;
import org.openapitools.vertxweb.server.model.TargetingSpecOperationAudienceExclude;
import org.openapitools.vertxweb.server.model.TargetingSpecOperationAudienceInclude;
import org.openapitools.vertxweb.server.model.TargetingSpecOperationGender;
import org.openapitools.vertxweb.server.model.TargetingSpecOperationGeo;
import org.openapitools.vertxweb.server.model.TargetingSpecOperationGeoExclude;
import org.openapitools.vertxweb.server.model.TargetingSpecOperationInterest;
import org.openapitools.vertxweb.server.model.TargetingSpecOperationLocale;
import org.openapitools.vertxweb.server.model.TargetingSpecOperationLocation;
import org.openapitools.vertxweb.server.model.TargetingSpecOperationLocationExclude;
import org.openapitools.vertxweb.server.model.TargetingSpecOperationMaximumAge;
import org.openapitools.vertxweb.server.model.TargetingSpecOperationMinimumAge;
import org.openapitools.vertxweb.server.model.TargetingSpecOperationShoppingRetargeting;
import org.openapitools.vertxweb.server.model.TargetingSpecShoppingRetargeting;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetingSpecOperations   {
  


  public enum FieldEnum {
    MINIMUM_AGE("MINIMUM_AGE");

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
  private List<TargetingSpecShoppingRetargeting> values = new ArrayList<>();
  private String value;

  public TargetingSpecOperations () {

  }

  public TargetingSpecOperations (FieldEnum field, OperationEnum operation, List<TargetingSpecShoppingRetargeting> values, String value) {
    this.field = field;
    this.operation = operation;
    this.values = values;
    this.value = value;
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

    
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingSpecOperations targetingSpecOperations = (TargetingSpecOperations) o;
    return Objects.equals(field, targetingSpecOperations.field) &&
        Objects.equals(operation, targetingSpecOperations.operation) &&
        Objects.equals(values, targetingSpecOperations.values) &&
        Objects.equals(value, targetingSpecOperations.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operation, values, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSpecOperations {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
