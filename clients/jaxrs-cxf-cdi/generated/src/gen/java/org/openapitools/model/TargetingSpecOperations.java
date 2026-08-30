package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


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
  

public enum FieldEnum {

    @JsonProperty("MINIMUM_AGE") MINIMUM_AGE(String.valueOf("MINIMUM_AGE"));


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


public enum OperationEnum {

    @JsonProperty("SET") SET(String.valueOf("SET"));


    private String value;

    OperationEnum(String v) {
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

  private OperationEnum operation;

  private List<@Valid TargetingSpecShoppingRetargeting> values = new ArrayList<>();

  private String value;

  /**
   **/
  public TargetingSpecOperations field(FieldEnum field) {
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
  public TargetingSpecOperations operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  @NotNull
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  /**
   **/
  public TargetingSpecOperations values(List<@Valid TargetingSpecShoppingRetargeting> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("values")
  @NotNull
  public List<@Valid TargetingSpecShoppingRetargeting> getValues() {
    return values;
  }
  public void setValues(List<@Valid TargetingSpecShoppingRetargeting> values) {
    this.values = values;
  }

  public TargetingSpecOperations addValuesItem(TargetingSpecShoppingRetargeting valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }


  /**
   **/
  public TargetingSpecOperations value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("value")
  @NotNull
 @Pattern(regexp="^\\d+\\+?$")  public String getValue() {
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

