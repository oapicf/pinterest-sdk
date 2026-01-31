package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsHotelAddress;
import org.openapitools.vertxweb.server.model.CatalogsHotelGuestRatings;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsUpdatableHotelAttributes   {
  
  private CatalogsHotelAddress address;
  private String basePrice;
  private String brand;
  private String category;
  private String customLabel0;
  private String customLabel1;
  private String customLabel2;
  private String customLabel3;
  private String customLabel4;
  private String description;
  private CatalogsHotelGuestRatings guestRatings;
  private BigDecimal latitude;
  private String link;
  private BigDecimal longitude;
  private String name;
  private List<String> neighborhood;
  private String salePrice;

  public CatalogsUpdatableHotelAttributes () {

  }

  public CatalogsUpdatableHotelAttributes (CatalogsHotelAddress address, String basePrice, String brand, String category, String customLabel0, String customLabel1, String customLabel2, String customLabel3, String customLabel4, String description, CatalogsHotelGuestRatings guestRatings, BigDecimal latitude, String link, BigDecimal longitude, String name, List<String> neighborhood, String salePrice) {
    this.address = address;
    this.basePrice = basePrice;
    this.brand = brand;
    this.category = category;
    this.customLabel0 = customLabel0;
    this.customLabel1 = customLabel1;
    this.customLabel2 = customLabel2;
    this.customLabel3 = customLabel3;
    this.customLabel4 = customLabel4;
    this.description = description;
    this.guestRatings = guestRatings;
    this.latitude = latitude;
    this.link = link;
    this.longitude = longitude;
    this.name = name;
    this.neighborhood = neighborhood;
    this.salePrice = salePrice;
  }

    
  @JsonProperty("address")
  public CatalogsHotelAddress getAddress() {
    return address;
  }
  public void setAddress(CatalogsHotelAddress address) {
    this.address = address;
  }

    
  @JsonProperty("base_price")
  public String getBasePrice() {
    return basePrice;
  }
  public void setBasePrice(String basePrice) {
    this.basePrice = basePrice;
  }

    
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

    
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

    
  @JsonProperty("custom_label_0")
  public String getCustomLabel0() {
    return customLabel0;
  }
  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

    
  @JsonProperty("custom_label_1")
  public String getCustomLabel1() {
    return customLabel1;
  }
  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

    
  @JsonProperty("custom_label_2")
  public String getCustomLabel2() {
    return customLabel2;
  }
  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

    
  @JsonProperty("custom_label_3")
  public String getCustomLabel3() {
    return customLabel3;
  }
  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

    
  @JsonProperty("custom_label_4")
  public String getCustomLabel4() {
    return customLabel4;
  }
  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("guest_ratings")
  public CatalogsHotelGuestRatings getGuestRatings() {
    return guestRatings;
  }
  public void setGuestRatings(CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
  }

    
  @JsonProperty("latitude")
  public BigDecimal getLatitude() {
    return latitude;
  }
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

    
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

    
  @JsonProperty("longitude")
  public BigDecimal getLongitude() {
    return longitude;
  }
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("neighborhood")
  public List<String> getNeighborhood() {
    return neighborhood;
  }
  public void setNeighborhood(List<String> neighborhood) {
    this.neighborhood = neighborhood;
  }

    
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }
  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes = (CatalogsUpdatableHotelAttributes) o;
    return Objects.equals(address, catalogsUpdatableHotelAttributes.address) &&
        Objects.equals(basePrice, catalogsUpdatableHotelAttributes.basePrice) &&
        Objects.equals(brand, catalogsUpdatableHotelAttributes.brand) &&
        Objects.equals(category, catalogsUpdatableHotelAttributes.category) &&
        Objects.equals(customLabel0, catalogsUpdatableHotelAttributes.customLabel0) &&
        Objects.equals(customLabel1, catalogsUpdatableHotelAttributes.customLabel1) &&
        Objects.equals(customLabel2, catalogsUpdatableHotelAttributes.customLabel2) &&
        Objects.equals(customLabel3, catalogsUpdatableHotelAttributes.customLabel3) &&
        Objects.equals(customLabel4, catalogsUpdatableHotelAttributes.customLabel4) &&
        Objects.equals(description, catalogsUpdatableHotelAttributes.description) &&
        Objects.equals(guestRatings, catalogsUpdatableHotelAttributes.guestRatings) &&
        Objects.equals(latitude, catalogsUpdatableHotelAttributes.latitude) &&
        Objects.equals(link, catalogsUpdatableHotelAttributes.link) &&
        Objects.equals(longitude, catalogsUpdatableHotelAttributes.longitude) &&
        Objects.equals(name, catalogsUpdatableHotelAttributes.name) &&
        Objects.equals(neighborhood, catalogsUpdatableHotelAttributes.neighborhood) &&
        Objects.equals(salePrice, catalogsUpdatableHotelAttributes.salePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, basePrice, brand, category, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, description, guestRatings, latitude, link, longitude, name, neighborhood, salePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsUpdatableHotelAttributes {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    customLabel0: ").append(toIndentedString(customLabel0)).append("\n");
    sb.append("    customLabel1: ").append(toIndentedString(customLabel1)).append("\n");
    sb.append("    customLabel2: ").append(toIndentedString(customLabel2)).append("\n");
    sb.append("    customLabel3: ").append(toIndentedString(customLabel3)).append("\n");
    sb.append("    customLabel4: ").append(toIndentedString(customLabel4)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    guestRatings: ").append(toIndentedString(guestRatings)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    neighborhood: ").append(toIndentedString(neighborhood)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
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
