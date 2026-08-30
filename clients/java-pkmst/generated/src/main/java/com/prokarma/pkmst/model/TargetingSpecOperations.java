package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.TargetingSpecOperationAgeBucket;
import com.prokarma.pkmst.model.TargetingSpecOperationAppType;
import com.prokarma.pkmst.model.TargetingSpecOperationAudienceExclude;
import com.prokarma.pkmst.model.TargetingSpecOperationAudienceInclude;
import com.prokarma.pkmst.model.TargetingSpecOperationGender;
import com.prokarma.pkmst.model.TargetingSpecOperationGeo;
import com.prokarma.pkmst.model.TargetingSpecOperationGeoExclude;
import com.prokarma.pkmst.model.TargetingSpecOperationInterest;
import com.prokarma.pkmst.model.TargetingSpecOperationLocale;
import com.prokarma.pkmst.model.TargetingSpecOperationLocation;
import com.prokarma.pkmst.model.TargetingSpecOperationLocationExclude;
import com.prokarma.pkmst.model.TargetingSpecOperationMaximumAge;
import com.prokarma.pkmst.model.TargetingSpecOperationMinimumAge;
import com.prokarma.pkmst.model.TargetingSpecOperationShoppingRetargeting;
import com.prokarma.pkmst.model.TargetingSpecShoppingRetargeting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TargetingSpecOperations
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "field", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = TargetingSpecOperationAgeBucket.class, name = "AGE_BUCKET"),
  @JsonSubTypes.Type(value = TargetingSpecOperationAppType.class, name = "APPTYPE"),
  @JsonSubTypes.Type(value = TargetingSpecOperationAudienceExclude.class, name = "AUDIENCE_EXCLUDE"),
  @JsonSubTypes.Type(value = TargetingSpecOperationAudienceInclude.class, name = "AUDIENCE_INCLUDE"),
  @JsonSubTypes.Type(value = TargetingSpecOperationGender.class, name = "GENDER"),
  @JsonSubTypes.Type(value = TargetingSpecOperationGeo.class, name = "GEO"),
  @JsonSubTypes.Type(value = TargetingSpecOperationGeoExclude.class, name = "GEO_EXCLUDE"),
  @JsonSubTypes.Type(value = TargetingSpecOperationInterest.class, name = "INTEREST"),
  @JsonSubTypes.Type(value = TargetingSpecOperationLocale.class, name = "LOCALE"),
  @JsonSubTypes.Type(value = TargetingSpecOperationLocation.class, name = "LOCATION"),
  @JsonSubTypes.Type(value = TargetingSpecOperationLocationExclude.class, name = "LOCATION_EXCLUDE"),
  @JsonSubTypes.Type(value = TargetingSpecOperationMaximumAge.class, name = "MAXIMUM_AGE"),
  @JsonSubTypes.Type(value = TargetingSpecOperationMinimumAge.class, name = "MINIMUM_AGE"),
  @JsonSubTypes.Type(value = TargetingSpecOperationShoppingRetargeting.class, name = "SHOPPING_RETARGETING"),
})

public class TargetingSpecOperations   {
  /**
   * Gets or Sets field
   */
  public enum FieldEnum {
    MINIMUM_AGE("MINIMUM_AGE");

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FieldEnum fromValue(String text) {
      for (FieldEnum b : FieldEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("field")
  private FieldEnum field;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    SET("SET");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("operation")
  private OperationEnum operation;

  @JsonProperty("values")
  
  private List<TargetingSpecShoppingRetargeting> values = new ArrayList<>();

  @JsonProperty("value")
  private String value;

  public TargetingSpecOperations field(FieldEnum field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
   */
  @ApiModelProperty(required = true, value = "")
  public FieldEnum getField() {
    return field;
  }

  public void setField(FieldEnum field) {
    this.field = field;
  }

  public TargetingSpecOperations operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @ApiModelProperty(required = true, value = "")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public TargetingSpecOperations values(List<TargetingSpecShoppingRetargeting> values) {
    this.values = values;
    return this;
  }

  public TargetingSpecOperations addValuesItem(TargetingSpecShoppingRetargeting valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   */
  @ApiModelProperty(required = true, value = "")
  public List<TargetingSpecShoppingRetargeting> getValues() {
    return values;
  }

  public void setValues(List<TargetingSpecShoppingRetargeting> values) {
    this.values = values;
  }

  public TargetingSpecOperations value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @ApiModelProperty(required = true, value = "")
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

