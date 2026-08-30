package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A currency filter. This filter cannot be negated
 */

@Schema(name = "CatalogsProductGroupCurrencyCriteria", description = "A currency filter. This filter cannot be negated")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsProductGroupCurrencyCriteria {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean negated;

  private NonNullableCatalogsCurrency values;

  public CatalogsProductGroupCurrencyCriteria() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsProductGroupCurrencyCriteria(NonNullableCatalogsCurrency values) {
    this.values = values;
  }

  public CatalogsProductGroupCurrencyCriteria negated(@Nullable Boolean negated) {
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

  public CatalogsProductGroupCurrencyCriteria values(NonNullableCatalogsCurrency values) {
    this.values = values;
    return this;
  }

  /**
   * Get values
   * @return values
   */
  @NotNull @Valid 
  @Schema(name = "values", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("values")
  public NonNullableCatalogsCurrency getValues() {
    return values;
  }

  @JsonProperty("values")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

