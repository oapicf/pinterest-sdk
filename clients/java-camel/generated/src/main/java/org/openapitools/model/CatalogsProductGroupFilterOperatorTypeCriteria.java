package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FilterOperatorType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CatalogsProductGroupFilterOperatorTypeCriteria
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsProductGroupFilterOperatorTypeCriteria {

  private FilterOperatorType filterOperatorType;

  private Boolean negated;

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

  public CatalogsProductGroupFilterOperatorTypeCriteria filterOperatorType(FilterOperatorType filterOperatorType) {
    this.filterOperatorType = filterOperatorType;
    return this;
  }

  /**
   * Get filterOperatorType
   * @return filterOperatorType
   */
  @Valid 
  @Schema(name = "filter_operator_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter_operator_type")
  public FilterOperatorType getFilterOperatorType() {
    return filterOperatorType;
  }

  public void setFilterOperatorType(FilterOperatorType filterOperatorType) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

