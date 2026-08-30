/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  /**
   */
  public TargetingSpecOperations field(FieldEnum field) {
    this.field = field;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("field")
  public FieldEnum getField() {
    return field;
  }
  public void setField(FieldEnum field) {
    this.field = field;
  }

  /**
   */
  public TargetingSpecOperations operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  /**
   */
  public TargetingSpecOperations values(List<TargetingSpecShoppingRetargeting> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("values")
  public List<TargetingSpecShoppingRetargeting> getValues() {
    return values;
  }
  public void setValues(List<TargetingSpecShoppingRetargeting> values) {
    this.values = values;
  }

  /**
   */
  public TargetingSpecOperations value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

