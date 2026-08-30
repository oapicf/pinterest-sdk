package apimodels;

import apimodels.Country;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdAccountsCountry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdAccountsCountry   {
  @JsonProperty("code")
  @NotNull
@Valid

  private Country code;

  @JsonProperty("currency")
  @NotNull

  private String currency;

  @JsonProperty("index")
  @NotNull
@Valid

  private BigDecimal index;

  @JsonProperty("name")
  @NotNull

  private String name;

  public AdAccountsCountry code(Country code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

