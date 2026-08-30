package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NumericFilterOperatorType;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CatalogsProductGroupUint32Criteria   {
  
  private Boolean negated;

  private NumericFilterOperatorType operator;

  private Integer value;

  /**
   **/
  public CatalogsProductGroupUint32Criteria negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  
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
  public CatalogsProductGroupUint32Criteria operator(NumericFilterOperatorType operator) {
    this.operator = operator;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operator")
  @NotNull
  public NumericFilterOperatorType getOperator() {
    return operator;
  }
  public void setOperator(NumericFilterOperatorType operator) {
    this.operator = operator;
  }


  /**
   * minimum: 0
   * maximum: 4294967295
   **/
  public CatalogsProductGroupUint32Criteria value(Integer value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("value")
  @NotNull
 @Min(0) @Max(4294967295)  public Integer getValue() {
    return value;
  }
  public void setValue(Integer value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroupUint32Criteria catalogsProductGroupUint32Criteria = (CatalogsProductGroupUint32Criteria) o;
    return Objects.equals(this.negated, catalogsProductGroupUint32Criteria.negated) &&
        Objects.equals(this.operator, catalogsProductGroupUint32Criteria.operator) &&
        Objects.equals(this.value, catalogsProductGroupUint32Criteria.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negated, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupUint32Criteria {\n");
    
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

