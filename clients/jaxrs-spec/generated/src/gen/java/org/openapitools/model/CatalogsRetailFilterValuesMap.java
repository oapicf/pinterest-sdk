package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * A map of filter attributes to their available values.
 **/
@ApiModel(description = "A map of filter attributes to their available values.")
@JsonTypeName("catalogs_retail_filter_values_map")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsRetailFilterValuesMap   {
  private @Valid List<String> adImageTags = new ArrayList<>();
  private @Valid List<String> adVideoTags = new ArrayList<>();
  public enum AvailabilityEnum {

    IN_STOCK(String.valueOf("IN_STOCK")), OUT_OF_STOCK(String.valueOf("OUT_OF_STOCK")), PREORDER(String.valueOf("PREORDER")), UNAVAILABLE(String.valueOf("UNAVAILABLE"));


    private String value;

    AvailabilityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static AvailabilityEnum fromString(String s) {
        for (AvailabilityEnum b : AvailabilityEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static AvailabilityEnum fromValue(String value) {
        for (AvailabilityEnum b : AvailabilityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid List<AvailabilityEnum> availability = new ArrayList<>();
  private @Valid List<String> brand = new ArrayList<>();
  public enum ConditionEnum {

    NEW(String.valueOf("NEW")), USED(String.valueOf("USED")), REFURBISHED(String.valueOf("REFURBISHED"));


    private String value;

    ConditionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ConditionEnum fromString(String s) {
        for (ConditionEnum b : ConditionEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static ConditionEnum fromValue(String value) {
        for (ConditionEnum b : ConditionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid List<ConditionEnum> condition = new ArrayList<>();
  private @Valid List<String> customLabel0 = new ArrayList<>();
  private @Valid List<String> customLabel1 = new ArrayList<>();
  private @Valid List<String> customLabel2 = new ArrayList<>();
  private @Valid List<String> customLabel3 = new ArrayList<>();
  private @Valid List<String> customLabel4 = new ArrayList<>();
  public enum GenderEnum {

    FEMALE(String.valueOf("FEMALE")), MALE(String.valueOf("MALE")), UNISEX(String.valueOf("UNISEX"));


    private String value;

    GenderEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static GenderEnum fromString(String s) {
        for (GenderEnum b : GenderEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static GenderEnum fromValue(String value) {
        for (GenderEnum b : GenderEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid List<GenderEnum> gender = new ArrayList<>();
  private @Valid List<String> googleProductCategory0 = new ArrayList<>();
  private @Valid List<String> googleProductCategory1 = new ArrayList<>();
  private @Valid List<String> googleProductCategory2 = new ArrayList<>();
  private @Valid List<String> googleProductCategory3 = new ArrayList<>();
  private @Valid List<String> googleProductCategory4 = new ArrayList<>();
  private @Valid List<String> googleProductCategory5 = new ArrayList<>();
  private @Valid List<String> googleProductCategory6 = new ArrayList<>();
  public enum MediaTypeEnum {

    IMAGE(String.valueOf("IMAGE")), VIDEO(String.valueOf("VIDEO"));


    private String value;

    MediaTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static MediaTypeEnum fromString(String s) {
        for (MediaTypeEnum b : MediaTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static MediaTypeEnum fromValue(String value) {
        for (MediaTypeEnum b : MediaTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid List<MediaTypeEnum> mediaType = new ArrayList<>();
  private @Valid List<String> productType0 = new ArrayList<>();
  private @Valid List<String> productType1 = new ArrayList<>();
  private @Valid List<String> productType2 = new ArrayList<>();
  private @Valid List<String> productType3 = new ArrayList<>();
  private @Valid List<String> productType4 = new ArrayList<>();

  public CatalogsRetailFilterValuesMap() {
  }

  /**
   **/
  public CatalogsRetailFilterValuesMap adImageTags(List<String> adImageTags) {
    this.adImageTags = adImageTags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ad_image_tags")
  public List<String> getAdImageTags() {
    return adImageTags;
  }

  @JsonProperty("ad_image_tags")
  public void setAdImageTags(List<String> adImageTags) {
    this.adImageTags = adImageTags;
  }

  public CatalogsRetailFilterValuesMap addAdImageTagsItem(String adImageTagsItem) {
    if (this.adImageTags == null) {
      this.adImageTags = new ArrayList<>();
    }

    this.adImageTags.add(adImageTagsItem);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeAdImageTagsItem(String adImageTagsItem) {
    if (adImageTagsItem != null && this.adImageTags != null) {
      this.adImageTags.remove(adImageTagsItem);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap adVideoTags(List<String> adVideoTags) {
    this.adVideoTags = adVideoTags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ad_video_tags")
  public List<String> getAdVideoTags() {
    return adVideoTags;
  }

  @JsonProperty("ad_video_tags")
  public void setAdVideoTags(List<String> adVideoTags) {
    this.adVideoTags = adVideoTags;
  }

  public CatalogsRetailFilterValuesMap addAdVideoTagsItem(String adVideoTagsItem) {
    if (this.adVideoTags == null) {
      this.adVideoTags = new ArrayList<>();
    }

    this.adVideoTags.add(adVideoTagsItem);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeAdVideoTagsItem(String adVideoTagsItem) {
    if (adVideoTagsItem != null && this.adVideoTags != null) {
      this.adVideoTags.remove(adVideoTagsItem);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap availability(List<AvailabilityEnum> availability) {
    this.availability = availability;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("availability")
  public List<AvailabilityEnum> getAvailability() {
    return availability;
  }

  @JsonProperty("availability")
  public void setAvailability(List<AvailabilityEnum> availability) {
    this.availability = availability;
  }

  public CatalogsRetailFilterValuesMap addAvailabilityItem(AvailabilityEnum availabilityItem) {
    if (this.availability == null) {
      this.availability = new ArrayList<>();
    }

    this.availability.add(availabilityItem);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeAvailabilityItem(AvailabilityEnum availabilityItem) {
    if (availabilityItem != null && this.availability != null) {
      this.availability.remove(availabilityItem);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap brand(List<String> brand) {
    this.brand = brand;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("brand")
  public List<String> getBrand() {
    return brand;
  }

  @JsonProperty("brand")
  public void setBrand(List<String> brand) {
    this.brand = brand;
  }

  public CatalogsRetailFilterValuesMap addBrandItem(String brandItem) {
    if (this.brand == null) {
      this.brand = new ArrayList<>();
    }

    this.brand.add(brandItem);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeBrandItem(String brandItem) {
    if (brandItem != null && this.brand != null) {
      this.brand.remove(brandItem);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap condition(List<ConditionEnum> condition) {
    this.condition = condition;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("condition")
  public List<ConditionEnum> getCondition() {
    return condition;
  }

  @JsonProperty("condition")
  public void setCondition(List<ConditionEnum> condition) {
    this.condition = condition;
  }

  public CatalogsRetailFilterValuesMap addConditionItem(ConditionEnum conditionItem) {
    if (this.condition == null) {
      this.condition = new ArrayList<>();
    }

    this.condition.add(conditionItem);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeConditionItem(ConditionEnum conditionItem) {
    if (conditionItem != null && this.condition != null) {
      this.condition.remove(conditionItem);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap customLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_0")
  public List<String> getCustomLabel0() {
    return customLabel0;
  }

  @JsonProperty("custom_label_0")
  public void setCustomLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public CatalogsRetailFilterValuesMap addCustomLabel0Item(String customLabel0Item) {
    if (this.customLabel0 == null) {
      this.customLabel0 = new ArrayList<>();
    }

    this.customLabel0.add(customLabel0Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeCustomLabel0Item(String customLabel0Item) {
    if (customLabel0Item != null && this.customLabel0 != null) {
      this.customLabel0.remove(customLabel0Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap customLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_1")
  public List<String> getCustomLabel1() {
    return customLabel1;
  }

  @JsonProperty("custom_label_1")
  public void setCustomLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public CatalogsRetailFilterValuesMap addCustomLabel1Item(String customLabel1Item) {
    if (this.customLabel1 == null) {
      this.customLabel1 = new ArrayList<>();
    }

    this.customLabel1.add(customLabel1Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeCustomLabel1Item(String customLabel1Item) {
    if (customLabel1Item != null && this.customLabel1 != null) {
      this.customLabel1.remove(customLabel1Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap customLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_2")
  public List<String> getCustomLabel2() {
    return customLabel2;
  }

  @JsonProperty("custom_label_2")
  public void setCustomLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public CatalogsRetailFilterValuesMap addCustomLabel2Item(String customLabel2Item) {
    if (this.customLabel2 == null) {
      this.customLabel2 = new ArrayList<>();
    }

    this.customLabel2.add(customLabel2Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeCustomLabel2Item(String customLabel2Item) {
    if (customLabel2Item != null && this.customLabel2 != null) {
      this.customLabel2.remove(customLabel2Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap customLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_3")
  public List<String> getCustomLabel3() {
    return customLabel3;
  }

  @JsonProperty("custom_label_3")
  public void setCustomLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public CatalogsRetailFilterValuesMap addCustomLabel3Item(String customLabel3Item) {
    if (this.customLabel3 == null) {
      this.customLabel3 = new ArrayList<>();
    }

    this.customLabel3.add(customLabel3Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeCustomLabel3Item(String customLabel3Item) {
    if (customLabel3Item != null && this.customLabel3 != null) {
      this.customLabel3.remove(customLabel3Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap customLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_4")
  public List<String> getCustomLabel4() {
    return customLabel4;
  }

  @JsonProperty("custom_label_4")
  public void setCustomLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public CatalogsRetailFilterValuesMap addCustomLabel4Item(String customLabel4Item) {
    if (this.customLabel4 == null) {
      this.customLabel4 = new ArrayList<>();
    }

    this.customLabel4.add(customLabel4Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeCustomLabel4Item(String customLabel4Item) {
    if (customLabel4Item != null && this.customLabel4 != null) {
      this.customLabel4.remove(customLabel4Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap gender(List<GenderEnum> gender) {
    this.gender = gender;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("gender")
  public List<GenderEnum> getGender() {
    return gender;
  }

  @JsonProperty("gender")
  public void setGender(List<GenderEnum> gender) {
    this.gender = gender;
  }

  public CatalogsRetailFilterValuesMap addGenderItem(GenderEnum genderItem) {
    if (this.gender == null) {
      this.gender = new ArrayList<>();
    }

    this.gender.add(genderItem);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeGenderItem(GenderEnum genderItem) {
    if (genderItem != null && this.gender != null) {
      this.gender.remove(genderItem);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap googleProductCategory0(List<String> googleProductCategory0) {
    this.googleProductCategory0 = googleProductCategory0;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("google_product_category_0")
  public List<String> getGoogleProductCategory0() {
    return googleProductCategory0;
  }

  @JsonProperty("google_product_category_0")
  public void setGoogleProductCategory0(List<String> googleProductCategory0) {
    this.googleProductCategory0 = googleProductCategory0;
  }

  public CatalogsRetailFilterValuesMap addGoogleProductCategory0Item(String googleProductCategory0Item) {
    if (this.googleProductCategory0 == null) {
      this.googleProductCategory0 = new ArrayList<>();
    }

    this.googleProductCategory0.add(googleProductCategory0Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeGoogleProductCategory0Item(String googleProductCategory0Item) {
    if (googleProductCategory0Item != null && this.googleProductCategory0 != null) {
      this.googleProductCategory0.remove(googleProductCategory0Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap googleProductCategory1(List<String> googleProductCategory1) {
    this.googleProductCategory1 = googleProductCategory1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("google_product_category_1")
  public List<String> getGoogleProductCategory1() {
    return googleProductCategory1;
  }

  @JsonProperty("google_product_category_1")
  public void setGoogleProductCategory1(List<String> googleProductCategory1) {
    this.googleProductCategory1 = googleProductCategory1;
  }

  public CatalogsRetailFilterValuesMap addGoogleProductCategory1Item(String googleProductCategory1Item) {
    if (this.googleProductCategory1 == null) {
      this.googleProductCategory1 = new ArrayList<>();
    }

    this.googleProductCategory1.add(googleProductCategory1Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeGoogleProductCategory1Item(String googleProductCategory1Item) {
    if (googleProductCategory1Item != null && this.googleProductCategory1 != null) {
      this.googleProductCategory1.remove(googleProductCategory1Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap googleProductCategory2(List<String> googleProductCategory2) {
    this.googleProductCategory2 = googleProductCategory2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("google_product_category_2")
  public List<String> getGoogleProductCategory2() {
    return googleProductCategory2;
  }

  @JsonProperty("google_product_category_2")
  public void setGoogleProductCategory2(List<String> googleProductCategory2) {
    this.googleProductCategory2 = googleProductCategory2;
  }

  public CatalogsRetailFilterValuesMap addGoogleProductCategory2Item(String googleProductCategory2Item) {
    if (this.googleProductCategory2 == null) {
      this.googleProductCategory2 = new ArrayList<>();
    }

    this.googleProductCategory2.add(googleProductCategory2Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeGoogleProductCategory2Item(String googleProductCategory2Item) {
    if (googleProductCategory2Item != null && this.googleProductCategory2 != null) {
      this.googleProductCategory2.remove(googleProductCategory2Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap googleProductCategory3(List<String> googleProductCategory3) {
    this.googleProductCategory3 = googleProductCategory3;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("google_product_category_3")
  public List<String> getGoogleProductCategory3() {
    return googleProductCategory3;
  }

  @JsonProperty("google_product_category_3")
  public void setGoogleProductCategory3(List<String> googleProductCategory3) {
    this.googleProductCategory3 = googleProductCategory3;
  }

  public CatalogsRetailFilterValuesMap addGoogleProductCategory3Item(String googleProductCategory3Item) {
    if (this.googleProductCategory3 == null) {
      this.googleProductCategory3 = new ArrayList<>();
    }

    this.googleProductCategory3.add(googleProductCategory3Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeGoogleProductCategory3Item(String googleProductCategory3Item) {
    if (googleProductCategory3Item != null && this.googleProductCategory3 != null) {
      this.googleProductCategory3.remove(googleProductCategory3Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap googleProductCategory4(List<String> googleProductCategory4) {
    this.googleProductCategory4 = googleProductCategory4;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("google_product_category_4")
  public List<String> getGoogleProductCategory4() {
    return googleProductCategory4;
  }

  @JsonProperty("google_product_category_4")
  public void setGoogleProductCategory4(List<String> googleProductCategory4) {
    this.googleProductCategory4 = googleProductCategory4;
  }

  public CatalogsRetailFilterValuesMap addGoogleProductCategory4Item(String googleProductCategory4Item) {
    if (this.googleProductCategory4 == null) {
      this.googleProductCategory4 = new ArrayList<>();
    }

    this.googleProductCategory4.add(googleProductCategory4Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeGoogleProductCategory4Item(String googleProductCategory4Item) {
    if (googleProductCategory4Item != null && this.googleProductCategory4 != null) {
      this.googleProductCategory4.remove(googleProductCategory4Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap googleProductCategory5(List<String> googleProductCategory5) {
    this.googleProductCategory5 = googleProductCategory5;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("google_product_category_5")
  public List<String> getGoogleProductCategory5() {
    return googleProductCategory5;
  }

  @JsonProperty("google_product_category_5")
  public void setGoogleProductCategory5(List<String> googleProductCategory5) {
    this.googleProductCategory5 = googleProductCategory5;
  }

  public CatalogsRetailFilterValuesMap addGoogleProductCategory5Item(String googleProductCategory5Item) {
    if (this.googleProductCategory5 == null) {
      this.googleProductCategory5 = new ArrayList<>();
    }

    this.googleProductCategory5.add(googleProductCategory5Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeGoogleProductCategory5Item(String googleProductCategory5Item) {
    if (googleProductCategory5Item != null && this.googleProductCategory5 != null) {
      this.googleProductCategory5.remove(googleProductCategory5Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap googleProductCategory6(List<String> googleProductCategory6) {
    this.googleProductCategory6 = googleProductCategory6;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("google_product_category_6")
  public List<String> getGoogleProductCategory6() {
    return googleProductCategory6;
  }

  @JsonProperty("google_product_category_6")
  public void setGoogleProductCategory6(List<String> googleProductCategory6) {
    this.googleProductCategory6 = googleProductCategory6;
  }

  public CatalogsRetailFilterValuesMap addGoogleProductCategory6Item(String googleProductCategory6Item) {
    if (this.googleProductCategory6 == null) {
      this.googleProductCategory6 = new ArrayList<>();
    }

    this.googleProductCategory6.add(googleProductCategory6Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeGoogleProductCategory6Item(String googleProductCategory6Item) {
    if (googleProductCategory6Item != null && this.googleProductCategory6 != null) {
      this.googleProductCategory6.remove(googleProductCategory6Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap mediaType(List<MediaTypeEnum> mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("media_type")
  public List<MediaTypeEnum> getMediaType() {
    return mediaType;
  }

  @JsonProperty("media_type")
  public void setMediaType(List<MediaTypeEnum> mediaType) {
    this.mediaType = mediaType;
  }

  public CatalogsRetailFilterValuesMap addMediaTypeItem(MediaTypeEnum mediaTypeItem) {
    if (this.mediaType == null) {
      this.mediaType = new ArrayList<>();
    }

    this.mediaType.add(mediaTypeItem);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeMediaTypeItem(MediaTypeEnum mediaTypeItem) {
    if (mediaTypeItem != null && this.mediaType != null) {
      this.mediaType.remove(mediaTypeItem);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap productType0(List<String> productType0) {
    this.productType0 = productType0;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_type_0")
  public List<String> getProductType0() {
    return productType0;
  }

  @JsonProperty("product_type_0")
  public void setProductType0(List<String> productType0) {
    this.productType0 = productType0;
  }

  public CatalogsRetailFilterValuesMap addProductType0Item(String productType0Item) {
    if (this.productType0 == null) {
      this.productType0 = new ArrayList<>();
    }

    this.productType0.add(productType0Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeProductType0Item(String productType0Item) {
    if (productType0Item != null && this.productType0 != null) {
      this.productType0.remove(productType0Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap productType1(List<String> productType1) {
    this.productType1 = productType1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_type_1")
  public List<String> getProductType1() {
    return productType1;
  }

  @JsonProperty("product_type_1")
  public void setProductType1(List<String> productType1) {
    this.productType1 = productType1;
  }

  public CatalogsRetailFilterValuesMap addProductType1Item(String productType1Item) {
    if (this.productType1 == null) {
      this.productType1 = new ArrayList<>();
    }

    this.productType1.add(productType1Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeProductType1Item(String productType1Item) {
    if (productType1Item != null && this.productType1 != null) {
      this.productType1.remove(productType1Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap productType2(List<String> productType2) {
    this.productType2 = productType2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_type_2")
  public List<String> getProductType2() {
    return productType2;
  }

  @JsonProperty("product_type_2")
  public void setProductType2(List<String> productType2) {
    this.productType2 = productType2;
  }

  public CatalogsRetailFilterValuesMap addProductType2Item(String productType2Item) {
    if (this.productType2 == null) {
      this.productType2 = new ArrayList<>();
    }

    this.productType2.add(productType2Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeProductType2Item(String productType2Item) {
    if (productType2Item != null && this.productType2 != null) {
      this.productType2.remove(productType2Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap productType3(List<String> productType3) {
    this.productType3 = productType3;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_type_3")
  public List<String> getProductType3() {
    return productType3;
  }

  @JsonProperty("product_type_3")
  public void setProductType3(List<String> productType3) {
    this.productType3 = productType3;
  }

  public CatalogsRetailFilterValuesMap addProductType3Item(String productType3Item) {
    if (this.productType3 == null) {
      this.productType3 = new ArrayList<>();
    }

    this.productType3.add(productType3Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeProductType3Item(String productType3Item) {
    if (productType3Item != null && this.productType3 != null) {
      this.productType3.remove(productType3Item);
    }

    return this;
  }
  /**
   **/
  public CatalogsRetailFilterValuesMap productType4(List<String> productType4) {
    this.productType4 = productType4;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("product_type_4")
  public List<String> getProductType4() {
    return productType4;
  }

  @JsonProperty("product_type_4")
  public void setProductType4(List<String> productType4) {
    this.productType4 = productType4;
  }

  public CatalogsRetailFilterValuesMap addProductType4Item(String productType4Item) {
    if (this.productType4 == null) {
      this.productType4 = new ArrayList<>();
    }

    this.productType4.add(productType4Item);
    return this;
  }

  public CatalogsRetailFilterValuesMap removeProductType4Item(String productType4Item) {
    if (productType4Item != null && this.productType4 != null) {
      this.productType4.remove(productType4Item);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

