package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsProductGroupFilterOperatorTypeCriteria   {
  


  public enum FilterOperatorTypeEnum {
    IS("IS"),
    CONTAINS("CONTAINS");

    private String value;

    FilterOperatorTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private FilterOperatorTypeEnum filterOperatorType = FilterOperatorTypeEnum.IS;
  private Boolean negated = false;
  private List<String> values = new ArrayList<>();

  public CatalogsProductGroupFilterOperatorTypeCriteria () {

  }

  public CatalogsProductGroupFilterOperatorTypeCriteria (FilterOperatorTypeEnum filterOperatorType, Boolean negated, List<String> values) {
    this.filterOperatorType = filterOperatorType;
    this.negated = negated;
    this.values = values;
  }

    
  @JsonProperty("filter_operator_type")
  public FilterOperatorTypeEnum getFilterOperatorType() {
    return filterOperatorType;
  }
  public void setFilterOperatorType(FilterOperatorTypeEnum filterOperatorType) {
    this.filterOperatorType = filterOperatorType;
  }

    
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }
  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

    
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
    return Objects.equals(filterOperatorType, catalogsProductGroupFilterOperatorTypeCriteria.filterOperatorType) &&
        Objects.equals(negated, catalogsProductGroupFilterOperatorTypeCriteria.negated) &&
        Objects.equals(values, catalogsProductGroupFilterOperatorTypeCriteria.values);
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
