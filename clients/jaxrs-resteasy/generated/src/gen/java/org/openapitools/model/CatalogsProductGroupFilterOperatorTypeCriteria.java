package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FilterOperatorType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsProductGroupFilterOperatorTypeCriteria   {
  
  private FilterOperatorType filterOperatorType;
  private Boolean negated;
  private List<String> values = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filter_operator_type")
  @Valid
  public FilterOperatorType getFilterOperatorType() {
    return filterOperatorType;
  }
  public void setFilterOperatorType(FilterOperatorType filterOperatorType) {
    this.filterOperatorType = filterOperatorType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }
  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("values")
  @NotNull
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

