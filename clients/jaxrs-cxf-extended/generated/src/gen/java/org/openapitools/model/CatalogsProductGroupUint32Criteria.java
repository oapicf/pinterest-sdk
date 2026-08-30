package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.NumericFilterOperatorType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsProductGroupUint32Criteria  {
  
  @ApiModelProperty(value = "")
  private Boolean negated;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private NumericFilterOperatorType operator;

  @ApiModelProperty(required = true, value = "")
  private Integer value;
 /**
  * Get negated
  * @return negated
  */
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }

  /**
   * Sets the <code>negated</code> property.
   */
 public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  /**
   * Sets the <code>negated</code> property.
   */
  public CatalogsProductGroupUint32Criteria negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

 /**
  * Get operator
  * @return operator
  */
  @JsonProperty("operator")
  @NotNull
  public NumericFilterOperatorType getOperator() {
    return operator;
  }

  /**
   * Sets the <code>operator</code> property.
   */
 public void setOperator(NumericFilterOperatorType operator) {
    this.operator = operator;
  }

  /**
   * Sets the <code>operator</code> property.
   */
  public CatalogsProductGroupUint32Criteria operator(NumericFilterOperatorType operator) {
    this.operator = operator;
    return this;
  }

 /**
  * Get value
  * minimum: 0
  * maximum: 4294967295
  * @return value
  */
  @JsonProperty("value")
  @NotNull
 @Min(0) @Max(4294967295)  public Integer getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(Integer value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
  public CatalogsProductGroupUint32Criteria value(Integer value) {
    this.value = value;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

