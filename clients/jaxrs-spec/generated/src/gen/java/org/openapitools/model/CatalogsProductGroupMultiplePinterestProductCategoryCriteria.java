package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductCategoryEnum;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CatalogsProductGroupMultiplePinterestProductCategoryCriteria")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsProductGroupMultiplePinterestProductCategoryCriteria   {
  private Boolean negated;
  private @Valid List<ProductCategoryEnum> values = new ArrayList<>();

  public CatalogsProductGroupMultiplePinterestProductCategoryCriteria() {
  }

  @JsonCreator
  public CatalogsProductGroupMultiplePinterestProductCategoryCriteria(
    @JsonProperty(required = true, value = "values") List<ProductCategoryEnum> values
  ) {
    this.values = values;
  }

  /**
   **/
  public CatalogsProductGroupMultiplePinterestProductCategoryCriteria negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }

  @JsonProperty("negated")
  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  /**
   **/
  public CatalogsProductGroupMultiplePinterestProductCategoryCriteria values(List<ProductCategoryEnum> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "values")
  @NotNull public List<ProductCategoryEnum> getValues() {
    return values;
  }

  @JsonProperty(required = true, value = "values")
  public void setValues(List<ProductCategoryEnum> values) {
    this.values = values;
  }

  public CatalogsProductGroupMultiplePinterestProductCategoryCriteria addValuesItem(ProductCategoryEnum valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }

    this.values.add(valuesItem);
    return this;
  }

  public CatalogsProductGroupMultiplePinterestProductCategoryCriteria removeValuesItem(ProductCategoryEnum valuesItem) {
    if (valuesItem != null && this.values != null) {
      this.values.remove(valuesItem);
    }

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
