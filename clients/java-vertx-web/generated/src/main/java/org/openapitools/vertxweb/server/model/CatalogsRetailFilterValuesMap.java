package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A map of filter attributes to their available values.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsRetailFilterValuesMap   {
  
  private List<String> adImageTags = new ArrayList<>();
  private List<String> adVideoTags = new ArrayList<>();


  public enum AvailabilityEnum {
    IN_STOCK("IN_STOCK"),
    OUT_OF_STOCK("OUT_OF_STOCK"),
    PREORDER("PREORDER"),
    UNAVAILABLE("UNAVAILABLE");

    private String value;

    AvailabilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<AvailabilityEnum> availability = new ArrayList<>();
  private List<String> brand = new ArrayList<>();


  public enum ConditionEnum {
    NEW("NEW"),
    USED("USED"),
    REFURBISHED("REFURBISHED");

    private String value;

    ConditionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<ConditionEnum> condition = new ArrayList<>();
  private List<String> customLabel0 = new ArrayList<>();
  private List<String> customLabel1 = new ArrayList<>();
  private List<String> customLabel2 = new ArrayList<>();
  private List<String> customLabel3 = new ArrayList<>();
  private List<String> customLabel4 = new ArrayList<>();


  public enum GenderEnum {
    FEMALE("FEMALE"),
    MALE("MALE"),
    UNISEX("UNISEX");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<GenderEnum> gender = new ArrayList<>();
  private List<String> googleProductCategory0 = new ArrayList<>();
  private List<String> googleProductCategory1 = new ArrayList<>();
  private List<String> googleProductCategory2 = new ArrayList<>();
  private List<String> googleProductCategory3 = new ArrayList<>();
  private List<String> googleProductCategory4 = new ArrayList<>();
  private List<String> googleProductCategory5 = new ArrayList<>();
  private List<String> googleProductCategory6 = new ArrayList<>();


  public enum MediaTypeEnum {
    IMAGE("IMAGE"),
    VIDEO("VIDEO");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<MediaTypeEnum> mediaType = new ArrayList<>();
  private List<String> productType0 = new ArrayList<>();
  private List<String> productType1 = new ArrayList<>();
  private List<String> productType2 = new ArrayList<>();
  private List<String> productType3 = new ArrayList<>();
  private List<String> productType4 = new ArrayList<>();

  public CatalogsRetailFilterValuesMap () {

  }

  public CatalogsRetailFilterValuesMap (List<String> adImageTags, List<String> adVideoTags, List<AvailabilityEnum> availability, List<String> brand, List<ConditionEnum> condition, List<String> customLabel0, List<String> customLabel1, List<String> customLabel2, List<String> customLabel3, List<String> customLabel4, List<GenderEnum> gender, List<String> googleProductCategory0, List<String> googleProductCategory1, List<String> googleProductCategory2, List<String> googleProductCategory3, List<String> googleProductCategory4, List<String> googleProductCategory5, List<String> googleProductCategory6, List<MediaTypeEnum> mediaType, List<String> productType0, List<String> productType1, List<String> productType2, List<String> productType3, List<String> productType4) {
    this.adImageTags = adImageTags;
    this.adVideoTags = adVideoTags;
    this.availability = availability;
    this.brand = brand;
    this.condition = condition;
    this.customLabel0 = customLabel0;
    this.customLabel1 = customLabel1;
    this.customLabel2 = customLabel2;
    this.customLabel3 = customLabel3;
    this.customLabel4 = customLabel4;
    this.gender = gender;
    this.googleProductCategory0 = googleProductCategory0;
    this.googleProductCategory1 = googleProductCategory1;
    this.googleProductCategory2 = googleProductCategory2;
    this.googleProductCategory3 = googleProductCategory3;
    this.googleProductCategory4 = googleProductCategory4;
    this.googleProductCategory5 = googleProductCategory5;
    this.googleProductCategory6 = googleProductCategory6;
    this.mediaType = mediaType;
    this.productType0 = productType0;
    this.productType1 = productType1;
    this.productType2 = productType2;
    this.productType3 = productType3;
    this.productType4 = productType4;
  }

    
  @JsonProperty("ad_image_tags")
  public List<String> getAdImageTags() {
    return adImageTags;
  }
  public void setAdImageTags(List<String> adImageTags) {
    this.adImageTags = adImageTags;
  }

    
  @JsonProperty("ad_video_tags")
  public List<String> getAdVideoTags() {
    return adVideoTags;
  }
  public void setAdVideoTags(List<String> adVideoTags) {
    this.adVideoTags = adVideoTags;
  }

    
  @JsonProperty("availability")
  public List<AvailabilityEnum> getAvailability() {
    return availability;
  }
  public void setAvailability(List<AvailabilityEnum> availability) {
    this.availability = availability;
  }

    
  @JsonProperty("brand")
  public List<String> getBrand() {
    return brand;
  }
  public void setBrand(List<String> brand) {
    this.brand = brand;
  }

    
  @JsonProperty("condition")
  public List<ConditionEnum> getCondition() {
    return condition;
  }
  public void setCondition(List<ConditionEnum> condition) {
    this.condition = condition;
  }

    
  @JsonProperty("custom_label_0")
  public List<String> getCustomLabel0() {
    return customLabel0;
  }
  public void setCustomLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
  }

    
  @JsonProperty("custom_label_1")
  public List<String> getCustomLabel1() {
    return customLabel1;
  }
  public void setCustomLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
  }

    
  @JsonProperty("custom_label_2")
  public List<String> getCustomLabel2() {
    return customLabel2;
  }
  public void setCustomLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
  }

    
  @JsonProperty("custom_label_3")
  public List<String> getCustomLabel3() {
    return customLabel3;
  }
  public void setCustomLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
  }

    
  @JsonProperty("custom_label_4")
  public List<String> getCustomLabel4() {
    return customLabel4;
  }
  public void setCustomLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
  }

    
  @JsonProperty("gender")
  public List<GenderEnum> getGender() {
    return gender;
  }
  public void setGender(List<GenderEnum> gender) {
    this.gender = gender;
  }

    
  @JsonProperty("google_product_category_0")
  public List<String> getGoogleProductCategory0() {
    return googleProductCategory0;
  }
  public void setGoogleProductCategory0(List<String> googleProductCategory0) {
    this.googleProductCategory0 = googleProductCategory0;
  }

    
  @JsonProperty("google_product_category_1")
  public List<String> getGoogleProductCategory1() {
    return googleProductCategory1;
  }
  public void setGoogleProductCategory1(List<String> googleProductCategory1) {
    this.googleProductCategory1 = googleProductCategory1;
  }

    
  @JsonProperty("google_product_category_2")
  public List<String> getGoogleProductCategory2() {
    return googleProductCategory2;
  }
  public void setGoogleProductCategory2(List<String> googleProductCategory2) {
    this.googleProductCategory2 = googleProductCategory2;
  }

    
  @JsonProperty("google_product_category_3")
  public List<String> getGoogleProductCategory3() {
    return googleProductCategory3;
  }
  public void setGoogleProductCategory3(List<String> googleProductCategory3) {
    this.googleProductCategory3 = googleProductCategory3;
  }

    
  @JsonProperty("google_product_category_4")
  public List<String> getGoogleProductCategory4() {
    return googleProductCategory4;
  }
  public void setGoogleProductCategory4(List<String> googleProductCategory4) {
    this.googleProductCategory4 = googleProductCategory4;
  }

    
  @JsonProperty("google_product_category_5")
  public List<String> getGoogleProductCategory5() {
    return googleProductCategory5;
  }
  public void setGoogleProductCategory5(List<String> googleProductCategory5) {
    this.googleProductCategory5 = googleProductCategory5;
  }

    
  @JsonProperty("google_product_category_6")
  public List<String> getGoogleProductCategory6() {
    return googleProductCategory6;
  }
  public void setGoogleProductCategory6(List<String> googleProductCategory6) {
    this.googleProductCategory6 = googleProductCategory6;
  }

    
  @JsonProperty("media_type")
  public List<MediaTypeEnum> getMediaType() {
    return mediaType;
  }
  public void setMediaType(List<MediaTypeEnum> mediaType) {
    this.mediaType = mediaType;
  }

    
  @JsonProperty("product_type_0")
  public List<String> getProductType0() {
    return productType0;
  }
  public void setProductType0(List<String> productType0) {
    this.productType0 = productType0;
  }

    
  @JsonProperty("product_type_1")
  public List<String> getProductType1() {
    return productType1;
  }
  public void setProductType1(List<String> productType1) {
    this.productType1 = productType1;
  }

    
  @JsonProperty("product_type_2")
  public List<String> getProductType2() {
    return productType2;
  }
  public void setProductType2(List<String> productType2) {
    this.productType2 = productType2;
  }

    
  @JsonProperty("product_type_3")
  public List<String> getProductType3() {
    return productType3;
  }
  public void setProductType3(List<String> productType3) {
    this.productType3 = productType3;
  }

    
  @JsonProperty("product_type_4")
  public List<String> getProductType4() {
    return productType4;
  }
  public void setProductType4(List<String> productType4) {
    this.productType4 = productType4;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap = (CatalogsRetailFilterValuesMap) o;
    return Objects.equals(adImageTags, catalogsRetailFilterValuesMap.adImageTags) &&
        Objects.equals(adVideoTags, catalogsRetailFilterValuesMap.adVideoTags) &&
        Objects.equals(availability, catalogsRetailFilterValuesMap.availability) &&
        Objects.equals(brand, catalogsRetailFilterValuesMap.brand) &&
        Objects.equals(condition, catalogsRetailFilterValuesMap.condition) &&
        Objects.equals(customLabel0, catalogsRetailFilterValuesMap.customLabel0) &&
        Objects.equals(customLabel1, catalogsRetailFilterValuesMap.customLabel1) &&
        Objects.equals(customLabel2, catalogsRetailFilterValuesMap.customLabel2) &&
        Objects.equals(customLabel3, catalogsRetailFilterValuesMap.customLabel3) &&
        Objects.equals(customLabel4, catalogsRetailFilterValuesMap.customLabel4) &&
        Objects.equals(gender, catalogsRetailFilterValuesMap.gender) &&
        Objects.equals(googleProductCategory0, catalogsRetailFilterValuesMap.googleProductCategory0) &&
        Objects.equals(googleProductCategory1, catalogsRetailFilterValuesMap.googleProductCategory1) &&
        Objects.equals(googleProductCategory2, catalogsRetailFilterValuesMap.googleProductCategory2) &&
        Objects.equals(googleProductCategory3, catalogsRetailFilterValuesMap.googleProductCategory3) &&
        Objects.equals(googleProductCategory4, catalogsRetailFilterValuesMap.googleProductCategory4) &&
        Objects.equals(googleProductCategory5, catalogsRetailFilterValuesMap.googleProductCategory5) &&
        Objects.equals(googleProductCategory6, catalogsRetailFilterValuesMap.googleProductCategory6) &&
        Objects.equals(mediaType, catalogsRetailFilterValuesMap.mediaType) &&
        Objects.equals(productType0, catalogsRetailFilterValuesMap.productType0) &&
        Objects.equals(productType1, catalogsRetailFilterValuesMap.productType1) &&
        Objects.equals(productType2, catalogsRetailFilterValuesMap.productType2) &&
        Objects.equals(productType3, catalogsRetailFilterValuesMap.productType3) &&
        Objects.equals(productType4, catalogsRetailFilterValuesMap.productType4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adImageTags, adVideoTags, availability, brand, condition, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, gender, googleProductCategory0, googleProductCategory1, googleProductCategory2, googleProductCategory3, googleProductCategory4, googleProductCategory5, googleProductCategory6, mediaType, productType0, productType1, productType2, productType3, productType4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailFilterValuesMap {\n");
    
    sb.append("    adImageTags: ").append(toIndentedString(adImageTags)).append("\n");
    sb.append("    adVideoTags: ").append(toIndentedString(adVideoTags)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    customLabel0: ").append(toIndentedString(customLabel0)).append("\n");
    sb.append("    customLabel1: ").append(toIndentedString(customLabel1)).append("\n");
    sb.append("    customLabel2: ").append(toIndentedString(customLabel2)).append("\n");
    sb.append("    customLabel3: ").append(toIndentedString(customLabel3)).append("\n");
    sb.append("    customLabel4: ").append(toIndentedString(customLabel4)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    googleProductCategory0: ").append(toIndentedString(googleProductCategory0)).append("\n");
    sb.append("    googleProductCategory1: ").append(toIndentedString(googleProductCategory1)).append("\n");
    sb.append("    googleProductCategory2: ").append(toIndentedString(googleProductCategory2)).append("\n");
    sb.append("    googleProductCategory3: ").append(toIndentedString(googleProductCategory3)).append("\n");
    sb.append("    googleProductCategory4: ").append(toIndentedString(googleProductCategory4)).append("\n");
    sb.append("    googleProductCategory5: ").append(toIndentedString(googleProductCategory5)).append("\n");
    sb.append("    googleProductCategory6: ").append(toIndentedString(googleProductCategory6)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    productType0: ").append(toIndentedString(productType0)).append("\n");
    sb.append("    productType1: ").append(toIndentedString(productType1)).append("\n");
    sb.append("    productType2: ").append(toIndentedString(productType2)).append("\n");
    sb.append("    productType3: ").append(toIndentedString(productType3)).append("\n");
    sb.append("    productType4: ").append(toIndentedString(productType4)).append("\n");
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
