package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsProductGroupMultipleStringListCriteria   {
  
  private List<List<String>> values = new ArrayList<>();
  private Boolean negated = false;

  public CatalogsProductGroupMultipleStringListCriteria () {

  }

  public CatalogsProductGroupMultipleStringListCriteria (List<List<String>> values, Boolean negated) {
    this.values = values;
    this.negated = negated;
  }

    
  @JsonProperty("values")
  public List<List<String>> getValues() {
    return values;
  }
  public void setValues(List<List<String>> values) {
    this.values = values;
  }

    
  @JsonProperty("negated")
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
    CatalogsProductGroupMultipleStringListCriteria catalogsProductGroupMultipleStringListCriteria = (CatalogsProductGroupMultipleStringListCriteria) o;
    return Objects.equals(values, catalogsProductGroupMultipleStringListCriteria.values) &&
        Objects.equals(negated, catalogsProductGroupMultipleStringListCriteria.negated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, negated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupMultipleStringListCriteria {\n");
    
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
