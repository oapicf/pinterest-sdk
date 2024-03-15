package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.AdCountry;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdAccountsCountryResponseData  {
  
  @ApiModelProperty(value = "")
  private AdCountry code;

  @ApiModelProperty(example = "Dollars", value = "Country currency.")
 /**
   * Country currency.
  **/
  private String currency;

  @ApiModelProperty(example = "1", value = "Country index")
  @Valid
 /**
   * Country index
  **/
  private BigDecimal index;

  @ApiModelProperty(example = "United States of America", value = "Country name")
 /**
   * Country name
  **/
  private String name;
 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public AdCountry getCode() {
    return code;
  }

  public void setCode(AdCountry code) {
    this.code = code;
  }

  public AdAccountsCountryResponseData code(AdCountry code) {
    this.code = code;
    return this;
  }

 /**
   * Country currency.
   * @return currency
  **/
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AdAccountsCountryResponseData currency(String currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Country index
   * @return index
  **/
  @JsonProperty("index")
  public BigDecimal getIndex() {
    return index;
  }

  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  public AdAccountsCountryResponseData index(BigDecimal index) {
    this.index = index;
    return this;
  }

 /**
   * Country name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdAccountsCountryResponseData name(String name) {
    this.name = name;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

