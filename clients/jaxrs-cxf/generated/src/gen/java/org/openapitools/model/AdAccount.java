package org.openapitools.model;

import org.openapitools.model.AdAccountOwner;
import org.openapitools.model.Country;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AdAccount  {
  
  @ApiModelProperty(value = "")
  private String id;

  @ApiModelProperty(value = "")
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private AdAccountOwner owner;

  @ApiModelProperty(value = "")
  @Valid
  private Country country;

  @ApiModelProperty(value = "")
  @Valid
  private Currency currency;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdAccount id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdAccount name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public AdAccountOwner getOwner() {
    return owner;
  }

  public void setOwner(AdAccountOwner owner) {
    this.owner = owner;
  }

  public AdAccount owner(AdAccountOwner owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get country
   * @return country
  **/
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public AdAccount country(Country country) {
    this.country = country;
    return this;
  }

 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public AdAccount currency(Currency currency) {
    this.currency = currency;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

