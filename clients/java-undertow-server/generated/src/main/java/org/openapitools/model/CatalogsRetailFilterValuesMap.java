/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Gender;
import org.openapitools.model.MediaType;
import org.openapitools.model.ProductAvailability;
import org.openapitools.model.ProductCondition;



/**
 * A map of filter attributes to their available values.
 */

@ApiModel(description = "A map of filter attributes to their available values.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsRetailFilterValuesMap   {
  
  private List<String> adImageTags = new ArrayList<>();
  private List<String> adVideoTags = new ArrayList<>();
  private List<ProductAvailability> availability = new ArrayList<>();
  private List<String> brand = new ArrayList<>();
  private List<ProductCondition> condition = new ArrayList<>();
  private List<String> customLabel0 = new ArrayList<>();
  private List<String> customLabel1 = new ArrayList<>();
  private List<String> customLabel2 = new ArrayList<>();
  private List<String> customLabel3 = new ArrayList<>();
  private List<String> customLabel4 = new ArrayList<>();
  private List<Gender> gender = new ArrayList<>();
  private List<String> googleProductCategory0 = new ArrayList<>();
  private List<String> googleProductCategory1 = new ArrayList<>();
  private List<String> googleProductCategory2 = new ArrayList<>();
  private List<String> googleProductCategory3 = new ArrayList<>();
  private List<String> googleProductCategory4 = new ArrayList<>();
  private List<String> googleProductCategory5 = new ArrayList<>();
  private List<String> googleProductCategory6 = new ArrayList<>();
  private List<MediaType> mediaType = new ArrayList<>();
  private List<String> productType0 = new ArrayList<>();
  private List<String> productType1 = new ArrayList<>();
  private List<String> productType2 = new ArrayList<>();
  private List<String> productType3 = new ArrayList<>();
  private List<String> productType4 = new ArrayList<>();

  /**
   */
  public CatalogsRetailFilterValuesMap adImageTags(List<String> adImageTags) {
    this.adImageTags = adImageTags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ad_image_tags")
  public List<String> getAdImageTags() {
    return adImageTags;
  }
  public void setAdImageTags(List<String> adImageTags) {
    this.adImageTags = adImageTags;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap adVideoTags(List<String> adVideoTags) {
    this.adVideoTags = adVideoTags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ad_video_tags")
  public List<String> getAdVideoTags() {
    return adVideoTags;
  }
  public void setAdVideoTags(List<String> adVideoTags) {
    this.adVideoTags = adVideoTags;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap availability(List<ProductAvailability> availability) {
    this.availability = availability;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("availability")
  public List<ProductAvailability> getAvailability() {
    return availability;
  }
  public void setAvailability(List<ProductAvailability> availability) {
    this.availability = availability;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap brand(List<String> brand) {
    this.brand = brand;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("brand")
  public List<String> getBrand() {
    return brand;
  }
  public void setBrand(List<String> brand) {
    this.brand = brand;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap condition(List<ProductCondition> condition) {
    this.condition = condition;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("condition")
  public List<ProductCondition> getCondition() {
    return condition;
  }
  public void setCondition(List<ProductCondition> condition) {
    this.condition = condition;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap customLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_0")
  public List<String> getCustomLabel0() {
    return customLabel0;
  }
  public void setCustomLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap customLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_1")
  public List<String> getCustomLabel1() {
    return customLabel1;
  }
  public void setCustomLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap customLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_2")
  public List<String> getCustomLabel2() {
    return customLabel2;
  }
  public void setCustomLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap customLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_3")
  public List<String> getCustomLabel3() {
    return customLabel3;
  }
  public void setCustomLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap customLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_4")
  public List<String> getCustomLabel4() {
    return customLabel4;
  }
  public void setCustomLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap gender(List<Gender> gender) {
    this.gender = gender;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("gender")
  public List<Gender> getGender() {
    return gender;
  }
  public void setGender(List<Gender> gender) {
    this.gender = gender;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap googleProductCategory0(List<String> googleProductCategory0) {
    this.googleProductCategory0 = googleProductCategory0;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("google_product_category_0")
  public List<String> getGoogleProductCategory0() {
    return googleProductCategory0;
  }
  public void setGoogleProductCategory0(List<String> googleProductCategory0) {
    this.googleProductCategory0 = googleProductCategory0;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap googleProductCategory1(List<String> googleProductCategory1) {
    this.googleProductCategory1 = googleProductCategory1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("google_product_category_1")
  public List<String> getGoogleProductCategory1() {
    return googleProductCategory1;
  }
  public void setGoogleProductCategory1(List<String> googleProductCategory1) {
    this.googleProductCategory1 = googleProductCategory1;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap googleProductCategory2(List<String> googleProductCategory2) {
    this.googleProductCategory2 = googleProductCategory2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("google_product_category_2")
  public List<String> getGoogleProductCategory2() {
    return googleProductCategory2;
  }
  public void setGoogleProductCategory2(List<String> googleProductCategory2) {
    this.googleProductCategory2 = googleProductCategory2;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap googleProductCategory3(List<String> googleProductCategory3) {
    this.googleProductCategory3 = googleProductCategory3;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("google_product_category_3")
  public List<String> getGoogleProductCategory3() {
    return googleProductCategory3;
  }
  public void setGoogleProductCategory3(List<String> googleProductCategory3) {
    this.googleProductCategory3 = googleProductCategory3;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap googleProductCategory4(List<String> googleProductCategory4) {
    this.googleProductCategory4 = googleProductCategory4;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("google_product_category_4")
  public List<String> getGoogleProductCategory4() {
    return googleProductCategory4;
  }
  public void setGoogleProductCategory4(List<String> googleProductCategory4) {
    this.googleProductCategory4 = googleProductCategory4;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap googleProductCategory5(List<String> googleProductCategory5) {
    this.googleProductCategory5 = googleProductCategory5;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("google_product_category_5")
  public List<String> getGoogleProductCategory5() {
    return googleProductCategory5;
  }
  public void setGoogleProductCategory5(List<String> googleProductCategory5) {
    this.googleProductCategory5 = googleProductCategory5;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap googleProductCategory6(List<String> googleProductCategory6) {
    this.googleProductCategory6 = googleProductCategory6;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("google_product_category_6")
  public List<String> getGoogleProductCategory6() {
    return googleProductCategory6;
  }
  public void setGoogleProductCategory6(List<String> googleProductCategory6) {
    this.googleProductCategory6 = googleProductCategory6;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap mediaType(List<MediaType> mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("media_type")
  public List<MediaType> getMediaType() {
    return mediaType;
  }
  public void setMediaType(List<MediaType> mediaType) {
    this.mediaType = mediaType;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap productType0(List<String> productType0) {
    this.productType0 = productType0;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_type_0")
  public List<String> getProductType0() {
    return productType0;
  }
  public void setProductType0(List<String> productType0) {
    this.productType0 = productType0;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap productType1(List<String> productType1) {
    this.productType1 = productType1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_type_1")
  public List<String> getProductType1() {
    return productType1;
  }
  public void setProductType1(List<String> productType1) {
    this.productType1 = productType1;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap productType2(List<String> productType2) {
    this.productType2 = productType2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_type_2")
  public List<String> getProductType2() {
    return productType2;
  }
  public void setProductType2(List<String> productType2) {
    this.productType2 = productType2;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap productType3(List<String> productType3) {
    this.productType3 = productType3;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_type_3")
  public List<String> getProductType3() {
    return productType3;
  }
  public void setProductType3(List<String> productType3) {
    this.productType3 = productType3;
  }

  /**
   */
  public CatalogsRetailFilterValuesMap productType4(List<String> productType4) {
    this.productType4 = productType4;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

