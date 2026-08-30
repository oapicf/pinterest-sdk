package apimodels;

import apimodels.TargetingSpecListOperation;
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
 * TargetingSpecOperationLocale
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TargetingSpecOperationLocale   {
  /**
   * Gets or Sets field
   */
  public enum FieldEnum {
    LOCALE("LOCALE");

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

  @JsonProperty("operation")
  @NotNull
@Valid

  private TargetingSpecListOperation operation;

  @JsonProperty("values")
  @NotNull

  private List<String> values = new ArrayList<>();

  public TargetingSpecOperationLocale field(FieldEnum field) {
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

  public TargetingSpecOperationLocale operation(TargetingSpecListOperation operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  public TargetingSpecListOperation getOperation() {
    return operation;
  }

  public void setOperation(TargetingSpecListOperation operation) {
    this.operation = operation;
  }

  public TargetingSpecOperationLocale values(List<String> values) {
    this.values = values;
    return this;
  }

  public TargetingSpecOperationLocale addValuesItem(String valuesItem) {
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
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
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
    TargetingSpecOperationLocale targetingSpecOperationLocale = (TargetingSpecOperationLocale) o;
    return Objects.equals(field, targetingSpecOperationLocale.field) &&
        Objects.equals(operation, targetingSpecOperationLocale.operation) &&
        Objects.equals(values, targetingSpecOperationLocale.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operation, values);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

