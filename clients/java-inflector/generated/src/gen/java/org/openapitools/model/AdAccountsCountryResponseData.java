package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.AdCountry;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdAccountsCountryResponseData   {
  @JsonProperty("code")
  private AdCountry code;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("index")
  private BigDecimal index;

  @JsonProperty("name")
  private String name;

  /**
   **/
  public AdAccountsCountryResponseData code(AdCountry code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("code")
  public AdCountry getCode() {
    return code;
  }
  public void setCode(AdCountry code) {
    this.code = code;
  }

  /**
   * Country currency.
   **/
  public AdAccountsCountryResponseData currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(example = "Dollars", value = "Country currency.")
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
  public AdAccountsCountryResponseData index(BigDecimal index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "Country index")
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
  public AdAccountsCountryResponseData name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "United States of America", value = "Country name")
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
    return Objects.equals(code, adAccountsCountryResponseData.code) &&
        Objects.equals(currency, adAccountsCountryResponseData.currency) &&
        Objects.equals(index, adAccountsCountryResponseData.index) &&
        Objects.equals(name, adAccountsCountryResponseData.name);
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

