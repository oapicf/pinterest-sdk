package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CatalogsProductGroupPricingCriteria
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsProductGroupPricingCriteria {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean inclusion = true;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean negated;

  private BigDecimal values;

  public CatalogsProductGroupPricingCriteria() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsProductGroupPricingCriteria(BigDecimal values) {
    this.values = values;
  }

  public CatalogsProductGroupPricingCriteria inclusion(Boolean inclusion) {
    this.inclusion = inclusion;
    return this;
  }

  /**
   * Get inclusion
   * @return inclusion
   */
  
  @Schema(name = "inclusion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inclusion")
  public Boolean getInclusion() {
    return inclusion;
  }

  @JsonProperty("inclusion")
  public void setInclusion(Boolean inclusion) {
    this.inclusion = inclusion;
  }

  public CatalogsProductGroupPricingCriteria negated(@Nullable Boolean negated) {
    this.negated = negated;
    return this;
  }

  /**
   * Get negated
   * @return negated
   */
  
  @Schema(name = "negated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("negated")
  public @Nullable Boolean getNegated() {
    return negated;
  }

  @JsonProperty("negated")
  public void setNegated(@Nullable Boolean negated) {
    this.negated = negated;
  }

  public CatalogsProductGroupPricingCriteria values(BigDecimal values) {
    this.values = values;
    return this;
  }

  /**
   * Get values
   * minimum: 0
   * @return values
   */
  @NotNull @Valid @DecimalMin(value = "0") 
  @Schema(name = "values", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("values")
  public BigDecimal getValues() {
    return values;
  }

  @JsonProperty("values")
  public void setValues(BigDecimal values) {
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
    CatalogsProductGroupPricingCriteria catalogsProductGroupPricingCriteria = (CatalogsProductGroupPricingCriteria) o;
    return Objects.equals(this.inclusion, catalogsProductGroupPricingCriteria.inclusion) &&
        Objects.equals(this.negated, catalogsProductGroupPricingCriteria.negated) &&
        Objects.equals(this.values, catalogsProductGroupPricingCriteria.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inclusion, negated, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupPricingCriteria {\n");
    sb.append("    inclusion: ").append(toIndentedString(inclusion)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

