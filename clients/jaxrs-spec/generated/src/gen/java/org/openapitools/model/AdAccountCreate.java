package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Country;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("AdAccountCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdAccountCreate   {
  private Country country;
  private Currency currency;
  private String name;
  private String ownerUserId;

  public AdAccountCreate() {
  }

  /**
   **/
  public AdAccountCreate country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   **/
  public AdAccountCreate currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * Ad account name.
   **/
  public AdAccountCreate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Ad account name.")
  @JsonProperty("name")
   @Size(max=256)public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Advertiser&#39;s owning user ID.
   **/
  public AdAccountCreate ownerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

  
  @ApiModelProperty(value = "Advertiser's owning user ID.")
  @JsonProperty("owner_user_id")
   @Pattern(regexp="^\\d+$")public String getOwnerUserId() {
    return ownerUserId;
  }

  @JsonProperty("owner_user_id")
  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

