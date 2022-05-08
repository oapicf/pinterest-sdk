package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsProductGroupMultipleStringCriteria
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2022-05-08T00:32:37.756477Z[Etc/UTC]")
public class CatalogsProductGroupMultipleStringCriteria   {

  @JsonProperty("values")
  @Valid
  private List<String> values = new ArrayList<String>();

  @JsonProperty("negated")
  private Boolean negated;

  public CatalogsProductGroupMultipleStringCriteria values(List<String> values) {
    this.values = values;
    return this;
  }

  public CatalogsProductGroupMultipleStringCriteria addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @NotNull 
  @Schema(name = "values", required = true)
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public CatalogsProductGroupMultipleStringCriteria negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  /**
   * Get negated
   * @return negated
  */
  @NotNull 
  @Schema(name = "negated", required = true)
  public Boolean getNegated() {
    return negated;
  }

  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroupMultipleStringCriteria catalogsProductGroupMultipleStringCriteria = (CatalogsProductGroupMultipleStringCriteria) o;
    return Objects.equals(this.values, catalogsProductGroupMultipleStringCriteria.values) &&
        Objects.equals(this.negated, catalogsProductGroupMultipleStringCriteria.negated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, negated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupMultipleStringCriteria {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
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

