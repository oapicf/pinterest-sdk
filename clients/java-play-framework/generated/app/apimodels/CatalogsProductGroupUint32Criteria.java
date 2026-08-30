package apimodels;

import apimodels.NumericFilterOperatorType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CatalogsProductGroupUint32Criteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsProductGroupUint32Criteria   {
  @JsonProperty("negated")
  
  private Boolean negated;

  @JsonProperty("operator")
  @NotNull
@Valid

  private NumericFilterOperatorType operator;

  @JsonProperty("value")
  @NotNull
@Min(0)
@Max(4294967295)

  private Integer value;

  public CatalogsProductGroupUint32Criteria negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

   /**
   * Get negated
   * @return negated
  **/
  public Boolean getNegated() {
    return negated;
  }

  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  public CatalogsProductGroupUint32Criteria operator(NumericFilterOperatorType operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  public NumericFilterOperatorType getOperator() {
    return operator;
  }

  public void setOperator(NumericFilterOperatorType operator) {
    this.operator = operator;
  }

  public CatalogsProductGroupUint32Criteria value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * minimum: 0
   * maximum: 4294967295
   * @return value
  **/
  public Integer getValue() {
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
    return Objects.equals(negated, catalogsProductGroupUint32Criteria.negated) &&
        Objects.equals(operator, catalogsProductGroupUint32Criteria.operator) &&
        Objects.equals(value, catalogsProductGroupUint32Criteria.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negated, operator, value);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

