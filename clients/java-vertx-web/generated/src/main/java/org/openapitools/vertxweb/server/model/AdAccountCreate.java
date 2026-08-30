package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.Currency;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdAccountCreate   {
  
  private Country country;
  private Currency currency;
  private String name;
  private String ownerUserId;
  private String timeZone;

  public AdAccountCreate () {

  }

  public AdAccountCreate (Country country, Currency currency, String name, String ownerUserId, String timeZone) {
    this.country = country;
    this.currency = currency;
    this.name = name;
    this.ownerUserId = ownerUserId;
    this.timeZone = timeZone;
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

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("owner_user_id")
  public String getOwnerUserId() {
    return ownerUserId;
  }
  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

    
  @JsonProperty("time_zone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccountCreate adAccountCreate = (AdAccountCreate) o;
    return Objects.equals(country, adAccountCreate.country) &&
        Objects.equals(currency, adAccountCreate.currency) &&
        Objects.equals(name, adAccountCreate.name) &&
        Objects.equals(ownerUserId, adAccountCreate.ownerUserId) &&
        Objects.equals(timeZone, adAccountCreate.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, currency, name, ownerUserId, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountCreate {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
