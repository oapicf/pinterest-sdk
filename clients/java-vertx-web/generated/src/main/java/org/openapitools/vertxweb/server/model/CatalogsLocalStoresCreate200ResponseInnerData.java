package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.CatalogsLocalStoresCreate200ResponseInnerDataOneOf;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.LocalStore;
import org.openapitools.vertxweb.server.model.PinterestLibError;

/**
 * Created/updated resource on success or error details on failure
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsLocalStoresCreate200ResponseInnerData   {
  
  private String addressPrimary;
  private String addressSecondary;
  private String city;
  private Country country;
  private OffsetDateTime createdAt;
  private String id;
  private Float latitude;
  private Float longitude;
  private String name;
  private String postalCode;
  private String region;
  private String storeCode;
  private OffsetDateTime updatedAt;
  private PinterestLibError exceptions;

  public CatalogsLocalStoresCreate200ResponseInnerData () {

  }

  public CatalogsLocalStoresCreate200ResponseInnerData (String addressPrimary, String addressSecondary, String city, Country country, OffsetDateTime createdAt, String id, Float latitude, Float longitude, String name, String postalCode, String region, String storeCode, OffsetDateTime updatedAt, PinterestLibError exceptions) {
    this.addressPrimary = addressPrimary;
    this.addressSecondary = addressSecondary;
    this.city = city;
    this.country = country;
    this.createdAt = createdAt;
    this.id = id;
    this.latitude = latitude;
    this.longitude = longitude;
    this.name = name;
    this.postalCode = postalCode;
    this.region = region;
    this.storeCode = storeCode;
    this.updatedAt = updatedAt;
    this.exceptions = exceptions;
  }

    
  @JsonProperty("address_primary")
  public String getAddressPrimary() {
    return addressPrimary;
  }
  public void setAddressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
  }

    
  @JsonProperty("address_secondary")
  public String getAddressSecondary() {
    return addressSecondary;
  }
  public void setAddressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
  }

    
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

    
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

    
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("latitude")
  public Float getLatitude() {
    return latitude;
  }
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

    
  @JsonProperty("longitude")
  public Float getLongitude() {
    return longitude;
  }
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("postal_code")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

    
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }

    
  @JsonProperty("store_code")
  public String getStoreCode() {
    return storeCode;
  }
  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

    
  @JsonProperty("updated_at")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("exceptions")
  public PinterestLibError getExceptions() {
    return exceptions;
  }
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
    return Objects.equals(addressPrimary, catalogsLocalStoresCreate200ResponseInnerData.addressPrimary) &&
        Objects.equals(addressSecondary, catalogsLocalStoresCreate200ResponseInnerData.addressSecondary) &&
        Objects.equals(city, catalogsLocalStoresCreate200ResponseInnerData.city) &&
        Objects.equals(country, catalogsLocalStoresCreate200ResponseInnerData.country) &&
        Objects.equals(createdAt, catalogsLocalStoresCreate200ResponseInnerData.createdAt) &&
        Objects.equals(id, catalogsLocalStoresCreate200ResponseInnerData.id) &&
        Objects.equals(latitude, catalogsLocalStoresCreate200ResponseInnerData.latitude) &&
        Objects.equals(longitude, catalogsLocalStoresCreate200ResponseInnerData.longitude) &&
        Objects.equals(name, catalogsLocalStoresCreate200ResponseInnerData.name) &&
        Objects.equals(postalCode, catalogsLocalStoresCreate200ResponseInnerData.postalCode) &&
        Objects.equals(region, catalogsLocalStoresCreate200ResponseInnerData.region) &&
        Objects.equals(storeCode, catalogsLocalStoresCreate200ResponseInnerData.storeCode) &&
        Objects.equals(updatedAt, catalogsLocalStoresCreate200ResponseInnerData.updatedAt) &&
        Objects.equals(exceptions, catalogsLocalStoresCreate200ResponseInnerData.exceptions);
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
