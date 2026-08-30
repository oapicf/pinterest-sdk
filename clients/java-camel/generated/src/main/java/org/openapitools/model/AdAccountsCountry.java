package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.Country;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AdAccountsCountry
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountsCountry {

  private Country code;

  private String currency;

  private BigDecimal index;

  private String name;

  public AdAccountsCountry() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdAccountsCountry(Country code, String currency, BigDecimal index, String name) {
    this.code = code;
    this.currency = currency;
    this.index = index;
    this.name = name;
  }

  public AdAccountsCountry code(Country code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @NotNull @Valid 
  @Schema(name = "code", example = "US", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public Country getCode() {
    return code;
  }

  public void setCode(Country code) {
    this.code = code;
  }

  public AdAccountsCountry currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Country currency.
   * @return currency
   */
  @NotNull 
  @Schema(name = "currency", example = "Dollars", description = "Country currency.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AdAccountsCountry index(BigDecimal index) {
    this.index = index;
    return this;
  }

  /**
   * Country index
   * @return index
   */
  @NotNull @Valid 
  @Schema(name = "index", example = "1", description = "Country index", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("index")
  public BigDecimal getIndex() {
    return index;
  }

  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  public AdAccountsCountry name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Country name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "United States of America", description = "Country name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccountsCountry adAccountsCountry = (AdAccountsCountry) o;
    return Objects.equals(this.code, adAccountsCountry.code) &&
        Objects.equals(this.currency, adAccountsCountry.currency) &&
        Objects.equals(this.index, adAccountsCountry.index) &&
        Objects.equals(this.name, adAccountsCountry.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, currency, index, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountsCountry {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

