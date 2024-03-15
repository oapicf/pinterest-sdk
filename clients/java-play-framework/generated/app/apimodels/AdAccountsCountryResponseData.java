package apimodels;

import apimodels.AdCountry;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdAccountsCountryResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdAccountsCountryResponseData   {
  @JsonProperty("code")
  @Valid

  private AdCountry code;

  @JsonProperty("currency")
  
  private String currency;

  @JsonProperty("index")
  @Valid

  private BigDecimal index;

  @JsonProperty("name")
  
  private String name;

  public AdAccountsCountryResponseData code(AdCountry code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

