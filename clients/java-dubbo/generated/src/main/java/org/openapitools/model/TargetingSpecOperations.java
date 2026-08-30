package org.openapitools.model;

import org.openapitools.model.TargetingSpecOperationAgeBucket;
import org.openapitools.model.TargetingSpecOperationAppType;
import org.openapitools.model.TargetingSpecOperationAudienceExclude;
import org.openapitools.model.TargetingSpecOperationAudienceInclude;
import org.openapitools.model.TargetingSpecOperationGender;
import org.openapitools.model.TargetingSpecOperationGeo;
import org.openapitools.model.TargetingSpecOperationGeoExclude;
import org.openapitools.model.TargetingSpecOperationInterest;
import org.openapitools.model.TargetingSpecOperationLocale;
import org.openapitools.model.TargetingSpecOperationLocation;
import org.openapitools.model.TargetingSpecOperationLocationExclude;
import org.openapitools.model.TargetingSpecOperationMaximumAge;
import org.openapitools.model.TargetingSpecOperationMinimumAge;
import org.openapitools.model.TargetingSpecOperationShoppingRetargeting;
import org.openapitools.model.TargetingSpecShoppingRetargeting;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class TargetingSpecOperations implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("field")
  private String field;

  @JsonProperty("operation")
  private String operation;

  @JsonProperty("values")
  private List<TargetingSpecShoppingRetargeting> values = new ArrayList<>();

  @JsonProperty("value")
  private String value;

  /**
   * 
   * @return field
   */
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  /**
   * 
   * @return operation
   */
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  /**
   * 
   * @return values
   */
  public List<TargetingSpecShoppingRetargeting> getValues() {
    return values;
  }

  public void setValues(List<TargetingSpecShoppingRetargeting> values) {
    this.values = values;
  }

  /**
   * 
   * @return value
   */
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
    return Objects.equals(this.field, targetingSpecOperations.field) &&
        Objects.equals(this.operation, targetingSpecOperations.operation) &&
        Objects.equals(this.values, targetingSpecOperations.values) &&
        Objects.equals(this.value, targetingSpecOperations.value);
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
