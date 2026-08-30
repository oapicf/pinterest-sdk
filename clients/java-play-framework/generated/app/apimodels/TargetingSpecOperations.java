package apimodels;

import apimodels.TargetingSpecOperationAgeBucket;
import apimodels.TargetingSpecOperationAppType;
import apimodels.TargetingSpecOperationAudienceExclude;
import apimodels.TargetingSpecOperationAudienceInclude;
import apimodels.TargetingSpecOperationGender;
import apimodels.TargetingSpecOperationGeo;
import apimodels.TargetingSpecOperationGeoExclude;
import apimodels.TargetingSpecOperationInterest;
import apimodels.TargetingSpecOperationLocale;
import apimodels.TargetingSpecOperationLocation;
import apimodels.TargetingSpecOperationLocationExclude;
import apimodels.TargetingSpecOperationMaximumAge;
import apimodels.TargetingSpecOperationMinimumAge;
import apimodels.TargetingSpecOperationShoppingRetargeting;
import apimodels.TargetingSpecShoppingRetargeting;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TargetingSpecOperations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TargetingSpecOperations   {
  /**
   * Gets or Sets field
   */
  public enum FieldEnum {
    MINIMUM_AGE("MINIMUM_AGE");

    private final String value;

    FieldEnum(String value) {
      this.value = value;
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

  @JsonProperty("field")
  @NotNull

  private FieldEnum field;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    SET("SET");

    private final String value;

    OperationEnum(String value) {
      this.value = value;
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

  @JsonProperty("operation")
  @NotNull

  private OperationEnum operation;

  @JsonProperty("values")
  @NotNull
@Valid

  private List<@Valid TargetingSpecShoppingRetargeting> values = new ArrayList<>();

  @JsonProperty("value")
  @NotNull
@Pattern(regexp="^\\d+\\+?$")

  private String value;

  public TargetingSpecOperations field(FieldEnum field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
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
  **/
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public TargetingSpecOperations values(List<@Valid TargetingSpecShoppingRetargeting> values) {
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
  **/
  public List<@Valid TargetingSpecShoppingRetargeting> getValues() {
    return values;
  }

  public void setValues(List<@Valid TargetingSpecShoppingRetargeting> values) {
    this.values = values;
  }

  public TargetingSpecOperations value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

