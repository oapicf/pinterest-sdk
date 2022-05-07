package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CatalogsProductGroupMultipleStringCriteria  {
  
  @ApiModelProperty(required = true, value = "")
  private List<String> values = new ArrayList<String>();

  @ApiModelProperty(required = true, value = "")
  private Boolean negated;
 /**
   * Get values
   * @return values
  **/
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public CatalogsProductGroupMultipleStringCriteria values(List<String> values) {
    this.values = values;
    return this;
  }

  public CatalogsProductGroupMultipleStringCriteria addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

 /**
   * Get negated
   * @return negated
  **/
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }

  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  public CatalogsProductGroupMultipleStringCriteria negated(Boolean negated) {
    this.negated = negated;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

