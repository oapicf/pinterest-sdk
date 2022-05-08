package apimodels;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * CatalogsProductGroupMultipleStringCriteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-08T00:31:58.024547Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsProductGroupMultipleStringCriteria   {
  @JsonProperty("values")
  @NotNull

  private List<String> values = new ArrayList<>();

  @JsonProperty("negated")
  @NotNull

  private Boolean negated;

  public CatalogsProductGroupMultipleStringCriteria values(List<String> values) {
    this.values = values;
    return this;
  }

  public CatalogsProductGroupMultipleStringCriteria addValuesItem(String valuesItem) {
    values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
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
  **/
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
    return Objects.equals(values, catalogsProductGroupMultipleStringCriteria.values) &&
        Objects.equals(negated, catalogsProductGroupMultipleStringCriteria.negated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, negated);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

