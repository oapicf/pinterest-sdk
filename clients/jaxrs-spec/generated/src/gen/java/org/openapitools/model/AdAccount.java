package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdAccountOwner;
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



@JsonTypeName("AdAccount")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-07T06:42:49.569940Z[Etc/UTC]")public class AdAccount   {
  
  private @Valid String id;
  private @Valid String name;
  private @Valid AdAccountOwner owner;
  private @Valid Country country;
  private @Valid Currency currency;

  /**
   **/
  public AdAccount id(String id) {
    this.id = id;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

/**
   **/
  public AdAccount name(String name) {
    this.name = name;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

/**
   **/
  public AdAccount owner(AdAccountOwner owner) {
    this.owner = owner;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  public AdAccountOwner getOwner() {
    return owner;
  }

  @JsonProperty("owner")
  public void setOwner(AdAccountOwner owner) {
    this.owner = owner;
  }

/**
   **/
  public AdAccount country(Country country) {
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
  public AdAccount currency(Currency currency) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccount adAccount = (AdAccount) o;
    return Objects.equals(this.id, adAccount.id) &&
        Objects.equals(this.name, adAccount.name) &&
        Objects.equals(this.owner, adAccount.owner) &&
        Objects.equals(this.country, adAccount.country) &&
        Objects.equals(this.currency, adAccount.currency);
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

