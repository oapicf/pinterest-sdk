package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.AdAccountOwner;
import org.openapitools.server.api.model.Country;
import org.openapitools.server.api.model.Currency;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdAccount   {
  
  private String id;
  private String name;
  private AdAccountOwner owner;
  private Country country;
  private Currency currency;

  public AdAccount () {

  }

  public AdAccount (String id, String name, AdAccountOwner owner, Country country, Currency currency) {
    this.id = id;
    this.name = name;
    this.owner = owner;
    this.country = country;
    this.currency = currency;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("owner")
  public AdAccountOwner getOwner() {
    return owner;
  }
  public void setOwner(AdAccountOwner owner) {
    this.owner = owner;
  }

    
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

    
  @JsonProperty("currency")
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
