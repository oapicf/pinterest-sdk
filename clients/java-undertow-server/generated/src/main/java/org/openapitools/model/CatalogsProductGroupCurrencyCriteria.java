/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: pinterest-api@pinterest.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NonNullableCatalogsCurrency;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2022-05-08T00:32:08.284608Z[Etc/UTC]")
public class CatalogsProductGroupCurrencyCriteria   {
  
  private NonNullableCatalogsCurrency values;
  private Boolean negated;

  /**
   */
  public CatalogsProductGroupCurrencyCriteria values(NonNullableCatalogsCurrency values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("values")
  public NonNullableCatalogsCurrency getValues() {
    return values;
  }
  public void setValues(NonNullableCatalogsCurrency values) {
    this.values = values;
  }

  /**
   */
  public CatalogsProductGroupCurrencyCriteria negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("negated")
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
    CatalogsProductGroupCurrencyCriteria catalogsProductGroupCurrencyCriteria = (CatalogsProductGroupCurrencyCriteria) o;
    return Objects.equals(values, catalogsProductGroupCurrencyCriteria.values) &&
        Objects.equals(negated, catalogsProductGroupCurrencyCriteria.negated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, negated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupCurrencyCriteria {\n");
    
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

