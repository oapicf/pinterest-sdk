package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.AdCountry;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdAccountsCountryResponseData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdAccountsCountryResponseData {

  private AdCountry code;

  private String currency;

  private BigDecimal index;

  private String name;

  public AdAccountsCountryResponseData code(AdCountry code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @Valid 
  @Schema(name = "code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public AdCountry getCode() {
    return code;
  }

  public void setCode(AdCountry code) {
    this.code = code;
  }

  public AdAccountsCountryResponseData currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Country currency.
   * @return currency
  */
  
  @Schema(name = "currency", example = "Dollars", description = "Country currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AdAccountsCountryResponseData index(BigDecimal index) {
    this.index = index;
    return this;
  }

  /**
   * Country index
   * @return index
  */
  @Valid 
  @Schema(name = "index", example = "1", description = "Country index", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("index")
  public BigDecimal getIndex() {
    return index;
  }

  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  public AdAccountsCountryResponseData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Country name
   * @return name
  */
  
  @Schema(name = "name", example = "United States of America", description = "Country name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    AdAccountsCountryResponseData adAccountsCountryResponseData = (AdAccountsCountryResponseData) o;
    return Objects.equals(this.code, adAccountsCountryResponseData.code) &&
        Objects.equals(this.currency, adAccountsCountryResponseData.currency) &&
        Objects.equals(this.index, adAccountsCountryResponseData.index) &&
        Objects.equals(this.name, adAccountsCountryResponseData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, currency, index, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountsCountryResponseData {\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

