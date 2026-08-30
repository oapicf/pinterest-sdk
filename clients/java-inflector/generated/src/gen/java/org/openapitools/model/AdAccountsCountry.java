package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.Country;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdAccountsCountry   {
  @JsonProperty("code")
  private Country code;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("index")
  private BigDecimal index;

  @JsonProperty("name")
  private String name;

  /**
   **/
  public AdAccountsCountry code(Country code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "US", required = true, value = "")
  @JsonProperty("code")
  public Country getCode() {
    return code;
  }
  public void setCode(Country code) {
    this.code = code;
  }

  /**
   * Country currency.
   **/
  public AdAccountsCountry currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(example = "Dollars", required = true, value = "Country currency.")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Country index
   **/
  public AdAccountsCountry index(BigDecimal index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(example = "1", required = true, value = "Country index")
  @JsonProperty("index")
  public BigDecimal getIndex() {
    return index;
  }
  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  /**
   * Country name
   **/
  public AdAccountsCountry name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "United States of America", required = true, value = "Country name")
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
    return Objects.equals(code, adAccountsCountry.code) &&
        Objects.equals(currency, adAccountsCountry.currency) &&
        Objects.equals(index, adAccountsCountry.index) &&
        Objects.equals(name, adAccountsCountry.name);
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

