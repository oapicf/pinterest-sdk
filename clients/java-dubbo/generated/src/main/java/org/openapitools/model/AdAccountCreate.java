package org.openapitools.model;

import org.openapitools.model.Country;
import org.openapitools.model.Currency;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class AdAccountCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("currency")
  private Currency currency;

  /**
   * Ad account name.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Advertiser&#39;s owning user ID.
   */
  @JsonProperty("owner_user_id")
  private String ownerUserId;

  /**
   * The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
   */
  @JsonProperty("time_zone")
  private String timeZone;

  /**
   * 
   * @return country
   */
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * 
   * @return currency
   */
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * Ad account name.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Advertiser&#39;s owning user ID.
   * @return ownerUserId
   */
  public String getOwnerUserId() {
    return ownerUserId;
  }

  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  /**
   * The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
   * @return timeZone
   */
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
    return Objects.equals(this.country, adAccountCreate.country) &&
        Objects.equals(this.currency, adAccountCreate.currency) &&
        Objects.equals(this.name, adAccountCreate.name) &&
        Objects.equals(this.ownerUserId, adAccountCreate.ownerUserId) &&
        Objects.equals(this.timeZone, adAccountCreate.timeZone);
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
