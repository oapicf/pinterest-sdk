package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.CatalogsLocalStoresCreate200ResponseInnerDataOneOf;
import org.openapitools.model.Country;
import org.openapitools.model.LocalStore;
import org.openapitools.model.PinterestLibError;
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
 * Created/updated resource on success or error details on failure
 **/
@ApiModel(description = "Created/updated resource on success or error details on failure")
@JsonTypeName("catalogs_local_stores_create_200_response_inner_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsLocalStoresCreate200ResponseInnerData   {
  private String addressPrimary;
  private String addressSecondary;
  private String city;
  private Country country;
  private Date createdAt;
  private String id;
  private Float latitude;
  private Float longitude;
  private String name;
  private String postalCode;
  private String region;
  private String storeCode;
  private Date updatedAt;
  private PinterestLibError exceptions;

  public CatalogsLocalStoresCreate200ResponseInnerData() {
  }

  @JsonCreator
  public CatalogsLocalStoresCreate200ResponseInnerData(
    @JsonProperty(required = true, value = "country") Country country,
    @JsonProperty(required = true, value = "created_at") Date createdAt,
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "store_code") String storeCode,
    @JsonProperty(required = true, value = "updated_at") Date updatedAt,
    @JsonProperty(required = true, value = "exceptions") PinterestLibError exceptions
  ) {
    this.country = country;
    this.createdAt = createdAt;
    this.id = id;
    this.name = name;
    this.storeCode = storeCode;
    this.updatedAt = updatedAt;
    this.exceptions = exceptions;
  }

  /**
   * Primary address line of the store.
   **/
  public CatalogsLocalStoresCreate200ResponseInnerData addressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
    return this;
  }

  
  @ApiModelProperty(example = "123 Johnson St", value = "Primary address line of the store.")
  @JsonProperty("address_primary")
  public String getAddressPrimary() {
    return addressPrimary;
  }

  @JsonProperty("address_primary")
  public void setAddressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
  }

  /**
   * Secondary address line of the store.
   **/
  public CatalogsLocalStoresCreate200ResponseInnerData addressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
    return this;
  }

  
  @ApiModelProperty(example = "Suite 100", value = "Secondary address line of the store.")
  @JsonProperty("address_secondary")
  public String getAddressSecondary() {
    return addressSecondary;
  }

  @JsonProperty("address_secondary")
  public void setAddressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
  }

  /**
   * City where the store is located.
   **/
  public CatalogsLocalStoresCreate200ResponseInnerData city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(example = "Sunnyvale", value = "City where the store is located.")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * Country code where the store is located.
   **/
  public CatalogsLocalStoresCreate200ResponseInnerData country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Country code where the store is located.")
  @JsonProperty(required = true, value = "country")
  @NotNull public Country getCountry() {
    return country;
  }

  @JsonProperty(required = true, value = "country")
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Creation timestamp
   **/
  public CatalogsLocalStoresCreate200ResponseInnerData createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "Creation timestamp")
  @JsonProperty(required = true, value = "created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  @JsonProperty(required = true, value = "created_at")
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The ID of the local store.
   **/
  public CatalogsLocalStoresCreate200ResponseInnerData id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "1234567890", required = true, value = "The ID of the local store.")
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Geographic latitude coordinate of the store.
   **/
  public CatalogsLocalStoresCreate200ResponseInnerData latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(example = "-30.21", value = "Geographic latitude coordinate of the store.")
  @JsonProperty("latitude")
  public Float getLatitude() {
    return latitude;
  }

  @JsonProperty("latitude")
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  /**
   * Geographic longitude coordinate of the store.
   **/
  public CatalogsLocalStoresCreate200ResponseInnerData longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(example = "50.45", value = "Geographic longitude coordinate of the store.")
  @JsonProperty("longitude")
  public Float getLongitude() {
    return longitude;
  }

  @JsonProperty("longitude")
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  /**
   * The name of the local store.
   **/
  public CatalogsLocalStoresCreate200ResponseInnerData name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Sunnyvale Store", required = true, value = "The name of the local store.")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Postal or ZIP code of the store.
   **/
  public CatalogsLocalStoresCreate200ResponseInnerData postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  
  @ApiModelProperty(example = "94043", value = "Postal or ZIP code of the store.")
  @JsonProperty("postal_code")
  public String getPostalCode() {
    return postalCode;
  }

  @JsonProperty("postal_code")
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * State or region code where the store is located.
   **/
  public CatalogsLocalStoresCreate200ResponseInnerData region(String region) {
    this.region = region;
    return this;
  }

  
  @ApiModelProperty(example = "CA", value = "State or region code where the store is located.")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  @JsonProperty("region")
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Merchant provided code for the local store. Unique within the merchant&#39;s catalog.
   **/
  public CatalogsLocalStoresCreate200ResponseInnerData storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  
  @ApiModelProperty(example = "store_1", required = true, value = "Merchant provided code for the local store. Unique within the merchant's catalog.")
  @JsonProperty(required = true, value = "store_code")
  @NotNull public String getStoreCode() {
    return storeCode;
  }

  @JsonProperty(required = true, value = "store_code")
  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  /**
   * Last update timestamp
   **/
  public CatalogsLocalStoresCreate200ResponseInnerData updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:16:34Z", required = true, value = "Last update timestamp")
  @JsonProperty(required = true, value = "updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty(required = true, value = "updated_at")
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   **/
  public CatalogsLocalStoresCreate200ResponseInnerData exceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "exceptions")
  @NotNull @Valid public PinterestLibError getExceptions() {
    return exceptions;
  }

  @JsonProperty(required = true, value = "exceptions")
  public void setExceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsLocalStoresCreate200ResponseInnerData catalogsLocalStoresCreate200ResponseInnerData = (CatalogsLocalStoresCreate200ResponseInnerData) o;
    return Objects.equals(this.addressPrimary, catalogsLocalStoresCreate200ResponseInnerData.addressPrimary) &&
        Objects.equals(this.addressSecondary, catalogsLocalStoresCreate200ResponseInnerData.addressSecondary) &&
        Objects.equals(this.city, catalogsLocalStoresCreate200ResponseInnerData.city) &&
        Objects.equals(this.country, catalogsLocalStoresCreate200ResponseInnerData.country) &&
        Objects.equals(this.createdAt, catalogsLocalStoresCreate200ResponseInnerData.createdAt) &&
        Objects.equals(this.id, catalogsLocalStoresCreate200ResponseInnerData.id) &&
        Objects.equals(this.latitude, catalogsLocalStoresCreate200ResponseInnerData.latitude) &&
        Objects.equals(this.longitude, catalogsLocalStoresCreate200ResponseInnerData.longitude) &&
        Objects.equals(this.name, catalogsLocalStoresCreate200ResponseInnerData.name) &&
        Objects.equals(this.postalCode, catalogsLocalStoresCreate200ResponseInnerData.postalCode) &&
        Objects.equals(this.region, catalogsLocalStoresCreate200ResponseInnerData.region) &&
        Objects.equals(this.storeCode, catalogsLocalStoresCreate200ResponseInnerData.storeCode) &&
        Objects.equals(this.updatedAt, catalogsLocalStoresCreate200ResponseInnerData.updatedAt) &&
        Objects.equals(this.exceptions, catalogsLocalStoresCreate200ResponseInnerData.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressPrimary, addressSecondary, city, country, createdAt, id, latitude, longitude, name, postalCode, region, storeCode, updatedAt, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsLocalStoresCreate200ResponseInnerData {\n");
    
    sb.append("    addressPrimary: ").append(toIndentedString(addressPrimary)).append("\n");
    sb.append("    addressSecondary: ").append(toIndentedString(addressSecondary)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    storeCode: ").append(toIndentedString(storeCode)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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
