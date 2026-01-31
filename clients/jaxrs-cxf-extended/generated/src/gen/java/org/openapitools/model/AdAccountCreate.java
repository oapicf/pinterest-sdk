package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Country;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class AdAccountCreate  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Country country;

  @ApiModelProperty(value = "")
  @Valid
  private Currency currency;

 /**
  * Ad account name.
  */
  @ApiModelProperty(value = "Ad account name.")
  private String name;

 /**
  * Advertiser's owning user ID.
  */
  @ApiModelProperty(value = "Advertiser's owning user ID.")
  private String ownerUserId;
 /**
  * Get country
  * @return country
  */
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  /**
   * Sets the <code>country</code> property.
   */
 public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Sets the <code>country</code> property.
   */
  public AdAccountCreate country(Country country) {
    this.country = country;
    return this;
  }

 /**
  * Get currency
  * @return currency
  */
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
 public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
  public AdAccountCreate currency(Currency currency) {
    this.currency = currency;
    return this;
  }

 /**
  * Ad account name.
  * @return name
  */
  @JsonProperty("name")
 @Size(max=256)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public AdAccountCreate name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Advertiser&#39;s owning user ID.
  * @return ownerUserId
  */
  @JsonProperty("owner_user_id")
 @Pattern(regexp="^\\d+$")  public String getOwnerUserId() {
    return ownerUserId;
  }

  /**
   * Sets the <code>ownerUserId</code> property.
   */
 public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  /**
   * Sets the <code>ownerUserId</code> property.
   */
  public AdAccountCreate ownerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
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
    AdAccountCreate adAccountCreate = (AdAccountCreate) o;
    return Objects.equals(this.country, adAccountCreate.country) &&
        Objects.equals(this.currency, adAccountCreate.currency) &&
        Objects.equals(this.name, adAccountCreate.name) &&
        Objects.equals(this.ownerUserId, adAccountCreate.ownerUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, currency, name, ownerUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountCreate {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
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

