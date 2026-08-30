package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Gender;
import org.openapitools.model.MediaType;
import org.openapitools.model.ProductAvailability;
import org.openapitools.model.ProductCondition;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A map of filter attributes to their available values.
 */

@Schema(name = "CatalogsRetailFilterValuesMap", description = "A map of filter attributes to their available values.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsRetailFilterValuesMap {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> adImageTags = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> adVideoTags = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<ProductAvailability> availability = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> brand = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<ProductCondition> condition = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> customLabel0 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> customLabel1 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> customLabel2 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> customLabel3 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> customLabel4 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<Gender> gender = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> googleProductCategory0 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> googleProductCategory1 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> googleProductCategory2 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> googleProductCategory3 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> googleProductCategory4 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> googleProductCategory5 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> googleProductCategory6 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<MediaType> mediaType = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> productType0 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> productType1 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> productType2 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> productType3 = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> productType4 = new ArrayList<>();

  public CatalogsRetailFilterValuesMap adImageTags(List<String> adImageTags) {
    this.adImageTags = adImageTags;
    return this;
  }

  public CatalogsRetailFilterValuesMap addAdImageTagsItem(String adImageTagsItem) {
    if (this.adImageTags == null) {
      this.adImageTags = new ArrayList<>();
    }
    this.adImageTags.add(adImageTagsItem);
    return this;
  }

  /**
   * Get adImageTags
   * @return adImageTags
   */
  
  @Schema(name = "ad_image_tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_tags")
  public List<String> getAdImageTags() {
    return adImageTags;
  }

  @JsonProperty("ad_image_tags")
  public void setAdImageTags(List<String> adImageTags) {
    this.adImageTags = adImageTags;
  }

  public CatalogsRetailFilterValuesMap adVideoTags(List<String> adVideoTags) {
    this.adVideoTags = adVideoTags;
    return this;
  }

  public CatalogsRetailFilterValuesMap addAdVideoTagsItem(String adVideoTagsItem) {
    if (this.adVideoTags == null) {
      this.adVideoTags = new ArrayList<>();
    }
    this.adVideoTags.add(adVideoTagsItem);
    return this;
  }

  /**
   * Get adVideoTags
   * @return adVideoTags
   */
  
  @Schema(name = "ad_video_tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_video_tags")
  public List<String> getAdVideoTags() {
    return adVideoTags;
  }

  @JsonProperty("ad_video_tags")
  public void setAdVideoTags(List<String> adVideoTags) {
    this.adVideoTags = adVideoTags;
  }

  public CatalogsRetailFilterValuesMap availability(List<ProductAvailability> availability) {
    this.availability = availability;
    return this;
  }

  public CatalogsRetailFilterValuesMap addAvailabilityItem(ProductAvailability availabilityItem) {
    if (this.availability == null) {
      this.availability = new ArrayList<>();
    }
    this.availability.add(availabilityItem);
    return this;
  }

  /**
   * Get availability
   * @return availability
   */
  @Valid 
  @Schema(name = "availability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availability")
  public List<ProductAvailability> getAvailability() {
    return availability;
  }

  @JsonProperty("availability")
  public void setAvailability(List<ProductAvailability> availability) {
    this.availability = availability;
  }

  public CatalogsRetailFilterValuesMap brand(List<String> brand) {
    this.brand = brand;
    return this;
  }

  public CatalogsRetailFilterValuesMap addBrandItem(String brandItem) {
    if (this.brand == null) {
      this.brand = new ArrayList<>();
    }
    this.brand.add(brandItem);
    return this;
  }

  /**
   * Get brand
   * @return brand
   */
  
  @Schema(name = "brand", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("brand")
  public List<String> getBrand() {
    return brand;
  }

  @JsonProperty("brand")
  public void setBrand(List<String> brand) {
    this.brand = brand;
  }

  public CatalogsRetailFilterValuesMap condition(List<ProductCondition> condition) {
    this.condition = condition;
    return this;
  }

  public CatalogsRetailFilterValuesMap addConditionItem(ProductCondition conditionItem) {
    if (this.condition == null) {
      this.condition = new ArrayList<>();
    }
    this.condition.add(conditionItem);
    return this;
  }

  /**
   * Get condition
   * @return condition
   */
  @Valid 
  @Schema(name = "condition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("condition")
  public List<ProductCondition> getCondition() {
    return condition;
  }

  @JsonProperty("condition")
  public void setCondition(List<ProductCondition> condition) {
    this.condition = condition;
  }

  public CatalogsRetailFilterValuesMap customLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

  public CatalogsRetailFilterValuesMap addCustomLabel0Item(String customLabel0Item) {
    if (this.customLabel0 == null) {
      this.customLabel0 = new ArrayList<>();
    }
    this.customLabel0.add(customLabel0Item);
    return this;
  }

  /**
   * Get customLabel0
   * @return customLabel0
   */
  
  @Schema(name = "custom_label_0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_0")
  public List<String> getCustomLabel0() {
    return customLabel0;
  }

  @JsonProperty("custom_label_0")
  public void setCustomLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public CatalogsRetailFilterValuesMap customLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

  public CatalogsRetailFilterValuesMap addCustomLabel1Item(String customLabel1Item) {
    if (this.customLabel1 == null) {
      this.customLabel1 = new ArrayList<>();
    }
    this.customLabel1.add(customLabel1Item);
    return this;
  }

  /**
   * Get customLabel1
   * @return customLabel1
   */
  
  @Schema(name = "custom_label_1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_1")
  public List<String> getCustomLabel1() {
    return customLabel1;
  }

  @JsonProperty("custom_label_1")
  public void setCustomLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public CatalogsRetailFilterValuesMap customLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

  public CatalogsRetailFilterValuesMap addCustomLabel2Item(String customLabel2Item) {
    if (this.customLabel2 == null) {
      this.customLabel2 = new ArrayList<>();
    }
    this.customLabel2.add(customLabel2Item);
    return this;
  }

  /**
   * Get customLabel2
   * @return customLabel2
   */
  
  @Schema(name = "custom_label_2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_2")
  public List<String> getCustomLabel2() {
    return customLabel2;
  }

  @JsonProperty("custom_label_2")
  public void setCustomLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public CatalogsRetailFilterValuesMap customLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

  public CatalogsRetailFilterValuesMap addCustomLabel3Item(String customLabel3Item) {
    if (this.customLabel3 == null) {
      this.customLabel3 = new ArrayList<>();
    }
    this.customLabel3.add(customLabel3Item);
    return this;
  }

  /**
   * Get customLabel3
   * @return customLabel3
   */
  
  @Schema(name = "custom_label_3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_3")
  public List<String> getCustomLabel3() {
    return customLabel3;
  }

  @JsonProperty("custom_label_3")
  public void setCustomLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public CatalogsRetailFilterValuesMap customLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

  public CatalogsRetailFilterValuesMap addCustomLabel4Item(String customLabel4Item) {
    if (this.customLabel4 == null) {
      this.customLabel4 = new ArrayList<>();
    }
    this.customLabel4.add(customLabel4Item);
    return this;
  }

  /**
   * Get customLabel4
   * @return customLabel4
   */
  
  @Schema(name = "custom_label_4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_4")
  public List<String> getCustomLabel4() {
    return customLabel4;
  }

  @JsonProperty("custom_label_4")
  public void setCustomLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public CatalogsRetailFilterValuesMap gender(List<Gender> gender) {
    this.gender = gender;
    return this;
  }

  public CatalogsRetailFilterValuesMap addGenderItem(Gender genderItem) {
    if (this.gender == null) {
      this.gender = new ArrayList<>();
    }
    this.gender.add(genderItem);
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  @Valid 
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public List<Gender> getGender() {
    return gender;
  }

  @JsonProperty("gender")
  public void setGender(List<Gender> gender) {
    this.gender = gender;
  }

  public CatalogsRetailFilterValuesMap googleProductCategory0(List<String> googleProductCategory0) {
    this.googleProductCategory0 = googleProductCategory0;
    return this;
  }

  public CatalogsRetailFilterValuesMap addGoogleProductCategory0Item(String googleProductCategory0Item) {
    if (this.googleProductCategory0 == null) {
      this.googleProductCategory0 = new ArrayList<>();
    }
    this.googleProductCategory0.add(googleProductCategory0Item);
    return this;
  }

  /**
   * Get googleProductCategory0
   * @return googleProductCategory0
   */
  
  @Schema(name = "google_product_category_0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("google_product_category_0")
  public List<String> getGoogleProductCategory0() {
    return googleProductCategory0;
  }

  @JsonProperty("google_product_category_0")
  public void setGoogleProductCategory0(List<String> googleProductCategory0) {
    this.googleProductCategory0 = googleProductCategory0;
  }

  public CatalogsRetailFilterValuesMap googleProductCategory1(List<String> googleProductCategory1) {
    this.googleProductCategory1 = googleProductCategory1;
    return this;
  }

  public CatalogsRetailFilterValuesMap addGoogleProductCategory1Item(String googleProductCategory1Item) {
    if (this.googleProductCategory1 == null) {
      this.googleProductCategory1 = new ArrayList<>();
    }
    this.googleProductCategory1.add(googleProductCategory1Item);
    return this;
  }

  /**
   * Get googleProductCategory1
   * @return googleProductCategory1
   */
  
  @Schema(name = "google_product_category_1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("google_product_category_1")
  public List<String> getGoogleProductCategory1() {
    return googleProductCategory1;
  }

  @JsonProperty("google_product_category_1")
  public void setGoogleProductCategory1(List<String> googleProductCategory1) {
    this.googleProductCategory1 = googleProductCategory1;
  }

  public CatalogsRetailFilterValuesMap googleProductCategory2(List<String> googleProductCategory2) {
    this.googleProductCategory2 = googleProductCategory2;
    return this;
  }

  public CatalogsRetailFilterValuesMap addGoogleProductCategory2Item(String googleProductCategory2Item) {
    if (this.googleProductCategory2 == null) {
      this.googleProductCategory2 = new ArrayList<>();
    }
    this.googleProductCategory2.add(googleProductCategory2Item);
    return this;
  }

  /**
   * Get googleProductCategory2
   * @return googleProductCategory2
   */
  
  @Schema(name = "google_product_category_2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("google_product_category_2")
  public List<String> getGoogleProductCategory2() {
    return googleProductCategory2;
  }

  @JsonProperty("google_product_category_2")
  public void setGoogleProductCategory2(List<String> googleProductCategory2) {
    this.googleProductCategory2 = googleProductCategory2;
  }

  public CatalogsRetailFilterValuesMap googleProductCategory3(List<String> googleProductCategory3) {
    this.googleProductCategory3 = googleProductCategory3;
    return this;
  }

  public CatalogsRetailFilterValuesMap addGoogleProductCategory3Item(String googleProductCategory3Item) {
    if (this.googleProductCategory3 == null) {
      this.googleProductCategory3 = new ArrayList<>();
    }
    this.googleProductCategory3.add(googleProductCategory3Item);
    return this;
  }

  /**
   * Get googleProductCategory3
   * @return googleProductCategory3
   */
  
  @Schema(name = "google_product_category_3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("google_product_category_3")
  public List<String> getGoogleProductCategory3() {
    return googleProductCategory3;
  }

  @JsonProperty("google_product_category_3")
  public void setGoogleProductCategory3(List<String> googleProductCategory3) {
    this.googleProductCategory3 = googleProductCategory3;
  }

  public CatalogsRetailFilterValuesMap googleProductCategory4(List<String> googleProductCategory4) {
    this.googleProductCategory4 = googleProductCategory4;
    return this;
  }

  public CatalogsRetailFilterValuesMap addGoogleProductCategory4Item(String googleProductCategory4Item) {
    if (this.googleProductCategory4 == null) {
      this.googleProductCategory4 = new ArrayList<>();
    }
    this.googleProductCategory4.add(googleProductCategory4Item);
    return this;
  }

  /**
   * Get googleProductCategory4
   * @return googleProductCategory4
   */
  
  @Schema(name = "google_product_category_4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("google_product_category_4")
  public List<String> getGoogleProductCategory4() {
    return googleProductCategory4;
  }

  @JsonProperty("google_product_category_4")
  public void setGoogleProductCategory4(List<String> googleProductCategory4) {
    this.googleProductCategory4 = googleProductCategory4;
  }

  public CatalogsRetailFilterValuesMap googleProductCategory5(List<String> googleProductCategory5) {
    this.googleProductCategory5 = googleProductCategory5;
    return this;
  }

  public CatalogsRetailFilterValuesMap addGoogleProductCategory5Item(String googleProductCategory5Item) {
    if (this.googleProductCategory5 == null) {
      this.googleProductCategory5 = new ArrayList<>();
    }
    this.googleProductCategory5.add(googleProductCategory5Item);
    return this;
  }

  /**
   * Get googleProductCategory5
   * @return googleProductCategory5
   */
  
  @Schema(name = "google_product_category_5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("google_product_category_5")
  public List<String> getGoogleProductCategory5() {
    return googleProductCategory5;
  }

  @JsonProperty("google_product_category_5")
  public void setGoogleProductCategory5(List<String> googleProductCategory5) {
    this.googleProductCategory5 = googleProductCategory5;
  }

  public CatalogsRetailFilterValuesMap googleProductCategory6(List<String> googleProductCategory6) {
    this.googleProductCategory6 = googleProductCategory6;
    return this;
  }

  public CatalogsRetailFilterValuesMap addGoogleProductCategory6Item(String googleProductCategory6Item) {
    if (this.googleProductCategory6 == null) {
      this.googleProductCategory6 = new ArrayList<>();
    }
    this.googleProductCategory6.add(googleProductCategory6Item);
    return this;
  }

  /**
   * Get googleProductCategory6
   * @return googleProductCategory6
   */
  
  @Schema(name = "google_product_category_6", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("google_product_category_6")
  public List<String> getGoogleProductCategory6() {
    return googleProductCategory6;
  }

  @JsonProperty("google_product_category_6")
  public void setGoogleProductCategory6(List<String> googleProductCategory6) {
    this.googleProductCategory6 = googleProductCategory6;
  }

  public CatalogsRetailFilterValuesMap mediaType(List<MediaType> mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  public CatalogsRetailFilterValuesMap addMediaTypeItem(MediaType mediaTypeItem) {
    if (this.mediaType == null) {
      this.mediaType = new ArrayList<>();
    }
    this.mediaType.add(mediaTypeItem);
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
   */
  @Valid 
  @Schema(name = "media_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_type")
  public List<MediaType> getMediaType() {
    return mediaType;
  }

  @JsonProperty("media_type")
  public void setMediaType(List<MediaType> mediaType) {
    this.mediaType = mediaType;
  }

  public CatalogsRetailFilterValuesMap productType0(List<String> productType0) {
    this.productType0 = productType0;
    return this;
  }

  public CatalogsRetailFilterValuesMap addProductType0Item(String productType0Item) {
    if (this.productType0 == null) {
      this.productType0 = new ArrayList<>();
    }
    this.productType0.add(productType0Item);
    return this;
  }

  /**
   * Get productType0
   * @return productType0
   */
  
  @Schema(name = "product_type_0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_type_0")
  public List<String> getProductType0() {
    return productType0;
  }

  @JsonProperty("product_type_0")
  public void setProductType0(List<String> productType0) {
    this.productType0 = productType0;
  }

  public CatalogsRetailFilterValuesMap productType1(List<String> productType1) {
    this.productType1 = productType1;
    return this;
  }

  public CatalogsRetailFilterValuesMap addProductType1Item(String productType1Item) {
    if (this.productType1 == null) {
      this.productType1 = new ArrayList<>();
    }
    this.productType1.add(productType1Item);
    return this;
  }

  /**
   * Get productType1
   * @return productType1
   */
  
  @Schema(name = "product_type_1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_type_1")
  public List<String> getProductType1() {
    return productType1;
  }

  @JsonProperty("product_type_1")
  public void setProductType1(List<String> productType1) {
    this.productType1 = productType1;
  }

  public CatalogsRetailFilterValuesMap productType2(List<String> productType2) {
    this.productType2 = productType2;
    return this;
  }

  public CatalogsRetailFilterValuesMap addProductType2Item(String productType2Item) {
    if (this.productType2 == null) {
      this.productType2 = new ArrayList<>();
    }
    this.productType2.add(productType2Item);
    return this;
  }

  /**
   * Get productType2
   * @return productType2
   */
  
  @Schema(name = "product_type_2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_type_2")
  public List<String> getProductType2() {
    return productType2;
  }

  @JsonProperty("product_type_2")
  public void setProductType2(List<String> productType2) {
    this.productType2 = productType2;
  }

  public CatalogsRetailFilterValuesMap productType3(List<String> productType3) {
    this.productType3 = productType3;
    return this;
  }

  public CatalogsRetailFilterValuesMap addProductType3Item(String productType3Item) {
    if (this.productType3 == null) {
      this.productType3 = new ArrayList<>();
    }
    this.productType3.add(productType3Item);
    return this;
  }

  /**
   * Get productType3
   * @return productType3
   */
  
  @Schema(name = "product_type_3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_type_3")
  public List<String> getProductType3() {
    return productType3;
  }

  @JsonProperty("product_type_3")
  public void setProductType3(List<String> productType3) {
    this.productType3 = productType3;
  }

  public CatalogsRetailFilterValuesMap productType4(List<String> productType4) {
    this.productType4 = productType4;
    return this;
  }

  public CatalogsRetailFilterValuesMap addProductType4Item(String productType4Item) {
    if (this.productType4 == null) {
      this.productType4 = new ArrayList<>();
    }
    this.productType4.add(productType4Item);
    return this;
  }

  /**
   * Get productType4
   * @return productType4
   */
  
  @Schema(name = "product_type_4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_type_4")
  public List<String> getProductType4() {
    return productType4;
  }

  @JsonProperty("product_type_4")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

