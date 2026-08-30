package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Gender;
import org.openapitools.model.MediaType;
import org.openapitools.model.ProductAvailability;
import org.openapitools.model.ProductCondition;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A map of filter attributes to their available values.
 */
@ApiModel(description="A map of filter attributes to their available values.")

public class CatalogsRetailFilterValuesMap  {
  
  @ApiModelProperty(value = "")
  private List<String> adImageTags = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> adVideoTags = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<ProductAvailability> availability = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> brand = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<ProductCondition> condition = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> customLabel0 = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> customLabel1 = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> customLabel2 = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> customLabel3 = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> customLabel4 = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<Gender> gender = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> googleProductCategory0 = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> googleProductCategory1 = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> googleProductCategory2 = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> googleProductCategory3 = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> googleProductCategory4 = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> googleProductCategory5 = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> googleProductCategory6 = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<MediaType> mediaType = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> productType0 = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> productType1 = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> productType2 = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> productType3 = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> productType4 = new ArrayList<>();
 /**
  * Get adImageTags
  * @return adImageTags
  */
  @JsonProperty("ad_image_tags")
  public List<String> getAdImageTags() {
    return adImageTags;
  }

  /**
   * Sets the <code>adImageTags</code> property.
   */
 public void setAdImageTags(List<String> adImageTags) {
    this.adImageTags = adImageTags;
  }

  /**
   * Sets the <code>adImageTags</code> property.
   */
  public CatalogsRetailFilterValuesMap adImageTags(List<String> adImageTags) {
    this.adImageTags = adImageTags;
    return this;
  }

  /**
   * Adds a new item to the <code>adImageTags</code> list.
   */
  public CatalogsRetailFilterValuesMap addAdImageTagsItem(String adImageTagsItem) {
    this.adImageTags.add(adImageTagsItem);
    return this;
  }

 /**
  * Get adVideoTags
  * @return adVideoTags
  */
  @JsonProperty("ad_video_tags")
  public List<String> getAdVideoTags() {
    return adVideoTags;
  }

  /**
   * Sets the <code>adVideoTags</code> property.
   */
 public void setAdVideoTags(List<String> adVideoTags) {
    this.adVideoTags = adVideoTags;
  }

  /**
   * Sets the <code>adVideoTags</code> property.
   */
  public CatalogsRetailFilterValuesMap adVideoTags(List<String> adVideoTags) {
    this.adVideoTags = adVideoTags;
    return this;
  }

  /**
   * Adds a new item to the <code>adVideoTags</code> list.
   */
  public CatalogsRetailFilterValuesMap addAdVideoTagsItem(String adVideoTagsItem) {
    this.adVideoTags.add(adVideoTagsItem);
    return this;
  }

 /**
  * Get availability
  * @return availability
  */
  @JsonProperty("availability")
  public List<ProductAvailability> getAvailability() {
    return availability;
  }

  /**
   * Sets the <code>availability</code> property.
   */
 public void setAvailability(List<ProductAvailability> availability) {
    this.availability = availability;
  }

  /**
   * Sets the <code>availability</code> property.
   */
  public CatalogsRetailFilterValuesMap availability(List<ProductAvailability> availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Adds a new item to the <code>availability</code> list.
   */
  public CatalogsRetailFilterValuesMap addAvailabilityItem(ProductAvailability availabilityItem) {
    this.availability.add(availabilityItem);
    return this;
  }

 /**
  * Get brand
  * @return brand
  */
  @JsonProperty("brand")
  public List<String> getBrand() {
    return brand;
  }

  /**
   * Sets the <code>brand</code> property.
   */
 public void setBrand(List<String> brand) {
    this.brand = brand;
  }

  /**
   * Sets the <code>brand</code> property.
   */
  public CatalogsRetailFilterValuesMap brand(List<String> brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Adds a new item to the <code>brand</code> list.
   */
  public CatalogsRetailFilterValuesMap addBrandItem(String brandItem) {
    this.brand.add(brandItem);
    return this;
  }

 /**
  * Get condition
  * @return condition
  */
  @JsonProperty("condition")
  public List<ProductCondition> getCondition() {
    return condition;
  }

  /**
   * Sets the <code>condition</code> property.
   */
 public void setCondition(List<ProductCondition> condition) {
    this.condition = condition;
  }

  /**
   * Sets the <code>condition</code> property.
   */
  public CatalogsRetailFilterValuesMap condition(List<ProductCondition> condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Adds a new item to the <code>condition</code> list.
   */
  public CatalogsRetailFilterValuesMap addConditionItem(ProductCondition conditionItem) {
    this.condition.add(conditionItem);
    return this;
  }

 /**
  * Get customLabel0
  * @return customLabel0
  */
  @JsonProperty("custom_label_0")
  public List<String> getCustomLabel0() {
    return customLabel0;
  }

  /**
   * Sets the <code>customLabel0</code> property.
   */
 public void setCustomLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
  }

  /**
   * Sets the <code>customLabel0</code> property.
   */
  public CatalogsRetailFilterValuesMap customLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

  /**
   * Adds a new item to the <code>customLabel0</code> list.
   */
  public CatalogsRetailFilterValuesMap addCustomLabel0Item(String customLabel0Item) {
    this.customLabel0.add(customLabel0Item);
    return this;
  }

 /**
  * Get customLabel1
  * @return customLabel1
  */
  @JsonProperty("custom_label_1")
  public List<String> getCustomLabel1() {
    return customLabel1;
  }

  /**
   * Sets the <code>customLabel1</code> property.
   */
 public void setCustomLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
  }

  /**
   * Sets the <code>customLabel1</code> property.
   */
  public CatalogsRetailFilterValuesMap customLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

  /**
   * Adds a new item to the <code>customLabel1</code> list.
   */
  public CatalogsRetailFilterValuesMap addCustomLabel1Item(String customLabel1Item) {
    this.customLabel1.add(customLabel1Item);
    return this;
  }

 /**
  * Get customLabel2
  * @return customLabel2
  */
  @JsonProperty("custom_label_2")
  public List<String> getCustomLabel2() {
    return customLabel2;
  }

  /**
   * Sets the <code>customLabel2</code> property.
   */
 public void setCustomLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
  }

  /**
   * Sets the <code>customLabel2</code> property.
   */
  public CatalogsRetailFilterValuesMap customLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

  /**
   * Adds a new item to the <code>customLabel2</code> list.
   */
  public CatalogsRetailFilterValuesMap addCustomLabel2Item(String customLabel2Item) {
    this.customLabel2.add(customLabel2Item);
    return this;
  }

 /**
  * Get customLabel3
  * @return customLabel3
  */
  @JsonProperty("custom_label_3")
  public List<String> getCustomLabel3() {
    return customLabel3;
  }

  /**
   * Sets the <code>customLabel3</code> property.
   */
 public void setCustomLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
  }

  /**
   * Sets the <code>customLabel3</code> property.
   */
  public CatalogsRetailFilterValuesMap customLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

  /**
   * Adds a new item to the <code>customLabel3</code> list.
   */
  public CatalogsRetailFilterValuesMap addCustomLabel3Item(String customLabel3Item) {
    this.customLabel3.add(customLabel3Item);
    return this;
  }

 /**
  * Get customLabel4
  * @return customLabel4
  */
  @JsonProperty("custom_label_4")
  public List<String> getCustomLabel4() {
    return customLabel4;
  }

  /**
   * Sets the <code>customLabel4</code> property.
   */
 public void setCustomLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
  }

  /**
   * Sets the <code>customLabel4</code> property.
   */
  public CatalogsRetailFilterValuesMap customLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

  /**
   * Adds a new item to the <code>customLabel4</code> list.
   */
  public CatalogsRetailFilterValuesMap addCustomLabel4Item(String customLabel4Item) {
    this.customLabel4.add(customLabel4Item);
    return this;
  }

 /**
  * Get gender
  * @return gender
  */
  @JsonProperty("gender")
  public List<Gender> getGender() {
    return gender;
  }

  /**
   * Sets the <code>gender</code> property.
   */
 public void setGender(List<Gender> gender) {
    this.gender = gender;
  }

  /**
   * Sets the <code>gender</code> property.
   */
  public CatalogsRetailFilterValuesMap gender(List<Gender> gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Adds a new item to the <code>gender</code> list.
   */
  public CatalogsRetailFilterValuesMap addGenderItem(Gender genderItem) {
    this.gender.add(genderItem);
    return this;
  }

 /**
  * Get googleProductCategory0
  * @return googleProductCategory0
  */
  @JsonProperty("google_product_category_0")
  public List<String> getGoogleProductCategory0() {
    return googleProductCategory0;
  }

  /**
   * Sets the <code>googleProductCategory0</code> property.
   */
 public void setGoogleProductCategory0(List<String> googleProductCategory0) {
    this.googleProductCategory0 = googleProductCategory0;
  }

  /**
   * Sets the <code>googleProductCategory0</code> property.
   */
  public CatalogsRetailFilterValuesMap googleProductCategory0(List<String> googleProductCategory0) {
    this.googleProductCategory0 = googleProductCategory0;
    return this;
  }

  /**
   * Adds a new item to the <code>googleProductCategory0</code> list.
   */
  public CatalogsRetailFilterValuesMap addGoogleProductCategory0Item(String googleProductCategory0Item) {
    this.googleProductCategory0.add(googleProductCategory0Item);
    return this;
  }

 /**
  * Get googleProductCategory1
  * @return googleProductCategory1
  */
  @JsonProperty("google_product_category_1")
  public List<String> getGoogleProductCategory1() {
    return googleProductCategory1;
  }

  /**
   * Sets the <code>googleProductCategory1</code> property.
   */
 public void setGoogleProductCategory1(List<String> googleProductCategory1) {
    this.googleProductCategory1 = googleProductCategory1;
  }

  /**
   * Sets the <code>googleProductCategory1</code> property.
   */
  public CatalogsRetailFilterValuesMap googleProductCategory1(List<String> googleProductCategory1) {
    this.googleProductCategory1 = googleProductCategory1;
    return this;
  }

  /**
   * Adds a new item to the <code>googleProductCategory1</code> list.
   */
  public CatalogsRetailFilterValuesMap addGoogleProductCategory1Item(String googleProductCategory1Item) {
    this.googleProductCategory1.add(googleProductCategory1Item);
    return this;
  }

 /**
  * Get googleProductCategory2
  * @return googleProductCategory2
  */
  @JsonProperty("google_product_category_2")
  public List<String> getGoogleProductCategory2() {
    return googleProductCategory2;
  }

  /**
   * Sets the <code>googleProductCategory2</code> property.
   */
 public void setGoogleProductCategory2(List<String> googleProductCategory2) {
    this.googleProductCategory2 = googleProductCategory2;
  }

  /**
   * Sets the <code>googleProductCategory2</code> property.
   */
  public CatalogsRetailFilterValuesMap googleProductCategory2(List<String> googleProductCategory2) {
    this.googleProductCategory2 = googleProductCategory2;
    return this;
  }

  /**
   * Adds a new item to the <code>googleProductCategory2</code> list.
   */
  public CatalogsRetailFilterValuesMap addGoogleProductCategory2Item(String googleProductCategory2Item) {
    this.googleProductCategory2.add(googleProductCategory2Item);
    return this;
  }

 /**
  * Get googleProductCategory3
  * @return googleProductCategory3
  */
  @JsonProperty("google_product_category_3")
  public List<String> getGoogleProductCategory3() {
    return googleProductCategory3;
  }

  /**
   * Sets the <code>googleProductCategory3</code> property.
   */
 public void setGoogleProductCategory3(List<String> googleProductCategory3) {
    this.googleProductCategory3 = googleProductCategory3;
  }

  /**
   * Sets the <code>googleProductCategory3</code> property.
   */
  public CatalogsRetailFilterValuesMap googleProductCategory3(List<String> googleProductCategory3) {
    this.googleProductCategory3 = googleProductCategory3;
    return this;
  }

  /**
   * Adds a new item to the <code>googleProductCategory3</code> list.
   */
  public CatalogsRetailFilterValuesMap addGoogleProductCategory3Item(String googleProductCategory3Item) {
    this.googleProductCategory3.add(googleProductCategory3Item);
    return this;
  }

 /**
  * Get googleProductCategory4
  * @return googleProductCategory4
  */
  @JsonProperty("google_product_category_4")
  public List<String> getGoogleProductCategory4() {
    return googleProductCategory4;
  }

  /**
   * Sets the <code>googleProductCategory4</code> property.
   */
 public void setGoogleProductCategory4(List<String> googleProductCategory4) {
    this.googleProductCategory4 = googleProductCategory4;
  }

  /**
   * Sets the <code>googleProductCategory4</code> property.
   */
  public CatalogsRetailFilterValuesMap googleProductCategory4(List<String> googleProductCategory4) {
    this.googleProductCategory4 = googleProductCategory4;
    return this;
  }

  /**
   * Adds a new item to the <code>googleProductCategory4</code> list.
   */
  public CatalogsRetailFilterValuesMap addGoogleProductCategory4Item(String googleProductCategory4Item) {
    this.googleProductCategory4.add(googleProductCategory4Item);
    return this;
  }

 /**
  * Get googleProductCategory5
  * @return googleProductCategory5
  */
  @JsonProperty("google_product_category_5")
  public List<String> getGoogleProductCategory5() {
    return googleProductCategory5;
  }

  /**
   * Sets the <code>googleProductCategory5</code> property.
   */
 public void setGoogleProductCategory5(List<String> googleProductCategory5) {
    this.googleProductCategory5 = googleProductCategory5;
  }

  /**
   * Sets the <code>googleProductCategory5</code> property.
   */
  public CatalogsRetailFilterValuesMap googleProductCategory5(List<String> googleProductCategory5) {
    this.googleProductCategory5 = googleProductCategory5;
    return this;
  }

  /**
   * Adds a new item to the <code>googleProductCategory5</code> list.
   */
  public CatalogsRetailFilterValuesMap addGoogleProductCategory5Item(String googleProductCategory5Item) {
    this.googleProductCategory5.add(googleProductCategory5Item);
    return this;
  }

 /**
  * Get googleProductCategory6
  * @return googleProductCategory6
  */
  @JsonProperty("google_product_category_6")
  public List<String> getGoogleProductCategory6() {
    return googleProductCategory6;
  }

  /**
   * Sets the <code>googleProductCategory6</code> property.
   */
 public void setGoogleProductCategory6(List<String> googleProductCategory6) {
    this.googleProductCategory6 = googleProductCategory6;
  }

  /**
   * Sets the <code>googleProductCategory6</code> property.
   */
  public CatalogsRetailFilterValuesMap googleProductCategory6(List<String> googleProductCategory6) {
    this.googleProductCategory6 = googleProductCategory6;
    return this;
  }

  /**
   * Adds a new item to the <code>googleProductCategory6</code> list.
   */
  public CatalogsRetailFilterValuesMap addGoogleProductCategory6Item(String googleProductCategory6Item) {
    this.googleProductCategory6.add(googleProductCategory6Item);
    return this;
  }

 /**
  * Get mediaType
  * @return mediaType
  */
  @JsonProperty("media_type")
  public List<MediaType> getMediaType() {
    return mediaType;
  }

  /**
   * Sets the <code>mediaType</code> property.
   */
 public void setMediaType(List<MediaType> mediaType) {
    this.mediaType = mediaType;
  }

  /**
   * Sets the <code>mediaType</code> property.
   */
  public CatalogsRetailFilterValuesMap mediaType(List<MediaType> mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Adds a new item to the <code>mediaType</code> list.
   */
  public CatalogsRetailFilterValuesMap addMediaTypeItem(MediaType mediaTypeItem) {
    this.mediaType.add(mediaTypeItem);
    return this;
  }

 /**
  * Get productType0
  * @return productType0
  */
  @JsonProperty("product_type_0")
  public List<String> getProductType0() {
    return productType0;
  }

  /**
   * Sets the <code>productType0</code> property.
   */
 public void setProductType0(List<String> productType0) {
    this.productType0 = productType0;
  }

  /**
   * Sets the <code>productType0</code> property.
   */
  public CatalogsRetailFilterValuesMap productType0(List<String> productType0) {
    this.productType0 = productType0;
    return this;
  }

  /**
   * Adds a new item to the <code>productType0</code> list.
   */
  public CatalogsRetailFilterValuesMap addProductType0Item(String productType0Item) {
    this.productType0.add(productType0Item);
    return this;
  }

 /**
  * Get productType1
  * @return productType1
  */
  @JsonProperty("product_type_1")
  public List<String> getProductType1() {
    return productType1;
  }

  /**
   * Sets the <code>productType1</code> property.
   */
 public void setProductType1(List<String> productType1) {
    this.productType1 = productType1;
  }

  /**
   * Sets the <code>productType1</code> property.
   */
  public CatalogsRetailFilterValuesMap productType1(List<String> productType1) {
    this.productType1 = productType1;
    return this;
  }

  /**
   * Adds a new item to the <code>productType1</code> list.
   */
  public CatalogsRetailFilterValuesMap addProductType1Item(String productType1Item) {
    this.productType1.add(productType1Item);
    return this;
  }

 /**
  * Get productType2
  * @return productType2
  */
  @JsonProperty("product_type_2")
  public List<String> getProductType2() {
    return productType2;
  }

  /**
   * Sets the <code>productType2</code> property.
   */
 public void setProductType2(List<String> productType2) {
    this.productType2 = productType2;
  }

  /**
   * Sets the <code>productType2</code> property.
   */
  public CatalogsRetailFilterValuesMap productType2(List<String> productType2) {
    this.productType2 = productType2;
    return this;
  }

  /**
   * Adds a new item to the <code>productType2</code> list.
   */
  public CatalogsRetailFilterValuesMap addProductType2Item(String productType2Item) {
    this.productType2.add(productType2Item);
    return this;
  }

 /**
  * Get productType3
  * @return productType3
  */
  @JsonProperty("product_type_3")
  public List<String> getProductType3() {
    return productType3;
  }

  /**
   * Sets the <code>productType3</code> property.
   */
 public void setProductType3(List<String> productType3) {
    this.productType3 = productType3;
  }

  /**
   * Sets the <code>productType3</code> property.
   */
  public CatalogsRetailFilterValuesMap productType3(List<String> productType3) {
    this.productType3 = productType3;
    return this;
  }

  /**
   * Adds a new item to the <code>productType3</code> list.
   */
  public CatalogsRetailFilterValuesMap addProductType3Item(String productType3Item) {
    this.productType3.add(productType3Item);
    return this;
  }

 /**
  * Get productType4
  * @return productType4
  */
  @JsonProperty("product_type_4")
  public List<String> getProductType4() {
    return productType4;
  }

  /**
   * Sets the <code>productType4</code> property.
   */
 public void setProductType4(List<String> productType4) {
    this.productType4 = productType4;
  }

  /**
   * Sets the <code>productType4</code> property.
   */
  public CatalogsRetailFilterValuesMap productType4(List<String> productType4) {
    this.productType4 = productType4;
    return this;
  }

  /**
   * Adds a new item to the <code>productType4</code> list.
   */
  public CatalogsRetailFilterValuesMap addProductType4Item(String productType4Item) {
    this.productType4.add(productType4Item);
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
    CatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap = (CatalogsRetailFilterValuesMap) o;
    return Objects.equals(this.adImageTags, catalogsRetailFilterValuesMap.adImageTags) &&
        Objects.equals(this.adVideoTags, catalogsRetailFilterValuesMap.adVideoTags) &&
        Objects.equals(this.availability, catalogsRetailFilterValuesMap.availability) &&
        Objects.equals(this.brand, catalogsRetailFilterValuesMap.brand) &&
        Objects.equals(this.condition, catalogsRetailFilterValuesMap.condition) &&
        Objects.equals(this.customLabel0, catalogsRetailFilterValuesMap.customLabel0) &&
        Objects.equals(this.customLabel1, catalogsRetailFilterValuesMap.customLabel1) &&
        Objects.equals(this.customLabel2, catalogsRetailFilterValuesMap.customLabel2) &&
        Objects.equals(this.customLabel3, catalogsRetailFilterValuesMap.customLabel3) &&
        Objects.equals(this.customLabel4, catalogsRetailFilterValuesMap.customLabel4) &&
        Objects.equals(this.gender, catalogsRetailFilterValuesMap.gender) &&
        Objects.equals(this.googleProductCategory0, catalogsRetailFilterValuesMap.googleProductCategory0) &&
        Objects.equals(this.googleProductCategory1, catalogsRetailFilterValuesMap.googleProductCategory1) &&
        Objects.equals(this.googleProductCategory2, catalogsRetailFilterValuesMap.googleProductCategory2) &&
        Objects.equals(this.googleProductCategory3, catalogsRetailFilterValuesMap.googleProductCategory3) &&
        Objects.equals(this.googleProductCategory4, catalogsRetailFilterValuesMap.googleProductCategory4) &&
        Objects.equals(this.googleProductCategory5, catalogsRetailFilterValuesMap.googleProductCategory5) &&
        Objects.equals(this.googleProductCategory6, catalogsRetailFilterValuesMap.googleProductCategory6) &&
        Objects.equals(this.mediaType, catalogsRetailFilterValuesMap.mediaType) &&
        Objects.equals(this.productType0, catalogsRetailFilterValuesMap.productType0) &&
        Objects.equals(this.productType1, catalogsRetailFilterValuesMap.productType1) &&
        Objects.equals(this.productType2, catalogsRetailFilterValuesMap.productType2) &&
        Objects.equals(this.productType3, catalogsRetailFilterValuesMap.productType3) &&
        Objects.equals(this.productType4, catalogsRetailFilterValuesMap.productType4);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

