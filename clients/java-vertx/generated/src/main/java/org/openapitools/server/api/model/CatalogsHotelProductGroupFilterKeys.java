package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.BrandFilter;
import org.openapitools.server.api.model.CatalogsProductGroupMultipleCountriesCriteria;
import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria;
import org.openapitools.server.api.model.CatalogsProductGroupPricingCurrencyCriteria;
import org.openapitools.server.api.model.CountryFilter;
import org.openapitools.server.api.model.CustomLabel0Filter;
import org.openapitools.server.api.model.CustomLabel1Filter;
import org.openapitools.server.api.model.CustomLabel2Filter;
import org.openapitools.server.api.model.CustomLabel3Filter;
import org.openapitools.server.api.model.CustomLabel4Filter;
import org.openapitools.server.api.model.HotelIdFilter;
import org.openapitools.server.api.model.PriceFilter;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsHotelProductGroupFilterKeys   {
  
  private CatalogsProductGroupPricingCurrencyCriteria PRICE;
  private CatalogsProductGroupMultipleStringCriteria HOTEL_ID;
  private CatalogsProductGroupMultipleStringCriteria BRAND;
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0;
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1;
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2;
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3;
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4;
  private CatalogsProductGroupMultipleCountriesCriteria COUNTRY;

  public CatalogsHotelProductGroupFilterKeys () {

  }

  public CatalogsHotelProductGroupFilterKeys (CatalogsProductGroupPricingCurrencyCriteria PRICE, CatalogsProductGroupMultipleStringCriteria HOTEL_ID, CatalogsProductGroupMultipleStringCriteria BRAND, CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0, CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1, CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2, CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3, CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4, CatalogsProductGroupMultipleCountriesCriteria COUNTRY) {
    this.PRICE = PRICE;
    this.HOTEL_ID = HOTEL_ID;
    this.BRAND = BRAND;
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
    this.COUNTRY = COUNTRY;
  }

    
  @JsonProperty("PRICE")
  public CatalogsProductGroupPricingCurrencyCriteria getPRICE() {
    return PRICE;
  }
  public void setPRICE(CatalogsProductGroupPricingCurrencyCriteria PRICE) {
    this.PRICE = PRICE;
  }

    
  @JsonProperty("HOTEL_ID")
  public CatalogsProductGroupMultipleStringCriteria getHOTELID() {
    return HOTEL_ID;
  }
  public void setHOTELID(CatalogsProductGroupMultipleStringCriteria HOTEL_ID) {
    this.HOTEL_ID = HOTEL_ID;
  }

    
  @JsonProperty("BRAND")
  public CatalogsProductGroupMultipleStringCriteria getBRAND() {
    return BRAND;
  }
  public void setBRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
    this.BRAND = BRAND;
  }

    
  @JsonProperty("CUSTOM_LABEL_0")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL0() {
    return CUSTOM_LABEL_0;
  }
  public void setCUSTOMLABEL0(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
  }

    
  @JsonProperty("CUSTOM_LABEL_1")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL1() {
    return CUSTOM_LABEL_1;
  }
  public void setCUSTOMLABEL1(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
  }

    
  @JsonProperty("CUSTOM_LABEL_2")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL2() {
    return CUSTOM_LABEL_2;
  }
  public void setCUSTOMLABEL2(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
  }

    
  @JsonProperty("CUSTOM_LABEL_3")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL3() {
    return CUSTOM_LABEL_3;
  }
  public void setCUSTOMLABEL3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
  }

    
  @JsonProperty("CUSTOM_LABEL_4")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL4() {
    return CUSTOM_LABEL_4;
  }
  public void setCUSTOMLABEL4(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
  }

    
  @JsonProperty("COUNTRY")
  public CatalogsProductGroupMultipleCountriesCriteria getCOUNTRY() {
    return COUNTRY;
  }
  public void setCOUNTRY(CatalogsProductGroupMultipleCountriesCriteria COUNTRY) {
    this.COUNTRY = COUNTRY;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelProductGroupFilterKeys catalogsHotelProductGroupFilterKeys = (CatalogsHotelProductGroupFilterKeys) o;
    return Objects.equals(PRICE, catalogsHotelProductGroupFilterKeys.PRICE) &&
        Objects.equals(HOTEL_ID, catalogsHotelProductGroupFilterKeys.HOTEL_ID) &&
        Objects.equals(BRAND, catalogsHotelProductGroupFilterKeys.BRAND) &&
        Objects.equals(CUSTOM_LABEL_0, catalogsHotelProductGroupFilterKeys.CUSTOM_LABEL_0) &&
        Objects.equals(CUSTOM_LABEL_1, catalogsHotelProductGroupFilterKeys.CUSTOM_LABEL_1) &&
        Objects.equals(CUSTOM_LABEL_2, catalogsHotelProductGroupFilterKeys.CUSTOM_LABEL_2) &&
        Objects.equals(CUSTOM_LABEL_3, catalogsHotelProductGroupFilterKeys.CUSTOM_LABEL_3) &&
        Objects.equals(CUSTOM_LABEL_4, catalogsHotelProductGroupFilterKeys.CUSTOM_LABEL_4) &&
        Objects.equals(COUNTRY, catalogsHotelProductGroupFilterKeys.COUNTRY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PRICE, HOTEL_ID, BRAND, CUSTOM_LABEL_0, CUSTOM_LABEL_1, CUSTOM_LABEL_2, CUSTOM_LABEL_3, CUSTOM_LABEL_4, COUNTRY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelProductGroupFilterKeys {\n");
    
    sb.append("    PRICE: ").append(toIndentedString(PRICE)).append("\n");
    sb.append("    HOTEL_ID: ").append(toIndentedString(HOTEL_ID)).append("\n");
    sb.append("    BRAND: ").append(toIndentedString(BRAND)).append("\n");
    sb.append("    CUSTOM_LABEL_0: ").append(toIndentedString(CUSTOM_LABEL_0)).append("\n");
    sb.append("    CUSTOM_LABEL_1: ").append(toIndentedString(CUSTOM_LABEL_1)).append("\n");
    sb.append("    CUSTOM_LABEL_2: ").append(toIndentedString(CUSTOM_LABEL_2)).append("\n");
    sb.append("    CUSTOM_LABEL_3: ").append(toIndentedString(CUSTOM_LABEL_3)).append("\n");
    sb.append("    CUSTOM_LABEL_4: ").append(toIndentedString(CUSTOM_LABEL_4)).append("\n");
    sb.append("    COUNTRY: ").append(toIndentedString(COUNTRY)).append("\n");
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
