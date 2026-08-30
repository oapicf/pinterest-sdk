package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.model.CatalogsLocalStoresCreate200ResponseInnerDataOneOf;
import org.openapitools.model.Country;
import org.openapitools.model.LocalStore;
import org.openapitools.model.PinterestLibError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Created/updated resource on success or error details on failure
 */
@ApiModel(description="Created/updated resource on success or error details on failure")

public class CatalogsLocalStoresCreate200ResponseInnerData  {
  
 /**
  * Primary address line of the store.
  */
  @ApiModelProperty(example = "123 Johnson St", value = "Primary address line of the store.")
  private String addressPrimary;

 /**
  * Secondary address line of the store.
  */
  @ApiModelProperty(example = "Suite 100", value = "Secondary address line of the store.")
  private String addressSecondary;

 /**
  * City where the store is located.
  */
  @ApiModelProperty(example = "Sunnyvale", value = "City where the store is located.")
  private String city;

 /**
  * Country code where the store is located.
  */
  @ApiModelProperty(required = true, value = "Country code where the store is located.")
  @Valid
  private Country country;

 /**
  * Creation timestamp
  */
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "Creation timestamp")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date createdAt;

 /**
  * The ID of the local store.
  */
  @ApiModelProperty(example = "1234567890", required = true, value = "The ID of the local store.")
  private String id;

 /**
  * Geographic latitude coordinate of the store.
  */
  @ApiModelProperty(example = "-30.21", value = "Geographic latitude coordinate of the store.")
  private Float latitude;

 /**
  * Geographic longitude coordinate of the store.
  */
  @ApiModelProperty(example = "50.45", value = "Geographic longitude coordinate of the store.")
  private Float longitude;

 /**
  * The name of the local store.
  */
  @ApiModelProperty(example = "Sunnyvale Store", required = true, value = "The name of the local store.")
  private String name;

 /**
  * Postal or ZIP code of the store.
  */
  @ApiModelProperty(example = "94043", value = "Postal or ZIP code of the store.")
  private String postalCode;

 /**
  * State or region code where the store is located.
  */
  @ApiModelProperty(example = "CA", value = "State or region code where the store is located.")
  private String region;

 /**
  * Merchant provided code for the local store. Unique within the merchant's catalog.
  */
  @ApiModelProperty(example = "store_1", required = true, value = "Merchant provided code for the local store. Unique within the merchant's catalog.")
  private String storeCode;

 /**
  * Last update timestamp
  */
  @ApiModelProperty(example = "2022-03-14T15:16:34Z", required = true, value = "Last update timestamp")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date updatedAt;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PinterestLibError exceptions;
 /**
  * Primary address line of the store.
  * @return addressPrimary
  */
  @JsonProperty("address_primary")
  public String getAddressPrimary() {
    return addressPrimary;
  }

  /**
   * Sets the <code>addressPrimary</code> property.
   */
 public void setAddressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
  }

  /**
   * Sets the <code>addressPrimary</code> property.
   */
  public CatalogsLocalStoresCreate200ResponseInnerData addressPrimary(String addressPrimary) {
    this.addressPrimary = addressPrimary;
    return this;
  }

 /**
  * Secondary address line of the store.
  * @return addressSecondary
  */
  @JsonProperty("address_secondary")
  public String getAddressSecondary() {
    return addressSecondary;
  }

  /**
   * Sets the <code>addressSecondary</code> property.
   */
 public void setAddressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
  }

  /**
   * Sets the <code>addressSecondary</code> property.
   */
  public CatalogsLocalStoresCreate200ResponseInnerData addressSecondary(String addressSecondary) {
    this.addressSecondary = addressSecondary;
    return this;
  }

 /**
  * City where the store is located.
  * @return city
  */
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  /**
   * Sets the <code>city</code> property.
   */
 public void setCity(String city) {
    this.city = city;
  }

  /**
   * Sets the <code>city</code> property.
   */
  public CatalogsLocalStoresCreate200ResponseInnerData city(String city) {
    this.city = city;
    return this;
  }

 /**
  * Country code where the store is located.
  * @return country
  */
  @JsonProperty("country")
  @NotNull
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
  public CatalogsLocalStoresCreate200ResponseInnerData country(Country country) {
    this.country = country;
    return this;
  }

 /**
  * Creation timestamp
  * @return createdAt
  */
  @JsonProperty("created_at")
  @NotNull
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   * <br><em>N.B. <code>createdAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   * <br><em>N.B. <code>createdAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CatalogsLocalStoresCreate200ResponseInnerData createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * The ID of the local store.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CatalogsLocalStoresCreate200ResponseInnerData id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Geographic latitude coordinate of the store.
  * @return latitude
  */
  @JsonProperty("latitude")
  public Float getLatitude() {
    return latitude;
  }

  /**
   * Sets the <code>latitude</code> property.
   */
 public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  /**
   * Sets the <code>latitude</code> property.
   */
  public CatalogsLocalStoresCreate200ResponseInnerData latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
  * Geographic longitude coordinate of the store.
  * @return longitude
  */
  @JsonProperty("longitude")
  public Float getLongitude() {
    return longitude;
  }

  /**
   * Sets the <code>longitude</code> property.
   */
 public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  /**
   * Sets the <code>longitude</code> property.
   */
  public CatalogsLocalStoresCreate200ResponseInnerData longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
  * The name of the local store.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
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
  public CatalogsLocalStoresCreate200ResponseInnerData name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Postal or ZIP code of the store.
  * @return postalCode
  */
  @JsonProperty("postal_code")
  public String getPostalCode() {
    return postalCode;
  }

  /**
   * Sets the <code>postalCode</code> property.
   */
 public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * Sets the <code>postalCode</code> property.
   */
  public CatalogsLocalStoresCreate200ResponseInnerData postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

 /**
  * State or region code where the store is located.
  * @return region
  */
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Sets the <code>region</code> property.
   */
 public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Sets the <code>region</code> property.
   */
  public CatalogsLocalStoresCreate200ResponseInnerData region(String region) {
    this.region = region;
    return this;
  }

 /**
  * Merchant provided code for the local store. Unique within the merchant&#39;s catalog.
  * @return storeCode
  */
  @JsonProperty("store_code")
  @NotNull
  public String getStoreCode() {
    return storeCode;
  }

  /**
   * Sets the <code>storeCode</code> property.
   */
 public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  /**
   * Sets the <code>storeCode</code> property.
   */
  public CatalogsLocalStoresCreate200ResponseInnerData storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

 /**
  * Last update timestamp
  * @return updatedAt
  */
  @JsonProperty("updated_at")
  @NotNull
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   * <br><em>N.B. <code>updatedAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   * <br><em>N.B. <code>updatedAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CatalogsLocalStoresCreate200ResponseInnerData updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

 /**
  * Get exceptions
  * @return exceptions
  */
  @JsonProperty("exceptions")
  @NotNull
  public PinterestLibError getExceptions() {
    return exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   */
 public void setExceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   */
  public CatalogsLocalStoresCreate200ResponseInnerData exceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

