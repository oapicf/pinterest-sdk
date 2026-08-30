package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Resource create operation model.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Resource create operation model.")
public class LocalStoreCreate   {
  
  private String addressPrimary;

  private String addressSecondary;

  private String city;

  private Country country;

  private Float latitude;

  private Float longitude;

  private String name;

  private String postalCode;

  private String region;

  private String storeCode;

  /**
   * Primary address line of the store.
   **/
  public LocalStoreCreate addressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
    return this;
  }

  
  @ApiModelProperty(example = "123 Johnson St", value = "Primary address line of the store.")
  @JsonProperty("address_primary")
  public String getAddressPrimary() {
    return addressPrimary;
  }
  public void setAddressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
  }


  /**
   * Secondary address line of the store.
   **/
  public LocalStoreCreate addressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
    return this;
  }

  
  @ApiModelProperty(example = "Suite 100", value = "Secondary address line of the store.")
  @JsonProperty("address_secondary")
  public String getAddressSecondary() {
    return addressSecondary;
  }
  public void setAddressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
  }


  /**
   * City where the store is located.
   **/
  public LocalStoreCreate city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(example = "Sunnyvale", value = "City where the store is located.")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }


  /**
   * Country code where the store is located.
   **/
  public LocalStoreCreate country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Country code where the store is located.")
  @JsonProperty("country")
  @NotNull
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }


  /**
   * Geographic latitude coordinate of the store.
   **/
  public LocalStoreCreate latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(example = "-30.21", value = "Geographic latitude coordinate of the store.")
  @JsonProperty("latitude")
  public Float getLatitude() {
    return latitude;
  }
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }


  /**
   * Geographic longitude coordinate of the store.
   **/
  public LocalStoreCreate longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(example = "50.45", value = "Geographic longitude coordinate of the store.")
  @JsonProperty("longitude")
  public Float getLongitude() {
    return longitude;
  }
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }


  /**
   * The name of the local store.
   **/
  public LocalStoreCreate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Sunnyvale Store", required = true, value = "The name of the local store.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Postal or ZIP code of the store.
   **/
  public LocalStoreCreate postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  
  @ApiModelProperty(example = "94043", value = "Postal or ZIP code of the store.")
  @JsonProperty("postal_code")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  /**
   * State or region code where the store is located.
   **/
  public LocalStoreCreate region(String region) {
    this.region = region;
    return this;
  }

  
  @ApiModelProperty(example = "CA", value = "State or region code where the store is located.")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }


  /**
   * Merchant provided code for the local store. Unique within the merchant&#39;s catalog.
   **/
  public LocalStoreCreate storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  
  @ApiModelProperty(example = "store_1", required = true, value = "Merchant provided code for the local store. Unique within the merchant's catalog.")
  @JsonProperty("store_code")
  @NotNull
  public String getStoreCode() {
    return storeCode;
  }
  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalStoreCreate localStoreCreate = (LocalStoreCreate) o;
    return Objects.equals(this.addressPrimary, localStoreCreate.addressPrimary) &&
        Objects.equals(this.addressSecondary, localStoreCreate.addressSecondary) &&
        Objects.equals(this.city, localStoreCreate.city) &&
        Objects.equals(this.country, localStoreCreate.country) &&
        Objects.equals(this.latitude, localStoreCreate.latitude) &&
        Objects.equals(this.longitude, localStoreCreate.longitude) &&
        Objects.equals(this.name, localStoreCreate.name) &&
        Objects.equals(this.postalCode, localStoreCreate.postalCode) &&
        Objects.equals(this.region, localStoreCreate.region) &&
        Objects.equals(this.storeCode, localStoreCreate.storeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressPrimary, addressSecondary, city, country, latitude, longitude, name, postalCode, region, storeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalStoreCreate {\n");
    
    sb.append("    addressPrimary: ").append(toIndentedString(addressPrimary)).append("\n");
    sb.append("    addressSecondary: ").append(toIndentedString(addressSecondary)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    storeCode: ").append(toIndentedString(storeCode)).append("\n");
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

