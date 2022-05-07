package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsProductGroupCurrencyCriteria;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CurrencyFilter
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2022-05-07T06:40:56.403503Z[Etc/UTC]")
public class CurrencyFilter   {

  @JsonProperty("CURRENCY")
  private CatalogsProductGroupCurrencyCriteria CURRENCY;

  public CurrencyFilter CURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
    return this;
  }

  /**
   * Get CURRENCY
   * @return CURRENCY
  */
  @NotNull @Valid 
  @Schema(name = "CURRENCY", required = true)
  public CatalogsProductGroupCurrencyCriteria getCURRENCY() {
    return CURRENCY;
  }

  public void setCURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyFilter currencyFilter = (CurrencyFilter) o;
    return Objects.equals(this.CURRENCY, currencyFilter.CURRENCY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CURRENCY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyFilter {\n");
    sb.append("    CURRENCY: ").append(toIndentedString(CURRENCY)).append("\n");
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

