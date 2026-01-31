package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsProductGroupFilterOperatorTypeCriteria
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsProductGroupFilterOperatorTypeCriteria {

  /**
   * Gets or Sets filterOperatorType
   */
  public enum FilterOperatorTypeEnum {
    IS("IS"),
    
    CONTAINS("CONTAINS");

    private final String value;

    FilterOperatorTypeEnum(String value) {
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
    public static FilterOperatorTypeEnum fromValue(String value) {
      for (FilterOperatorTypeEnum b : FilterOperatorTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FilterOperatorTypeEnum filterOperatorType = FilterOperatorTypeEnum.IS;

  private Boolean negated = false;

  @Valid
  private List<String> values = new ArrayList<>();

  public CatalogsProductGroupFilterOperatorTypeCriteria() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsProductGroupFilterOperatorTypeCriteria(List<String> values) {
    this.values = values;
  }

  public CatalogsProductGroupFilterOperatorTypeCriteria filterOperatorType(FilterOperatorTypeEnum filterOperatorType) {
    this.filterOperatorType = filterOperatorType;
    return this;
  }

  /**
   * Get filterOperatorType
   * @return filterOperatorType
   */
  
  @Schema(name = "filter_operator_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter_operator_type")
  public FilterOperatorTypeEnum getFilterOperatorType() {
    return filterOperatorType;
  }

  public void setFilterOperatorType(FilterOperatorTypeEnum filterOperatorType) {
    this.filterOperatorType = filterOperatorType;
  }

  public CatalogsProductGroupFilterOperatorTypeCriteria negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  /**
   * Get negated
   * @return negated
   */
  
  @Schema(name = "negated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }

  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  public CatalogsProductGroupFilterOperatorTypeCriteria values(List<String> values) {
    this.values = values;
    return this;
  }

  public CatalogsProductGroupFilterOperatorTypeCriteria addValuesItem(String valuesItem) {
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
    CatalogsProductGroupFilterOperatorTypeCriteria catalogsProductGroupFilterOperatorTypeCriteria = (CatalogsProductGroupFilterOperatorTypeCriteria) o;
    return Objects.equals(this.filterOperatorType, catalogsProductGroupFilterOperatorTypeCriteria.filterOperatorType) &&
        Objects.equals(this.negated, catalogsProductGroupFilterOperatorTypeCriteria.negated) &&
        Objects.equals(this.values, catalogsProductGroupFilterOperatorTypeCriteria.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterOperatorType, negated, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupFilterOperatorTypeCriteria {\n");
    sb.append("    filterOperatorType: ").append(toIndentedString(filterOperatorType)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
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

