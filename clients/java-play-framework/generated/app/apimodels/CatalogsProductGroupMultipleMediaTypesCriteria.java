package apimodels;

import apimodels.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CatalogsProductGroupMultipleMediaTypesCriteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsProductGroupMultipleMediaTypesCriteria   {
  @JsonProperty("values")
  @NotNull
@Valid

  private List<MediaType> values = new ArrayList<>();

  @JsonProperty("negated")
  
  private Boolean negated = false;

  public CatalogsProductGroupMultipleMediaTypesCriteria values(List<MediaType> values) {
    this.values = values;
    return this;
  }

  public CatalogsProductGroupMultipleMediaTypesCriteria addValuesItem(MediaType valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  public List<MediaType> getValues() {
    return values;
  }

  public void setValues(List<MediaType> values) {
    this.values = values;
  }

  public CatalogsProductGroupMultipleMediaTypesCriteria negated(Boolean negated) {
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
    CatalogsProductGroupMultipleMediaTypesCriteria catalogsProductGroupMultipleMediaTypesCriteria = (CatalogsProductGroupMultipleMediaTypesCriteria) o;
    return Objects.equals(values, catalogsProductGroupMultipleMediaTypesCriteria.values) &&
        Objects.equals(negated, catalogsProductGroupMultipleMediaTypesCriteria.negated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, negated);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupMultipleMediaTypesCriteria {\n");
    
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

