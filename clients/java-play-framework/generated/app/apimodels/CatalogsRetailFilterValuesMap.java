package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A map of filter attributes to their available values.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsRetailFilterValuesMap   {
  @JsonProperty("ad_image_tags")
  
  private List<String> adImageTags = null;

  @JsonProperty("ad_video_tags")
  
  private List<String> adVideoTags = null;

  /**
   * Gets or Sets availability
   */
  public enum AvailabilityEnum {
    IN_STOCK("IN_STOCK"),
    
    OUT_OF_STOCK("OUT_OF_STOCK"),
    
    PREORDER("PREORDER"),
    
    UNAVAILABLE("UNAVAILABLE");

    private final String value;

    AvailabilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("availability")
  
  private List<AvailabilityEnum> availability = null;

  @JsonProperty("brand")
  
  private List<String> brand = null;

  /**
   * Gets or Sets condition
   */
  public enum ConditionEnum {
    NEW("NEW"),
    
    USED("USED"),
    
    REFURBISHED("REFURBISHED");

    private final String value;

    ConditionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("condition")
  
  private List<ConditionEnum> condition = null;

  @JsonProperty("custom_label_0")
  
  private List<String> customLabel0 = null;

  @JsonProperty("custom_label_1")
  
  private List<String> customLabel1 = null;

  @JsonProperty("custom_label_2")
  
  private List<String> customLabel2 = null;

  @JsonProperty("custom_label_3")
  
  private List<String> customLabel3 = null;

  @JsonProperty("custom_label_4")
  
  private List<String> customLabel4 = null;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    FEMALE("FEMALE"),
    
    MALE("MALE"),
    
    UNISEX("UNISEX");

    private final String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("gender")
  
  private List<GenderEnum> gender = null;

  @JsonProperty("google_product_category_0")
  
  private List<String> googleProductCategory0 = null;

  @JsonProperty("google_product_category_1")
  
  private List<String> googleProductCategory1 = null;

  @JsonProperty("google_product_category_2")
  
  private List<String> googleProductCategory2 = null;

  @JsonProperty("google_product_category_3")
  
  private List<String> googleProductCategory3 = null;

  @JsonProperty("google_product_category_4")
  
  private List<String> googleProductCategory4 = null;

  @JsonProperty("google_product_category_5")
  
  private List<String> googleProductCategory5 = null;

  @JsonProperty("google_product_category_6")
  
  private List<String> googleProductCategory6 = null;

  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    IMAGE("IMAGE"),
    
    VIDEO("VIDEO");

    private final String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("media_type")
  
  private List<MediaTypeEnum> mediaType = null;

  @JsonProperty("product_type_0")
  
  private List<String> productType0 = null;

  @JsonProperty("product_type_1")
  
  private List<String> productType1 = null;

  @JsonProperty("product_type_2")
  
  private List<String> productType2 = null;

  @JsonProperty("product_type_3")
  
  private List<String> productType3 = null;

  @JsonProperty("product_type_4")
  
  private List<String> productType4 = null;

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
  **/
  public List<String> getAdImageTags() {
    return adImageTags;
  }

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
  **/
  public List<String> getAdVideoTags() {
    return adVideoTags;
  }

  public void setAdVideoTags(List<String> adVideoTags) {
    this.adVideoTags = adVideoTags;
  }

  public CatalogsRetailFilterValuesMap availability(List<AvailabilityEnum> availability) {
    this.availability = availability;
    return this;
  }

  public CatalogsRetailFilterValuesMap addAvailabilityItem(AvailabilityEnum availabilityItem) {
    if (this.availability == null) {
      this.availability = new ArrayList<>();
    }
    this.availability.add(availabilityItem);
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  public List<AvailabilityEnum> getAvailability() {
    return availability;
  }

  public void setAvailability(List<AvailabilityEnum> availability) {
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
  **/
  public List<String> getBrand() {
    return brand;
  }

  public void setBrand(List<String> brand) {
    this.brand = brand;
  }

  public CatalogsRetailFilterValuesMap condition(List<ConditionEnum> condition) {
    this.condition = condition;
    return this;
  }

  public CatalogsRetailFilterValuesMap addConditionItem(ConditionEnum conditionItem) {
    if (this.condition == null) {
      this.condition = new ArrayList<>();
    }
    this.condition.add(conditionItem);
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  public List<ConditionEnum> getCondition() {
    return condition;
  }

  public void setCondition(List<ConditionEnum> condition) {
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
  **/
  public List<String> getCustomLabel0() {
    return customLabel0;
  }

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
  **/
  public List<String> getCustomLabel1() {
    return customLabel1;
  }

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
  **/
  public List<String> getCustomLabel2() {
    return customLabel2;
  }

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
  **/
  public List<String> getCustomLabel3() {
    return customLabel3;
  }

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
  **/
  public List<String> getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public CatalogsRetailFilterValuesMap gender(List<GenderEnum> gender) {
    this.gender = gender;
    return this;
  }

  public CatalogsRetailFilterValuesMap addGenderItem(GenderEnum genderItem) {
    if (this.gender == null) {
      this.gender = new ArrayList<>();
    }
    this.gender.add(genderItem);
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  public List<GenderEnum> getGender() {
    return gender;
  }

  public void setGender(List<GenderEnum> gender) {
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
  **/
  public List<String> getGoogleProductCategory0() {
    return googleProductCategory0;
  }

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
  **/
  public List<String> getGoogleProductCategory1() {
    return googleProductCategory1;
  }

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
  **/
  public List<String> getGoogleProductCategory2() {
    return googleProductCategory2;
  }

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
  **/
  public List<String> getGoogleProductCategory3() {
    return googleProductCategory3;
  }

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
  **/
  public List<String> getGoogleProductCategory4() {
    return googleProductCategory4;
  }

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
  **/
  public List<String> getGoogleProductCategory5() {
    return googleProductCategory5;
  }

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
  **/
  public List<String> getGoogleProductCategory6() {
    return googleProductCategory6;
  }

  public void setGoogleProductCategory6(List<String> googleProductCategory6) {
    this.googleProductCategory6 = googleProductCategory6;
  }

  public CatalogsRetailFilterValuesMap mediaType(List<MediaTypeEnum> mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  public CatalogsRetailFilterValuesMap addMediaTypeItem(MediaTypeEnum mediaTypeItem) {
    if (this.mediaType == null) {
      this.mediaType = new ArrayList<>();
    }
    this.mediaType.add(mediaTypeItem);
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  public List<MediaTypeEnum> getMediaType() {
    return mediaType;
  }

  public void setMediaType(List<MediaTypeEnum> mediaType) {
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
  **/
  public List<String> getProductType0() {
    return productType0;
  }

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
  **/
  public List<String> getProductType1() {
    return productType1;
  }

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
  **/
  public List<String> getProductType2() {
    return productType2;
  }

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
  **/
  public List<String> getProductType3() {
    return productType3;
  }

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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

