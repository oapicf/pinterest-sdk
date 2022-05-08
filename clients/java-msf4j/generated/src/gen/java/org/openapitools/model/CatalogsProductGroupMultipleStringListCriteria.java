package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * CatalogsProductGroupMultipleStringListCriteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-05-08T00:31:37.849823Z[Etc/UTC]")
public class CatalogsProductGroupMultipleStringListCriteria   {
  @JsonProperty("values")
  private List<List<String>> values = new ArrayList<List<String>>();

  @JsonProperty("negated")
  private Boolean negated;

  public CatalogsProductGroupMultipleStringListCriteria values(List<List<String>> values) {
    this.values = values;
    return this;
  }

  public CatalogsProductGroupMultipleStringListCriteria addValuesItem(List<String> valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(required = true, value = "")
  public List<List<String>> getValues() {
    return values;
  }

  public void setValues(List<List<String>> values) {
    this.values = values;
  }

  public CatalogsProductGroupMultipleStringListCriteria negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

   /**
   * Get negated
   * @return negated
  **/
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.values, catalogsProductGroupMultipleStringListCriteria.values) &&
        Objects.equals(this.negated, catalogsProductGroupMultipleStringListCriteria.negated);
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

