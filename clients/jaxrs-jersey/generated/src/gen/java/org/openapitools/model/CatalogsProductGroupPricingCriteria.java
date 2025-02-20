/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * CatalogsProductGroupPricingCriteria
 */
@JsonPropertyOrder({
  CatalogsProductGroupPricingCriteria.JSON_PROPERTY_INCLUSION,
  CatalogsProductGroupPricingCriteria.JSON_PROPERTY_VALUES,
  CatalogsProductGroupPricingCriteria.JSON_PROPERTY_NEGATED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsProductGroupPricingCriteria   {
  public static final String JSON_PROPERTY_INCLUSION = "inclusion";
  @JsonProperty(JSON_PROPERTY_INCLUSION)
  private Boolean inclusion = true;

  public static final String JSON_PROPERTY_VALUES = "values";
  @JsonProperty(JSON_PROPERTY_VALUES)
  private BigDecimal values;

  public static final String JSON_PROPERTY_NEGATED = "negated";
  @JsonProperty(JSON_PROPERTY_NEGATED)
  private Boolean negated = false;

  public CatalogsProductGroupPricingCriteria inclusion(Boolean inclusion) {
    this.inclusion = inclusion;
    return this;
  }

  /**
   * Get inclusion
   * @return inclusion
   **/
  @JsonProperty(value = "inclusion")
  @ApiModelProperty(value = "")
  
  public Boolean getInclusion() {
    return inclusion;
  }

  public void setInclusion(Boolean inclusion) {
    this.inclusion = inclusion;
  }

  public CatalogsProductGroupPricingCriteria values(BigDecimal values) {
    this.values = values;
    return this;
  }

  /**
   * Get values
   * minimum: 0
   * @return values
   **/
  @JsonProperty(value = "values")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid  @DecimalMin("0")
  public BigDecimal getValues() {
    return values;
  }

  public void setValues(BigDecimal values) {
    this.values = values;
  }

  public CatalogsProductGroupPricingCriteria negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  /**
   * Get negated
   * @return negated
   **/
  @JsonProperty(value = "negated")
  @ApiModelProperty(value = "")
  
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
    CatalogsProductGroupPricingCriteria catalogsProductGroupPricingCriteria = (CatalogsProductGroupPricingCriteria) o;
    return Objects.equals(this.inclusion, catalogsProductGroupPricingCriteria.inclusion) &&
        Objects.equals(this.values, catalogsProductGroupPricingCriteria.values) &&
        Objects.equals(this.negated, catalogsProductGroupPricingCriteria.negated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inclusion, values, negated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupPricingCriteria {\n");
    
    sb.append("    inclusion: ").append(toIndentedString(inclusion)).append("\n");
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

