package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NonNullableCatalogsCurrency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A currency filter. This filter cannot be negated
 **/
@ApiModel(description = "A currency filter. This filter cannot be negated")
@JsonTypeName("CatalogsProductGroupCurrencyCriteria")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsProductGroupCurrencyCriteria   {
  private Boolean negated;
  private NonNullableCatalogsCurrency values;

  public CatalogsProductGroupCurrencyCriteria() {
  }

  @JsonCreator
  public CatalogsProductGroupCurrencyCriteria(
    @JsonProperty(required = true, value = "values") NonNullableCatalogsCurrency values
  ) {
    this.values = values;
  }

  /**
   **/
  public CatalogsProductGroupCurrencyCriteria negated(Boolean negated) {
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
  public CatalogsProductGroupCurrencyCriteria values(NonNullableCatalogsCurrency values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "values")
  @NotNull public NonNullableCatalogsCurrency getValues() {
    return values;
  }

  @JsonProperty(required = true, value = "values")
  public void setValues(NonNullableCatalogsCurrency values) {
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
    CatalogsProductGroupCurrencyCriteria catalogsProductGroupCurrencyCriteria = (CatalogsProductGroupCurrencyCriteria) o;
    return Objects.equals(this.negated, catalogsProductGroupCurrencyCriteria.negated) &&
        Objects.equals(this.values, catalogsProductGroupCurrencyCriteria.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negated, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupCurrencyCriteria {\n");
    
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
