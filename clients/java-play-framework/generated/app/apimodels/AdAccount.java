package apimodels;

import apimodels.AdAccountOwner;
import apimodels.Country;
import apimodels.Currency;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * AdAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-08T00:31:58.024547Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdAccount   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("owner")
  @Valid

  private AdAccountOwner owner;

  @JsonProperty("country")
  @Valid

  private Country country;

  @JsonProperty("currency")
  @Valid

  private Currency currency;

  public AdAccount id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdAccount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdAccount owner(AdAccountOwner owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public AdAccountOwner getOwner() {
    return owner;
  }

  public void setOwner(AdAccountOwner owner) {
    this.owner = owner;
  }

  public AdAccount country(Country country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public AdAccount currency(Currency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccount adAccount = (AdAccount) o;
    return Objects.equals(id, adAccount.id) &&
        Objects.equals(name, adAccount.name) &&
        Objects.equals(owner, adAccount.owner) &&
        Objects.equals(country, adAccount.country) &&
        Objects.equals(currency, adAccount.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, owner, country, currency);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

