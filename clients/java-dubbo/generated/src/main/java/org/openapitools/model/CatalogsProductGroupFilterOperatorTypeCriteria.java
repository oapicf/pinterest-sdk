package org.openapitools.model;

import org.openapitools.model.FilterOperatorType;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CatalogsProductGroupFilterOperatorTypeCriteria implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("filter_operator_type")
  private FilterOperatorType filterOperatorType;

  @JsonProperty("negated")
  private Boolean negated;

  @JsonProperty("values")
  private List<String> values = new ArrayList<>();

  /**
   * 
   * @return filterOperatorType
   */
  public FilterOperatorType getFilterOperatorType() {
    return filterOperatorType;
  }

  public void setFilterOperatorType(FilterOperatorType filterOperatorType) {
    this.filterOperatorType = filterOperatorType;
  }

  /**
   * 
   * @return negated
   */
  public Boolean getNegated() {
    return negated;
  }

  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  /**
   * 
   * @return values
   */
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
