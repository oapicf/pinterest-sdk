package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsFeedValidationWarnings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsFeedValidationWarnings {

  private @Nullable Integer AD_IMAGE_0_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_0_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_0_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_0_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_0_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_0_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_0_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_10_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_10_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_10_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_10_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_10_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_10_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_10_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_11_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_11_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_11_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_11_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_11_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_11_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_11_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_12_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_12_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_12_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_12_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_12_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_12_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_12_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_13_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_13_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_13_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_13_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_13_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_13_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_13_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_14_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_14_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_14_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_14_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_14_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_14_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_14_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_15_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_15_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_15_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_15_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_15_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_15_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_15_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_16_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_16_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_16_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_16_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_16_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_16_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_16_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_17_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_17_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_17_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_17_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_17_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_17_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_17_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_18_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_18_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_18_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_18_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_18_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_18_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_18_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_19_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_19_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_19_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_19_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_19_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_19_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_19_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_1_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_1_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_1_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_1_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_1_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_1_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_1_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_2_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_2_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_2_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_2_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_2_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_2_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_2_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_3_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_3_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_3_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_3_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_3_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_3_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_3_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_4_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_4_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_4_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_4_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_4_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_4_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_4_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_5_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_5_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_5_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_5_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_5_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_5_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_5_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_6_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_6_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_6_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_6_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_6_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_6_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_6_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_7_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_7_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_7_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_7_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_7_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_7_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_7_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_8_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_8_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_8_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_8_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_8_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_8_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_8_TAG_REQUIRED;

  private @Nullable Integer AD_IMAGE_9_LINK_DUPLICATED;

  private @Nullable Integer AD_IMAGE_9_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_9_LINK_REQUIRED;

  private @Nullable Integer AD_IMAGE_9_LINK_WARNING;

  private @Nullable Integer AD_IMAGE_9_TAG_DUPLICATED;

  private @Nullable Integer AD_IMAGE_9_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_IMAGE_9_TAG_REQUIRED;

  private @Nullable Integer AD_LINK_FORMAT_WARNING;

  private @Nullable Integer AD_LINK_SAME_AS_LINK;

  private @Nullable Integer AD_VIDEO_0_LINK_DUPLICATED;

  private @Nullable Integer AD_VIDEO_0_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_VIDEO_0_LINK_REQUIRED;

  private @Nullable Integer AD_VIDEO_0_LINK_WARNING;

  private @Nullable Integer AD_VIDEO_0_TAG_DUPLICATED;

  private @Nullable Integer AD_VIDEO_0_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_VIDEO_0_TAG_REQUIRED;

  private @Nullable Integer AD_VIDEO_1_LINK_DUPLICATED;

  private @Nullable Integer AD_VIDEO_1_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_VIDEO_1_LINK_REQUIRED;

  private @Nullable Integer AD_VIDEO_1_LINK_WARNING;

  private @Nullable Integer AD_VIDEO_1_TAG_DUPLICATED;

  private @Nullable Integer AD_VIDEO_1_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_VIDEO_1_TAG_REQUIRED;

  private @Nullable Integer AD_VIDEO_2_LINK_DUPLICATED;

  private @Nullable Integer AD_VIDEO_2_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer AD_VIDEO_2_LINK_REQUIRED;

  private @Nullable Integer AD_VIDEO_2_LINK_WARNING;

  private @Nullable Integer AD_VIDEO_2_TAG_DUPLICATED;

  private @Nullable Integer AD_VIDEO_2_TAG_LENGTH_TOO_LONG;

  private @Nullable Integer AD_VIDEO_2_TAG_REQUIRED;

  private @Nullable Integer ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;

  private @Nullable Integer ADDITIONAL_IMAGE_LINK_WARNING;

  private @Nullable Integer ADWORDS_FORMAT_WARNING;

  private @Nullable Integer ADWORDS_SAME_AS_LINK;

  private @Nullable Integer AGE_GROUP_INVALID;

  private @Nullable Integer ANDROID_DEEP_LINK_INVALID;

  private @Nullable Integer AVAILABILITY_DATE_INVALID;

  private @Nullable Integer COUNTRY_DOES_NOT_MAP_TO_CURRENCY;

  private @Nullable Integer CUSTOM_LABEL_LENGTH_TOO_LONG;

  private @Nullable Integer DESCRIPTION_LENGTH_TOO_LONG;

  private @Nullable Integer DUPLICATE_HEADERS;

  private @Nullable Integer EXPIRATION_DATE_INVALID;

  /**
   * Ingestion completed early because there are no changes to your feed since the last successful update.
   */
  public enum FETCHSAMESIGNATUREEnum {
    NUMBER_1(1);

    private final Integer value;

    FETCHSAMESIGNATUREEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FETCHSAMESIGNATUREEnum fromValue(Integer value) {
      for (FETCHSAMESIGNATUREEnum b : FETCHSAMESIGNATUREEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable FETCHSAMESIGNATUREEnum FETCH_SAME_SIGNATURE;

  private @Nullable Integer GENDER_INVALID;

  private @Nullable Integer GTIN_INVALID;

  private @Nullable Integer IMAGE_LINK_WARNING;

  private @Nullable Integer INCONSISTENT_CURRENCY_VALUES;

  private @Nullable Integer INDEXED_PRODUCT_COUNT_LARGE_DELTA;

  private @Nullable Integer IOS_DEEP_LINK_INVALID;

  private @Nullable Integer IS_BUNDLE_INVALID;

  private @Nullable Integer ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;

  private @Nullable Integer LINK_FORMAT_WARNING;

  private @Nullable Integer MIN_AD_PRICE_INVALID;

  private @Nullable Integer MPN_INVALID;

  private @Nullable Integer MULTIPACK_INVALID;

  private @Nullable Integer OPTIONAL_CONDITION_INVALID;

  private @Nullable Integer OPTIONAL_CONDITION_MISSING;

  private @Nullable Integer OPTIONAL_PRODUCT_CATEGORY_INVALID;

  private @Nullable Integer OPTIONAL_PRODUCT_CATEGORY_MISSING;

  private @Nullable Integer PRODUCT_CATEGORY_DEPTH_WARNING;

  private @Nullable Integer PRODUCT_TYPE_LENGTH_TOO_LONG;

  private @Nullable Integer SALE_DATE_INVALID;

  private @Nullable Integer SALES_PRICE_INVALID;

  private @Nullable Integer SALES_PRICE_TOO_HIGH;

  private @Nullable Integer SALES_PRICE_TOO_LOW;

  private @Nullable Integer SHIPPING_HEIGHT_INVALID;

  private @Nullable Integer SHIPPING_INVALID;

  private @Nullable Integer SHIPPING_WEIGHT_INVALID;

  private @Nullable Integer SHIPPING_WIDTH_INVALID;

  private @Nullable Integer SIZE_SYSTEM_INVALID;

  private @Nullable Integer SIZE_TYPE_INVALID;

  private @Nullable Integer TAX_INVALID;

  private @Nullable Integer TITLE_LENGTH_TOO_LONG;

  private @Nullable Integer TOO_MANY_ADDITIONAL_IMAGE_LINKS;

  private @Nullable Integer UPDATED_TIME_INVALID;

  private @Nullable Integer UTM_SOURCE_AUTO_CORRECTED;

  private @Nullable Integer VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED;

  private @Nullable Integer WEIGHT_UNIT_INVALID;

  public CatalogsFeedValidationWarnings AD_IMAGE_0_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_0_LINK_DUPLICATED) {
    this.AD_IMAGE_0_LINK_DUPLICATED = AD_IMAGE_0_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_0_link is duplicated with another ad image link.
   * @return AD_IMAGE_0_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_0_LINK_DUPLICATED", description = "ad_image_0_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_0_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE0LINKDUPLICATED() {
    return AD_IMAGE_0_LINK_DUPLICATED;
  }

  public void setADIMAGE0LINKDUPLICATED(@Nullable Integer AD_IMAGE_0_LINK_DUPLICATED) {
    this.AD_IMAGE_0_LINK_DUPLICATED = AD_IMAGE_0_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_0_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_0_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_0_LINK_LENGTH_TOO_LONG = AD_IMAGE_0_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 0 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_0_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_0_LINK_LENGTH_TOO_LONG", description = "Ad image link 0 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_0_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE0LINKLENGTHTOOLONG() {
    return AD_IMAGE_0_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE0LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_0_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_0_LINK_LENGTH_TOO_LONG = AD_IMAGE_0_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_0_LINK_REQUIRED(@Nullable Integer AD_IMAGE_0_LINK_REQUIRED) {
    this.AD_IMAGE_0_LINK_REQUIRED = AD_IMAGE_0_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 0 is required because an image tag was provided.
   * @return AD_IMAGE_0_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_0_LINK_REQUIRED", description = "Ad image link 0 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_0_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE0LINKREQUIRED() {
    return AD_IMAGE_0_LINK_REQUIRED;
  }

  public void setADIMAGE0LINKREQUIRED(@Nullable Integer AD_IMAGE_0_LINK_REQUIRED) {
    this.AD_IMAGE_0_LINK_REQUIRED = AD_IMAGE_0_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_0_LINK_WARNING(@Nullable Integer AD_IMAGE_0_LINK_WARNING) {
    this.AD_IMAGE_0_LINK_WARNING = AD_IMAGE_0_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 0 format is unsupported.
   * @return AD_IMAGE_0_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_0_LINK_WARNING", description = "Ad image link 0 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_0_LINK_WARNING")
  public @Nullable Integer getADIMAGE0LINKWARNING() {
    return AD_IMAGE_0_LINK_WARNING;
  }

  public void setADIMAGE0LINKWARNING(@Nullable Integer AD_IMAGE_0_LINK_WARNING) {
    this.AD_IMAGE_0_LINK_WARNING = AD_IMAGE_0_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_0_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_0_TAG_DUPLICATED) {
    this.AD_IMAGE_0_TAG_DUPLICATED = AD_IMAGE_0_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_0_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_0_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_0_TAG_DUPLICATED", description = "ad_image_0_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_0_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE0TAGDUPLICATED() {
    return AD_IMAGE_0_TAG_DUPLICATED;
  }

  public void setADIMAGE0TAGDUPLICATED(@Nullable Integer AD_IMAGE_0_TAG_DUPLICATED) {
    this.AD_IMAGE_0_TAG_DUPLICATED = AD_IMAGE_0_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_0_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_0_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_0_TAG_LENGTH_TOO_LONG = AD_IMAGE_0_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 0 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_0_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_0_TAG_LENGTH_TOO_LONG", description = "Ad image tag 0 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_0_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE0TAGLENGTHTOOLONG() {
    return AD_IMAGE_0_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE0TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_0_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_0_TAG_LENGTH_TOO_LONG = AD_IMAGE_0_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_0_TAG_REQUIRED(@Nullable Integer AD_IMAGE_0_TAG_REQUIRED) {
    this.AD_IMAGE_0_TAG_REQUIRED = AD_IMAGE_0_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 0 is required because an image link was provided.
   * @return AD_IMAGE_0_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_0_TAG_REQUIRED", description = "Ad image tag 0 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_0_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE0TAGREQUIRED() {
    return AD_IMAGE_0_TAG_REQUIRED;
  }

  public void setADIMAGE0TAGREQUIRED(@Nullable Integer AD_IMAGE_0_TAG_REQUIRED) {
    this.AD_IMAGE_0_TAG_REQUIRED = AD_IMAGE_0_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_10_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_10_LINK_DUPLICATED) {
    this.AD_IMAGE_10_LINK_DUPLICATED = AD_IMAGE_10_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_10_link is duplicated with another ad image link.
   * @return AD_IMAGE_10_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_10_LINK_DUPLICATED", description = "ad_image_10_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_10_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE10LINKDUPLICATED() {
    return AD_IMAGE_10_LINK_DUPLICATED;
  }

  public void setADIMAGE10LINKDUPLICATED(@Nullable Integer AD_IMAGE_10_LINK_DUPLICATED) {
    this.AD_IMAGE_10_LINK_DUPLICATED = AD_IMAGE_10_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_10_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_10_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_10_LINK_LENGTH_TOO_LONG = AD_IMAGE_10_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 10 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_10_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_10_LINK_LENGTH_TOO_LONG", description = "Ad image link 10 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_10_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE10LINKLENGTHTOOLONG() {
    return AD_IMAGE_10_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE10LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_10_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_10_LINK_LENGTH_TOO_LONG = AD_IMAGE_10_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_10_LINK_REQUIRED(@Nullable Integer AD_IMAGE_10_LINK_REQUIRED) {
    this.AD_IMAGE_10_LINK_REQUIRED = AD_IMAGE_10_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 10 is required because an image tag was provided.
   * @return AD_IMAGE_10_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_10_LINK_REQUIRED", description = "Ad image link 10 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_10_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE10LINKREQUIRED() {
    return AD_IMAGE_10_LINK_REQUIRED;
  }

  public void setADIMAGE10LINKREQUIRED(@Nullable Integer AD_IMAGE_10_LINK_REQUIRED) {
    this.AD_IMAGE_10_LINK_REQUIRED = AD_IMAGE_10_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_10_LINK_WARNING(@Nullable Integer AD_IMAGE_10_LINK_WARNING) {
    this.AD_IMAGE_10_LINK_WARNING = AD_IMAGE_10_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 10 format is unsupported.
   * @return AD_IMAGE_10_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_10_LINK_WARNING", description = "Ad image link 10 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_10_LINK_WARNING")
  public @Nullable Integer getADIMAGE10LINKWARNING() {
    return AD_IMAGE_10_LINK_WARNING;
  }

  public void setADIMAGE10LINKWARNING(@Nullable Integer AD_IMAGE_10_LINK_WARNING) {
    this.AD_IMAGE_10_LINK_WARNING = AD_IMAGE_10_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_10_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_10_TAG_DUPLICATED) {
    this.AD_IMAGE_10_TAG_DUPLICATED = AD_IMAGE_10_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_10_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_10_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_10_TAG_DUPLICATED", description = "ad_image_10_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_10_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE10TAGDUPLICATED() {
    return AD_IMAGE_10_TAG_DUPLICATED;
  }

  public void setADIMAGE10TAGDUPLICATED(@Nullable Integer AD_IMAGE_10_TAG_DUPLICATED) {
    this.AD_IMAGE_10_TAG_DUPLICATED = AD_IMAGE_10_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_10_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_10_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_10_TAG_LENGTH_TOO_LONG = AD_IMAGE_10_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 10 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_10_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_10_TAG_LENGTH_TOO_LONG", description = "Ad image tag 10 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_10_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE10TAGLENGTHTOOLONG() {
    return AD_IMAGE_10_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE10TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_10_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_10_TAG_LENGTH_TOO_LONG = AD_IMAGE_10_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_10_TAG_REQUIRED(@Nullable Integer AD_IMAGE_10_TAG_REQUIRED) {
    this.AD_IMAGE_10_TAG_REQUIRED = AD_IMAGE_10_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 10 is required because an image link was provided.
   * @return AD_IMAGE_10_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_10_TAG_REQUIRED", description = "Ad image tag 10 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_10_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE10TAGREQUIRED() {
    return AD_IMAGE_10_TAG_REQUIRED;
  }

  public void setADIMAGE10TAGREQUIRED(@Nullable Integer AD_IMAGE_10_TAG_REQUIRED) {
    this.AD_IMAGE_10_TAG_REQUIRED = AD_IMAGE_10_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_11_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_11_LINK_DUPLICATED) {
    this.AD_IMAGE_11_LINK_DUPLICATED = AD_IMAGE_11_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_11_link is duplicated with another ad image link.
   * @return AD_IMAGE_11_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_11_LINK_DUPLICATED", description = "ad_image_11_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_11_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE11LINKDUPLICATED() {
    return AD_IMAGE_11_LINK_DUPLICATED;
  }

  public void setADIMAGE11LINKDUPLICATED(@Nullable Integer AD_IMAGE_11_LINK_DUPLICATED) {
    this.AD_IMAGE_11_LINK_DUPLICATED = AD_IMAGE_11_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_11_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_11_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_11_LINK_LENGTH_TOO_LONG = AD_IMAGE_11_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 11 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_11_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_11_LINK_LENGTH_TOO_LONG", description = "Ad image link 11 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_11_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE11LINKLENGTHTOOLONG() {
    return AD_IMAGE_11_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE11LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_11_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_11_LINK_LENGTH_TOO_LONG = AD_IMAGE_11_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_11_LINK_REQUIRED(@Nullable Integer AD_IMAGE_11_LINK_REQUIRED) {
    this.AD_IMAGE_11_LINK_REQUIRED = AD_IMAGE_11_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 11 is required because an image tag was provided.
   * @return AD_IMAGE_11_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_11_LINK_REQUIRED", description = "Ad image link 11 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_11_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE11LINKREQUIRED() {
    return AD_IMAGE_11_LINK_REQUIRED;
  }

  public void setADIMAGE11LINKREQUIRED(@Nullable Integer AD_IMAGE_11_LINK_REQUIRED) {
    this.AD_IMAGE_11_LINK_REQUIRED = AD_IMAGE_11_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_11_LINK_WARNING(@Nullable Integer AD_IMAGE_11_LINK_WARNING) {
    this.AD_IMAGE_11_LINK_WARNING = AD_IMAGE_11_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 11 format is unsupported.
   * @return AD_IMAGE_11_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_11_LINK_WARNING", description = "Ad image link 11 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_11_LINK_WARNING")
  public @Nullable Integer getADIMAGE11LINKWARNING() {
    return AD_IMAGE_11_LINK_WARNING;
  }

  public void setADIMAGE11LINKWARNING(@Nullable Integer AD_IMAGE_11_LINK_WARNING) {
    this.AD_IMAGE_11_LINK_WARNING = AD_IMAGE_11_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_11_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_11_TAG_DUPLICATED) {
    this.AD_IMAGE_11_TAG_DUPLICATED = AD_IMAGE_11_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_11_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_11_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_11_TAG_DUPLICATED", description = "ad_image_11_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_11_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE11TAGDUPLICATED() {
    return AD_IMAGE_11_TAG_DUPLICATED;
  }

  public void setADIMAGE11TAGDUPLICATED(@Nullable Integer AD_IMAGE_11_TAG_DUPLICATED) {
    this.AD_IMAGE_11_TAG_DUPLICATED = AD_IMAGE_11_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_11_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_11_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_11_TAG_LENGTH_TOO_LONG = AD_IMAGE_11_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 11 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_11_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_11_TAG_LENGTH_TOO_LONG", description = "Ad image tag 11 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_11_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE11TAGLENGTHTOOLONG() {
    return AD_IMAGE_11_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE11TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_11_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_11_TAG_LENGTH_TOO_LONG = AD_IMAGE_11_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_11_TAG_REQUIRED(@Nullable Integer AD_IMAGE_11_TAG_REQUIRED) {
    this.AD_IMAGE_11_TAG_REQUIRED = AD_IMAGE_11_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 11 is required because an image link was provided.
   * @return AD_IMAGE_11_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_11_TAG_REQUIRED", description = "Ad image tag 11 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_11_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE11TAGREQUIRED() {
    return AD_IMAGE_11_TAG_REQUIRED;
  }

  public void setADIMAGE11TAGREQUIRED(@Nullable Integer AD_IMAGE_11_TAG_REQUIRED) {
    this.AD_IMAGE_11_TAG_REQUIRED = AD_IMAGE_11_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_12_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_12_LINK_DUPLICATED) {
    this.AD_IMAGE_12_LINK_DUPLICATED = AD_IMAGE_12_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_12_link is duplicated with another ad image link.
   * @return AD_IMAGE_12_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_12_LINK_DUPLICATED", description = "ad_image_12_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_12_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE12LINKDUPLICATED() {
    return AD_IMAGE_12_LINK_DUPLICATED;
  }

  public void setADIMAGE12LINKDUPLICATED(@Nullable Integer AD_IMAGE_12_LINK_DUPLICATED) {
    this.AD_IMAGE_12_LINK_DUPLICATED = AD_IMAGE_12_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_12_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_12_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_12_LINK_LENGTH_TOO_LONG = AD_IMAGE_12_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 12 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_12_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_12_LINK_LENGTH_TOO_LONG", description = "Ad image link 12 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_12_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE12LINKLENGTHTOOLONG() {
    return AD_IMAGE_12_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE12LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_12_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_12_LINK_LENGTH_TOO_LONG = AD_IMAGE_12_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_12_LINK_REQUIRED(@Nullable Integer AD_IMAGE_12_LINK_REQUIRED) {
    this.AD_IMAGE_12_LINK_REQUIRED = AD_IMAGE_12_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 12 is required because an image tag was provided.
   * @return AD_IMAGE_12_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_12_LINK_REQUIRED", description = "Ad image link 12 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_12_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE12LINKREQUIRED() {
    return AD_IMAGE_12_LINK_REQUIRED;
  }

  public void setADIMAGE12LINKREQUIRED(@Nullable Integer AD_IMAGE_12_LINK_REQUIRED) {
    this.AD_IMAGE_12_LINK_REQUIRED = AD_IMAGE_12_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_12_LINK_WARNING(@Nullable Integer AD_IMAGE_12_LINK_WARNING) {
    this.AD_IMAGE_12_LINK_WARNING = AD_IMAGE_12_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 12 format is unsupported.
   * @return AD_IMAGE_12_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_12_LINK_WARNING", description = "Ad image link 12 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_12_LINK_WARNING")
  public @Nullable Integer getADIMAGE12LINKWARNING() {
    return AD_IMAGE_12_LINK_WARNING;
  }

  public void setADIMAGE12LINKWARNING(@Nullable Integer AD_IMAGE_12_LINK_WARNING) {
    this.AD_IMAGE_12_LINK_WARNING = AD_IMAGE_12_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_12_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_12_TAG_DUPLICATED) {
    this.AD_IMAGE_12_TAG_DUPLICATED = AD_IMAGE_12_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_12_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_12_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_12_TAG_DUPLICATED", description = "ad_image_12_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_12_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE12TAGDUPLICATED() {
    return AD_IMAGE_12_TAG_DUPLICATED;
  }

  public void setADIMAGE12TAGDUPLICATED(@Nullable Integer AD_IMAGE_12_TAG_DUPLICATED) {
    this.AD_IMAGE_12_TAG_DUPLICATED = AD_IMAGE_12_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_12_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_12_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_12_TAG_LENGTH_TOO_LONG = AD_IMAGE_12_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 12 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_12_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_12_TAG_LENGTH_TOO_LONG", description = "Ad image tag 12 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_12_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE12TAGLENGTHTOOLONG() {
    return AD_IMAGE_12_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE12TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_12_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_12_TAG_LENGTH_TOO_LONG = AD_IMAGE_12_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_12_TAG_REQUIRED(@Nullable Integer AD_IMAGE_12_TAG_REQUIRED) {
    this.AD_IMAGE_12_TAG_REQUIRED = AD_IMAGE_12_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 12 is required because an image link was provided.
   * @return AD_IMAGE_12_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_12_TAG_REQUIRED", description = "Ad image tag 12 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_12_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE12TAGREQUIRED() {
    return AD_IMAGE_12_TAG_REQUIRED;
  }

  public void setADIMAGE12TAGREQUIRED(@Nullable Integer AD_IMAGE_12_TAG_REQUIRED) {
    this.AD_IMAGE_12_TAG_REQUIRED = AD_IMAGE_12_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_13_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_13_LINK_DUPLICATED) {
    this.AD_IMAGE_13_LINK_DUPLICATED = AD_IMAGE_13_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_13_link is duplicated with another ad image link.
   * @return AD_IMAGE_13_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_13_LINK_DUPLICATED", description = "ad_image_13_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_13_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE13LINKDUPLICATED() {
    return AD_IMAGE_13_LINK_DUPLICATED;
  }

  public void setADIMAGE13LINKDUPLICATED(@Nullable Integer AD_IMAGE_13_LINK_DUPLICATED) {
    this.AD_IMAGE_13_LINK_DUPLICATED = AD_IMAGE_13_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_13_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_13_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_13_LINK_LENGTH_TOO_LONG = AD_IMAGE_13_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 13 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_13_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_13_LINK_LENGTH_TOO_LONG", description = "Ad image link 13 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_13_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE13LINKLENGTHTOOLONG() {
    return AD_IMAGE_13_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE13LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_13_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_13_LINK_LENGTH_TOO_LONG = AD_IMAGE_13_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_13_LINK_REQUIRED(@Nullable Integer AD_IMAGE_13_LINK_REQUIRED) {
    this.AD_IMAGE_13_LINK_REQUIRED = AD_IMAGE_13_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 13 is required because an image tag was provided.
   * @return AD_IMAGE_13_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_13_LINK_REQUIRED", description = "Ad image link 13 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_13_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE13LINKREQUIRED() {
    return AD_IMAGE_13_LINK_REQUIRED;
  }

  public void setADIMAGE13LINKREQUIRED(@Nullable Integer AD_IMAGE_13_LINK_REQUIRED) {
    this.AD_IMAGE_13_LINK_REQUIRED = AD_IMAGE_13_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_13_LINK_WARNING(@Nullable Integer AD_IMAGE_13_LINK_WARNING) {
    this.AD_IMAGE_13_LINK_WARNING = AD_IMAGE_13_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 13 format is unsupported.
   * @return AD_IMAGE_13_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_13_LINK_WARNING", description = "Ad image link 13 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_13_LINK_WARNING")
  public @Nullable Integer getADIMAGE13LINKWARNING() {
    return AD_IMAGE_13_LINK_WARNING;
  }

  public void setADIMAGE13LINKWARNING(@Nullable Integer AD_IMAGE_13_LINK_WARNING) {
    this.AD_IMAGE_13_LINK_WARNING = AD_IMAGE_13_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_13_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_13_TAG_DUPLICATED) {
    this.AD_IMAGE_13_TAG_DUPLICATED = AD_IMAGE_13_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_13_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_13_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_13_TAG_DUPLICATED", description = "ad_image_13_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_13_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE13TAGDUPLICATED() {
    return AD_IMAGE_13_TAG_DUPLICATED;
  }

  public void setADIMAGE13TAGDUPLICATED(@Nullable Integer AD_IMAGE_13_TAG_DUPLICATED) {
    this.AD_IMAGE_13_TAG_DUPLICATED = AD_IMAGE_13_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_13_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_13_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_13_TAG_LENGTH_TOO_LONG = AD_IMAGE_13_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 13 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_13_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_13_TAG_LENGTH_TOO_LONG", description = "Ad image tag 13 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_13_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE13TAGLENGTHTOOLONG() {
    return AD_IMAGE_13_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE13TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_13_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_13_TAG_LENGTH_TOO_LONG = AD_IMAGE_13_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_13_TAG_REQUIRED(@Nullable Integer AD_IMAGE_13_TAG_REQUIRED) {
    this.AD_IMAGE_13_TAG_REQUIRED = AD_IMAGE_13_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 13 is required because an image link was provided.
   * @return AD_IMAGE_13_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_13_TAG_REQUIRED", description = "Ad image tag 13 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_13_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE13TAGREQUIRED() {
    return AD_IMAGE_13_TAG_REQUIRED;
  }

  public void setADIMAGE13TAGREQUIRED(@Nullable Integer AD_IMAGE_13_TAG_REQUIRED) {
    this.AD_IMAGE_13_TAG_REQUIRED = AD_IMAGE_13_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_14_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_14_LINK_DUPLICATED) {
    this.AD_IMAGE_14_LINK_DUPLICATED = AD_IMAGE_14_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_14_link is duplicated with another ad image link.
   * @return AD_IMAGE_14_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_14_LINK_DUPLICATED", description = "ad_image_14_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_14_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE14LINKDUPLICATED() {
    return AD_IMAGE_14_LINK_DUPLICATED;
  }

  public void setADIMAGE14LINKDUPLICATED(@Nullable Integer AD_IMAGE_14_LINK_DUPLICATED) {
    this.AD_IMAGE_14_LINK_DUPLICATED = AD_IMAGE_14_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_14_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_14_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_14_LINK_LENGTH_TOO_LONG = AD_IMAGE_14_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 14 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_14_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_14_LINK_LENGTH_TOO_LONG", description = "Ad image link 14 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_14_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE14LINKLENGTHTOOLONG() {
    return AD_IMAGE_14_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE14LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_14_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_14_LINK_LENGTH_TOO_LONG = AD_IMAGE_14_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_14_LINK_REQUIRED(@Nullable Integer AD_IMAGE_14_LINK_REQUIRED) {
    this.AD_IMAGE_14_LINK_REQUIRED = AD_IMAGE_14_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 14 is required because an image tag was provided.
   * @return AD_IMAGE_14_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_14_LINK_REQUIRED", description = "Ad image link 14 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_14_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE14LINKREQUIRED() {
    return AD_IMAGE_14_LINK_REQUIRED;
  }

  public void setADIMAGE14LINKREQUIRED(@Nullable Integer AD_IMAGE_14_LINK_REQUIRED) {
    this.AD_IMAGE_14_LINK_REQUIRED = AD_IMAGE_14_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_14_LINK_WARNING(@Nullable Integer AD_IMAGE_14_LINK_WARNING) {
    this.AD_IMAGE_14_LINK_WARNING = AD_IMAGE_14_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 14 format is unsupported.
   * @return AD_IMAGE_14_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_14_LINK_WARNING", description = "Ad image link 14 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_14_LINK_WARNING")
  public @Nullable Integer getADIMAGE14LINKWARNING() {
    return AD_IMAGE_14_LINK_WARNING;
  }

  public void setADIMAGE14LINKWARNING(@Nullable Integer AD_IMAGE_14_LINK_WARNING) {
    this.AD_IMAGE_14_LINK_WARNING = AD_IMAGE_14_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_14_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_14_TAG_DUPLICATED) {
    this.AD_IMAGE_14_TAG_DUPLICATED = AD_IMAGE_14_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_14_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_14_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_14_TAG_DUPLICATED", description = "ad_image_14_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_14_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE14TAGDUPLICATED() {
    return AD_IMAGE_14_TAG_DUPLICATED;
  }

  public void setADIMAGE14TAGDUPLICATED(@Nullable Integer AD_IMAGE_14_TAG_DUPLICATED) {
    this.AD_IMAGE_14_TAG_DUPLICATED = AD_IMAGE_14_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_14_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_14_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_14_TAG_LENGTH_TOO_LONG = AD_IMAGE_14_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 14 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_14_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_14_TAG_LENGTH_TOO_LONG", description = "Ad image tag 14 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_14_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE14TAGLENGTHTOOLONG() {
    return AD_IMAGE_14_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE14TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_14_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_14_TAG_LENGTH_TOO_LONG = AD_IMAGE_14_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_14_TAG_REQUIRED(@Nullable Integer AD_IMAGE_14_TAG_REQUIRED) {
    this.AD_IMAGE_14_TAG_REQUIRED = AD_IMAGE_14_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 14 is required because an image link was provided.
   * @return AD_IMAGE_14_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_14_TAG_REQUIRED", description = "Ad image tag 14 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_14_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE14TAGREQUIRED() {
    return AD_IMAGE_14_TAG_REQUIRED;
  }

  public void setADIMAGE14TAGREQUIRED(@Nullable Integer AD_IMAGE_14_TAG_REQUIRED) {
    this.AD_IMAGE_14_TAG_REQUIRED = AD_IMAGE_14_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_15_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_15_LINK_DUPLICATED) {
    this.AD_IMAGE_15_LINK_DUPLICATED = AD_IMAGE_15_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_15_link is duplicated with another ad image link.
   * @return AD_IMAGE_15_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_15_LINK_DUPLICATED", description = "ad_image_15_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_15_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE15LINKDUPLICATED() {
    return AD_IMAGE_15_LINK_DUPLICATED;
  }

  public void setADIMAGE15LINKDUPLICATED(@Nullable Integer AD_IMAGE_15_LINK_DUPLICATED) {
    this.AD_IMAGE_15_LINK_DUPLICATED = AD_IMAGE_15_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_15_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_15_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_15_LINK_LENGTH_TOO_LONG = AD_IMAGE_15_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 15 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_15_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_15_LINK_LENGTH_TOO_LONG", description = "Ad image link 15 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_15_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE15LINKLENGTHTOOLONG() {
    return AD_IMAGE_15_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE15LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_15_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_15_LINK_LENGTH_TOO_LONG = AD_IMAGE_15_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_15_LINK_REQUIRED(@Nullable Integer AD_IMAGE_15_LINK_REQUIRED) {
    this.AD_IMAGE_15_LINK_REQUIRED = AD_IMAGE_15_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 15 is required because an image tag was provided.
   * @return AD_IMAGE_15_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_15_LINK_REQUIRED", description = "Ad image link 15 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_15_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE15LINKREQUIRED() {
    return AD_IMAGE_15_LINK_REQUIRED;
  }

  public void setADIMAGE15LINKREQUIRED(@Nullable Integer AD_IMAGE_15_LINK_REQUIRED) {
    this.AD_IMAGE_15_LINK_REQUIRED = AD_IMAGE_15_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_15_LINK_WARNING(@Nullable Integer AD_IMAGE_15_LINK_WARNING) {
    this.AD_IMAGE_15_LINK_WARNING = AD_IMAGE_15_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 15 format is unsupported.
   * @return AD_IMAGE_15_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_15_LINK_WARNING", description = "Ad image link 15 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_15_LINK_WARNING")
  public @Nullable Integer getADIMAGE15LINKWARNING() {
    return AD_IMAGE_15_LINK_WARNING;
  }

  public void setADIMAGE15LINKWARNING(@Nullable Integer AD_IMAGE_15_LINK_WARNING) {
    this.AD_IMAGE_15_LINK_WARNING = AD_IMAGE_15_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_15_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_15_TAG_DUPLICATED) {
    this.AD_IMAGE_15_TAG_DUPLICATED = AD_IMAGE_15_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_15_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_15_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_15_TAG_DUPLICATED", description = "ad_image_15_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_15_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE15TAGDUPLICATED() {
    return AD_IMAGE_15_TAG_DUPLICATED;
  }

  public void setADIMAGE15TAGDUPLICATED(@Nullable Integer AD_IMAGE_15_TAG_DUPLICATED) {
    this.AD_IMAGE_15_TAG_DUPLICATED = AD_IMAGE_15_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_15_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_15_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_15_TAG_LENGTH_TOO_LONG = AD_IMAGE_15_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 15 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_15_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_15_TAG_LENGTH_TOO_LONG", description = "Ad image tag 15 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_15_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE15TAGLENGTHTOOLONG() {
    return AD_IMAGE_15_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE15TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_15_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_15_TAG_LENGTH_TOO_LONG = AD_IMAGE_15_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_15_TAG_REQUIRED(@Nullable Integer AD_IMAGE_15_TAG_REQUIRED) {
    this.AD_IMAGE_15_TAG_REQUIRED = AD_IMAGE_15_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 15 is required because an image link was provided.
   * @return AD_IMAGE_15_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_15_TAG_REQUIRED", description = "Ad image tag 15 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_15_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE15TAGREQUIRED() {
    return AD_IMAGE_15_TAG_REQUIRED;
  }

  public void setADIMAGE15TAGREQUIRED(@Nullable Integer AD_IMAGE_15_TAG_REQUIRED) {
    this.AD_IMAGE_15_TAG_REQUIRED = AD_IMAGE_15_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_16_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_16_LINK_DUPLICATED) {
    this.AD_IMAGE_16_LINK_DUPLICATED = AD_IMAGE_16_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_16_link is duplicated with another ad image link.
   * @return AD_IMAGE_16_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_16_LINK_DUPLICATED", description = "ad_image_16_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_16_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE16LINKDUPLICATED() {
    return AD_IMAGE_16_LINK_DUPLICATED;
  }

  public void setADIMAGE16LINKDUPLICATED(@Nullable Integer AD_IMAGE_16_LINK_DUPLICATED) {
    this.AD_IMAGE_16_LINK_DUPLICATED = AD_IMAGE_16_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_16_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_16_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_16_LINK_LENGTH_TOO_LONG = AD_IMAGE_16_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 16 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_16_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_16_LINK_LENGTH_TOO_LONG", description = "Ad image link 16 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_16_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE16LINKLENGTHTOOLONG() {
    return AD_IMAGE_16_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE16LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_16_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_16_LINK_LENGTH_TOO_LONG = AD_IMAGE_16_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_16_LINK_REQUIRED(@Nullable Integer AD_IMAGE_16_LINK_REQUIRED) {
    this.AD_IMAGE_16_LINK_REQUIRED = AD_IMAGE_16_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 16 is required because an image tag was provided.
   * @return AD_IMAGE_16_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_16_LINK_REQUIRED", description = "Ad image link 16 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_16_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE16LINKREQUIRED() {
    return AD_IMAGE_16_LINK_REQUIRED;
  }

  public void setADIMAGE16LINKREQUIRED(@Nullable Integer AD_IMAGE_16_LINK_REQUIRED) {
    this.AD_IMAGE_16_LINK_REQUIRED = AD_IMAGE_16_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_16_LINK_WARNING(@Nullable Integer AD_IMAGE_16_LINK_WARNING) {
    this.AD_IMAGE_16_LINK_WARNING = AD_IMAGE_16_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 16 format is unsupported.
   * @return AD_IMAGE_16_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_16_LINK_WARNING", description = "Ad image link 16 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_16_LINK_WARNING")
  public @Nullable Integer getADIMAGE16LINKWARNING() {
    return AD_IMAGE_16_LINK_WARNING;
  }

  public void setADIMAGE16LINKWARNING(@Nullable Integer AD_IMAGE_16_LINK_WARNING) {
    this.AD_IMAGE_16_LINK_WARNING = AD_IMAGE_16_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_16_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_16_TAG_DUPLICATED) {
    this.AD_IMAGE_16_TAG_DUPLICATED = AD_IMAGE_16_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_16_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_16_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_16_TAG_DUPLICATED", description = "ad_image_16_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_16_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE16TAGDUPLICATED() {
    return AD_IMAGE_16_TAG_DUPLICATED;
  }

  public void setADIMAGE16TAGDUPLICATED(@Nullable Integer AD_IMAGE_16_TAG_DUPLICATED) {
    this.AD_IMAGE_16_TAG_DUPLICATED = AD_IMAGE_16_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_16_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_16_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_16_TAG_LENGTH_TOO_LONG = AD_IMAGE_16_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 16 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_16_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_16_TAG_LENGTH_TOO_LONG", description = "Ad image tag 16 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_16_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE16TAGLENGTHTOOLONG() {
    return AD_IMAGE_16_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE16TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_16_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_16_TAG_LENGTH_TOO_LONG = AD_IMAGE_16_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_16_TAG_REQUIRED(@Nullable Integer AD_IMAGE_16_TAG_REQUIRED) {
    this.AD_IMAGE_16_TAG_REQUIRED = AD_IMAGE_16_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 16 is required because an image link was provided.
   * @return AD_IMAGE_16_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_16_TAG_REQUIRED", description = "Ad image tag 16 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_16_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE16TAGREQUIRED() {
    return AD_IMAGE_16_TAG_REQUIRED;
  }

  public void setADIMAGE16TAGREQUIRED(@Nullable Integer AD_IMAGE_16_TAG_REQUIRED) {
    this.AD_IMAGE_16_TAG_REQUIRED = AD_IMAGE_16_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_17_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_17_LINK_DUPLICATED) {
    this.AD_IMAGE_17_LINK_DUPLICATED = AD_IMAGE_17_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_17_link is duplicated with another ad image link.
   * @return AD_IMAGE_17_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_17_LINK_DUPLICATED", description = "ad_image_17_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_17_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE17LINKDUPLICATED() {
    return AD_IMAGE_17_LINK_DUPLICATED;
  }

  public void setADIMAGE17LINKDUPLICATED(@Nullable Integer AD_IMAGE_17_LINK_DUPLICATED) {
    this.AD_IMAGE_17_LINK_DUPLICATED = AD_IMAGE_17_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_17_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_17_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_17_LINK_LENGTH_TOO_LONG = AD_IMAGE_17_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 17 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_17_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_17_LINK_LENGTH_TOO_LONG", description = "Ad image link 17 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_17_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE17LINKLENGTHTOOLONG() {
    return AD_IMAGE_17_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE17LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_17_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_17_LINK_LENGTH_TOO_LONG = AD_IMAGE_17_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_17_LINK_REQUIRED(@Nullable Integer AD_IMAGE_17_LINK_REQUIRED) {
    this.AD_IMAGE_17_LINK_REQUIRED = AD_IMAGE_17_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 17 is required because an image tag was provided.
   * @return AD_IMAGE_17_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_17_LINK_REQUIRED", description = "Ad image link 17 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_17_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE17LINKREQUIRED() {
    return AD_IMAGE_17_LINK_REQUIRED;
  }

  public void setADIMAGE17LINKREQUIRED(@Nullable Integer AD_IMAGE_17_LINK_REQUIRED) {
    this.AD_IMAGE_17_LINK_REQUIRED = AD_IMAGE_17_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_17_LINK_WARNING(@Nullable Integer AD_IMAGE_17_LINK_WARNING) {
    this.AD_IMAGE_17_LINK_WARNING = AD_IMAGE_17_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 17 format is unsupported.
   * @return AD_IMAGE_17_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_17_LINK_WARNING", description = "Ad image link 17 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_17_LINK_WARNING")
  public @Nullable Integer getADIMAGE17LINKWARNING() {
    return AD_IMAGE_17_LINK_WARNING;
  }

  public void setADIMAGE17LINKWARNING(@Nullable Integer AD_IMAGE_17_LINK_WARNING) {
    this.AD_IMAGE_17_LINK_WARNING = AD_IMAGE_17_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_17_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_17_TAG_DUPLICATED) {
    this.AD_IMAGE_17_TAG_DUPLICATED = AD_IMAGE_17_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_17_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_17_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_17_TAG_DUPLICATED", description = "ad_image_17_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_17_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE17TAGDUPLICATED() {
    return AD_IMAGE_17_TAG_DUPLICATED;
  }

  public void setADIMAGE17TAGDUPLICATED(@Nullable Integer AD_IMAGE_17_TAG_DUPLICATED) {
    this.AD_IMAGE_17_TAG_DUPLICATED = AD_IMAGE_17_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_17_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_17_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_17_TAG_LENGTH_TOO_LONG = AD_IMAGE_17_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 17 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_17_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_17_TAG_LENGTH_TOO_LONG", description = "Ad image tag 17 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_17_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE17TAGLENGTHTOOLONG() {
    return AD_IMAGE_17_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE17TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_17_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_17_TAG_LENGTH_TOO_LONG = AD_IMAGE_17_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_17_TAG_REQUIRED(@Nullable Integer AD_IMAGE_17_TAG_REQUIRED) {
    this.AD_IMAGE_17_TAG_REQUIRED = AD_IMAGE_17_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 17 is required because an image link was provided.
   * @return AD_IMAGE_17_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_17_TAG_REQUIRED", description = "Ad image tag 17 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_17_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE17TAGREQUIRED() {
    return AD_IMAGE_17_TAG_REQUIRED;
  }

  public void setADIMAGE17TAGREQUIRED(@Nullable Integer AD_IMAGE_17_TAG_REQUIRED) {
    this.AD_IMAGE_17_TAG_REQUIRED = AD_IMAGE_17_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_18_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_18_LINK_DUPLICATED) {
    this.AD_IMAGE_18_LINK_DUPLICATED = AD_IMAGE_18_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_18_link is duplicated with another ad image link.
   * @return AD_IMAGE_18_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_18_LINK_DUPLICATED", description = "ad_image_18_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_18_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE18LINKDUPLICATED() {
    return AD_IMAGE_18_LINK_DUPLICATED;
  }

  public void setADIMAGE18LINKDUPLICATED(@Nullable Integer AD_IMAGE_18_LINK_DUPLICATED) {
    this.AD_IMAGE_18_LINK_DUPLICATED = AD_IMAGE_18_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_18_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_18_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_18_LINK_LENGTH_TOO_LONG = AD_IMAGE_18_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 18 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_18_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_18_LINK_LENGTH_TOO_LONG", description = "Ad image link 18 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_18_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE18LINKLENGTHTOOLONG() {
    return AD_IMAGE_18_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE18LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_18_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_18_LINK_LENGTH_TOO_LONG = AD_IMAGE_18_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_18_LINK_REQUIRED(@Nullable Integer AD_IMAGE_18_LINK_REQUIRED) {
    this.AD_IMAGE_18_LINK_REQUIRED = AD_IMAGE_18_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 18 is required because an image tag was provided.
   * @return AD_IMAGE_18_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_18_LINK_REQUIRED", description = "Ad image link 18 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_18_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE18LINKREQUIRED() {
    return AD_IMAGE_18_LINK_REQUIRED;
  }

  public void setADIMAGE18LINKREQUIRED(@Nullable Integer AD_IMAGE_18_LINK_REQUIRED) {
    this.AD_IMAGE_18_LINK_REQUIRED = AD_IMAGE_18_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_18_LINK_WARNING(@Nullable Integer AD_IMAGE_18_LINK_WARNING) {
    this.AD_IMAGE_18_LINK_WARNING = AD_IMAGE_18_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 18 format is unsupported.
   * @return AD_IMAGE_18_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_18_LINK_WARNING", description = "Ad image link 18 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_18_LINK_WARNING")
  public @Nullable Integer getADIMAGE18LINKWARNING() {
    return AD_IMAGE_18_LINK_WARNING;
  }

  public void setADIMAGE18LINKWARNING(@Nullable Integer AD_IMAGE_18_LINK_WARNING) {
    this.AD_IMAGE_18_LINK_WARNING = AD_IMAGE_18_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_18_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_18_TAG_DUPLICATED) {
    this.AD_IMAGE_18_TAG_DUPLICATED = AD_IMAGE_18_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_18_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_18_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_18_TAG_DUPLICATED", description = "ad_image_18_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_18_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE18TAGDUPLICATED() {
    return AD_IMAGE_18_TAG_DUPLICATED;
  }

  public void setADIMAGE18TAGDUPLICATED(@Nullable Integer AD_IMAGE_18_TAG_DUPLICATED) {
    this.AD_IMAGE_18_TAG_DUPLICATED = AD_IMAGE_18_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_18_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_18_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_18_TAG_LENGTH_TOO_LONG = AD_IMAGE_18_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 18 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_18_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_18_TAG_LENGTH_TOO_LONG", description = "Ad image tag 18 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_18_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE18TAGLENGTHTOOLONG() {
    return AD_IMAGE_18_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE18TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_18_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_18_TAG_LENGTH_TOO_LONG = AD_IMAGE_18_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_18_TAG_REQUIRED(@Nullable Integer AD_IMAGE_18_TAG_REQUIRED) {
    this.AD_IMAGE_18_TAG_REQUIRED = AD_IMAGE_18_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 18 is required because an image link was provided.
   * @return AD_IMAGE_18_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_18_TAG_REQUIRED", description = "Ad image tag 18 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_18_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE18TAGREQUIRED() {
    return AD_IMAGE_18_TAG_REQUIRED;
  }

  public void setADIMAGE18TAGREQUIRED(@Nullable Integer AD_IMAGE_18_TAG_REQUIRED) {
    this.AD_IMAGE_18_TAG_REQUIRED = AD_IMAGE_18_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_19_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_19_LINK_DUPLICATED) {
    this.AD_IMAGE_19_LINK_DUPLICATED = AD_IMAGE_19_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_19_link is duplicated with another ad image link.
   * @return AD_IMAGE_19_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_19_LINK_DUPLICATED", description = "ad_image_19_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_19_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE19LINKDUPLICATED() {
    return AD_IMAGE_19_LINK_DUPLICATED;
  }

  public void setADIMAGE19LINKDUPLICATED(@Nullable Integer AD_IMAGE_19_LINK_DUPLICATED) {
    this.AD_IMAGE_19_LINK_DUPLICATED = AD_IMAGE_19_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_19_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_19_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_19_LINK_LENGTH_TOO_LONG = AD_IMAGE_19_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 19 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_19_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_19_LINK_LENGTH_TOO_LONG", description = "Ad image link 19 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_19_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE19LINKLENGTHTOOLONG() {
    return AD_IMAGE_19_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE19LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_19_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_19_LINK_LENGTH_TOO_LONG = AD_IMAGE_19_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_19_LINK_REQUIRED(@Nullable Integer AD_IMAGE_19_LINK_REQUIRED) {
    this.AD_IMAGE_19_LINK_REQUIRED = AD_IMAGE_19_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 19 is required because an image tag was provided.
   * @return AD_IMAGE_19_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_19_LINK_REQUIRED", description = "Ad image link 19 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_19_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE19LINKREQUIRED() {
    return AD_IMAGE_19_LINK_REQUIRED;
  }

  public void setADIMAGE19LINKREQUIRED(@Nullable Integer AD_IMAGE_19_LINK_REQUIRED) {
    this.AD_IMAGE_19_LINK_REQUIRED = AD_IMAGE_19_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_19_LINK_WARNING(@Nullable Integer AD_IMAGE_19_LINK_WARNING) {
    this.AD_IMAGE_19_LINK_WARNING = AD_IMAGE_19_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 19 format is unsupported.
   * @return AD_IMAGE_19_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_19_LINK_WARNING", description = "Ad image link 19 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_19_LINK_WARNING")
  public @Nullable Integer getADIMAGE19LINKWARNING() {
    return AD_IMAGE_19_LINK_WARNING;
  }

  public void setADIMAGE19LINKWARNING(@Nullable Integer AD_IMAGE_19_LINK_WARNING) {
    this.AD_IMAGE_19_LINK_WARNING = AD_IMAGE_19_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_19_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_19_TAG_DUPLICATED) {
    this.AD_IMAGE_19_TAG_DUPLICATED = AD_IMAGE_19_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_19_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_19_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_19_TAG_DUPLICATED", description = "ad_image_19_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_19_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE19TAGDUPLICATED() {
    return AD_IMAGE_19_TAG_DUPLICATED;
  }

  public void setADIMAGE19TAGDUPLICATED(@Nullable Integer AD_IMAGE_19_TAG_DUPLICATED) {
    this.AD_IMAGE_19_TAG_DUPLICATED = AD_IMAGE_19_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_19_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_19_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_19_TAG_LENGTH_TOO_LONG = AD_IMAGE_19_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 19 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_19_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_19_TAG_LENGTH_TOO_LONG", description = "Ad image tag 19 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_19_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE19TAGLENGTHTOOLONG() {
    return AD_IMAGE_19_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE19TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_19_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_19_TAG_LENGTH_TOO_LONG = AD_IMAGE_19_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_19_TAG_REQUIRED(@Nullable Integer AD_IMAGE_19_TAG_REQUIRED) {
    this.AD_IMAGE_19_TAG_REQUIRED = AD_IMAGE_19_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 19 is required because an image link was provided.
   * @return AD_IMAGE_19_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_19_TAG_REQUIRED", description = "Ad image tag 19 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_19_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE19TAGREQUIRED() {
    return AD_IMAGE_19_TAG_REQUIRED;
  }

  public void setADIMAGE19TAGREQUIRED(@Nullable Integer AD_IMAGE_19_TAG_REQUIRED) {
    this.AD_IMAGE_19_TAG_REQUIRED = AD_IMAGE_19_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_1_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_1_LINK_DUPLICATED) {
    this.AD_IMAGE_1_LINK_DUPLICATED = AD_IMAGE_1_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_1_link is duplicated with another ad image link.
   * @return AD_IMAGE_1_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_1_LINK_DUPLICATED", description = "ad_image_1_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_1_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE1LINKDUPLICATED() {
    return AD_IMAGE_1_LINK_DUPLICATED;
  }

  public void setADIMAGE1LINKDUPLICATED(@Nullable Integer AD_IMAGE_1_LINK_DUPLICATED) {
    this.AD_IMAGE_1_LINK_DUPLICATED = AD_IMAGE_1_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_1_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_1_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_1_LINK_LENGTH_TOO_LONG = AD_IMAGE_1_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 1 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_1_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_1_LINK_LENGTH_TOO_LONG", description = "Ad image link 1 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_1_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE1LINKLENGTHTOOLONG() {
    return AD_IMAGE_1_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE1LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_1_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_1_LINK_LENGTH_TOO_LONG = AD_IMAGE_1_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_1_LINK_REQUIRED(@Nullable Integer AD_IMAGE_1_LINK_REQUIRED) {
    this.AD_IMAGE_1_LINK_REQUIRED = AD_IMAGE_1_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 1 is required because an image tag was provided.
   * @return AD_IMAGE_1_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_1_LINK_REQUIRED", description = "Ad image link 1 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_1_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE1LINKREQUIRED() {
    return AD_IMAGE_1_LINK_REQUIRED;
  }

  public void setADIMAGE1LINKREQUIRED(@Nullable Integer AD_IMAGE_1_LINK_REQUIRED) {
    this.AD_IMAGE_1_LINK_REQUIRED = AD_IMAGE_1_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_1_LINK_WARNING(@Nullable Integer AD_IMAGE_1_LINK_WARNING) {
    this.AD_IMAGE_1_LINK_WARNING = AD_IMAGE_1_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 1 format is unsupported.
   * @return AD_IMAGE_1_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_1_LINK_WARNING", description = "Ad image link 1 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_1_LINK_WARNING")
  public @Nullable Integer getADIMAGE1LINKWARNING() {
    return AD_IMAGE_1_LINK_WARNING;
  }

  public void setADIMAGE1LINKWARNING(@Nullable Integer AD_IMAGE_1_LINK_WARNING) {
    this.AD_IMAGE_1_LINK_WARNING = AD_IMAGE_1_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_1_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_1_TAG_DUPLICATED) {
    this.AD_IMAGE_1_TAG_DUPLICATED = AD_IMAGE_1_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_1_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_1_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_1_TAG_DUPLICATED", description = "ad_image_1_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_1_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE1TAGDUPLICATED() {
    return AD_IMAGE_1_TAG_DUPLICATED;
  }

  public void setADIMAGE1TAGDUPLICATED(@Nullable Integer AD_IMAGE_1_TAG_DUPLICATED) {
    this.AD_IMAGE_1_TAG_DUPLICATED = AD_IMAGE_1_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_1_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_1_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_1_TAG_LENGTH_TOO_LONG = AD_IMAGE_1_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 1 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_1_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_1_TAG_LENGTH_TOO_LONG", description = "Ad image tag 1 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_1_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE1TAGLENGTHTOOLONG() {
    return AD_IMAGE_1_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE1TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_1_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_1_TAG_LENGTH_TOO_LONG = AD_IMAGE_1_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_1_TAG_REQUIRED(@Nullable Integer AD_IMAGE_1_TAG_REQUIRED) {
    this.AD_IMAGE_1_TAG_REQUIRED = AD_IMAGE_1_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 1 is required because an image link was provided.
   * @return AD_IMAGE_1_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_1_TAG_REQUIRED", description = "Ad image tag 1 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_1_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE1TAGREQUIRED() {
    return AD_IMAGE_1_TAG_REQUIRED;
  }

  public void setADIMAGE1TAGREQUIRED(@Nullable Integer AD_IMAGE_1_TAG_REQUIRED) {
    this.AD_IMAGE_1_TAG_REQUIRED = AD_IMAGE_1_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_2_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_2_LINK_DUPLICATED) {
    this.AD_IMAGE_2_LINK_DUPLICATED = AD_IMAGE_2_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_2_link is duplicated with another ad image link.
   * @return AD_IMAGE_2_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_2_LINK_DUPLICATED", description = "ad_image_2_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_2_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE2LINKDUPLICATED() {
    return AD_IMAGE_2_LINK_DUPLICATED;
  }

  public void setADIMAGE2LINKDUPLICATED(@Nullable Integer AD_IMAGE_2_LINK_DUPLICATED) {
    this.AD_IMAGE_2_LINK_DUPLICATED = AD_IMAGE_2_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_2_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_2_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_2_LINK_LENGTH_TOO_LONG = AD_IMAGE_2_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 2 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_2_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_2_LINK_LENGTH_TOO_LONG", description = "Ad image link 2 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_2_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE2LINKLENGTHTOOLONG() {
    return AD_IMAGE_2_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE2LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_2_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_2_LINK_LENGTH_TOO_LONG = AD_IMAGE_2_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_2_LINK_REQUIRED(@Nullable Integer AD_IMAGE_2_LINK_REQUIRED) {
    this.AD_IMAGE_2_LINK_REQUIRED = AD_IMAGE_2_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 2 is required because an image tag was provided.
   * @return AD_IMAGE_2_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_2_LINK_REQUIRED", description = "Ad image link 2 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_2_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE2LINKREQUIRED() {
    return AD_IMAGE_2_LINK_REQUIRED;
  }

  public void setADIMAGE2LINKREQUIRED(@Nullable Integer AD_IMAGE_2_LINK_REQUIRED) {
    this.AD_IMAGE_2_LINK_REQUIRED = AD_IMAGE_2_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_2_LINK_WARNING(@Nullable Integer AD_IMAGE_2_LINK_WARNING) {
    this.AD_IMAGE_2_LINK_WARNING = AD_IMAGE_2_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 2 format is unsupported.
   * @return AD_IMAGE_2_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_2_LINK_WARNING", description = "Ad image link 2 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_2_LINK_WARNING")
  public @Nullable Integer getADIMAGE2LINKWARNING() {
    return AD_IMAGE_2_LINK_WARNING;
  }

  public void setADIMAGE2LINKWARNING(@Nullable Integer AD_IMAGE_2_LINK_WARNING) {
    this.AD_IMAGE_2_LINK_WARNING = AD_IMAGE_2_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_2_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_2_TAG_DUPLICATED) {
    this.AD_IMAGE_2_TAG_DUPLICATED = AD_IMAGE_2_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_2_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_2_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_2_TAG_DUPLICATED", description = "ad_image_2_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_2_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE2TAGDUPLICATED() {
    return AD_IMAGE_2_TAG_DUPLICATED;
  }

  public void setADIMAGE2TAGDUPLICATED(@Nullable Integer AD_IMAGE_2_TAG_DUPLICATED) {
    this.AD_IMAGE_2_TAG_DUPLICATED = AD_IMAGE_2_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_2_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_2_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_2_TAG_LENGTH_TOO_LONG = AD_IMAGE_2_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 2 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_2_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_2_TAG_LENGTH_TOO_LONG", description = "Ad image tag 2 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_2_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE2TAGLENGTHTOOLONG() {
    return AD_IMAGE_2_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE2TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_2_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_2_TAG_LENGTH_TOO_LONG = AD_IMAGE_2_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_2_TAG_REQUIRED(@Nullable Integer AD_IMAGE_2_TAG_REQUIRED) {
    this.AD_IMAGE_2_TAG_REQUIRED = AD_IMAGE_2_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 2 is required because an image link was provided.
   * @return AD_IMAGE_2_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_2_TAG_REQUIRED", description = "Ad image tag 2 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_2_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE2TAGREQUIRED() {
    return AD_IMAGE_2_TAG_REQUIRED;
  }

  public void setADIMAGE2TAGREQUIRED(@Nullable Integer AD_IMAGE_2_TAG_REQUIRED) {
    this.AD_IMAGE_2_TAG_REQUIRED = AD_IMAGE_2_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_3_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_3_LINK_DUPLICATED) {
    this.AD_IMAGE_3_LINK_DUPLICATED = AD_IMAGE_3_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_3_link is duplicated with another ad image link.
   * @return AD_IMAGE_3_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_3_LINK_DUPLICATED", description = "ad_image_3_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_3_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE3LINKDUPLICATED() {
    return AD_IMAGE_3_LINK_DUPLICATED;
  }

  public void setADIMAGE3LINKDUPLICATED(@Nullable Integer AD_IMAGE_3_LINK_DUPLICATED) {
    this.AD_IMAGE_3_LINK_DUPLICATED = AD_IMAGE_3_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_3_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_3_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_3_LINK_LENGTH_TOO_LONG = AD_IMAGE_3_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 3 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_3_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_3_LINK_LENGTH_TOO_LONG", description = "Ad image link 3 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_3_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE3LINKLENGTHTOOLONG() {
    return AD_IMAGE_3_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE3LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_3_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_3_LINK_LENGTH_TOO_LONG = AD_IMAGE_3_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_3_LINK_REQUIRED(@Nullable Integer AD_IMAGE_3_LINK_REQUIRED) {
    this.AD_IMAGE_3_LINK_REQUIRED = AD_IMAGE_3_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 3 is required because an image tag was provided.
   * @return AD_IMAGE_3_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_3_LINK_REQUIRED", description = "Ad image link 3 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_3_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE3LINKREQUIRED() {
    return AD_IMAGE_3_LINK_REQUIRED;
  }

  public void setADIMAGE3LINKREQUIRED(@Nullable Integer AD_IMAGE_3_LINK_REQUIRED) {
    this.AD_IMAGE_3_LINK_REQUIRED = AD_IMAGE_3_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_3_LINK_WARNING(@Nullable Integer AD_IMAGE_3_LINK_WARNING) {
    this.AD_IMAGE_3_LINK_WARNING = AD_IMAGE_3_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 3 format is unsupported.
   * @return AD_IMAGE_3_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_3_LINK_WARNING", description = "Ad image link 3 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_3_LINK_WARNING")
  public @Nullable Integer getADIMAGE3LINKWARNING() {
    return AD_IMAGE_3_LINK_WARNING;
  }

  public void setADIMAGE3LINKWARNING(@Nullable Integer AD_IMAGE_3_LINK_WARNING) {
    this.AD_IMAGE_3_LINK_WARNING = AD_IMAGE_3_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_3_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_3_TAG_DUPLICATED) {
    this.AD_IMAGE_3_TAG_DUPLICATED = AD_IMAGE_3_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_3_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_3_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_3_TAG_DUPLICATED", description = "ad_image_3_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_3_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE3TAGDUPLICATED() {
    return AD_IMAGE_3_TAG_DUPLICATED;
  }

  public void setADIMAGE3TAGDUPLICATED(@Nullable Integer AD_IMAGE_3_TAG_DUPLICATED) {
    this.AD_IMAGE_3_TAG_DUPLICATED = AD_IMAGE_3_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_3_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_3_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_3_TAG_LENGTH_TOO_LONG = AD_IMAGE_3_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 3 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_3_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_3_TAG_LENGTH_TOO_LONG", description = "Ad image tag 3 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_3_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE3TAGLENGTHTOOLONG() {
    return AD_IMAGE_3_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE3TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_3_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_3_TAG_LENGTH_TOO_LONG = AD_IMAGE_3_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_3_TAG_REQUIRED(@Nullable Integer AD_IMAGE_3_TAG_REQUIRED) {
    this.AD_IMAGE_3_TAG_REQUIRED = AD_IMAGE_3_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 3 is required because an image link was provided.
   * @return AD_IMAGE_3_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_3_TAG_REQUIRED", description = "Ad image tag 3 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_3_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE3TAGREQUIRED() {
    return AD_IMAGE_3_TAG_REQUIRED;
  }

  public void setADIMAGE3TAGREQUIRED(@Nullable Integer AD_IMAGE_3_TAG_REQUIRED) {
    this.AD_IMAGE_3_TAG_REQUIRED = AD_IMAGE_3_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_4_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_4_LINK_DUPLICATED) {
    this.AD_IMAGE_4_LINK_DUPLICATED = AD_IMAGE_4_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_4_link is duplicated with another ad image link.
   * @return AD_IMAGE_4_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_4_LINK_DUPLICATED", description = "ad_image_4_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_4_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE4LINKDUPLICATED() {
    return AD_IMAGE_4_LINK_DUPLICATED;
  }

  public void setADIMAGE4LINKDUPLICATED(@Nullable Integer AD_IMAGE_4_LINK_DUPLICATED) {
    this.AD_IMAGE_4_LINK_DUPLICATED = AD_IMAGE_4_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_4_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_4_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_4_LINK_LENGTH_TOO_LONG = AD_IMAGE_4_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 4 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_4_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_4_LINK_LENGTH_TOO_LONG", description = "Ad image link 4 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_4_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE4LINKLENGTHTOOLONG() {
    return AD_IMAGE_4_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE4LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_4_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_4_LINK_LENGTH_TOO_LONG = AD_IMAGE_4_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_4_LINK_REQUIRED(@Nullable Integer AD_IMAGE_4_LINK_REQUIRED) {
    this.AD_IMAGE_4_LINK_REQUIRED = AD_IMAGE_4_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 4 is required because an image tag was provided.
   * @return AD_IMAGE_4_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_4_LINK_REQUIRED", description = "Ad image link 4 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_4_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE4LINKREQUIRED() {
    return AD_IMAGE_4_LINK_REQUIRED;
  }

  public void setADIMAGE4LINKREQUIRED(@Nullable Integer AD_IMAGE_4_LINK_REQUIRED) {
    this.AD_IMAGE_4_LINK_REQUIRED = AD_IMAGE_4_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_4_LINK_WARNING(@Nullable Integer AD_IMAGE_4_LINK_WARNING) {
    this.AD_IMAGE_4_LINK_WARNING = AD_IMAGE_4_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 4 format is unsupported.
   * @return AD_IMAGE_4_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_4_LINK_WARNING", description = "Ad image link 4 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_4_LINK_WARNING")
  public @Nullable Integer getADIMAGE4LINKWARNING() {
    return AD_IMAGE_4_LINK_WARNING;
  }

  public void setADIMAGE4LINKWARNING(@Nullable Integer AD_IMAGE_4_LINK_WARNING) {
    this.AD_IMAGE_4_LINK_WARNING = AD_IMAGE_4_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_4_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_4_TAG_DUPLICATED) {
    this.AD_IMAGE_4_TAG_DUPLICATED = AD_IMAGE_4_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_4_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_4_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_4_TAG_DUPLICATED", description = "ad_image_4_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_4_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE4TAGDUPLICATED() {
    return AD_IMAGE_4_TAG_DUPLICATED;
  }

  public void setADIMAGE4TAGDUPLICATED(@Nullable Integer AD_IMAGE_4_TAG_DUPLICATED) {
    this.AD_IMAGE_4_TAG_DUPLICATED = AD_IMAGE_4_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_4_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_4_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_4_TAG_LENGTH_TOO_LONG = AD_IMAGE_4_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 4 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_4_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_4_TAG_LENGTH_TOO_LONG", description = "Ad image tag 4 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_4_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE4TAGLENGTHTOOLONG() {
    return AD_IMAGE_4_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE4TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_4_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_4_TAG_LENGTH_TOO_LONG = AD_IMAGE_4_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_4_TAG_REQUIRED(@Nullable Integer AD_IMAGE_4_TAG_REQUIRED) {
    this.AD_IMAGE_4_TAG_REQUIRED = AD_IMAGE_4_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 4 is required because an image link was provided.
   * @return AD_IMAGE_4_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_4_TAG_REQUIRED", description = "Ad image tag 4 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_4_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE4TAGREQUIRED() {
    return AD_IMAGE_4_TAG_REQUIRED;
  }

  public void setADIMAGE4TAGREQUIRED(@Nullable Integer AD_IMAGE_4_TAG_REQUIRED) {
    this.AD_IMAGE_4_TAG_REQUIRED = AD_IMAGE_4_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_5_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_5_LINK_DUPLICATED) {
    this.AD_IMAGE_5_LINK_DUPLICATED = AD_IMAGE_5_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_5_link is duplicated with another ad image link.
   * @return AD_IMAGE_5_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_5_LINK_DUPLICATED", description = "ad_image_5_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_5_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE5LINKDUPLICATED() {
    return AD_IMAGE_5_LINK_DUPLICATED;
  }

  public void setADIMAGE5LINKDUPLICATED(@Nullable Integer AD_IMAGE_5_LINK_DUPLICATED) {
    this.AD_IMAGE_5_LINK_DUPLICATED = AD_IMAGE_5_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_5_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_5_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_5_LINK_LENGTH_TOO_LONG = AD_IMAGE_5_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 5 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_5_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_5_LINK_LENGTH_TOO_LONG", description = "Ad image link 5 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_5_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE5LINKLENGTHTOOLONG() {
    return AD_IMAGE_5_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE5LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_5_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_5_LINK_LENGTH_TOO_LONG = AD_IMAGE_5_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_5_LINK_REQUIRED(@Nullable Integer AD_IMAGE_5_LINK_REQUIRED) {
    this.AD_IMAGE_5_LINK_REQUIRED = AD_IMAGE_5_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 5 is required because an image tag was provided.
   * @return AD_IMAGE_5_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_5_LINK_REQUIRED", description = "Ad image link 5 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_5_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE5LINKREQUIRED() {
    return AD_IMAGE_5_LINK_REQUIRED;
  }

  public void setADIMAGE5LINKREQUIRED(@Nullable Integer AD_IMAGE_5_LINK_REQUIRED) {
    this.AD_IMAGE_5_LINK_REQUIRED = AD_IMAGE_5_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_5_LINK_WARNING(@Nullable Integer AD_IMAGE_5_LINK_WARNING) {
    this.AD_IMAGE_5_LINK_WARNING = AD_IMAGE_5_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 5 format is unsupported.
   * @return AD_IMAGE_5_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_5_LINK_WARNING", description = "Ad image link 5 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_5_LINK_WARNING")
  public @Nullable Integer getADIMAGE5LINKWARNING() {
    return AD_IMAGE_5_LINK_WARNING;
  }

  public void setADIMAGE5LINKWARNING(@Nullable Integer AD_IMAGE_5_LINK_WARNING) {
    this.AD_IMAGE_5_LINK_WARNING = AD_IMAGE_5_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_5_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_5_TAG_DUPLICATED) {
    this.AD_IMAGE_5_TAG_DUPLICATED = AD_IMAGE_5_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_5_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_5_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_5_TAG_DUPLICATED", description = "ad_image_5_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_5_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE5TAGDUPLICATED() {
    return AD_IMAGE_5_TAG_DUPLICATED;
  }

  public void setADIMAGE5TAGDUPLICATED(@Nullable Integer AD_IMAGE_5_TAG_DUPLICATED) {
    this.AD_IMAGE_5_TAG_DUPLICATED = AD_IMAGE_5_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_5_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_5_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_5_TAG_LENGTH_TOO_LONG = AD_IMAGE_5_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 5 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_5_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_5_TAG_LENGTH_TOO_LONG", description = "Ad image tag 5 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_5_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE5TAGLENGTHTOOLONG() {
    return AD_IMAGE_5_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE5TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_5_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_5_TAG_LENGTH_TOO_LONG = AD_IMAGE_5_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_5_TAG_REQUIRED(@Nullable Integer AD_IMAGE_5_TAG_REQUIRED) {
    this.AD_IMAGE_5_TAG_REQUIRED = AD_IMAGE_5_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 5 is required because an image link was provided.
   * @return AD_IMAGE_5_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_5_TAG_REQUIRED", description = "Ad image tag 5 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_5_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE5TAGREQUIRED() {
    return AD_IMAGE_5_TAG_REQUIRED;
  }

  public void setADIMAGE5TAGREQUIRED(@Nullable Integer AD_IMAGE_5_TAG_REQUIRED) {
    this.AD_IMAGE_5_TAG_REQUIRED = AD_IMAGE_5_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_6_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_6_LINK_DUPLICATED) {
    this.AD_IMAGE_6_LINK_DUPLICATED = AD_IMAGE_6_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_6_link is duplicated with another ad image link.
   * @return AD_IMAGE_6_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_6_LINK_DUPLICATED", description = "ad_image_6_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_6_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE6LINKDUPLICATED() {
    return AD_IMAGE_6_LINK_DUPLICATED;
  }

  public void setADIMAGE6LINKDUPLICATED(@Nullable Integer AD_IMAGE_6_LINK_DUPLICATED) {
    this.AD_IMAGE_6_LINK_DUPLICATED = AD_IMAGE_6_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_6_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_6_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_6_LINK_LENGTH_TOO_LONG = AD_IMAGE_6_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 6 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_6_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_6_LINK_LENGTH_TOO_LONG", description = "Ad image link 6 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_6_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE6LINKLENGTHTOOLONG() {
    return AD_IMAGE_6_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE6LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_6_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_6_LINK_LENGTH_TOO_LONG = AD_IMAGE_6_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_6_LINK_REQUIRED(@Nullable Integer AD_IMAGE_6_LINK_REQUIRED) {
    this.AD_IMAGE_6_LINK_REQUIRED = AD_IMAGE_6_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 6 is required because an image tag was provided.
   * @return AD_IMAGE_6_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_6_LINK_REQUIRED", description = "Ad image link 6 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_6_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE6LINKREQUIRED() {
    return AD_IMAGE_6_LINK_REQUIRED;
  }

  public void setADIMAGE6LINKREQUIRED(@Nullable Integer AD_IMAGE_6_LINK_REQUIRED) {
    this.AD_IMAGE_6_LINK_REQUIRED = AD_IMAGE_6_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_6_LINK_WARNING(@Nullable Integer AD_IMAGE_6_LINK_WARNING) {
    this.AD_IMAGE_6_LINK_WARNING = AD_IMAGE_6_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 6 format is unsupported.
   * @return AD_IMAGE_6_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_6_LINK_WARNING", description = "Ad image link 6 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_6_LINK_WARNING")
  public @Nullable Integer getADIMAGE6LINKWARNING() {
    return AD_IMAGE_6_LINK_WARNING;
  }

  public void setADIMAGE6LINKWARNING(@Nullable Integer AD_IMAGE_6_LINK_WARNING) {
    this.AD_IMAGE_6_LINK_WARNING = AD_IMAGE_6_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_6_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_6_TAG_DUPLICATED) {
    this.AD_IMAGE_6_TAG_DUPLICATED = AD_IMAGE_6_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_6_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_6_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_6_TAG_DUPLICATED", description = "ad_image_6_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_6_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE6TAGDUPLICATED() {
    return AD_IMAGE_6_TAG_DUPLICATED;
  }

  public void setADIMAGE6TAGDUPLICATED(@Nullable Integer AD_IMAGE_6_TAG_DUPLICATED) {
    this.AD_IMAGE_6_TAG_DUPLICATED = AD_IMAGE_6_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_6_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_6_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_6_TAG_LENGTH_TOO_LONG = AD_IMAGE_6_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 6 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_6_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_6_TAG_LENGTH_TOO_LONG", description = "Ad image tag 6 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_6_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE6TAGLENGTHTOOLONG() {
    return AD_IMAGE_6_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE6TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_6_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_6_TAG_LENGTH_TOO_LONG = AD_IMAGE_6_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_6_TAG_REQUIRED(@Nullable Integer AD_IMAGE_6_TAG_REQUIRED) {
    this.AD_IMAGE_6_TAG_REQUIRED = AD_IMAGE_6_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 6 is required because an image link was provided.
   * @return AD_IMAGE_6_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_6_TAG_REQUIRED", description = "Ad image tag 6 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_6_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE6TAGREQUIRED() {
    return AD_IMAGE_6_TAG_REQUIRED;
  }

  public void setADIMAGE6TAGREQUIRED(@Nullable Integer AD_IMAGE_6_TAG_REQUIRED) {
    this.AD_IMAGE_6_TAG_REQUIRED = AD_IMAGE_6_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_7_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_7_LINK_DUPLICATED) {
    this.AD_IMAGE_7_LINK_DUPLICATED = AD_IMAGE_7_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_7_link is duplicated with another ad image link.
   * @return AD_IMAGE_7_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_7_LINK_DUPLICATED", description = "ad_image_7_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_7_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE7LINKDUPLICATED() {
    return AD_IMAGE_7_LINK_DUPLICATED;
  }

  public void setADIMAGE7LINKDUPLICATED(@Nullable Integer AD_IMAGE_7_LINK_DUPLICATED) {
    this.AD_IMAGE_7_LINK_DUPLICATED = AD_IMAGE_7_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_7_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_7_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_7_LINK_LENGTH_TOO_LONG = AD_IMAGE_7_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 7 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_7_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_7_LINK_LENGTH_TOO_LONG", description = "Ad image link 7 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_7_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE7LINKLENGTHTOOLONG() {
    return AD_IMAGE_7_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE7LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_7_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_7_LINK_LENGTH_TOO_LONG = AD_IMAGE_7_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_7_LINK_REQUIRED(@Nullable Integer AD_IMAGE_7_LINK_REQUIRED) {
    this.AD_IMAGE_7_LINK_REQUIRED = AD_IMAGE_7_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 7 is required because an image tag was provided.
   * @return AD_IMAGE_7_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_7_LINK_REQUIRED", description = "Ad image link 7 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_7_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE7LINKREQUIRED() {
    return AD_IMAGE_7_LINK_REQUIRED;
  }

  public void setADIMAGE7LINKREQUIRED(@Nullable Integer AD_IMAGE_7_LINK_REQUIRED) {
    this.AD_IMAGE_7_LINK_REQUIRED = AD_IMAGE_7_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_7_LINK_WARNING(@Nullable Integer AD_IMAGE_7_LINK_WARNING) {
    this.AD_IMAGE_7_LINK_WARNING = AD_IMAGE_7_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 7 format is unsupported.
   * @return AD_IMAGE_7_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_7_LINK_WARNING", description = "Ad image link 7 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_7_LINK_WARNING")
  public @Nullable Integer getADIMAGE7LINKWARNING() {
    return AD_IMAGE_7_LINK_WARNING;
  }

  public void setADIMAGE7LINKWARNING(@Nullable Integer AD_IMAGE_7_LINK_WARNING) {
    this.AD_IMAGE_7_LINK_WARNING = AD_IMAGE_7_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_7_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_7_TAG_DUPLICATED) {
    this.AD_IMAGE_7_TAG_DUPLICATED = AD_IMAGE_7_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_7_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_7_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_7_TAG_DUPLICATED", description = "ad_image_7_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_7_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE7TAGDUPLICATED() {
    return AD_IMAGE_7_TAG_DUPLICATED;
  }

  public void setADIMAGE7TAGDUPLICATED(@Nullable Integer AD_IMAGE_7_TAG_DUPLICATED) {
    this.AD_IMAGE_7_TAG_DUPLICATED = AD_IMAGE_7_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_7_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_7_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_7_TAG_LENGTH_TOO_LONG = AD_IMAGE_7_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 7 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_7_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_7_TAG_LENGTH_TOO_LONG", description = "Ad image tag 7 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_7_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE7TAGLENGTHTOOLONG() {
    return AD_IMAGE_7_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE7TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_7_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_7_TAG_LENGTH_TOO_LONG = AD_IMAGE_7_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_7_TAG_REQUIRED(@Nullable Integer AD_IMAGE_7_TAG_REQUIRED) {
    this.AD_IMAGE_7_TAG_REQUIRED = AD_IMAGE_7_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 7 is required because an image link was provided.
   * @return AD_IMAGE_7_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_7_TAG_REQUIRED", description = "Ad image tag 7 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_7_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE7TAGREQUIRED() {
    return AD_IMAGE_7_TAG_REQUIRED;
  }

  public void setADIMAGE7TAGREQUIRED(@Nullable Integer AD_IMAGE_7_TAG_REQUIRED) {
    this.AD_IMAGE_7_TAG_REQUIRED = AD_IMAGE_7_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_8_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_8_LINK_DUPLICATED) {
    this.AD_IMAGE_8_LINK_DUPLICATED = AD_IMAGE_8_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_8_link is duplicated with another ad image link.
   * @return AD_IMAGE_8_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_8_LINK_DUPLICATED", description = "ad_image_8_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_8_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE8LINKDUPLICATED() {
    return AD_IMAGE_8_LINK_DUPLICATED;
  }

  public void setADIMAGE8LINKDUPLICATED(@Nullable Integer AD_IMAGE_8_LINK_DUPLICATED) {
    this.AD_IMAGE_8_LINK_DUPLICATED = AD_IMAGE_8_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_8_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_8_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_8_LINK_LENGTH_TOO_LONG = AD_IMAGE_8_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 8 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_8_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_8_LINK_LENGTH_TOO_LONG", description = "Ad image link 8 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_8_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE8LINKLENGTHTOOLONG() {
    return AD_IMAGE_8_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE8LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_8_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_8_LINK_LENGTH_TOO_LONG = AD_IMAGE_8_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_8_LINK_REQUIRED(@Nullable Integer AD_IMAGE_8_LINK_REQUIRED) {
    this.AD_IMAGE_8_LINK_REQUIRED = AD_IMAGE_8_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 8 is required because an image tag was provided.
   * @return AD_IMAGE_8_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_8_LINK_REQUIRED", description = "Ad image link 8 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_8_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE8LINKREQUIRED() {
    return AD_IMAGE_8_LINK_REQUIRED;
  }

  public void setADIMAGE8LINKREQUIRED(@Nullable Integer AD_IMAGE_8_LINK_REQUIRED) {
    this.AD_IMAGE_8_LINK_REQUIRED = AD_IMAGE_8_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_8_LINK_WARNING(@Nullable Integer AD_IMAGE_8_LINK_WARNING) {
    this.AD_IMAGE_8_LINK_WARNING = AD_IMAGE_8_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 8 format is unsupported.
   * @return AD_IMAGE_8_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_8_LINK_WARNING", description = "Ad image link 8 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_8_LINK_WARNING")
  public @Nullable Integer getADIMAGE8LINKWARNING() {
    return AD_IMAGE_8_LINK_WARNING;
  }

  public void setADIMAGE8LINKWARNING(@Nullable Integer AD_IMAGE_8_LINK_WARNING) {
    this.AD_IMAGE_8_LINK_WARNING = AD_IMAGE_8_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_8_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_8_TAG_DUPLICATED) {
    this.AD_IMAGE_8_TAG_DUPLICATED = AD_IMAGE_8_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_8_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_8_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_8_TAG_DUPLICATED", description = "ad_image_8_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_8_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE8TAGDUPLICATED() {
    return AD_IMAGE_8_TAG_DUPLICATED;
  }

  public void setADIMAGE8TAGDUPLICATED(@Nullable Integer AD_IMAGE_8_TAG_DUPLICATED) {
    this.AD_IMAGE_8_TAG_DUPLICATED = AD_IMAGE_8_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_8_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_8_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_8_TAG_LENGTH_TOO_LONG = AD_IMAGE_8_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 8 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_8_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_8_TAG_LENGTH_TOO_LONG", description = "Ad image tag 8 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_8_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE8TAGLENGTHTOOLONG() {
    return AD_IMAGE_8_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE8TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_8_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_8_TAG_LENGTH_TOO_LONG = AD_IMAGE_8_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_8_TAG_REQUIRED(@Nullable Integer AD_IMAGE_8_TAG_REQUIRED) {
    this.AD_IMAGE_8_TAG_REQUIRED = AD_IMAGE_8_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 8 is required because an image link was provided.
   * @return AD_IMAGE_8_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_8_TAG_REQUIRED", description = "Ad image tag 8 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_8_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE8TAGREQUIRED() {
    return AD_IMAGE_8_TAG_REQUIRED;
  }

  public void setADIMAGE8TAGREQUIRED(@Nullable Integer AD_IMAGE_8_TAG_REQUIRED) {
    this.AD_IMAGE_8_TAG_REQUIRED = AD_IMAGE_8_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_9_LINK_DUPLICATED(@Nullable Integer AD_IMAGE_9_LINK_DUPLICATED) {
    this.AD_IMAGE_9_LINK_DUPLICATED = AD_IMAGE_9_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_image_9_link is duplicated with another ad image link.
   * @return AD_IMAGE_9_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_9_LINK_DUPLICATED", description = "ad_image_9_link is duplicated with another ad image link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_9_LINK_DUPLICATED")
  public @Nullable Integer getADIMAGE9LINKDUPLICATED() {
    return AD_IMAGE_9_LINK_DUPLICATED;
  }

  public void setADIMAGE9LINKDUPLICATED(@Nullable Integer AD_IMAGE_9_LINK_DUPLICATED) {
    this.AD_IMAGE_9_LINK_DUPLICATED = AD_IMAGE_9_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_9_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_9_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_9_LINK_LENGTH_TOO_LONG = AD_IMAGE_9_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image link 9 length is too long. The maximum length is 2047 characters.
   * @return AD_IMAGE_9_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_9_LINK_LENGTH_TOO_LONG", description = "Ad image link 9 length is too long. The maximum length is 2047 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_9_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE9LINKLENGTHTOOLONG() {
    return AD_IMAGE_9_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE9LINKLENGTHTOOLONG(@Nullable Integer AD_IMAGE_9_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_9_LINK_LENGTH_TOO_LONG = AD_IMAGE_9_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_9_LINK_REQUIRED(@Nullable Integer AD_IMAGE_9_LINK_REQUIRED) {
    this.AD_IMAGE_9_LINK_REQUIRED = AD_IMAGE_9_LINK_REQUIRED;
    return this;
  }

  /**
   * Ad image link 9 is required because an image tag was provided.
   * @return AD_IMAGE_9_LINK_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_9_LINK_REQUIRED", description = "Ad image link 9 is required because an image tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_9_LINK_REQUIRED")
  public @Nullable Integer getADIMAGE9LINKREQUIRED() {
    return AD_IMAGE_9_LINK_REQUIRED;
  }

  public void setADIMAGE9LINKREQUIRED(@Nullable Integer AD_IMAGE_9_LINK_REQUIRED) {
    this.AD_IMAGE_9_LINK_REQUIRED = AD_IMAGE_9_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_9_LINK_WARNING(@Nullable Integer AD_IMAGE_9_LINK_WARNING) {
    this.AD_IMAGE_9_LINK_WARNING = AD_IMAGE_9_LINK_WARNING;
    return this;
  }

  /**
   * Ad image link 9 format is unsupported.
   * @return AD_IMAGE_9_LINK_WARNING
   */
  
  @Schema(name = "AD_IMAGE_9_LINK_WARNING", description = "Ad image link 9 format is unsupported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_9_LINK_WARNING")
  public @Nullable Integer getADIMAGE9LINKWARNING() {
    return AD_IMAGE_9_LINK_WARNING;
  }

  public void setADIMAGE9LINKWARNING(@Nullable Integer AD_IMAGE_9_LINK_WARNING) {
    this.AD_IMAGE_9_LINK_WARNING = AD_IMAGE_9_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_9_TAG_DUPLICATED(@Nullable Integer AD_IMAGE_9_TAG_DUPLICATED) {
    this.AD_IMAGE_9_TAG_DUPLICATED = AD_IMAGE_9_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_image_9_tag is duplicated with another ad image tag.
   * @return AD_IMAGE_9_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_IMAGE_9_TAG_DUPLICATED", description = "ad_image_9_tag is duplicated with another ad image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_9_TAG_DUPLICATED")
  public @Nullable Integer getADIMAGE9TAGDUPLICATED() {
    return AD_IMAGE_9_TAG_DUPLICATED;
  }

  public void setADIMAGE9TAGDUPLICATED(@Nullable Integer AD_IMAGE_9_TAG_DUPLICATED) {
    this.AD_IMAGE_9_TAG_DUPLICATED = AD_IMAGE_9_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_9_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_IMAGE_9_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_9_TAG_LENGTH_TOO_LONG = AD_IMAGE_9_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Ad image tag 9 length is too long. The maximum length is 511 characters.
   * @return AD_IMAGE_9_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_IMAGE_9_TAG_LENGTH_TOO_LONG", description = "Ad image tag 9 length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_9_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADIMAGE9TAGLENGTHTOOLONG() {
    return AD_IMAGE_9_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE9TAGLENGTHTOOLONG(@Nullable Integer AD_IMAGE_9_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_9_TAG_LENGTH_TOO_LONG = AD_IMAGE_9_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_IMAGE_9_TAG_REQUIRED(@Nullable Integer AD_IMAGE_9_TAG_REQUIRED) {
    this.AD_IMAGE_9_TAG_REQUIRED = AD_IMAGE_9_TAG_REQUIRED;
    return this;
  }

  /**
   * Ad image tag 9 is required because an image link was provided.
   * @return AD_IMAGE_9_TAG_REQUIRED
   */
  
  @Schema(name = "AD_IMAGE_9_TAG_REQUIRED", description = "Ad image tag 9 is required because an image link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_9_TAG_REQUIRED")
  public @Nullable Integer getADIMAGE9TAGREQUIRED() {
    return AD_IMAGE_9_TAG_REQUIRED;
  }

  public void setADIMAGE9TAGREQUIRED(@Nullable Integer AD_IMAGE_9_TAG_REQUIRED) {
    this.AD_IMAGE_9_TAG_REQUIRED = AD_IMAGE_9_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_LINK_FORMAT_WARNING(@Nullable Integer AD_LINK_FORMAT_WARNING) {
    this.AD_LINK_FORMAT_WARNING = AD_LINK_FORMAT_WARNING;
    return this;
  }

  /**
   * Some items have ad links that are formatted incorrectly.
   * @return AD_LINK_FORMAT_WARNING
   */
  
  @Schema(name = "AD_LINK_FORMAT_WARNING", description = "Some items have ad links that are formatted incorrectly.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_LINK_FORMAT_WARNING")
  public @Nullable Integer getADLINKFORMATWARNING() {
    return AD_LINK_FORMAT_WARNING;
  }

  public void setADLINKFORMATWARNING(@Nullable Integer AD_LINK_FORMAT_WARNING) {
    this.AD_LINK_FORMAT_WARNING = AD_LINK_FORMAT_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_LINK_SAME_AS_LINK(@Nullable Integer AD_LINK_SAME_AS_LINK) {
    this.AD_LINK_SAME_AS_LINK = AD_LINK_SAME_AS_LINK;
    return this;
  }

  /**
   * Some items have ad link URLs that are duplicates of the link URLs for those items.
   * @return AD_LINK_SAME_AS_LINK
   */
  
  @Schema(name = "AD_LINK_SAME_AS_LINK", description = "Some items have ad link URLs that are duplicates of the link URLs for those items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_LINK_SAME_AS_LINK")
  public @Nullable Integer getADLINKSAMEASLINK() {
    return AD_LINK_SAME_AS_LINK;
  }

  public void setADLINKSAMEASLINK(@Nullable Integer AD_LINK_SAME_AS_LINK) {
    this.AD_LINK_SAME_AS_LINK = AD_LINK_SAME_AS_LINK;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_0_LINK_DUPLICATED(@Nullable Integer AD_VIDEO_0_LINK_DUPLICATED) {
    this.AD_VIDEO_0_LINK_DUPLICATED = AD_VIDEO_0_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_video_0_link is duplicated with another ad video link.
   * @return AD_VIDEO_0_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_VIDEO_0_LINK_DUPLICATED", description = "ad_video_0_link is duplicated with another ad video link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_0_LINK_DUPLICATED")
  public @Nullable Integer getADVIDEO0LINKDUPLICATED() {
    return AD_VIDEO_0_LINK_DUPLICATED;
  }

  public void setADVIDEO0LINKDUPLICATED(@Nullable Integer AD_VIDEO_0_LINK_DUPLICATED) {
    this.AD_VIDEO_0_LINK_DUPLICATED = AD_VIDEO_0_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_0_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_VIDEO_0_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_0_LINK_LENGTH_TOO_LONG = AD_VIDEO_0_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * ad_video_0_link length is too long. The maximum length is 511 characters.
   * @return AD_VIDEO_0_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_VIDEO_0_LINK_LENGTH_TOO_LONG", description = "ad_video_0_link length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_0_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADVIDEO0LINKLENGTHTOOLONG() {
    return AD_VIDEO_0_LINK_LENGTH_TOO_LONG;
  }

  public void setADVIDEO0LINKLENGTHTOOLONG(@Nullable Integer AD_VIDEO_0_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_0_LINK_LENGTH_TOO_LONG = AD_VIDEO_0_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_0_LINK_REQUIRED(@Nullable Integer AD_VIDEO_0_LINK_REQUIRED) {
    this.AD_VIDEO_0_LINK_REQUIRED = AD_VIDEO_0_LINK_REQUIRED;
    return this;
  }

  /**
   * ad_video_0_link is required for this item because ad_video_0_tag was provided.
   * @return AD_VIDEO_0_LINK_REQUIRED
   */
  
  @Schema(name = "AD_VIDEO_0_LINK_REQUIRED", description = "ad_video_0_link is required for this item because ad_video_0_tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_0_LINK_REQUIRED")
  public @Nullable Integer getADVIDEO0LINKREQUIRED() {
    return AD_VIDEO_0_LINK_REQUIRED;
  }

  public void setADVIDEO0LINKREQUIRED(@Nullable Integer AD_VIDEO_0_LINK_REQUIRED) {
    this.AD_VIDEO_0_LINK_REQUIRED = AD_VIDEO_0_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_0_LINK_WARNING(@Nullable Integer AD_VIDEO_0_LINK_WARNING) {
    this.AD_VIDEO_0_LINK_WARNING = AD_VIDEO_0_LINK_WARNING;
    return this;
  }

  /**
   * ad_video_0_link is formatted incorrectly and will not be published with your items.
   * @return AD_VIDEO_0_LINK_WARNING
   */
  
  @Schema(name = "AD_VIDEO_0_LINK_WARNING", description = "ad_video_0_link is formatted incorrectly and will not be published with your items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_0_LINK_WARNING")
  public @Nullable Integer getADVIDEO0LINKWARNING() {
    return AD_VIDEO_0_LINK_WARNING;
  }

  public void setADVIDEO0LINKWARNING(@Nullable Integer AD_VIDEO_0_LINK_WARNING) {
    this.AD_VIDEO_0_LINK_WARNING = AD_VIDEO_0_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_0_TAG_DUPLICATED(@Nullable Integer AD_VIDEO_0_TAG_DUPLICATED) {
    this.AD_VIDEO_0_TAG_DUPLICATED = AD_VIDEO_0_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_video_0_tag is duplicated with another ad video tag.
   * @return AD_VIDEO_0_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_VIDEO_0_TAG_DUPLICATED", description = "ad_video_0_tag is duplicated with another ad video tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_0_TAG_DUPLICATED")
  public @Nullable Integer getADVIDEO0TAGDUPLICATED() {
    return AD_VIDEO_0_TAG_DUPLICATED;
  }

  public void setADVIDEO0TAGDUPLICATED(@Nullable Integer AD_VIDEO_0_TAG_DUPLICATED) {
    this.AD_VIDEO_0_TAG_DUPLICATED = AD_VIDEO_0_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_0_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_VIDEO_0_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_0_TAG_LENGTH_TOO_LONG = AD_VIDEO_0_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * ad_video_0_tag length is too long. The maximum length is 511 characters.
   * @return AD_VIDEO_0_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_VIDEO_0_TAG_LENGTH_TOO_LONG", description = "ad_video_0_tag length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_0_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADVIDEO0TAGLENGTHTOOLONG() {
    return AD_VIDEO_0_TAG_LENGTH_TOO_LONG;
  }

  public void setADVIDEO0TAGLENGTHTOOLONG(@Nullable Integer AD_VIDEO_0_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_0_TAG_LENGTH_TOO_LONG = AD_VIDEO_0_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_0_TAG_REQUIRED(@Nullable Integer AD_VIDEO_0_TAG_REQUIRED) {
    this.AD_VIDEO_0_TAG_REQUIRED = AD_VIDEO_0_TAG_REQUIRED;
    return this;
  }

  /**
   * ad_video_0_tag is required because ad_video_0_link was provided.
   * @return AD_VIDEO_0_TAG_REQUIRED
   */
  
  @Schema(name = "AD_VIDEO_0_TAG_REQUIRED", description = "ad_video_0_tag is required because ad_video_0_link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_0_TAG_REQUIRED")
  public @Nullable Integer getADVIDEO0TAGREQUIRED() {
    return AD_VIDEO_0_TAG_REQUIRED;
  }

  public void setADVIDEO0TAGREQUIRED(@Nullable Integer AD_VIDEO_0_TAG_REQUIRED) {
    this.AD_VIDEO_0_TAG_REQUIRED = AD_VIDEO_0_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_1_LINK_DUPLICATED(@Nullable Integer AD_VIDEO_1_LINK_DUPLICATED) {
    this.AD_VIDEO_1_LINK_DUPLICATED = AD_VIDEO_1_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_video_1_link is duplicated with another ad video link.
   * @return AD_VIDEO_1_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_VIDEO_1_LINK_DUPLICATED", description = "ad_video_1_link is duplicated with another ad video link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_1_LINK_DUPLICATED")
  public @Nullable Integer getADVIDEO1LINKDUPLICATED() {
    return AD_VIDEO_1_LINK_DUPLICATED;
  }

  public void setADVIDEO1LINKDUPLICATED(@Nullable Integer AD_VIDEO_1_LINK_DUPLICATED) {
    this.AD_VIDEO_1_LINK_DUPLICATED = AD_VIDEO_1_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_1_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_VIDEO_1_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_1_LINK_LENGTH_TOO_LONG = AD_VIDEO_1_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * ad_video_1_link length is too long. The maximum length is 511 characters.
   * @return AD_VIDEO_1_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_VIDEO_1_LINK_LENGTH_TOO_LONG", description = "ad_video_1_link length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_1_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADVIDEO1LINKLENGTHTOOLONG() {
    return AD_VIDEO_1_LINK_LENGTH_TOO_LONG;
  }

  public void setADVIDEO1LINKLENGTHTOOLONG(@Nullable Integer AD_VIDEO_1_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_1_LINK_LENGTH_TOO_LONG = AD_VIDEO_1_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_1_LINK_REQUIRED(@Nullable Integer AD_VIDEO_1_LINK_REQUIRED) {
    this.AD_VIDEO_1_LINK_REQUIRED = AD_VIDEO_1_LINK_REQUIRED;
    return this;
  }

  /**
   * ad_video_1_link is required for this item because ad_video_1_tag was provided.
   * @return AD_VIDEO_1_LINK_REQUIRED
   */
  
  @Schema(name = "AD_VIDEO_1_LINK_REQUIRED", description = "ad_video_1_link is required for this item because ad_video_1_tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_1_LINK_REQUIRED")
  public @Nullable Integer getADVIDEO1LINKREQUIRED() {
    return AD_VIDEO_1_LINK_REQUIRED;
  }

  public void setADVIDEO1LINKREQUIRED(@Nullable Integer AD_VIDEO_1_LINK_REQUIRED) {
    this.AD_VIDEO_1_LINK_REQUIRED = AD_VIDEO_1_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_1_LINK_WARNING(@Nullable Integer AD_VIDEO_1_LINK_WARNING) {
    this.AD_VIDEO_1_LINK_WARNING = AD_VIDEO_1_LINK_WARNING;
    return this;
  }

  /**
   * ad_video_1_link is formatted incorrectly and will not be published with your items.
   * @return AD_VIDEO_1_LINK_WARNING
   */
  
  @Schema(name = "AD_VIDEO_1_LINK_WARNING", description = "ad_video_1_link is formatted incorrectly and will not be published with your items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_1_LINK_WARNING")
  public @Nullable Integer getADVIDEO1LINKWARNING() {
    return AD_VIDEO_1_LINK_WARNING;
  }

  public void setADVIDEO1LINKWARNING(@Nullable Integer AD_VIDEO_1_LINK_WARNING) {
    this.AD_VIDEO_1_LINK_WARNING = AD_VIDEO_1_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_1_TAG_DUPLICATED(@Nullable Integer AD_VIDEO_1_TAG_DUPLICATED) {
    this.AD_VIDEO_1_TAG_DUPLICATED = AD_VIDEO_1_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_video_1_tag is duplicated with another ad video tag.
   * @return AD_VIDEO_1_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_VIDEO_1_TAG_DUPLICATED", description = "ad_video_1_tag is duplicated with another ad video tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_1_TAG_DUPLICATED")
  public @Nullable Integer getADVIDEO1TAGDUPLICATED() {
    return AD_VIDEO_1_TAG_DUPLICATED;
  }

  public void setADVIDEO1TAGDUPLICATED(@Nullable Integer AD_VIDEO_1_TAG_DUPLICATED) {
    this.AD_VIDEO_1_TAG_DUPLICATED = AD_VIDEO_1_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_1_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_VIDEO_1_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_1_TAG_LENGTH_TOO_LONG = AD_VIDEO_1_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * ad_video_1_tag length is too long. The maximum length is 511 characters.
   * @return AD_VIDEO_1_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_VIDEO_1_TAG_LENGTH_TOO_LONG", description = "ad_video_1_tag length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_1_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADVIDEO1TAGLENGTHTOOLONG() {
    return AD_VIDEO_1_TAG_LENGTH_TOO_LONG;
  }

  public void setADVIDEO1TAGLENGTHTOOLONG(@Nullable Integer AD_VIDEO_1_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_1_TAG_LENGTH_TOO_LONG = AD_VIDEO_1_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_1_TAG_REQUIRED(@Nullable Integer AD_VIDEO_1_TAG_REQUIRED) {
    this.AD_VIDEO_1_TAG_REQUIRED = AD_VIDEO_1_TAG_REQUIRED;
    return this;
  }

  /**
   * ad_video_1_tag is required because ad_video_1_link was provided.
   * @return AD_VIDEO_1_TAG_REQUIRED
   */
  
  @Schema(name = "AD_VIDEO_1_TAG_REQUIRED", description = "ad_video_1_tag is required because ad_video_1_link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_1_TAG_REQUIRED")
  public @Nullable Integer getADVIDEO1TAGREQUIRED() {
    return AD_VIDEO_1_TAG_REQUIRED;
  }

  public void setADVIDEO1TAGREQUIRED(@Nullable Integer AD_VIDEO_1_TAG_REQUIRED) {
    this.AD_VIDEO_1_TAG_REQUIRED = AD_VIDEO_1_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_2_LINK_DUPLICATED(@Nullable Integer AD_VIDEO_2_LINK_DUPLICATED) {
    this.AD_VIDEO_2_LINK_DUPLICATED = AD_VIDEO_2_LINK_DUPLICATED;
    return this;
  }

  /**
   * ad_video_2_link is duplicated with another ad video link.
   * @return AD_VIDEO_2_LINK_DUPLICATED
   */
  
  @Schema(name = "AD_VIDEO_2_LINK_DUPLICATED", description = "ad_video_2_link is duplicated with another ad video link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_2_LINK_DUPLICATED")
  public @Nullable Integer getADVIDEO2LINKDUPLICATED() {
    return AD_VIDEO_2_LINK_DUPLICATED;
  }

  public void setADVIDEO2LINKDUPLICATED(@Nullable Integer AD_VIDEO_2_LINK_DUPLICATED) {
    this.AD_VIDEO_2_LINK_DUPLICATED = AD_VIDEO_2_LINK_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_2_LINK_LENGTH_TOO_LONG(@Nullable Integer AD_VIDEO_2_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_2_LINK_LENGTH_TOO_LONG = AD_VIDEO_2_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * ad_video_2_link length is too long. The maximum length is 511 characters.
   * @return AD_VIDEO_2_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_VIDEO_2_LINK_LENGTH_TOO_LONG", description = "ad_video_2_link length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_2_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADVIDEO2LINKLENGTHTOOLONG() {
    return AD_VIDEO_2_LINK_LENGTH_TOO_LONG;
  }

  public void setADVIDEO2LINKLENGTHTOOLONG(@Nullable Integer AD_VIDEO_2_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_2_LINK_LENGTH_TOO_LONG = AD_VIDEO_2_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_2_LINK_REQUIRED(@Nullable Integer AD_VIDEO_2_LINK_REQUIRED) {
    this.AD_VIDEO_2_LINK_REQUIRED = AD_VIDEO_2_LINK_REQUIRED;
    return this;
  }

  /**
   * ad_video_2_link is required for this item because ad_video_2_tag was provided.
   * @return AD_VIDEO_2_LINK_REQUIRED
   */
  
  @Schema(name = "AD_VIDEO_2_LINK_REQUIRED", description = "ad_video_2_link is required for this item because ad_video_2_tag was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_2_LINK_REQUIRED")
  public @Nullable Integer getADVIDEO2LINKREQUIRED() {
    return AD_VIDEO_2_LINK_REQUIRED;
  }

  public void setADVIDEO2LINKREQUIRED(@Nullable Integer AD_VIDEO_2_LINK_REQUIRED) {
    this.AD_VIDEO_2_LINK_REQUIRED = AD_VIDEO_2_LINK_REQUIRED;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_2_LINK_WARNING(@Nullable Integer AD_VIDEO_2_LINK_WARNING) {
    this.AD_VIDEO_2_LINK_WARNING = AD_VIDEO_2_LINK_WARNING;
    return this;
  }

  /**
   * ad_video_2_link is formatted incorrectly and will not be published with your items.
   * @return AD_VIDEO_2_LINK_WARNING
   */
  
  @Schema(name = "AD_VIDEO_2_LINK_WARNING", description = "ad_video_2_link is formatted incorrectly and will not be published with your items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_2_LINK_WARNING")
  public @Nullable Integer getADVIDEO2LINKWARNING() {
    return AD_VIDEO_2_LINK_WARNING;
  }

  public void setADVIDEO2LINKWARNING(@Nullable Integer AD_VIDEO_2_LINK_WARNING) {
    this.AD_VIDEO_2_LINK_WARNING = AD_VIDEO_2_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_2_TAG_DUPLICATED(@Nullable Integer AD_VIDEO_2_TAG_DUPLICATED) {
    this.AD_VIDEO_2_TAG_DUPLICATED = AD_VIDEO_2_TAG_DUPLICATED;
    return this;
  }

  /**
   * ad_video_2_tag is duplicated with another ad video tag.
   * @return AD_VIDEO_2_TAG_DUPLICATED
   */
  
  @Schema(name = "AD_VIDEO_2_TAG_DUPLICATED", description = "ad_video_2_tag is duplicated with another ad video tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_2_TAG_DUPLICATED")
  public @Nullable Integer getADVIDEO2TAGDUPLICATED() {
    return AD_VIDEO_2_TAG_DUPLICATED;
  }

  public void setADVIDEO2TAGDUPLICATED(@Nullable Integer AD_VIDEO_2_TAG_DUPLICATED) {
    this.AD_VIDEO_2_TAG_DUPLICATED = AD_VIDEO_2_TAG_DUPLICATED;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_2_TAG_LENGTH_TOO_LONG(@Nullable Integer AD_VIDEO_2_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_2_TAG_LENGTH_TOO_LONG = AD_VIDEO_2_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * ad_video_2_tag length is too long. The maximum length is 511 characters.
   * @return AD_VIDEO_2_TAG_LENGTH_TOO_LONG
   */
  
  @Schema(name = "AD_VIDEO_2_TAG_LENGTH_TOO_LONG", description = "ad_video_2_tag length is too long. The maximum length is 511 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_2_TAG_LENGTH_TOO_LONG")
  public @Nullable Integer getADVIDEO2TAGLENGTHTOOLONG() {
    return AD_VIDEO_2_TAG_LENGTH_TOO_LONG;
  }

  public void setADVIDEO2TAGLENGTHTOOLONG(@Nullable Integer AD_VIDEO_2_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_2_TAG_LENGTH_TOO_LONG = AD_VIDEO_2_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings AD_VIDEO_2_TAG_REQUIRED(@Nullable Integer AD_VIDEO_2_TAG_REQUIRED) {
    this.AD_VIDEO_2_TAG_REQUIRED = AD_VIDEO_2_TAG_REQUIRED;
    return this;
  }

  /**
   * ad_video_2_tag is required because ad_video_2_link was provided.
   * @return AD_VIDEO_2_TAG_REQUIRED
   */
  
  @Schema(name = "AD_VIDEO_2_TAG_REQUIRED", description = "ad_video_2_tag is required because ad_video_2_link was provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_2_TAG_REQUIRED")
  public @Nullable Integer getADVIDEO2TAGREQUIRED() {
    return AD_VIDEO_2_TAG_REQUIRED;
  }

  public void setADVIDEO2TAGREQUIRED(@Nullable Integer AD_VIDEO_2_TAG_REQUIRED) {
    this.AD_VIDEO_2_TAG_REQUIRED = AD_VIDEO_2_TAG_REQUIRED;
  }

  public CatalogsFeedValidationWarnings ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG(@Nullable Integer ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG) {
    this.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG = ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
   * @return ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG
   */
  
  @Schema(name = "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", description = "Some items have additional_image_link URLs that contain too many characters, so those items will not be published.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG")
  public @Nullable Integer getADDITIONALIMAGELINKLENGTHTOOLONG() {
    return ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
  }

  public void setADDITIONALIMAGELINKLENGTHTOOLONG(@Nullable Integer ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG) {
    this.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG = ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings ADDITIONAL_IMAGE_LINK_WARNING(@Nullable Integer ADDITIONAL_IMAGE_LINK_WARNING) {
    this.ADDITIONAL_IMAGE_LINK_WARNING = ADDITIONAL_IMAGE_LINK_WARNING;
    return this;
  }

  /**
   * Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
   * @return ADDITIONAL_IMAGE_LINK_WARNING
   */
  
  @Schema(name = "ADDITIONAL_IMAGE_LINK_WARNING", description = "Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADDITIONAL_IMAGE_LINK_WARNING")
  public @Nullable Integer getADDITIONALIMAGELINKWARNING() {
    return ADDITIONAL_IMAGE_LINK_WARNING;
  }

  public void setADDITIONALIMAGELINKWARNING(@Nullable Integer ADDITIONAL_IMAGE_LINK_WARNING) {
    this.ADDITIONAL_IMAGE_LINK_WARNING = ADDITIONAL_IMAGE_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings ADWORDS_FORMAT_WARNING(@Nullable Integer ADWORDS_FORMAT_WARNING) {
    this.ADWORDS_FORMAT_WARNING = ADWORDS_FORMAT_WARNING;
    return this;
  }

  /**
   * Some items have adwords_redirect links that are formatted incorrectly.
   * @return ADWORDS_FORMAT_WARNING
   */
  
  @Schema(name = "ADWORDS_FORMAT_WARNING", description = "Some items have adwords_redirect links that are formatted incorrectly.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADWORDS_FORMAT_WARNING")
  public @Nullable Integer getADWORDSFORMATWARNING() {
    return ADWORDS_FORMAT_WARNING;
  }

  public void setADWORDSFORMATWARNING(@Nullable Integer ADWORDS_FORMAT_WARNING) {
    this.ADWORDS_FORMAT_WARNING = ADWORDS_FORMAT_WARNING;
  }

  public CatalogsFeedValidationWarnings ADWORDS_SAME_AS_LINK(@Nullable Integer ADWORDS_SAME_AS_LINK) {
    this.ADWORDS_SAME_AS_LINK = ADWORDS_SAME_AS_LINK;
    return this;
  }

  /**
   * Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
   * @return ADWORDS_SAME_AS_LINK
   */
  
  @Schema(name = "ADWORDS_SAME_AS_LINK", description = "Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADWORDS_SAME_AS_LINK")
  public @Nullable Integer getADWORDSSAMEASLINK() {
    return ADWORDS_SAME_AS_LINK;
  }

  public void setADWORDSSAMEASLINK(@Nullable Integer ADWORDS_SAME_AS_LINK) {
    this.ADWORDS_SAME_AS_LINK = ADWORDS_SAME_AS_LINK;
  }

  public CatalogsFeedValidationWarnings AGE_GROUP_INVALID(@Nullable Integer AGE_GROUP_INVALID) {
    this.AGE_GROUP_INVALID = AGE_GROUP_INVALID;
    return this;
  }

  /**
   * Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
   * @return AGE_GROUP_INVALID
   */
  
  @Schema(name = "AGE_GROUP_INVALID", description = "Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AGE_GROUP_INVALID")
  public @Nullable Integer getAGEGROUPINVALID() {
    return AGE_GROUP_INVALID;
  }

  public void setAGEGROUPINVALID(@Nullable Integer AGE_GROUP_INVALID) {
    this.AGE_GROUP_INVALID = AGE_GROUP_INVALID;
  }

  public CatalogsFeedValidationWarnings ANDROID_DEEP_LINK_INVALID(@Nullable Integer ANDROID_DEEP_LINK_INVALID) {
    this.ANDROID_DEEP_LINK_INVALID = ANDROID_DEEP_LINK_INVALID;
    return this;
  }

  /**
   * Some items include invalid android_deep_link.
   * @return ANDROID_DEEP_LINK_INVALID
   */
  
  @Schema(name = "ANDROID_DEEP_LINK_INVALID", description = "Some items include invalid android_deep_link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ANDROID_DEEP_LINK_INVALID")
  public @Nullable Integer getANDROIDDEEPLINKINVALID() {
    return ANDROID_DEEP_LINK_INVALID;
  }

  public void setANDROIDDEEPLINKINVALID(@Nullable Integer ANDROID_DEEP_LINK_INVALID) {
    this.ANDROID_DEEP_LINK_INVALID = ANDROID_DEEP_LINK_INVALID;
  }

  public CatalogsFeedValidationWarnings AVAILABILITY_DATE_INVALID(@Nullable Integer AVAILABILITY_DATE_INVALID) {
    this.AVAILABILITY_DATE_INVALID = AVAILABILITY_DATE_INVALID;
    return this;
  }

  /**
   * Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
   * @return AVAILABILITY_DATE_INVALID
   */
  
  @Schema(name = "AVAILABILITY_DATE_INVALID", description = "Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AVAILABILITY_DATE_INVALID")
  public @Nullable Integer getAVAILABILITYDATEINVALID() {
    return AVAILABILITY_DATE_INVALID;
  }

  public void setAVAILABILITYDATEINVALID(@Nullable Integer AVAILABILITY_DATE_INVALID) {
    this.AVAILABILITY_DATE_INVALID = AVAILABILITY_DATE_INVALID;
  }

  public CatalogsFeedValidationWarnings COUNTRY_DOES_NOT_MAP_TO_CURRENCY(@Nullable Integer COUNTRY_DOES_NOT_MAP_TO_CURRENCY) {
    this.COUNTRY_DOES_NOT_MAP_TO_CURRENCY = COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
    return this;
  }

  /**
   * Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
   * @return COUNTRY_DOES_NOT_MAP_TO_CURRENCY
   */
  
  @Schema(name = "COUNTRY_DOES_NOT_MAP_TO_CURRENCY", description = "Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("COUNTRY_DOES_NOT_MAP_TO_CURRENCY")
  public @Nullable Integer getCOUNTRYDOESNOTMAPTOCURRENCY() {
    return COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
  }

  public void setCOUNTRYDOESNOTMAPTOCURRENCY(@Nullable Integer COUNTRY_DOES_NOT_MAP_TO_CURRENCY) {
    this.COUNTRY_DOES_NOT_MAP_TO_CURRENCY = COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
  }

  public CatalogsFeedValidationWarnings CUSTOM_LABEL_LENGTH_TOO_LONG(@Nullable Integer CUSTOM_LABEL_LENGTH_TOO_LONG) {
    this.CUSTOM_LABEL_LENGTH_TOO_LONG = CUSTOM_LABEL_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Some items have custom_label values that are too long, those items will be published without that custom label.
   * @return CUSTOM_LABEL_LENGTH_TOO_LONG
   */
  
  @Schema(name = "CUSTOM_LABEL_LENGTH_TOO_LONG", description = "Some items have custom_label values that are too long, those items will be published without that custom label.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CUSTOM_LABEL_LENGTH_TOO_LONG")
  public @Nullable Integer getCUSTOMLABELLENGTHTOOLONG() {
    return CUSTOM_LABEL_LENGTH_TOO_LONG;
  }

  public void setCUSTOMLABELLENGTHTOOLONG(@Nullable Integer CUSTOM_LABEL_LENGTH_TOO_LONG) {
    this.CUSTOM_LABEL_LENGTH_TOO_LONG = CUSTOM_LABEL_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings DESCRIPTION_LENGTH_TOO_LONG(@Nullable Integer DESCRIPTION_LENGTH_TOO_LONG) {
    this.DESCRIPTION_LENGTH_TOO_LONG = DESCRIPTION_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * The description for some items were truncated because they contain too many characters.
   * @return DESCRIPTION_LENGTH_TOO_LONG
   */
  
  @Schema(name = "DESCRIPTION_LENGTH_TOO_LONG", description = "The description for some items were truncated because they contain too many characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DESCRIPTION_LENGTH_TOO_LONG")
  public @Nullable Integer getDESCRIPTIONLENGTHTOOLONG() {
    return DESCRIPTION_LENGTH_TOO_LONG;
  }

  public void setDESCRIPTIONLENGTHTOOLONG(@Nullable Integer DESCRIPTION_LENGTH_TOO_LONG) {
    this.DESCRIPTION_LENGTH_TOO_LONG = DESCRIPTION_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings DUPLICATE_HEADERS(@Nullable Integer DUPLICATE_HEADERS) {
    this.DUPLICATE_HEADERS = DUPLICATE_HEADERS;
    return this;
  }

  /**
   * Your feed contains duplicate headers.
   * @return DUPLICATE_HEADERS
   */
  
  @Schema(name = "DUPLICATE_HEADERS", description = "Your feed contains duplicate headers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DUPLICATE_HEADERS")
  public @Nullable Integer getDUPLICATEHEADERS() {
    return DUPLICATE_HEADERS;
  }

  public void setDUPLICATEHEADERS(@Nullable Integer DUPLICATE_HEADERS) {
    this.DUPLICATE_HEADERS = DUPLICATE_HEADERS;
  }

  public CatalogsFeedValidationWarnings EXPIRATION_DATE_INVALID(@Nullable Integer EXPIRATION_DATE_INVALID) {
    this.EXPIRATION_DATE_INVALID = EXPIRATION_DATE_INVALID;
    return this;
  }

  /**
   * Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
   * @return EXPIRATION_DATE_INVALID
   */
  
  @Schema(name = "EXPIRATION_DATE_INVALID", description = "Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EXPIRATION_DATE_INVALID")
  public @Nullable Integer getEXPIRATIONDATEINVALID() {
    return EXPIRATION_DATE_INVALID;
  }

  public void setEXPIRATIONDATEINVALID(@Nullable Integer EXPIRATION_DATE_INVALID) {
    this.EXPIRATION_DATE_INVALID = EXPIRATION_DATE_INVALID;
  }

  public CatalogsFeedValidationWarnings FETCH_SAME_SIGNATURE(@Nullable FETCHSAMESIGNATUREEnum FETCH_SAME_SIGNATURE) {
    this.FETCH_SAME_SIGNATURE = FETCH_SAME_SIGNATURE;
    return this;
  }

  /**
   * Ingestion completed early because there are no changes to your feed since the last successful update.
   * @return FETCH_SAME_SIGNATURE
   */
  
  @Schema(name = "FETCH_SAME_SIGNATURE", description = "Ingestion completed early because there are no changes to your feed since the last successful update.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FETCH_SAME_SIGNATURE")
  public @Nullable FETCHSAMESIGNATUREEnum getFETCHSAMESIGNATURE() {
    return FETCH_SAME_SIGNATURE;
  }

  public void setFETCHSAMESIGNATURE(@Nullable FETCHSAMESIGNATUREEnum FETCH_SAME_SIGNATURE) {
    this.FETCH_SAME_SIGNATURE = FETCH_SAME_SIGNATURE;
  }

  public CatalogsFeedValidationWarnings GENDER_INVALID(@Nullable Integer GENDER_INVALID) {
    this.GENDER_INVALID = GENDER_INVALID;
    return this;
  }

  /**
   * Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
   * @return GENDER_INVALID
   */
  
  @Schema(name = "GENDER_INVALID", description = "Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GENDER_INVALID")
  public @Nullable Integer getGENDERINVALID() {
    return GENDER_INVALID;
  }

  public void setGENDERINVALID(@Nullable Integer GENDER_INVALID) {
    this.GENDER_INVALID = GENDER_INVALID;
  }

  public CatalogsFeedValidationWarnings GTIN_INVALID(@Nullable Integer GTIN_INVALID) {
    this.GTIN_INVALID = GTIN_INVALID;
    return this;
  }

  /**
   * Some items include incorrectly formatted GTINs.
   * @return GTIN_INVALID
   */
  
  @Schema(name = "GTIN_INVALID", description = "Some items include incorrectly formatted GTINs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GTIN_INVALID")
  public @Nullable Integer getGTININVALID() {
    return GTIN_INVALID;
  }

  public void setGTININVALID(@Nullable Integer GTIN_INVALID) {
    this.GTIN_INVALID = GTIN_INVALID;
  }

  public CatalogsFeedValidationWarnings IMAGE_LINK_WARNING(@Nullable Integer IMAGE_LINK_WARNING) {
    this.IMAGE_LINK_WARNING = IMAGE_LINK_WARNING;
    return this;
  }

  /**
   * Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
   * @return IMAGE_LINK_WARNING
   */
  
  @Schema(name = "IMAGE_LINK_WARNING", description = "Some items have image_link URLs that are formatted incorrectly and will not be published with those items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IMAGE_LINK_WARNING")
  public @Nullable Integer getIMAGELINKWARNING() {
    return IMAGE_LINK_WARNING;
  }

  public void setIMAGELINKWARNING(@Nullable Integer IMAGE_LINK_WARNING) {
    this.IMAGE_LINK_WARNING = IMAGE_LINK_WARNING;
  }

  public CatalogsFeedValidationWarnings INCONSISTENT_CURRENCY_VALUES(@Nullable Integer INCONSISTENT_CURRENCY_VALUES) {
    this.INCONSISTENT_CURRENCY_VALUES = INCONSISTENT_CURRENCY_VALUES;
    return this;
  }

  /**
   * Some items include inconsistent currencies in price fields.
   * @return INCONSISTENT_CURRENCY_VALUES
   */
  
  @Schema(name = "INCONSISTENT_CURRENCY_VALUES", description = "Some items include inconsistent currencies in price fields.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("INCONSISTENT_CURRENCY_VALUES")
  public @Nullable Integer getINCONSISTENTCURRENCYVALUES() {
    return INCONSISTENT_CURRENCY_VALUES;
  }

  public void setINCONSISTENTCURRENCYVALUES(@Nullable Integer INCONSISTENT_CURRENCY_VALUES) {
    this.INCONSISTENT_CURRENCY_VALUES = INCONSISTENT_CURRENCY_VALUES;
  }

  public CatalogsFeedValidationWarnings INDEXED_PRODUCT_COUNT_LARGE_DELTA(@Nullable Integer INDEXED_PRODUCT_COUNT_LARGE_DELTA) {
    this.INDEXED_PRODUCT_COUNT_LARGE_DELTA = INDEXED_PRODUCT_COUNT_LARGE_DELTA;
    return this;
  }

  /**
   * The product count has increased or decreased significantly compared to the last successful ingestion.
   * @return INDEXED_PRODUCT_COUNT_LARGE_DELTA
   */
  
  @Schema(name = "INDEXED_PRODUCT_COUNT_LARGE_DELTA", description = "The product count has increased or decreased significantly compared to the last successful ingestion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("INDEXED_PRODUCT_COUNT_LARGE_DELTA")
  public @Nullable Integer getINDEXEDPRODUCTCOUNTLARGEDELTA() {
    return INDEXED_PRODUCT_COUNT_LARGE_DELTA;
  }

  public void setINDEXEDPRODUCTCOUNTLARGEDELTA(@Nullable Integer INDEXED_PRODUCT_COUNT_LARGE_DELTA) {
    this.INDEXED_PRODUCT_COUNT_LARGE_DELTA = INDEXED_PRODUCT_COUNT_LARGE_DELTA;
  }

  public CatalogsFeedValidationWarnings IOS_DEEP_LINK_INVALID(@Nullable Integer IOS_DEEP_LINK_INVALID) {
    this.IOS_DEEP_LINK_INVALID = IOS_DEEP_LINK_INVALID;
    return this;
  }

  /**
   * Some items include invalid ios_deep_link values.
   * @return IOS_DEEP_LINK_INVALID
   */
  
  @Schema(name = "IOS_DEEP_LINK_INVALID", description = "Some items include invalid ios_deep_link values.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IOS_DEEP_LINK_INVALID")
  public @Nullable Integer getIOSDEEPLINKINVALID() {
    return IOS_DEEP_LINK_INVALID;
  }

  public void setIOSDEEPLINKINVALID(@Nullable Integer IOS_DEEP_LINK_INVALID) {
    this.IOS_DEEP_LINK_INVALID = IOS_DEEP_LINK_INVALID;
  }

  public CatalogsFeedValidationWarnings IS_BUNDLE_INVALID(@Nullable Integer IS_BUNDLE_INVALID) {
    this.IS_BUNDLE_INVALID = IS_BUNDLE_INVALID;
    return this;
  }

  /**
   * Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
   * @return IS_BUNDLE_INVALID
   */
  
  @Schema(name = "IS_BUNDLE_INVALID", description = "Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IS_BUNDLE_INVALID")
  public @Nullable Integer getISBUNDLEINVALID() {
    return IS_BUNDLE_INVALID;
  }

  public void setISBUNDLEINVALID(@Nullable Integer IS_BUNDLE_INVALID) {
    this.IS_BUNDLE_INVALID = IS_BUNDLE_INVALID;
  }

  public CatalogsFeedValidationWarnings ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE(@Nullable Integer ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE = ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
    return this;
  }

  /**
   * Some items include additional_image_links that can't be found.
   * @return ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE
   */
  
  @Schema(name = "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", description = "Some items include additional_image_links that can't be found.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE")
  public @Nullable Integer getITEMADDITIONALIMAGEDOWNLOADFAILURE() {
    return ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
  }

  public void setITEMADDITIONALIMAGEDOWNLOADFAILURE(@Nullable Integer ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE = ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
  }

  public CatalogsFeedValidationWarnings LINK_FORMAT_WARNING(@Nullable Integer LINK_FORMAT_WARNING) {
    this.LINK_FORMAT_WARNING = LINK_FORMAT_WARNING;
    return this;
  }

  /**
   * Some items have an invalid product link which contains invalid UTM tracking paramaters.
   * @return LINK_FORMAT_WARNING
   */
  
  @Schema(name = "LINK_FORMAT_WARNING", description = "Some items have an invalid product link which contains invalid UTM tracking paramaters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LINK_FORMAT_WARNING")
  public @Nullable Integer getLINKFORMATWARNING() {
    return LINK_FORMAT_WARNING;
  }

  public void setLINKFORMATWARNING(@Nullable Integer LINK_FORMAT_WARNING) {
    this.LINK_FORMAT_WARNING = LINK_FORMAT_WARNING;
  }

  public CatalogsFeedValidationWarnings MIN_AD_PRICE_INVALID(@Nullable Integer MIN_AD_PRICE_INVALID) {
    this.MIN_AD_PRICE_INVALID = MIN_AD_PRICE_INVALID;
    return this;
  }

  /**
   * Some items include min_ad_price values that are formatted incorrectly.
   * @return MIN_AD_PRICE_INVALID
   */
  
  @Schema(name = "MIN_AD_PRICE_INVALID", description = "Some items include min_ad_price values that are formatted incorrectly.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MIN_AD_PRICE_INVALID")
  public @Nullable Integer getMINADPRICEINVALID() {
    return MIN_AD_PRICE_INVALID;
  }

  public void setMINADPRICEINVALID(@Nullable Integer MIN_AD_PRICE_INVALID) {
    this.MIN_AD_PRICE_INVALID = MIN_AD_PRICE_INVALID;
  }

  public CatalogsFeedValidationWarnings MPN_INVALID(@Nullable Integer MPN_INVALID) {
    this.MPN_INVALID = MPN_INVALID;
    return this;
  }

  /**
   * Some items include incorrectly formatted MPNs.
   * @return MPN_INVALID
   */
  
  @Schema(name = "MPN_INVALID", description = "Some items include incorrectly formatted MPNs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MPN_INVALID")
  public @Nullable Integer getMPNINVALID() {
    return MPN_INVALID;
  }

  public void setMPNINVALID(@Nullable Integer MPN_INVALID) {
    this.MPN_INVALID = MPN_INVALID;
  }

  public CatalogsFeedValidationWarnings MULTIPACK_INVALID(@Nullable Integer MULTIPACK_INVALID) {
    this.MULTIPACK_INVALID = MULTIPACK_INVALID;
    return this;
  }

  /**
   * Some items have invalid multipack values.
   * @return MULTIPACK_INVALID
   */
  
  @Schema(name = "MULTIPACK_INVALID", description = "Some items have invalid multipack values.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MULTIPACK_INVALID")
  public @Nullable Integer getMULTIPACKINVALID() {
    return MULTIPACK_INVALID;
  }

  public void setMULTIPACKINVALID(@Nullable Integer MULTIPACK_INVALID) {
    this.MULTIPACK_INVALID = MULTIPACK_INVALID;
  }

  public CatalogsFeedValidationWarnings OPTIONAL_CONDITION_INVALID(@Nullable Integer OPTIONAL_CONDITION_INVALID) {
    this.OPTIONAL_CONDITION_INVALID = OPTIONAL_CONDITION_INVALID;
    return this;
  }

  /**
   * Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
   * @return OPTIONAL_CONDITION_INVALID
   */
  
  @Schema(name = "OPTIONAL_CONDITION_INVALID", description = "Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OPTIONAL_CONDITION_INVALID")
  public @Nullable Integer getOPTIONALCONDITIONINVALID() {
    return OPTIONAL_CONDITION_INVALID;
  }

  public void setOPTIONALCONDITIONINVALID(@Nullable Integer OPTIONAL_CONDITION_INVALID) {
    this.OPTIONAL_CONDITION_INVALID = OPTIONAL_CONDITION_INVALID;
  }

  public CatalogsFeedValidationWarnings OPTIONAL_CONDITION_MISSING(@Nullable Integer OPTIONAL_CONDITION_MISSING) {
    this.OPTIONAL_CONDITION_MISSING = OPTIONAL_CONDITION_MISSING;
    return this;
  }

  /**
   * Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
   * @return OPTIONAL_CONDITION_MISSING
   */
  
  @Schema(name = "OPTIONAL_CONDITION_MISSING", description = "Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OPTIONAL_CONDITION_MISSING")
  public @Nullable Integer getOPTIONALCONDITIONMISSING() {
    return OPTIONAL_CONDITION_MISSING;
  }

  public void setOPTIONALCONDITIONMISSING(@Nullable Integer OPTIONAL_CONDITION_MISSING) {
    this.OPTIONAL_CONDITION_MISSING = OPTIONAL_CONDITION_MISSING;
  }

  public CatalogsFeedValidationWarnings OPTIONAL_PRODUCT_CATEGORY_INVALID(@Nullable Integer OPTIONAL_PRODUCT_CATEGORY_INVALID) {
    this.OPTIONAL_PRODUCT_CATEGORY_INVALID = OPTIONAL_PRODUCT_CATEGORY_INVALID;
    return this;
  }

  /**
   * Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
   * @return OPTIONAL_PRODUCT_CATEGORY_INVALID
   */
  
  @Schema(name = "OPTIONAL_PRODUCT_CATEGORY_INVALID", description = "Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OPTIONAL_PRODUCT_CATEGORY_INVALID")
  public @Nullable Integer getOPTIONALPRODUCTCATEGORYINVALID() {
    return OPTIONAL_PRODUCT_CATEGORY_INVALID;
  }

  public void setOPTIONALPRODUCTCATEGORYINVALID(@Nullable Integer OPTIONAL_PRODUCT_CATEGORY_INVALID) {
    this.OPTIONAL_PRODUCT_CATEGORY_INVALID = OPTIONAL_PRODUCT_CATEGORY_INVALID;
  }

  public CatalogsFeedValidationWarnings OPTIONAL_PRODUCT_CATEGORY_MISSING(@Nullable Integer OPTIONAL_PRODUCT_CATEGORY_MISSING) {
    this.OPTIONAL_PRODUCT_CATEGORY_MISSING = OPTIONAL_PRODUCT_CATEGORY_MISSING;
    return this;
  }

  /**
   * Some items are missing a google_product_category.
   * @return OPTIONAL_PRODUCT_CATEGORY_MISSING
   */
  
  @Schema(name = "OPTIONAL_PRODUCT_CATEGORY_MISSING", description = "Some items are missing a google_product_category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OPTIONAL_PRODUCT_CATEGORY_MISSING")
  public @Nullable Integer getOPTIONALPRODUCTCATEGORYMISSING() {
    return OPTIONAL_PRODUCT_CATEGORY_MISSING;
  }

  public void setOPTIONALPRODUCTCATEGORYMISSING(@Nullable Integer OPTIONAL_PRODUCT_CATEGORY_MISSING) {
    this.OPTIONAL_PRODUCT_CATEGORY_MISSING = OPTIONAL_PRODUCT_CATEGORY_MISSING;
  }

  public CatalogsFeedValidationWarnings PRODUCT_CATEGORY_DEPTH_WARNING(@Nullable Integer PRODUCT_CATEGORY_DEPTH_WARNING) {
    this.PRODUCT_CATEGORY_DEPTH_WARNING = PRODUCT_CATEGORY_DEPTH_WARNING;
    return this;
  }

  /**
   * Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
   * @return PRODUCT_CATEGORY_DEPTH_WARNING
   */
  
  @Schema(name = "PRODUCT_CATEGORY_DEPTH_WARNING", description = "Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PRODUCT_CATEGORY_DEPTH_WARNING")
  public @Nullable Integer getPRODUCTCATEGORYDEPTHWARNING() {
    return PRODUCT_CATEGORY_DEPTH_WARNING;
  }

  public void setPRODUCTCATEGORYDEPTHWARNING(@Nullable Integer PRODUCT_CATEGORY_DEPTH_WARNING) {
    this.PRODUCT_CATEGORY_DEPTH_WARNING = PRODUCT_CATEGORY_DEPTH_WARNING;
  }

  public CatalogsFeedValidationWarnings PRODUCT_TYPE_LENGTH_TOO_LONG(@Nullable Integer PRODUCT_TYPE_LENGTH_TOO_LONG) {
    this.PRODUCT_TYPE_LENGTH_TOO_LONG = PRODUCT_TYPE_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Some items have product_type values that are too long, those items will be published without that product type.
   * @return PRODUCT_TYPE_LENGTH_TOO_LONG
   */
  
  @Schema(name = "PRODUCT_TYPE_LENGTH_TOO_LONG", description = "Some items have product_type values that are too long, those items will be published without that product type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PRODUCT_TYPE_LENGTH_TOO_LONG")
  public @Nullable Integer getPRODUCTTYPELENGTHTOOLONG() {
    return PRODUCT_TYPE_LENGTH_TOO_LONG;
  }

  public void setPRODUCTTYPELENGTHTOOLONG(@Nullable Integer PRODUCT_TYPE_LENGTH_TOO_LONG) {
    this.PRODUCT_TYPE_LENGTH_TOO_LONG = PRODUCT_TYPE_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings SALE_DATE_INVALID(@Nullable Integer SALE_DATE_INVALID) {
    this.SALE_DATE_INVALID = SALE_DATE_INVALID;
    return this;
  }

  /**
   * Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
   * @return SALE_DATE_INVALID
   */
  
  @Schema(name = "SALE_DATE_INVALID", description = "Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SALE_DATE_INVALID")
  public @Nullable Integer getSALEDATEINVALID() {
    return SALE_DATE_INVALID;
  }

  public void setSALEDATEINVALID(@Nullable Integer SALE_DATE_INVALID) {
    this.SALE_DATE_INVALID = SALE_DATE_INVALID;
  }

  public CatalogsFeedValidationWarnings SALES_PRICE_INVALID(@Nullable Integer SALES_PRICE_INVALID) {
    this.SALES_PRICE_INVALID = SALES_PRICE_INVALID;
    return this;
  }

  /**
   * Some items have sale price values that are higher than the original price of the item.
   * @return SALES_PRICE_INVALID
   */
  
  @Schema(name = "SALES_PRICE_INVALID", description = "Some items have sale price values that are higher than the original price of the item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SALES_PRICE_INVALID")
  public @Nullable Integer getSALESPRICEINVALID() {
    return SALES_PRICE_INVALID;
  }

  public void setSALESPRICEINVALID(@Nullable Integer SALES_PRICE_INVALID) {
    this.SALES_PRICE_INVALID = SALES_PRICE_INVALID;
  }

  public CatalogsFeedValidationWarnings SALES_PRICE_TOO_HIGH(@Nullable Integer SALES_PRICE_TOO_HIGH) {
    this.SALES_PRICE_TOO_HIGH = SALES_PRICE_TOO_HIGH;
    return this;
  }

  /**
   * Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
   * @return SALES_PRICE_TOO_HIGH
   */
  
  @Schema(name = "SALES_PRICE_TOO_HIGH", description = "Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SALES_PRICE_TOO_HIGH")
  public @Nullable Integer getSALESPRICETOOHIGH() {
    return SALES_PRICE_TOO_HIGH;
  }

  public void setSALESPRICETOOHIGH(@Nullable Integer SALES_PRICE_TOO_HIGH) {
    this.SALES_PRICE_TOO_HIGH = SALES_PRICE_TOO_HIGH;
  }

  public CatalogsFeedValidationWarnings SALES_PRICE_TOO_LOW(@Nullable Integer SALES_PRICE_TOO_LOW) {
    this.SALES_PRICE_TOO_LOW = SALES_PRICE_TOO_LOW;
    return this;
  }

  /**
   * Some items include sales price that is much lower than the list price.
   * @return SALES_PRICE_TOO_LOW
   */
  
  @Schema(name = "SALES_PRICE_TOO_LOW", description = "Some items include sales price that is much lower than the list price.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SALES_PRICE_TOO_LOW")
  public @Nullable Integer getSALESPRICETOOLOW() {
    return SALES_PRICE_TOO_LOW;
  }

  public void setSALESPRICETOOLOW(@Nullable Integer SALES_PRICE_TOO_LOW) {
    this.SALES_PRICE_TOO_LOW = SALES_PRICE_TOO_LOW;
  }

  public CatalogsFeedValidationWarnings SHIPPING_HEIGHT_INVALID(@Nullable Integer SHIPPING_HEIGHT_INVALID) {
    this.SHIPPING_HEIGHT_INVALID = SHIPPING_HEIGHT_INVALID;
    return this;
  }

  /**
   * Some items include incorrectly formatted shipping_height.
   * @return SHIPPING_HEIGHT_INVALID
   */
  
  @Schema(name = "SHIPPING_HEIGHT_INVALID", description = "Some items include incorrectly formatted shipping_height.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SHIPPING_HEIGHT_INVALID")
  public @Nullable Integer getSHIPPINGHEIGHTINVALID() {
    return SHIPPING_HEIGHT_INVALID;
  }

  public void setSHIPPINGHEIGHTINVALID(@Nullable Integer SHIPPING_HEIGHT_INVALID) {
    this.SHIPPING_HEIGHT_INVALID = SHIPPING_HEIGHT_INVALID;
  }

  public CatalogsFeedValidationWarnings SHIPPING_INVALID(@Nullable Integer SHIPPING_INVALID) {
    this.SHIPPING_INVALID = SHIPPING_INVALID;
    return this;
  }

  /**
   * Some items have shipping values that are formatted incorrectly.
   * @return SHIPPING_INVALID
   */
  
  @Schema(name = "SHIPPING_INVALID", description = "Some items have shipping values that are formatted incorrectly.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SHIPPING_INVALID")
  public @Nullable Integer getSHIPPINGINVALID() {
    return SHIPPING_INVALID;
  }

  public void setSHIPPINGINVALID(@Nullable Integer SHIPPING_INVALID) {
    this.SHIPPING_INVALID = SHIPPING_INVALID;
  }

  public CatalogsFeedValidationWarnings SHIPPING_WEIGHT_INVALID(@Nullable Integer SHIPPING_WEIGHT_INVALID) {
    this.SHIPPING_WEIGHT_INVALID = SHIPPING_WEIGHT_INVALID;
    return this;
  }

  /**
   * Some items have invalid shipping_weight values.
   * @return SHIPPING_WEIGHT_INVALID
   */
  
  @Schema(name = "SHIPPING_WEIGHT_INVALID", description = "Some items have invalid shipping_weight values.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SHIPPING_WEIGHT_INVALID")
  public @Nullable Integer getSHIPPINGWEIGHTINVALID() {
    return SHIPPING_WEIGHT_INVALID;
  }

  public void setSHIPPINGWEIGHTINVALID(@Nullable Integer SHIPPING_WEIGHT_INVALID) {
    this.SHIPPING_WEIGHT_INVALID = SHIPPING_WEIGHT_INVALID;
  }

  public CatalogsFeedValidationWarnings SHIPPING_WIDTH_INVALID(@Nullable Integer SHIPPING_WIDTH_INVALID) {
    this.SHIPPING_WIDTH_INVALID = SHIPPING_WIDTH_INVALID;
    return this;
  }

  /**
   * Some items include incorrectly formatted shipping_width.
   * @return SHIPPING_WIDTH_INVALID
   */
  
  @Schema(name = "SHIPPING_WIDTH_INVALID", description = "Some items include incorrectly formatted shipping_width.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SHIPPING_WIDTH_INVALID")
  public @Nullable Integer getSHIPPINGWIDTHINVALID() {
    return SHIPPING_WIDTH_INVALID;
  }

  public void setSHIPPINGWIDTHINVALID(@Nullable Integer SHIPPING_WIDTH_INVALID) {
    this.SHIPPING_WIDTH_INVALID = SHIPPING_WIDTH_INVALID;
  }

  public CatalogsFeedValidationWarnings SIZE_SYSTEM_INVALID(@Nullable Integer SIZE_SYSTEM_INVALID) {
    this.SIZE_SYSTEM_INVALID = SIZE_SYSTEM_INVALID;
    return this;
  }

  /**
   * Some items have size system values which are not one of the supported size systems.
   * @return SIZE_SYSTEM_INVALID
   */
  
  @Schema(name = "SIZE_SYSTEM_INVALID", description = "Some items have size system values which are not one of the supported size systems.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SIZE_SYSTEM_INVALID")
  public @Nullable Integer getSIZESYSTEMINVALID() {
    return SIZE_SYSTEM_INVALID;
  }

  public void setSIZESYSTEMINVALID(@Nullable Integer SIZE_SYSTEM_INVALID) {
    this.SIZE_SYSTEM_INVALID = SIZE_SYSTEM_INVALID;
  }

  public CatalogsFeedValidationWarnings SIZE_TYPE_INVALID(@Nullable Integer SIZE_TYPE_INVALID) {
    this.SIZE_TYPE_INVALID = SIZE_TYPE_INVALID;
    return this;
  }

  /**
   * Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
   * @return SIZE_TYPE_INVALID
   */
  
  @Schema(name = "SIZE_TYPE_INVALID", description = "Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SIZE_TYPE_INVALID")
  public @Nullable Integer getSIZETYPEINVALID() {
    return SIZE_TYPE_INVALID;
  }

  public void setSIZETYPEINVALID(@Nullable Integer SIZE_TYPE_INVALID) {
    this.SIZE_TYPE_INVALID = SIZE_TYPE_INVALID;
  }

  public CatalogsFeedValidationWarnings TAX_INVALID(@Nullable Integer TAX_INVALID) {
    this.TAX_INVALID = TAX_INVALID;
    return this;
  }

  /**
   * Some items have tax values that are formatted incorrectly.
   * @return TAX_INVALID
   */
  
  @Schema(name = "TAX_INVALID", description = "Some items have tax values that are formatted incorrectly.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TAX_INVALID")
  public @Nullable Integer getTAXINVALID() {
    return TAX_INVALID;
  }

  public void setTAXINVALID(@Nullable Integer TAX_INVALID) {
    this.TAX_INVALID = TAX_INVALID;
  }

  public CatalogsFeedValidationWarnings TITLE_LENGTH_TOO_LONG(@Nullable Integer TITLE_LENGTH_TOO_LONG) {
    this.TITLE_LENGTH_TOO_LONG = TITLE_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * The title for some items were truncated because they contain too many characters.
   * @return TITLE_LENGTH_TOO_LONG
   */
  
  @Schema(name = "TITLE_LENGTH_TOO_LONG", description = "The title for some items were truncated because they contain too many characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TITLE_LENGTH_TOO_LONG")
  public @Nullable Integer getTITLELENGTHTOOLONG() {
    return TITLE_LENGTH_TOO_LONG;
  }

  public void setTITLELENGTHTOOLONG(@Nullable Integer TITLE_LENGTH_TOO_LONG) {
    this.TITLE_LENGTH_TOO_LONG = TITLE_LENGTH_TOO_LONG;
  }

  public CatalogsFeedValidationWarnings TOO_MANY_ADDITIONAL_IMAGE_LINKS(@Nullable Integer TOO_MANY_ADDITIONAL_IMAGE_LINKS) {
    this.TOO_MANY_ADDITIONAL_IMAGE_LINKS = TOO_MANY_ADDITIONAL_IMAGE_LINKS;
    return this;
  }

  /**
   * Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
   * @return TOO_MANY_ADDITIONAL_IMAGE_LINKS
   */
  
  @Schema(name = "TOO_MANY_ADDITIONAL_IMAGE_LINKS", description = "Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TOO_MANY_ADDITIONAL_IMAGE_LINKS")
  public @Nullable Integer getTOOMANYADDITIONALIMAGELINKS() {
    return TOO_MANY_ADDITIONAL_IMAGE_LINKS;
  }

  public void setTOOMANYADDITIONALIMAGELINKS(@Nullable Integer TOO_MANY_ADDITIONAL_IMAGE_LINKS) {
    this.TOO_MANY_ADDITIONAL_IMAGE_LINKS = TOO_MANY_ADDITIONAL_IMAGE_LINKS;
  }

  public CatalogsFeedValidationWarnings UPDATED_TIME_INVALID(@Nullable Integer UPDATED_TIME_INVALID) {
    this.UPDATED_TIME_INVALID = UPDATED_TIME_INVALID;
    return this;
  }

  /**
   * Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
   * @return UPDATED_TIME_INVALID
   */
  
  @Schema(name = "UPDATED_TIME_INVALID", description = "Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UPDATED_TIME_INVALID")
  public @Nullable Integer getUPDATEDTIMEINVALID() {
    return UPDATED_TIME_INVALID;
  }

  public void setUPDATEDTIMEINVALID(@Nullable Integer UPDATED_TIME_INVALID) {
    this.UPDATED_TIME_INVALID = UPDATED_TIME_INVALID;
  }

  public CatalogsFeedValidationWarnings UTM_SOURCE_AUTO_CORRECTED(@Nullable Integer UTM_SOURCE_AUTO_CORRECTED) {
    this.UTM_SOURCE_AUTO_CORRECTED = UTM_SOURCE_AUTO_CORRECTED;
    return this;
  }

  /**
   * Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
   * @return UTM_SOURCE_AUTO_CORRECTED
   */
  
  @Schema(name = "UTM_SOURCE_AUTO_CORRECTED", description = "Some items include utm_source values that are formatted incorrectly and have been automatically corrected.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UTM_SOURCE_AUTO_CORRECTED")
  public @Nullable Integer getUTMSOURCEAUTOCORRECTED() {
    return UTM_SOURCE_AUTO_CORRECTED;
  }

  public void setUTMSOURCEAUTOCORRECTED(@Nullable Integer UTM_SOURCE_AUTO_CORRECTED) {
    this.UTM_SOURCE_AUTO_CORRECTED = UTM_SOURCE_AUTO_CORRECTED;
  }

  public CatalogsFeedValidationWarnings VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED(@Nullable Integer VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED) {
    this.VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED = VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED;
    return this;
  }

  /**
   * A video is required in the item when ad_video fields are provided.
   * @return VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED
   */
  
  @Schema(name = "VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED", description = "A video is required in the item when ad_video fields are provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED")
  public @Nullable Integer getVIDEOREQUIREDWHENADVIDEOPROVIDED() {
    return VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED;
  }

  public void setVIDEOREQUIREDWHENADVIDEOPROVIDED(@Nullable Integer VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED) {
    this.VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED = VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED;
  }

  public CatalogsFeedValidationWarnings WEIGHT_UNIT_INVALID(@Nullable Integer WEIGHT_UNIT_INVALID) {
    this.WEIGHT_UNIT_INVALID = WEIGHT_UNIT_INVALID;
    return this;
  }

  /**
   * Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
   * @return WEIGHT_UNIT_INVALID
   */
  
  @Schema(name = "WEIGHT_UNIT_INVALID", description = "Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WEIGHT_UNIT_INVALID")
  public @Nullable Integer getWEIGHTUNITINVALID() {
    return WEIGHT_UNIT_INVALID;
  }

  public void setWEIGHTUNITINVALID(@Nullable Integer WEIGHT_UNIT_INVALID) {
    this.WEIGHT_UNIT_INVALID = WEIGHT_UNIT_INVALID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedValidationWarnings catalogsFeedValidationWarnings = (CatalogsFeedValidationWarnings) o;
    return Objects.equals(this.AD_IMAGE_0_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_0_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_0_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_0_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_0_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_0_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_0_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_0_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_0_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_0_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_0_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_0_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_0_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_0_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_10_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_10_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_10_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_10_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_10_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_10_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_10_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_10_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_10_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_10_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_10_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_10_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_10_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_10_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_11_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_11_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_11_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_11_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_11_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_11_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_11_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_11_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_11_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_11_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_11_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_11_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_11_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_11_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_12_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_12_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_12_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_12_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_12_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_12_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_12_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_12_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_12_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_12_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_12_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_12_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_12_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_12_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_13_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_13_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_13_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_13_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_13_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_13_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_13_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_13_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_13_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_13_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_13_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_13_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_13_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_13_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_14_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_14_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_14_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_14_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_14_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_14_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_14_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_14_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_14_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_14_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_14_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_14_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_14_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_14_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_15_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_15_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_15_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_15_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_15_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_15_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_15_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_15_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_15_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_15_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_15_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_15_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_15_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_15_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_16_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_16_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_16_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_16_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_16_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_16_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_16_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_16_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_16_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_16_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_16_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_16_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_16_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_16_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_17_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_17_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_17_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_17_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_17_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_17_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_17_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_17_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_17_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_17_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_17_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_17_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_17_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_17_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_18_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_18_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_18_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_18_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_18_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_18_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_18_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_18_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_18_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_18_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_18_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_18_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_18_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_18_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_19_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_19_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_19_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_19_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_19_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_19_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_19_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_19_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_19_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_19_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_19_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_19_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_19_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_19_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_1_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_1_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_1_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_1_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_1_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_1_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_1_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_1_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_1_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_1_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_1_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_1_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_1_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_1_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_2_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_2_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_2_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_2_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_2_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_2_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_2_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_2_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_2_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_2_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_2_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_2_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_2_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_2_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_3_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_3_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_3_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_3_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_3_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_3_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_3_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_3_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_3_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_3_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_3_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_3_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_3_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_3_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_4_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_4_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_4_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_4_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_4_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_4_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_4_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_4_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_4_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_4_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_4_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_4_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_4_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_4_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_5_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_5_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_5_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_5_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_5_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_5_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_5_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_5_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_5_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_5_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_5_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_5_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_5_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_5_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_6_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_6_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_6_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_6_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_6_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_6_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_6_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_6_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_6_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_6_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_6_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_6_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_6_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_6_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_7_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_7_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_7_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_7_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_7_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_7_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_7_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_7_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_7_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_7_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_7_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_7_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_7_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_7_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_8_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_8_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_8_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_8_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_8_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_8_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_8_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_8_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_8_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_8_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_8_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_8_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_8_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_8_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_9_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_9_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_9_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_9_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_9_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_9_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_9_LINK_WARNING, catalogsFeedValidationWarnings.AD_IMAGE_9_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_9_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_IMAGE_9_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_9_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_IMAGE_9_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_9_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_IMAGE_9_TAG_REQUIRED) &&
        Objects.equals(this.AD_LINK_FORMAT_WARNING, catalogsFeedValidationWarnings.AD_LINK_FORMAT_WARNING) &&
        Objects.equals(this.AD_LINK_SAME_AS_LINK, catalogsFeedValidationWarnings.AD_LINK_SAME_AS_LINK) &&
        Objects.equals(this.AD_VIDEO_0_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_VIDEO_0_LINK_DUPLICATED) &&
        Objects.equals(this.AD_VIDEO_0_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_VIDEO_0_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_VIDEO_0_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_VIDEO_0_LINK_REQUIRED) &&
        Objects.equals(this.AD_VIDEO_0_LINK_WARNING, catalogsFeedValidationWarnings.AD_VIDEO_0_LINK_WARNING) &&
        Objects.equals(this.AD_VIDEO_0_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_VIDEO_0_TAG_DUPLICATED) &&
        Objects.equals(this.AD_VIDEO_0_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_VIDEO_0_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_VIDEO_0_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_VIDEO_0_TAG_REQUIRED) &&
        Objects.equals(this.AD_VIDEO_1_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_VIDEO_1_LINK_DUPLICATED) &&
        Objects.equals(this.AD_VIDEO_1_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_VIDEO_1_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_VIDEO_1_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_VIDEO_1_LINK_REQUIRED) &&
        Objects.equals(this.AD_VIDEO_1_LINK_WARNING, catalogsFeedValidationWarnings.AD_VIDEO_1_LINK_WARNING) &&
        Objects.equals(this.AD_VIDEO_1_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_VIDEO_1_TAG_DUPLICATED) &&
        Objects.equals(this.AD_VIDEO_1_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_VIDEO_1_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_VIDEO_1_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_VIDEO_1_TAG_REQUIRED) &&
        Objects.equals(this.AD_VIDEO_2_LINK_DUPLICATED, catalogsFeedValidationWarnings.AD_VIDEO_2_LINK_DUPLICATED) &&
        Objects.equals(this.AD_VIDEO_2_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_VIDEO_2_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_VIDEO_2_LINK_REQUIRED, catalogsFeedValidationWarnings.AD_VIDEO_2_LINK_REQUIRED) &&
        Objects.equals(this.AD_VIDEO_2_LINK_WARNING, catalogsFeedValidationWarnings.AD_VIDEO_2_LINK_WARNING) &&
        Objects.equals(this.AD_VIDEO_2_TAG_DUPLICATED, catalogsFeedValidationWarnings.AD_VIDEO_2_TAG_DUPLICATED) &&
        Objects.equals(this.AD_VIDEO_2_TAG_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.AD_VIDEO_2_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_VIDEO_2_TAG_REQUIRED, catalogsFeedValidationWarnings.AD_VIDEO_2_TAG_REQUIRED) &&
        Objects.equals(this.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.ADDITIONAL_IMAGE_LINK_WARNING, catalogsFeedValidationWarnings.ADDITIONAL_IMAGE_LINK_WARNING) &&
        Objects.equals(this.ADWORDS_FORMAT_WARNING, catalogsFeedValidationWarnings.ADWORDS_FORMAT_WARNING) &&
        Objects.equals(this.ADWORDS_SAME_AS_LINK, catalogsFeedValidationWarnings.ADWORDS_SAME_AS_LINK) &&
        Objects.equals(this.AGE_GROUP_INVALID, catalogsFeedValidationWarnings.AGE_GROUP_INVALID) &&
        Objects.equals(this.ANDROID_DEEP_LINK_INVALID, catalogsFeedValidationWarnings.ANDROID_DEEP_LINK_INVALID) &&
        Objects.equals(this.AVAILABILITY_DATE_INVALID, catalogsFeedValidationWarnings.AVAILABILITY_DATE_INVALID) &&
        Objects.equals(this.COUNTRY_DOES_NOT_MAP_TO_CURRENCY, catalogsFeedValidationWarnings.COUNTRY_DOES_NOT_MAP_TO_CURRENCY) &&
        Objects.equals(this.CUSTOM_LABEL_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.CUSTOM_LABEL_LENGTH_TOO_LONG) &&
        Objects.equals(this.DESCRIPTION_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.DESCRIPTION_LENGTH_TOO_LONG) &&
        Objects.equals(this.DUPLICATE_HEADERS, catalogsFeedValidationWarnings.DUPLICATE_HEADERS) &&
        Objects.equals(this.EXPIRATION_DATE_INVALID, catalogsFeedValidationWarnings.EXPIRATION_DATE_INVALID) &&
        Objects.equals(this.FETCH_SAME_SIGNATURE, catalogsFeedValidationWarnings.FETCH_SAME_SIGNATURE) &&
        Objects.equals(this.GENDER_INVALID, catalogsFeedValidationWarnings.GENDER_INVALID) &&
        Objects.equals(this.GTIN_INVALID, catalogsFeedValidationWarnings.GTIN_INVALID) &&
        Objects.equals(this.IMAGE_LINK_WARNING, catalogsFeedValidationWarnings.IMAGE_LINK_WARNING) &&
        Objects.equals(this.INCONSISTENT_CURRENCY_VALUES, catalogsFeedValidationWarnings.INCONSISTENT_CURRENCY_VALUES) &&
        Objects.equals(this.INDEXED_PRODUCT_COUNT_LARGE_DELTA, catalogsFeedValidationWarnings.INDEXED_PRODUCT_COUNT_LARGE_DELTA) &&
        Objects.equals(this.IOS_DEEP_LINK_INVALID, catalogsFeedValidationWarnings.IOS_DEEP_LINK_INVALID) &&
        Objects.equals(this.IS_BUNDLE_INVALID, catalogsFeedValidationWarnings.IS_BUNDLE_INVALID) &&
        Objects.equals(this.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, catalogsFeedValidationWarnings.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE) &&
        Objects.equals(this.LINK_FORMAT_WARNING, catalogsFeedValidationWarnings.LINK_FORMAT_WARNING) &&
        Objects.equals(this.MIN_AD_PRICE_INVALID, catalogsFeedValidationWarnings.MIN_AD_PRICE_INVALID) &&
        Objects.equals(this.MPN_INVALID, catalogsFeedValidationWarnings.MPN_INVALID) &&
        Objects.equals(this.MULTIPACK_INVALID, catalogsFeedValidationWarnings.MULTIPACK_INVALID) &&
        Objects.equals(this.OPTIONAL_CONDITION_INVALID, catalogsFeedValidationWarnings.OPTIONAL_CONDITION_INVALID) &&
        Objects.equals(this.OPTIONAL_CONDITION_MISSING, catalogsFeedValidationWarnings.OPTIONAL_CONDITION_MISSING) &&
        Objects.equals(this.OPTIONAL_PRODUCT_CATEGORY_INVALID, catalogsFeedValidationWarnings.OPTIONAL_PRODUCT_CATEGORY_INVALID) &&
        Objects.equals(this.OPTIONAL_PRODUCT_CATEGORY_MISSING, catalogsFeedValidationWarnings.OPTIONAL_PRODUCT_CATEGORY_MISSING) &&
        Objects.equals(this.PRODUCT_CATEGORY_DEPTH_WARNING, catalogsFeedValidationWarnings.PRODUCT_CATEGORY_DEPTH_WARNING) &&
        Objects.equals(this.PRODUCT_TYPE_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.PRODUCT_TYPE_LENGTH_TOO_LONG) &&
        Objects.equals(this.SALE_DATE_INVALID, catalogsFeedValidationWarnings.SALE_DATE_INVALID) &&
        Objects.equals(this.SALES_PRICE_INVALID, catalogsFeedValidationWarnings.SALES_PRICE_INVALID) &&
        Objects.equals(this.SALES_PRICE_TOO_HIGH, catalogsFeedValidationWarnings.SALES_PRICE_TOO_HIGH) &&
        Objects.equals(this.SALES_PRICE_TOO_LOW, catalogsFeedValidationWarnings.SALES_PRICE_TOO_LOW) &&
        Objects.equals(this.SHIPPING_HEIGHT_INVALID, catalogsFeedValidationWarnings.SHIPPING_HEIGHT_INVALID) &&
        Objects.equals(this.SHIPPING_INVALID, catalogsFeedValidationWarnings.SHIPPING_INVALID) &&
        Objects.equals(this.SHIPPING_WEIGHT_INVALID, catalogsFeedValidationWarnings.SHIPPING_WEIGHT_INVALID) &&
        Objects.equals(this.SHIPPING_WIDTH_INVALID, catalogsFeedValidationWarnings.SHIPPING_WIDTH_INVALID) &&
        Objects.equals(this.SIZE_SYSTEM_INVALID, catalogsFeedValidationWarnings.SIZE_SYSTEM_INVALID) &&
        Objects.equals(this.SIZE_TYPE_INVALID, catalogsFeedValidationWarnings.SIZE_TYPE_INVALID) &&
        Objects.equals(this.TAX_INVALID, catalogsFeedValidationWarnings.TAX_INVALID) &&
        Objects.equals(this.TITLE_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.TITLE_LENGTH_TOO_LONG) &&
        Objects.equals(this.TOO_MANY_ADDITIONAL_IMAGE_LINKS, catalogsFeedValidationWarnings.TOO_MANY_ADDITIONAL_IMAGE_LINKS) &&
        Objects.equals(this.UPDATED_TIME_INVALID, catalogsFeedValidationWarnings.UPDATED_TIME_INVALID) &&
        Objects.equals(this.UTM_SOURCE_AUTO_CORRECTED, catalogsFeedValidationWarnings.UTM_SOURCE_AUTO_CORRECTED) &&
        Objects.equals(this.VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED, catalogsFeedValidationWarnings.VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED) &&
        Objects.equals(this.WEIGHT_UNIT_INVALID, catalogsFeedValidationWarnings.WEIGHT_UNIT_INVALID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_IMAGE_0_LINK_DUPLICATED, AD_IMAGE_0_LINK_LENGTH_TOO_LONG, AD_IMAGE_0_LINK_REQUIRED, AD_IMAGE_0_LINK_WARNING, AD_IMAGE_0_TAG_DUPLICATED, AD_IMAGE_0_TAG_LENGTH_TOO_LONG, AD_IMAGE_0_TAG_REQUIRED, AD_IMAGE_10_LINK_DUPLICATED, AD_IMAGE_10_LINK_LENGTH_TOO_LONG, AD_IMAGE_10_LINK_REQUIRED, AD_IMAGE_10_LINK_WARNING, AD_IMAGE_10_TAG_DUPLICATED, AD_IMAGE_10_TAG_LENGTH_TOO_LONG, AD_IMAGE_10_TAG_REQUIRED, AD_IMAGE_11_LINK_DUPLICATED, AD_IMAGE_11_LINK_LENGTH_TOO_LONG, AD_IMAGE_11_LINK_REQUIRED, AD_IMAGE_11_LINK_WARNING, AD_IMAGE_11_TAG_DUPLICATED, AD_IMAGE_11_TAG_LENGTH_TOO_LONG, AD_IMAGE_11_TAG_REQUIRED, AD_IMAGE_12_LINK_DUPLICATED, AD_IMAGE_12_LINK_LENGTH_TOO_LONG, AD_IMAGE_12_LINK_REQUIRED, AD_IMAGE_12_LINK_WARNING, AD_IMAGE_12_TAG_DUPLICATED, AD_IMAGE_12_TAG_LENGTH_TOO_LONG, AD_IMAGE_12_TAG_REQUIRED, AD_IMAGE_13_LINK_DUPLICATED, AD_IMAGE_13_LINK_LENGTH_TOO_LONG, AD_IMAGE_13_LINK_REQUIRED, AD_IMAGE_13_LINK_WARNING, AD_IMAGE_13_TAG_DUPLICATED, AD_IMAGE_13_TAG_LENGTH_TOO_LONG, AD_IMAGE_13_TAG_REQUIRED, AD_IMAGE_14_LINK_DUPLICATED, AD_IMAGE_14_LINK_LENGTH_TOO_LONG, AD_IMAGE_14_LINK_REQUIRED, AD_IMAGE_14_LINK_WARNING, AD_IMAGE_14_TAG_DUPLICATED, AD_IMAGE_14_TAG_LENGTH_TOO_LONG, AD_IMAGE_14_TAG_REQUIRED, AD_IMAGE_15_LINK_DUPLICATED, AD_IMAGE_15_LINK_LENGTH_TOO_LONG, AD_IMAGE_15_LINK_REQUIRED, AD_IMAGE_15_LINK_WARNING, AD_IMAGE_15_TAG_DUPLICATED, AD_IMAGE_15_TAG_LENGTH_TOO_LONG, AD_IMAGE_15_TAG_REQUIRED, AD_IMAGE_16_LINK_DUPLICATED, AD_IMAGE_16_LINK_LENGTH_TOO_LONG, AD_IMAGE_16_LINK_REQUIRED, AD_IMAGE_16_LINK_WARNING, AD_IMAGE_16_TAG_DUPLICATED, AD_IMAGE_16_TAG_LENGTH_TOO_LONG, AD_IMAGE_16_TAG_REQUIRED, AD_IMAGE_17_LINK_DUPLICATED, AD_IMAGE_17_LINK_LENGTH_TOO_LONG, AD_IMAGE_17_LINK_REQUIRED, AD_IMAGE_17_LINK_WARNING, AD_IMAGE_17_TAG_DUPLICATED, AD_IMAGE_17_TAG_LENGTH_TOO_LONG, AD_IMAGE_17_TAG_REQUIRED, AD_IMAGE_18_LINK_DUPLICATED, AD_IMAGE_18_LINK_LENGTH_TOO_LONG, AD_IMAGE_18_LINK_REQUIRED, AD_IMAGE_18_LINK_WARNING, AD_IMAGE_18_TAG_DUPLICATED, AD_IMAGE_18_TAG_LENGTH_TOO_LONG, AD_IMAGE_18_TAG_REQUIRED, AD_IMAGE_19_LINK_DUPLICATED, AD_IMAGE_19_LINK_LENGTH_TOO_LONG, AD_IMAGE_19_LINK_REQUIRED, AD_IMAGE_19_LINK_WARNING, AD_IMAGE_19_TAG_DUPLICATED, AD_IMAGE_19_TAG_LENGTH_TOO_LONG, AD_IMAGE_19_TAG_REQUIRED, AD_IMAGE_1_LINK_DUPLICATED, AD_IMAGE_1_LINK_LENGTH_TOO_LONG, AD_IMAGE_1_LINK_REQUIRED, AD_IMAGE_1_LINK_WARNING, AD_IMAGE_1_TAG_DUPLICATED, AD_IMAGE_1_TAG_LENGTH_TOO_LONG, AD_IMAGE_1_TAG_REQUIRED, AD_IMAGE_2_LINK_DUPLICATED, AD_IMAGE_2_LINK_LENGTH_TOO_LONG, AD_IMAGE_2_LINK_REQUIRED, AD_IMAGE_2_LINK_WARNING, AD_IMAGE_2_TAG_DUPLICATED, AD_IMAGE_2_TAG_LENGTH_TOO_LONG, AD_IMAGE_2_TAG_REQUIRED, AD_IMAGE_3_LINK_DUPLICATED, AD_IMAGE_3_LINK_LENGTH_TOO_LONG, AD_IMAGE_3_LINK_REQUIRED, AD_IMAGE_3_LINK_WARNING, AD_IMAGE_3_TAG_DUPLICATED, AD_IMAGE_3_TAG_LENGTH_TOO_LONG, AD_IMAGE_3_TAG_REQUIRED, AD_IMAGE_4_LINK_DUPLICATED, AD_IMAGE_4_LINK_LENGTH_TOO_LONG, AD_IMAGE_4_LINK_REQUIRED, AD_IMAGE_4_LINK_WARNING, AD_IMAGE_4_TAG_DUPLICATED, AD_IMAGE_4_TAG_LENGTH_TOO_LONG, AD_IMAGE_4_TAG_REQUIRED, AD_IMAGE_5_LINK_DUPLICATED, AD_IMAGE_5_LINK_LENGTH_TOO_LONG, AD_IMAGE_5_LINK_REQUIRED, AD_IMAGE_5_LINK_WARNING, AD_IMAGE_5_TAG_DUPLICATED, AD_IMAGE_5_TAG_LENGTH_TOO_LONG, AD_IMAGE_5_TAG_REQUIRED, AD_IMAGE_6_LINK_DUPLICATED, AD_IMAGE_6_LINK_LENGTH_TOO_LONG, AD_IMAGE_6_LINK_REQUIRED, AD_IMAGE_6_LINK_WARNING, AD_IMAGE_6_TAG_DUPLICATED, AD_IMAGE_6_TAG_LENGTH_TOO_LONG, AD_IMAGE_6_TAG_REQUIRED, AD_IMAGE_7_LINK_DUPLICATED, AD_IMAGE_7_LINK_LENGTH_TOO_LONG, AD_IMAGE_7_LINK_REQUIRED, AD_IMAGE_7_LINK_WARNING, AD_IMAGE_7_TAG_DUPLICATED, AD_IMAGE_7_TAG_LENGTH_TOO_LONG, AD_IMAGE_7_TAG_REQUIRED, AD_IMAGE_8_LINK_DUPLICATED, AD_IMAGE_8_LINK_LENGTH_TOO_LONG, AD_IMAGE_8_LINK_REQUIRED, AD_IMAGE_8_LINK_WARNING, AD_IMAGE_8_TAG_DUPLICATED, AD_IMAGE_8_TAG_LENGTH_TOO_LONG, AD_IMAGE_8_TAG_REQUIRED, AD_IMAGE_9_LINK_DUPLICATED, AD_IMAGE_9_LINK_LENGTH_TOO_LONG, AD_IMAGE_9_LINK_REQUIRED, AD_IMAGE_9_LINK_WARNING, AD_IMAGE_9_TAG_DUPLICATED, AD_IMAGE_9_TAG_LENGTH_TOO_LONG, AD_IMAGE_9_TAG_REQUIRED, AD_LINK_FORMAT_WARNING, AD_LINK_SAME_AS_LINK, AD_VIDEO_0_LINK_DUPLICATED, AD_VIDEO_0_LINK_LENGTH_TOO_LONG, AD_VIDEO_0_LINK_REQUIRED, AD_VIDEO_0_LINK_WARNING, AD_VIDEO_0_TAG_DUPLICATED, AD_VIDEO_0_TAG_LENGTH_TOO_LONG, AD_VIDEO_0_TAG_REQUIRED, AD_VIDEO_1_LINK_DUPLICATED, AD_VIDEO_1_LINK_LENGTH_TOO_LONG, AD_VIDEO_1_LINK_REQUIRED, AD_VIDEO_1_LINK_WARNING, AD_VIDEO_1_TAG_DUPLICATED, AD_VIDEO_1_TAG_LENGTH_TOO_LONG, AD_VIDEO_1_TAG_REQUIRED, AD_VIDEO_2_LINK_DUPLICATED, AD_VIDEO_2_LINK_LENGTH_TOO_LONG, AD_VIDEO_2_LINK_REQUIRED, AD_VIDEO_2_LINK_WARNING, AD_VIDEO_2_TAG_DUPLICATED, AD_VIDEO_2_TAG_LENGTH_TOO_LONG, AD_VIDEO_2_TAG_REQUIRED, ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, ADDITIONAL_IMAGE_LINK_WARNING, ADWORDS_FORMAT_WARNING, ADWORDS_SAME_AS_LINK, AGE_GROUP_INVALID, ANDROID_DEEP_LINK_INVALID, AVAILABILITY_DATE_INVALID, COUNTRY_DOES_NOT_MAP_TO_CURRENCY, CUSTOM_LABEL_LENGTH_TOO_LONG, DESCRIPTION_LENGTH_TOO_LONG, DUPLICATE_HEADERS, EXPIRATION_DATE_INVALID, FETCH_SAME_SIGNATURE, GENDER_INVALID, GTIN_INVALID, IMAGE_LINK_WARNING, INCONSISTENT_CURRENCY_VALUES, INDEXED_PRODUCT_COUNT_LARGE_DELTA, IOS_DEEP_LINK_INVALID, IS_BUNDLE_INVALID, ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, LINK_FORMAT_WARNING, MIN_AD_PRICE_INVALID, MPN_INVALID, MULTIPACK_INVALID, OPTIONAL_CONDITION_INVALID, OPTIONAL_CONDITION_MISSING, OPTIONAL_PRODUCT_CATEGORY_INVALID, OPTIONAL_PRODUCT_CATEGORY_MISSING, PRODUCT_CATEGORY_DEPTH_WARNING, PRODUCT_TYPE_LENGTH_TOO_LONG, SALE_DATE_INVALID, SALES_PRICE_INVALID, SALES_PRICE_TOO_HIGH, SALES_PRICE_TOO_LOW, SHIPPING_HEIGHT_INVALID, SHIPPING_INVALID, SHIPPING_WEIGHT_INVALID, SHIPPING_WIDTH_INVALID, SIZE_SYSTEM_INVALID, SIZE_TYPE_INVALID, TAX_INVALID, TITLE_LENGTH_TOO_LONG, TOO_MANY_ADDITIONAL_IMAGE_LINKS, UPDATED_TIME_INVALID, UTM_SOURCE_AUTO_CORRECTED, VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED, WEIGHT_UNIT_INVALID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedValidationWarnings {\n");
    sb.append("    AD_IMAGE_0_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_0_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_0_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_0_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_0_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_0_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_0_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_0_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_0_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_0_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_0_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_0_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_0_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_0_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_10_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_10_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_10_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_10_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_10_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_10_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_10_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_10_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_10_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_10_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_10_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_10_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_10_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_10_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_11_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_11_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_11_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_11_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_11_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_11_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_11_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_11_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_11_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_11_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_11_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_11_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_11_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_11_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_12_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_12_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_12_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_12_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_12_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_12_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_12_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_12_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_12_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_12_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_12_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_12_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_12_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_12_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_13_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_13_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_13_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_13_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_13_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_13_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_13_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_13_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_13_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_13_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_13_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_13_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_13_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_13_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_14_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_14_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_14_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_14_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_14_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_14_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_14_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_14_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_14_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_14_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_14_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_14_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_14_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_14_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_15_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_15_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_15_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_15_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_15_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_15_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_15_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_15_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_15_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_15_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_15_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_15_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_15_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_15_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_16_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_16_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_16_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_16_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_16_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_16_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_16_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_16_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_16_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_16_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_16_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_16_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_16_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_16_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_17_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_17_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_17_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_17_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_17_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_17_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_17_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_17_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_17_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_17_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_17_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_17_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_17_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_17_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_18_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_18_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_18_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_18_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_18_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_18_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_18_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_18_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_18_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_18_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_18_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_18_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_18_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_18_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_19_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_19_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_19_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_19_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_19_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_19_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_19_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_19_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_19_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_19_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_19_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_19_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_19_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_19_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_1_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_1_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_1_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_1_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_1_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_1_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_1_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_1_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_1_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_1_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_1_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_1_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_1_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_1_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_2_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_2_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_2_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_2_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_2_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_2_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_2_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_2_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_2_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_2_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_2_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_2_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_2_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_2_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_3_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_3_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_3_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_3_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_3_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_3_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_3_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_3_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_3_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_3_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_3_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_3_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_3_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_3_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_4_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_4_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_4_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_4_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_4_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_4_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_4_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_4_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_4_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_4_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_4_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_4_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_4_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_4_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_5_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_5_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_5_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_5_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_5_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_5_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_5_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_5_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_5_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_5_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_5_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_5_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_5_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_5_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_6_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_6_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_6_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_6_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_6_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_6_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_6_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_6_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_6_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_6_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_6_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_6_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_6_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_6_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_7_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_7_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_7_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_7_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_7_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_7_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_7_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_7_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_7_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_7_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_7_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_7_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_7_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_7_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_8_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_8_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_8_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_8_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_8_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_8_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_8_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_8_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_8_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_8_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_8_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_8_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_8_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_8_TAG_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_9_LINK_DUPLICATED: ").append(toIndentedString(AD_IMAGE_9_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_9_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_9_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_9_LINK_REQUIRED: ").append(toIndentedString(AD_IMAGE_9_LINK_REQUIRED)).append("\n");
    sb.append("    AD_IMAGE_9_LINK_WARNING: ").append(toIndentedString(AD_IMAGE_9_LINK_WARNING)).append("\n");
    sb.append("    AD_IMAGE_9_TAG_DUPLICATED: ").append(toIndentedString(AD_IMAGE_9_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_IMAGE_9_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_IMAGE_9_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_IMAGE_9_TAG_REQUIRED: ").append(toIndentedString(AD_IMAGE_9_TAG_REQUIRED)).append("\n");
    sb.append("    AD_LINK_FORMAT_WARNING: ").append(toIndentedString(AD_LINK_FORMAT_WARNING)).append("\n");
    sb.append("    AD_LINK_SAME_AS_LINK: ").append(toIndentedString(AD_LINK_SAME_AS_LINK)).append("\n");
    sb.append("    AD_VIDEO_0_LINK_DUPLICATED: ").append(toIndentedString(AD_VIDEO_0_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_VIDEO_0_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_VIDEO_0_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_VIDEO_0_LINK_REQUIRED: ").append(toIndentedString(AD_VIDEO_0_LINK_REQUIRED)).append("\n");
    sb.append("    AD_VIDEO_0_LINK_WARNING: ").append(toIndentedString(AD_VIDEO_0_LINK_WARNING)).append("\n");
    sb.append("    AD_VIDEO_0_TAG_DUPLICATED: ").append(toIndentedString(AD_VIDEO_0_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_VIDEO_0_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_VIDEO_0_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_VIDEO_0_TAG_REQUIRED: ").append(toIndentedString(AD_VIDEO_0_TAG_REQUIRED)).append("\n");
    sb.append("    AD_VIDEO_1_LINK_DUPLICATED: ").append(toIndentedString(AD_VIDEO_1_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_VIDEO_1_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_VIDEO_1_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_VIDEO_1_LINK_REQUIRED: ").append(toIndentedString(AD_VIDEO_1_LINK_REQUIRED)).append("\n");
    sb.append("    AD_VIDEO_1_LINK_WARNING: ").append(toIndentedString(AD_VIDEO_1_LINK_WARNING)).append("\n");
    sb.append("    AD_VIDEO_1_TAG_DUPLICATED: ").append(toIndentedString(AD_VIDEO_1_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_VIDEO_1_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_VIDEO_1_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_VIDEO_1_TAG_REQUIRED: ").append(toIndentedString(AD_VIDEO_1_TAG_REQUIRED)).append("\n");
    sb.append("    AD_VIDEO_2_LINK_DUPLICATED: ").append(toIndentedString(AD_VIDEO_2_LINK_DUPLICATED)).append("\n");
    sb.append("    AD_VIDEO_2_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(AD_VIDEO_2_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_VIDEO_2_LINK_REQUIRED: ").append(toIndentedString(AD_VIDEO_2_LINK_REQUIRED)).append("\n");
    sb.append("    AD_VIDEO_2_LINK_WARNING: ").append(toIndentedString(AD_VIDEO_2_LINK_WARNING)).append("\n");
    sb.append("    AD_VIDEO_2_TAG_DUPLICATED: ").append(toIndentedString(AD_VIDEO_2_TAG_DUPLICATED)).append("\n");
    sb.append("    AD_VIDEO_2_TAG_LENGTH_TOO_LONG: ").append(toIndentedString(AD_VIDEO_2_TAG_LENGTH_TOO_LONG)).append("\n");
    sb.append("    AD_VIDEO_2_TAG_REQUIRED: ").append(toIndentedString(AD_VIDEO_2_TAG_REQUIRED)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_LINK_WARNING: ").append(toIndentedString(ADDITIONAL_IMAGE_LINK_WARNING)).append("\n");
    sb.append("    ADWORDS_FORMAT_WARNING: ").append(toIndentedString(ADWORDS_FORMAT_WARNING)).append("\n");
    sb.append("    ADWORDS_SAME_AS_LINK: ").append(toIndentedString(ADWORDS_SAME_AS_LINK)).append("\n");
    sb.append("    AGE_GROUP_INVALID: ").append(toIndentedString(AGE_GROUP_INVALID)).append("\n");
    sb.append("    ANDROID_DEEP_LINK_INVALID: ").append(toIndentedString(ANDROID_DEEP_LINK_INVALID)).append("\n");
    sb.append("    AVAILABILITY_DATE_INVALID: ").append(toIndentedString(AVAILABILITY_DATE_INVALID)).append("\n");
    sb.append("    COUNTRY_DOES_NOT_MAP_TO_CURRENCY: ").append(toIndentedString(COUNTRY_DOES_NOT_MAP_TO_CURRENCY)).append("\n");
    sb.append("    CUSTOM_LABEL_LENGTH_TOO_LONG: ").append(toIndentedString(CUSTOM_LABEL_LENGTH_TOO_LONG)).append("\n");
    sb.append("    DESCRIPTION_LENGTH_TOO_LONG: ").append(toIndentedString(DESCRIPTION_LENGTH_TOO_LONG)).append("\n");
    sb.append("    DUPLICATE_HEADERS: ").append(toIndentedString(DUPLICATE_HEADERS)).append("\n");
    sb.append("    EXPIRATION_DATE_INVALID: ").append(toIndentedString(EXPIRATION_DATE_INVALID)).append("\n");
    sb.append("    FETCH_SAME_SIGNATURE: ").append(toIndentedString(FETCH_SAME_SIGNATURE)).append("\n");
    sb.append("    GENDER_INVALID: ").append(toIndentedString(GENDER_INVALID)).append("\n");
    sb.append("    GTIN_INVALID: ").append(toIndentedString(GTIN_INVALID)).append("\n");
    sb.append("    IMAGE_LINK_WARNING: ").append(toIndentedString(IMAGE_LINK_WARNING)).append("\n");
    sb.append("    INCONSISTENT_CURRENCY_VALUES: ").append(toIndentedString(INCONSISTENT_CURRENCY_VALUES)).append("\n");
    sb.append("    INDEXED_PRODUCT_COUNT_LARGE_DELTA: ").append(toIndentedString(INDEXED_PRODUCT_COUNT_LARGE_DELTA)).append("\n");
    sb.append("    IOS_DEEP_LINK_INVALID: ").append(toIndentedString(IOS_DEEP_LINK_INVALID)).append("\n");
    sb.append("    IS_BUNDLE_INVALID: ").append(toIndentedString(IS_BUNDLE_INVALID)).append("\n");
    sb.append("    ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: ").append(toIndentedString(ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE)).append("\n");
    sb.append("    LINK_FORMAT_WARNING: ").append(toIndentedString(LINK_FORMAT_WARNING)).append("\n");
    sb.append("    MIN_AD_PRICE_INVALID: ").append(toIndentedString(MIN_AD_PRICE_INVALID)).append("\n");
    sb.append("    MPN_INVALID: ").append(toIndentedString(MPN_INVALID)).append("\n");
    sb.append("    MULTIPACK_INVALID: ").append(toIndentedString(MULTIPACK_INVALID)).append("\n");
    sb.append("    OPTIONAL_CONDITION_INVALID: ").append(toIndentedString(OPTIONAL_CONDITION_INVALID)).append("\n");
    sb.append("    OPTIONAL_CONDITION_MISSING: ").append(toIndentedString(OPTIONAL_CONDITION_MISSING)).append("\n");
    sb.append("    OPTIONAL_PRODUCT_CATEGORY_INVALID: ").append(toIndentedString(OPTIONAL_PRODUCT_CATEGORY_INVALID)).append("\n");
    sb.append("    OPTIONAL_PRODUCT_CATEGORY_MISSING: ").append(toIndentedString(OPTIONAL_PRODUCT_CATEGORY_MISSING)).append("\n");
    sb.append("    PRODUCT_CATEGORY_DEPTH_WARNING: ").append(toIndentedString(PRODUCT_CATEGORY_DEPTH_WARNING)).append("\n");
    sb.append("    PRODUCT_TYPE_LENGTH_TOO_LONG: ").append(toIndentedString(PRODUCT_TYPE_LENGTH_TOO_LONG)).append("\n");
    sb.append("    SALE_DATE_INVALID: ").append(toIndentedString(SALE_DATE_INVALID)).append("\n");
    sb.append("    SALES_PRICE_INVALID: ").append(toIndentedString(SALES_PRICE_INVALID)).append("\n");
    sb.append("    SALES_PRICE_TOO_HIGH: ").append(toIndentedString(SALES_PRICE_TOO_HIGH)).append("\n");
    sb.append("    SALES_PRICE_TOO_LOW: ").append(toIndentedString(SALES_PRICE_TOO_LOW)).append("\n");
    sb.append("    SHIPPING_HEIGHT_INVALID: ").append(toIndentedString(SHIPPING_HEIGHT_INVALID)).append("\n");
    sb.append("    SHIPPING_INVALID: ").append(toIndentedString(SHIPPING_INVALID)).append("\n");
    sb.append("    SHIPPING_WEIGHT_INVALID: ").append(toIndentedString(SHIPPING_WEIGHT_INVALID)).append("\n");
    sb.append("    SHIPPING_WIDTH_INVALID: ").append(toIndentedString(SHIPPING_WIDTH_INVALID)).append("\n");
    sb.append("    SIZE_SYSTEM_INVALID: ").append(toIndentedString(SIZE_SYSTEM_INVALID)).append("\n");
    sb.append("    SIZE_TYPE_INVALID: ").append(toIndentedString(SIZE_TYPE_INVALID)).append("\n");
    sb.append("    TAX_INVALID: ").append(toIndentedString(TAX_INVALID)).append("\n");
    sb.append("    TITLE_LENGTH_TOO_LONG: ").append(toIndentedString(TITLE_LENGTH_TOO_LONG)).append("\n");
    sb.append("    TOO_MANY_ADDITIONAL_IMAGE_LINKS: ").append(toIndentedString(TOO_MANY_ADDITIONAL_IMAGE_LINKS)).append("\n");
    sb.append("    UPDATED_TIME_INVALID: ").append(toIndentedString(UPDATED_TIME_INVALID)).append("\n");
    sb.append("    UTM_SOURCE_AUTO_CORRECTED: ").append(toIndentedString(UTM_SOURCE_AUTO_CORRECTED)).append("\n");
    sb.append("    VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED: ").append(toIndentedString(VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED)).append("\n");
    sb.append("    WEIGHT_UNIT_INVALID: ").append(toIndentedString(WEIGHT_UNIT_INVALID)).append("\n");
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

