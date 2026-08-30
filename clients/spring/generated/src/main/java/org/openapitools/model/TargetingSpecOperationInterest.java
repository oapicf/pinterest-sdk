package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TargetingSpecListOperation;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TargetingSpecOperationInterest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingSpecOperationInterest implements TargetingSpecOperations {

  /**
   * Gets or Sets field
   */
  public enum FieldEnum {
    INTEREST("INTEREST");

    private final String value;

    FieldEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private FieldEnum field;

  private TargetingSpecListOperation operation;

  private List<String> values = new ArrayList<>();

  public TargetingSpecOperationInterest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TargetingSpecOperationInterest(FieldEnum field, TargetingSpecListOperation operation, List<String> values) {
    this.field = field;
    this.operation = operation;
    this.values = values;
  }

  public TargetingSpecOperationInterest field(FieldEnum field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
   */
  @NotNull 
  @Schema(name = "field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field")
  public FieldEnum getField() {
    return field;
  }

  @JsonProperty("field")
  public void setField(FieldEnum field) {
    this.field = field;
  }

  public TargetingSpecOperationInterest operation(TargetingSpecListOperation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @NotNull @Valid 
  @Schema(name = "operation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation")
  public TargetingSpecListOperation getOperation() {
    return operation;
  }

  @JsonProperty("operation")
  public void setOperation(TargetingSpecListOperation operation) {
    this.operation = operation;
  }

  public TargetingSpecOperationInterest values(List<String> values) {
    this.values = values;
    return this;
  }

  public TargetingSpecOperationInterest addValuesItem(String valuesItem) {
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
  @NotNull 
  @Schema(name = "values", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }

  @JsonProperty("values")
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
    TargetingSpecOperationInterest targetingSpecOperationInterest = (TargetingSpecOperationInterest) o;
    return Objects.equals(this.field, targetingSpecOperationInterest.field) &&
        Objects.equals(this.operation, targetingSpecOperationInterest.operation) &&
        Objects.equals(this.values, targetingSpecOperationInterest.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operation, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSpecOperationInterest {\n");
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

