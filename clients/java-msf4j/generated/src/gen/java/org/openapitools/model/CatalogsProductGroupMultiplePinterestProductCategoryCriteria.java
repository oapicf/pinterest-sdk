package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductCategoryEnum;

/**
 * CatalogsProductGroupMultiplePinterestProductCategoryCriteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsProductGroupMultiplePinterestProductCategoryCriteria   {
  @JsonProperty("negated")
  private Boolean negated;

  @JsonProperty("values")
  private List<ProductCategoryEnum> values = new ArrayList<>();

  public CatalogsProductGroupMultiplePinterestProductCategoryCriteria negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

   /**
   * Get negated
   * @return negated
  **/
  @ApiModelProperty(value = "")
  public Boolean getNegated() {
    return negated;
  }

  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  public CatalogsProductGroupMultiplePinterestProductCategoryCriteria values(List<ProductCategoryEnum> values) {
    this.values = values;
    return this;
  }

  public CatalogsProductGroupMultiplePinterestProductCategoryCriteria addValuesItem(ProductCategoryEnum valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ProductCategoryEnum> getValues() {
    return values;
  }

  public void setValues(List<ProductCategoryEnum> values) {
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
    CatalogsProductGroupMultiplePinterestProductCategoryCriteria catalogsProductGroupMultiplePinterestProductCategoryCriteria = (CatalogsProductGroupMultiplePinterestProductCategoryCriteria) o;
    return Objects.equals(this.negated, catalogsProductGroupMultiplePinterestProductCategoryCriteria.negated) &&
        Objects.equals(this.values, catalogsProductGroupMultiplePinterestProductCategoryCriteria.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negated, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupMultiplePinterestProductCategoryCriteria {\n");
    
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

