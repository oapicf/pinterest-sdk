package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsItemValidationDetails;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsItemValidationWarnings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsItemValidationWarnings {

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_0_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_0_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_0_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_0_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_0_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_0_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_0_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_10_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_10_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_10_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_10_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_10_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_10_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_10_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_11_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_11_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_11_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_11_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_11_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_11_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_11_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_12_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_12_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_12_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_12_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_12_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_12_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_12_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_13_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_13_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_13_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_13_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_13_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_13_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_13_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_14_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_14_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_14_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_14_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_14_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_14_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_14_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_15_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_15_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_15_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_15_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_15_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_15_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_15_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_16_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_16_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_16_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_16_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_16_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_16_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_16_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_17_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_17_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_17_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_17_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_17_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_17_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_17_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_18_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_18_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_18_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_18_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_18_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_18_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_18_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_19_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_19_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_19_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_19_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_19_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_19_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_19_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_1_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_1_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_1_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_1_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_1_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_1_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_1_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_2_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_2_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_2_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_2_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_2_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_2_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_2_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_3_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_3_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_3_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_3_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_3_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_3_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_3_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_4_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_4_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_4_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_4_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_4_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_4_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_4_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_5_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_5_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_5_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_5_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_5_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_5_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_5_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_6_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_6_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_6_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_6_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_6_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_6_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_6_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_7_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_7_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_7_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_7_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_7_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_7_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_7_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_8_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_8_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_8_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_8_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_8_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_8_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_8_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_9_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_9_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_9_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_9_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_9_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_9_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_IMAGE_9_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_LINK_FORMAT_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_LINK_SAME_AS_LINK;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_0_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_0_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_0_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_0_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_0_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_0_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_0_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_1_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_1_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_1_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_1_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_1_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_1_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_1_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_2_LINK_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_2_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_2_LINK_REQUIRED;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_2_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_2_TAG_DUPLICATED;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_2_TAG_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails AD_VIDEO_2_TAG_REQUIRED;

  private @Nullable CatalogsItemValidationDetails ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails ADDITIONAL_IMAGE_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails ADWORDS_FORMAT_WARNING;

  private @Nullable CatalogsItemValidationDetails ADWORDS_SAME_AS_LINK;

  private @Nullable CatalogsItemValidationDetails AGE_GROUP_INVALID;

  private @Nullable CatalogsItemValidationDetails ANDROID_DEEP_LINK_INVALID;

  private @Nullable CatalogsItemValidationDetails AVAILABILITY_DATE_INVALID;

  private @Nullable CatalogsItemValidationDetails COUNTRY_DOES_NOT_MAP_TO_CURRENCY;

  private @Nullable CatalogsItemValidationDetails CUSTOM_LABEL_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails DESCRIPTION_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails EXPIRATION_DATE_INVALID;

  private @Nullable CatalogsItemValidationDetails GENDER_INVALID;

  private @Nullable CatalogsItemValidationDetails GTIN_INVALID;

  private @Nullable CatalogsItemValidationDetails IMAGE_LINK_WARNING;

  private @Nullable CatalogsItemValidationDetails IOS_DEEP_LINK_INVALID;

  private @Nullable CatalogsItemValidationDetails IS_BUNDLE_INVALID;

  private @Nullable CatalogsItemValidationDetails ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;

  private @Nullable CatalogsItemValidationDetails LINK_FORMAT_WARNING;

  private @Nullable CatalogsItemValidationDetails MIN_AD_PRICE_INVALID;

  private @Nullable CatalogsItemValidationDetails MPN_INVALID;

  private @Nullable CatalogsItemValidationDetails MULTIPACK_INVALID;

  private @Nullable CatalogsItemValidationDetails OPTIONAL_CONDITION_INVALID;

  private @Nullable CatalogsItemValidationDetails OPTIONAL_CONDITION_MISSING;

  private @Nullable CatalogsItemValidationDetails OPTIONAL_PRODUCT_CATEGORY_INVALID;

  private @Nullable CatalogsItemValidationDetails OPTIONAL_PRODUCT_CATEGORY_MISSING;

  private @Nullable CatalogsItemValidationDetails PRODUCT_CATEGORY_DEPTH_WARNING;

  private @Nullable CatalogsItemValidationDetails PRODUCT_TYPE_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails SALE_DATE_INVALID;

  private @Nullable CatalogsItemValidationDetails SALES_PRICE_INVALID;

  private @Nullable CatalogsItemValidationDetails SALES_PRICE_TOO_HIGH;

  private @Nullable CatalogsItemValidationDetails SALES_PRICE_TOO_LOW;

  private @Nullable CatalogsItemValidationDetails SHIPPING_HEIGHT_INVALID;

  private @Nullable CatalogsItemValidationDetails SHIPPING_INVALID;

  private @Nullable CatalogsItemValidationDetails SHIPPING_WEIGHT_INVALID;

  private @Nullable CatalogsItemValidationDetails SHIPPING_WIDTH_INVALID;

  private @Nullable CatalogsItemValidationDetails SIZE_SYSTEM_INVALID;

  private @Nullable CatalogsItemValidationDetails SIZE_TYPE_INVALID;

  private @Nullable CatalogsItemValidationDetails TAX_INVALID;

  private @Nullable CatalogsItemValidationDetails TITLE_LENGTH_TOO_LONG;

  private @Nullable CatalogsItemValidationDetails TOO_MANY_ADDITIONAL_IMAGE_LINKS;

  private @Nullable CatalogsItemValidationDetails UTM_SOURCE_AUTO_CORRECTED;

  private @Nullable CatalogsItemValidationDetails VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED;

  private @Nullable CatalogsItemValidationDetails WEIGHT_UNIT_INVALID;

  public CatalogsItemValidationWarnings AD_IMAGE_0_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_0_LINK_DUPLICATED) {
    this.AD_IMAGE_0_LINK_DUPLICATED = AD_IMAGE_0_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_0_LINK_DUPLICATED
   * @return AD_IMAGE_0_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_0_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_0_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE0LINKDUPLICATED() {
    return AD_IMAGE_0_LINK_DUPLICATED;
  }

  public void setADIMAGE0LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_0_LINK_DUPLICATED) {
    this.AD_IMAGE_0_LINK_DUPLICATED = AD_IMAGE_0_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_0_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_0_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_0_LINK_LENGTH_TOO_LONG = AD_IMAGE_0_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_0_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_0_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_0_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_0_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE0LINKLENGTHTOOLONG() {
    return AD_IMAGE_0_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE0LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_0_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_0_LINK_LENGTH_TOO_LONG = AD_IMAGE_0_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_0_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_0_LINK_REQUIRED) {
    this.AD_IMAGE_0_LINK_REQUIRED = AD_IMAGE_0_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_0_LINK_REQUIRED
   * @return AD_IMAGE_0_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_0_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_0_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE0LINKREQUIRED() {
    return AD_IMAGE_0_LINK_REQUIRED;
  }

  public void setADIMAGE0LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_0_LINK_REQUIRED) {
    this.AD_IMAGE_0_LINK_REQUIRED = AD_IMAGE_0_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_0_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_0_LINK_WARNING) {
    this.AD_IMAGE_0_LINK_WARNING = AD_IMAGE_0_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_0_LINK_WARNING
   * @return AD_IMAGE_0_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_0_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_0_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE0LINKWARNING() {
    return AD_IMAGE_0_LINK_WARNING;
  }

  public void setADIMAGE0LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_0_LINK_WARNING) {
    this.AD_IMAGE_0_LINK_WARNING = AD_IMAGE_0_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_0_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_0_TAG_DUPLICATED) {
    this.AD_IMAGE_0_TAG_DUPLICATED = AD_IMAGE_0_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_0_TAG_DUPLICATED
   * @return AD_IMAGE_0_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_0_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_0_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE0TAGDUPLICATED() {
    return AD_IMAGE_0_TAG_DUPLICATED;
  }

  public void setADIMAGE0TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_0_TAG_DUPLICATED) {
    this.AD_IMAGE_0_TAG_DUPLICATED = AD_IMAGE_0_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_0_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_0_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_0_TAG_LENGTH_TOO_LONG = AD_IMAGE_0_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_0_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_0_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_0_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_0_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE0TAGLENGTHTOOLONG() {
    return AD_IMAGE_0_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE0TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_0_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_0_TAG_LENGTH_TOO_LONG = AD_IMAGE_0_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_0_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_0_TAG_REQUIRED) {
    this.AD_IMAGE_0_TAG_REQUIRED = AD_IMAGE_0_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_0_TAG_REQUIRED
   * @return AD_IMAGE_0_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_0_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_0_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE0TAGREQUIRED() {
    return AD_IMAGE_0_TAG_REQUIRED;
  }

  public void setADIMAGE0TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_0_TAG_REQUIRED) {
    this.AD_IMAGE_0_TAG_REQUIRED = AD_IMAGE_0_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_10_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_10_LINK_DUPLICATED) {
    this.AD_IMAGE_10_LINK_DUPLICATED = AD_IMAGE_10_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_10_LINK_DUPLICATED
   * @return AD_IMAGE_10_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_10_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_10_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE10LINKDUPLICATED() {
    return AD_IMAGE_10_LINK_DUPLICATED;
  }

  public void setADIMAGE10LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_10_LINK_DUPLICATED) {
    this.AD_IMAGE_10_LINK_DUPLICATED = AD_IMAGE_10_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_10_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_10_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_10_LINK_LENGTH_TOO_LONG = AD_IMAGE_10_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_10_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_10_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_10_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_10_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE10LINKLENGTHTOOLONG() {
    return AD_IMAGE_10_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE10LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_10_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_10_LINK_LENGTH_TOO_LONG = AD_IMAGE_10_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_10_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_10_LINK_REQUIRED) {
    this.AD_IMAGE_10_LINK_REQUIRED = AD_IMAGE_10_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_10_LINK_REQUIRED
   * @return AD_IMAGE_10_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_10_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_10_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE10LINKREQUIRED() {
    return AD_IMAGE_10_LINK_REQUIRED;
  }

  public void setADIMAGE10LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_10_LINK_REQUIRED) {
    this.AD_IMAGE_10_LINK_REQUIRED = AD_IMAGE_10_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_10_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_10_LINK_WARNING) {
    this.AD_IMAGE_10_LINK_WARNING = AD_IMAGE_10_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_10_LINK_WARNING
   * @return AD_IMAGE_10_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_10_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_10_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE10LINKWARNING() {
    return AD_IMAGE_10_LINK_WARNING;
  }

  public void setADIMAGE10LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_10_LINK_WARNING) {
    this.AD_IMAGE_10_LINK_WARNING = AD_IMAGE_10_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_10_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_10_TAG_DUPLICATED) {
    this.AD_IMAGE_10_TAG_DUPLICATED = AD_IMAGE_10_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_10_TAG_DUPLICATED
   * @return AD_IMAGE_10_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_10_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_10_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE10TAGDUPLICATED() {
    return AD_IMAGE_10_TAG_DUPLICATED;
  }

  public void setADIMAGE10TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_10_TAG_DUPLICATED) {
    this.AD_IMAGE_10_TAG_DUPLICATED = AD_IMAGE_10_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_10_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_10_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_10_TAG_LENGTH_TOO_LONG = AD_IMAGE_10_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_10_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_10_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_10_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_10_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE10TAGLENGTHTOOLONG() {
    return AD_IMAGE_10_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE10TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_10_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_10_TAG_LENGTH_TOO_LONG = AD_IMAGE_10_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_10_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_10_TAG_REQUIRED) {
    this.AD_IMAGE_10_TAG_REQUIRED = AD_IMAGE_10_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_10_TAG_REQUIRED
   * @return AD_IMAGE_10_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_10_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_10_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE10TAGREQUIRED() {
    return AD_IMAGE_10_TAG_REQUIRED;
  }

  public void setADIMAGE10TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_10_TAG_REQUIRED) {
    this.AD_IMAGE_10_TAG_REQUIRED = AD_IMAGE_10_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_11_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_11_LINK_DUPLICATED) {
    this.AD_IMAGE_11_LINK_DUPLICATED = AD_IMAGE_11_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_11_LINK_DUPLICATED
   * @return AD_IMAGE_11_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_11_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_11_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE11LINKDUPLICATED() {
    return AD_IMAGE_11_LINK_DUPLICATED;
  }

  public void setADIMAGE11LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_11_LINK_DUPLICATED) {
    this.AD_IMAGE_11_LINK_DUPLICATED = AD_IMAGE_11_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_11_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_11_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_11_LINK_LENGTH_TOO_LONG = AD_IMAGE_11_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_11_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_11_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_11_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_11_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE11LINKLENGTHTOOLONG() {
    return AD_IMAGE_11_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE11LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_11_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_11_LINK_LENGTH_TOO_LONG = AD_IMAGE_11_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_11_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_11_LINK_REQUIRED) {
    this.AD_IMAGE_11_LINK_REQUIRED = AD_IMAGE_11_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_11_LINK_REQUIRED
   * @return AD_IMAGE_11_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_11_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_11_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE11LINKREQUIRED() {
    return AD_IMAGE_11_LINK_REQUIRED;
  }

  public void setADIMAGE11LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_11_LINK_REQUIRED) {
    this.AD_IMAGE_11_LINK_REQUIRED = AD_IMAGE_11_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_11_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_11_LINK_WARNING) {
    this.AD_IMAGE_11_LINK_WARNING = AD_IMAGE_11_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_11_LINK_WARNING
   * @return AD_IMAGE_11_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_11_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_11_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE11LINKWARNING() {
    return AD_IMAGE_11_LINK_WARNING;
  }

  public void setADIMAGE11LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_11_LINK_WARNING) {
    this.AD_IMAGE_11_LINK_WARNING = AD_IMAGE_11_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_11_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_11_TAG_DUPLICATED) {
    this.AD_IMAGE_11_TAG_DUPLICATED = AD_IMAGE_11_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_11_TAG_DUPLICATED
   * @return AD_IMAGE_11_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_11_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_11_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE11TAGDUPLICATED() {
    return AD_IMAGE_11_TAG_DUPLICATED;
  }

  public void setADIMAGE11TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_11_TAG_DUPLICATED) {
    this.AD_IMAGE_11_TAG_DUPLICATED = AD_IMAGE_11_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_11_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_11_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_11_TAG_LENGTH_TOO_LONG = AD_IMAGE_11_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_11_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_11_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_11_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_11_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE11TAGLENGTHTOOLONG() {
    return AD_IMAGE_11_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE11TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_11_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_11_TAG_LENGTH_TOO_LONG = AD_IMAGE_11_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_11_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_11_TAG_REQUIRED) {
    this.AD_IMAGE_11_TAG_REQUIRED = AD_IMAGE_11_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_11_TAG_REQUIRED
   * @return AD_IMAGE_11_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_11_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_11_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE11TAGREQUIRED() {
    return AD_IMAGE_11_TAG_REQUIRED;
  }

  public void setADIMAGE11TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_11_TAG_REQUIRED) {
    this.AD_IMAGE_11_TAG_REQUIRED = AD_IMAGE_11_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_12_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_12_LINK_DUPLICATED) {
    this.AD_IMAGE_12_LINK_DUPLICATED = AD_IMAGE_12_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_12_LINK_DUPLICATED
   * @return AD_IMAGE_12_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_12_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_12_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE12LINKDUPLICATED() {
    return AD_IMAGE_12_LINK_DUPLICATED;
  }

  public void setADIMAGE12LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_12_LINK_DUPLICATED) {
    this.AD_IMAGE_12_LINK_DUPLICATED = AD_IMAGE_12_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_12_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_12_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_12_LINK_LENGTH_TOO_LONG = AD_IMAGE_12_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_12_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_12_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_12_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_12_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE12LINKLENGTHTOOLONG() {
    return AD_IMAGE_12_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE12LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_12_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_12_LINK_LENGTH_TOO_LONG = AD_IMAGE_12_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_12_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_12_LINK_REQUIRED) {
    this.AD_IMAGE_12_LINK_REQUIRED = AD_IMAGE_12_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_12_LINK_REQUIRED
   * @return AD_IMAGE_12_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_12_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_12_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE12LINKREQUIRED() {
    return AD_IMAGE_12_LINK_REQUIRED;
  }

  public void setADIMAGE12LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_12_LINK_REQUIRED) {
    this.AD_IMAGE_12_LINK_REQUIRED = AD_IMAGE_12_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_12_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_12_LINK_WARNING) {
    this.AD_IMAGE_12_LINK_WARNING = AD_IMAGE_12_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_12_LINK_WARNING
   * @return AD_IMAGE_12_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_12_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_12_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE12LINKWARNING() {
    return AD_IMAGE_12_LINK_WARNING;
  }

  public void setADIMAGE12LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_12_LINK_WARNING) {
    this.AD_IMAGE_12_LINK_WARNING = AD_IMAGE_12_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_12_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_12_TAG_DUPLICATED) {
    this.AD_IMAGE_12_TAG_DUPLICATED = AD_IMAGE_12_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_12_TAG_DUPLICATED
   * @return AD_IMAGE_12_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_12_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_12_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE12TAGDUPLICATED() {
    return AD_IMAGE_12_TAG_DUPLICATED;
  }

  public void setADIMAGE12TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_12_TAG_DUPLICATED) {
    this.AD_IMAGE_12_TAG_DUPLICATED = AD_IMAGE_12_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_12_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_12_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_12_TAG_LENGTH_TOO_LONG = AD_IMAGE_12_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_12_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_12_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_12_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_12_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE12TAGLENGTHTOOLONG() {
    return AD_IMAGE_12_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE12TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_12_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_12_TAG_LENGTH_TOO_LONG = AD_IMAGE_12_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_12_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_12_TAG_REQUIRED) {
    this.AD_IMAGE_12_TAG_REQUIRED = AD_IMAGE_12_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_12_TAG_REQUIRED
   * @return AD_IMAGE_12_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_12_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_12_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE12TAGREQUIRED() {
    return AD_IMAGE_12_TAG_REQUIRED;
  }

  public void setADIMAGE12TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_12_TAG_REQUIRED) {
    this.AD_IMAGE_12_TAG_REQUIRED = AD_IMAGE_12_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_13_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_13_LINK_DUPLICATED) {
    this.AD_IMAGE_13_LINK_DUPLICATED = AD_IMAGE_13_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_13_LINK_DUPLICATED
   * @return AD_IMAGE_13_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_13_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_13_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE13LINKDUPLICATED() {
    return AD_IMAGE_13_LINK_DUPLICATED;
  }

  public void setADIMAGE13LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_13_LINK_DUPLICATED) {
    this.AD_IMAGE_13_LINK_DUPLICATED = AD_IMAGE_13_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_13_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_13_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_13_LINK_LENGTH_TOO_LONG = AD_IMAGE_13_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_13_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_13_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_13_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_13_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE13LINKLENGTHTOOLONG() {
    return AD_IMAGE_13_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE13LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_13_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_13_LINK_LENGTH_TOO_LONG = AD_IMAGE_13_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_13_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_13_LINK_REQUIRED) {
    this.AD_IMAGE_13_LINK_REQUIRED = AD_IMAGE_13_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_13_LINK_REQUIRED
   * @return AD_IMAGE_13_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_13_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_13_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE13LINKREQUIRED() {
    return AD_IMAGE_13_LINK_REQUIRED;
  }

  public void setADIMAGE13LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_13_LINK_REQUIRED) {
    this.AD_IMAGE_13_LINK_REQUIRED = AD_IMAGE_13_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_13_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_13_LINK_WARNING) {
    this.AD_IMAGE_13_LINK_WARNING = AD_IMAGE_13_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_13_LINK_WARNING
   * @return AD_IMAGE_13_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_13_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_13_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE13LINKWARNING() {
    return AD_IMAGE_13_LINK_WARNING;
  }

  public void setADIMAGE13LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_13_LINK_WARNING) {
    this.AD_IMAGE_13_LINK_WARNING = AD_IMAGE_13_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_13_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_13_TAG_DUPLICATED) {
    this.AD_IMAGE_13_TAG_DUPLICATED = AD_IMAGE_13_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_13_TAG_DUPLICATED
   * @return AD_IMAGE_13_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_13_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_13_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE13TAGDUPLICATED() {
    return AD_IMAGE_13_TAG_DUPLICATED;
  }

  public void setADIMAGE13TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_13_TAG_DUPLICATED) {
    this.AD_IMAGE_13_TAG_DUPLICATED = AD_IMAGE_13_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_13_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_13_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_13_TAG_LENGTH_TOO_LONG = AD_IMAGE_13_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_13_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_13_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_13_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_13_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE13TAGLENGTHTOOLONG() {
    return AD_IMAGE_13_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE13TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_13_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_13_TAG_LENGTH_TOO_LONG = AD_IMAGE_13_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_13_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_13_TAG_REQUIRED) {
    this.AD_IMAGE_13_TAG_REQUIRED = AD_IMAGE_13_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_13_TAG_REQUIRED
   * @return AD_IMAGE_13_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_13_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_13_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE13TAGREQUIRED() {
    return AD_IMAGE_13_TAG_REQUIRED;
  }

  public void setADIMAGE13TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_13_TAG_REQUIRED) {
    this.AD_IMAGE_13_TAG_REQUIRED = AD_IMAGE_13_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_14_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_14_LINK_DUPLICATED) {
    this.AD_IMAGE_14_LINK_DUPLICATED = AD_IMAGE_14_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_14_LINK_DUPLICATED
   * @return AD_IMAGE_14_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_14_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_14_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE14LINKDUPLICATED() {
    return AD_IMAGE_14_LINK_DUPLICATED;
  }

  public void setADIMAGE14LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_14_LINK_DUPLICATED) {
    this.AD_IMAGE_14_LINK_DUPLICATED = AD_IMAGE_14_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_14_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_14_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_14_LINK_LENGTH_TOO_LONG = AD_IMAGE_14_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_14_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_14_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_14_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_14_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE14LINKLENGTHTOOLONG() {
    return AD_IMAGE_14_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE14LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_14_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_14_LINK_LENGTH_TOO_LONG = AD_IMAGE_14_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_14_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_14_LINK_REQUIRED) {
    this.AD_IMAGE_14_LINK_REQUIRED = AD_IMAGE_14_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_14_LINK_REQUIRED
   * @return AD_IMAGE_14_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_14_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_14_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE14LINKREQUIRED() {
    return AD_IMAGE_14_LINK_REQUIRED;
  }

  public void setADIMAGE14LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_14_LINK_REQUIRED) {
    this.AD_IMAGE_14_LINK_REQUIRED = AD_IMAGE_14_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_14_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_14_LINK_WARNING) {
    this.AD_IMAGE_14_LINK_WARNING = AD_IMAGE_14_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_14_LINK_WARNING
   * @return AD_IMAGE_14_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_14_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_14_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE14LINKWARNING() {
    return AD_IMAGE_14_LINK_WARNING;
  }

  public void setADIMAGE14LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_14_LINK_WARNING) {
    this.AD_IMAGE_14_LINK_WARNING = AD_IMAGE_14_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_14_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_14_TAG_DUPLICATED) {
    this.AD_IMAGE_14_TAG_DUPLICATED = AD_IMAGE_14_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_14_TAG_DUPLICATED
   * @return AD_IMAGE_14_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_14_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_14_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE14TAGDUPLICATED() {
    return AD_IMAGE_14_TAG_DUPLICATED;
  }

  public void setADIMAGE14TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_14_TAG_DUPLICATED) {
    this.AD_IMAGE_14_TAG_DUPLICATED = AD_IMAGE_14_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_14_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_14_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_14_TAG_LENGTH_TOO_LONG = AD_IMAGE_14_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_14_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_14_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_14_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_14_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE14TAGLENGTHTOOLONG() {
    return AD_IMAGE_14_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE14TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_14_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_14_TAG_LENGTH_TOO_LONG = AD_IMAGE_14_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_14_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_14_TAG_REQUIRED) {
    this.AD_IMAGE_14_TAG_REQUIRED = AD_IMAGE_14_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_14_TAG_REQUIRED
   * @return AD_IMAGE_14_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_14_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_14_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE14TAGREQUIRED() {
    return AD_IMAGE_14_TAG_REQUIRED;
  }

  public void setADIMAGE14TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_14_TAG_REQUIRED) {
    this.AD_IMAGE_14_TAG_REQUIRED = AD_IMAGE_14_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_15_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_15_LINK_DUPLICATED) {
    this.AD_IMAGE_15_LINK_DUPLICATED = AD_IMAGE_15_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_15_LINK_DUPLICATED
   * @return AD_IMAGE_15_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_15_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_15_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE15LINKDUPLICATED() {
    return AD_IMAGE_15_LINK_DUPLICATED;
  }

  public void setADIMAGE15LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_15_LINK_DUPLICATED) {
    this.AD_IMAGE_15_LINK_DUPLICATED = AD_IMAGE_15_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_15_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_15_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_15_LINK_LENGTH_TOO_LONG = AD_IMAGE_15_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_15_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_15_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_15_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_15_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE15LINKLENGTHTOOLONG() {
    return AD_IMAGE_15_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE15LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_15_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_15_LINK_LENGTH_TOO_LONG = AD_IMAGE_15_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_15_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_15_LINK_REQUIRED) {
    this.AD_IMAGE_15_LINK_REQUIRED = AD_IMAGE_15_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_15_LINK_REQUIRED
   * @return AD_IMAGE_15_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_15_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_15_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE15LINKREQUIRED() {
    return AD_IMAGE_15_LINK_REQUIRED;
  }

  public void setADIMAGE15LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_15_LINK_REQUIRED) {
    this.AD_IMAGE_15_LINK_REQUIRED = AD_IMAGE_15_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_15_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_15_LINK_WARNING) {
    this.AD_IMAGE_15_LINK_WARNING = AD_IMAGE_15_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_15_LINK_WARNING
   * @return AD_IMAGE_15_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_15_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_15_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE15LINKWARNING() {
    return AD_IMAGE_15_LINK_WARNING;
  }

  public void setADIMAGE15LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_15_LINK_WARNING) {
    this.AD_IMAGE_15_LINK_WARNING = AD_IMAGE_15_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_15_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_15_TAG_DUPLICATED) {
    this.AD_IMAGE_15_TAG_DUPLICATED = AD_IMAGE_15_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_15_TAG_DUPLICATED
   * @return AD_IMAGE_15_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_15_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_15_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE15TAGDUPLICATED() {
    return AD_IMAGE_15_TAG_DUPLICATED;
  }

  public void setADIMAGE15TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_15_TAG_DUPLICATED) {
    this.AD_IMAGE_15_TAG_DUPLICATED = AD_IMAGE_15_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_15_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_15_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_15_TAG_LENGTH_TOO_LONG = AD_IMAGE_15_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_15_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_15_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_15_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_15_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE15TAGLENGTHTOOLONG() {
    return AD_IMAGE_15_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE15TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_15_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_15_TAG_LENGTH_TOO_LONG = AD_IMAGE_15_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_15_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_15_TAG_REQUIRED) {
    this.AD_IMAGE_15_TAG_REQUIRED = AD_IMAGE_15_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_15_TAG_REQUIRED
   * @return AD_IMAGE_15_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_15_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_15_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE15TAGREQUIRED() {
    return AD_IMAGE_15_TAG_REQUIRED;
  }

  public void setADIMAGE15TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_15_TAG_REQUIRED) {
    this.AD_IMAGE_15_TAG_REQUIRED = AD_IMAGE_15_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_16_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_16_LINK_DUPLICATED) {
    this.AD_IMAGE_16_LINK_DUPLICATED = AD_IMAGE_16_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_16_LINK_DUPLICATED
   * @return AD_IMAGE_16_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_16_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_16_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE16LINKDUPLICATED() {
    return AD_IMAGE_16_LINK_DUPLICATED;
  }

  public void setADIMAGE16LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_16_LINK_DUPLICATED) {
    this.AD_IMAGE_16_LINK_DUPLICATED = AD_IMAGE_16_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_16_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_16_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_16_LINK_LENGTH_TOO_LONG = AD_IMAGE_16_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_16_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_16_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_16_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_16_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE16LINKLENGTHTOOLONG() {
    return AD_IMAGE_16_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE16LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_16_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_16_LINK_LENGTH_TOO_LONG = AD_IMAGE_16_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_16_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_16_LINK_REQUIRED) {
    this.AD_IMAGE_16_LINK_REQUIRED = AD_IMAGE_16_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_16_LINK_REQUIRED
   * @return AD_IMAGE_16_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_16_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_16_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE16LINKREQUIRED() {
    return AD_IMAGE_16_LINK_REQUIRED;
  }

  public void setADIMAGE16LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_16_LINK_REQUIRED) {
    this.AD_IMAGE_16_LINK_REQUIRED = AD_IMAGE_16_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_16_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_16_LINK_WARNING) {
    this.AD_IMAGE_16_LINK_WARNING = AD_IMAGE_16_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_16_LINK_WARNING
   * @return AD_IMAGE_16_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_16_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_16_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE16LINKWARNING() {
    return AD_IMAGE_16_LINK_WARNING;
  }

  public void setADIMAGE16LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_16_LINK_WARNING) {
    this.AD_IMAGE_16_LINK_WARNING = AD_IMAGE_16_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_16_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_16_TAG_DUPLICATED) {
    this.AD_IMAGE_16_TAG_DUPLICATED = AD_IMAGE_16_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_16_TAG_DUPLICATED
   * @return AD_IMAGE_16_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_16_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_16_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE16TAGDUPLICATED() {
    return AD_IMAGE_16_TAG_DUPLICATED;
  }

  public void setADIMAGE16TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_16_TAG_DUPLICATED) {
    this.AD_IMAGE_16_TAG_DUPLICATED = AD_IMAGE_16_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_16_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_16_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_16_TAG_LENGTH_TOO_LONG = AD_IMAGE_16_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_16_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_16_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_16_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_16_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE16TAGLENGTHTOOLONG() {
    return AD_IMAGE_16_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE16TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_16_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_16_TAG_LENGTH_TOO_LONG = AD_IMAGE_16_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_16_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_16_TAG_REQUIRED) {
    this.AD_IMAGE_16_TAG_REQUIRED = AD_IMAGE_16_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_16_TAG_REQUIRED
   * @return AD_IMAGE_16_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_16_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_16_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE16TAGREQUIRED() {
    return AD_IMAGE_16_TAG_REQUIRED;
  }

  public void setADIMAGE16TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_16_TAG_REQUIRED) {
    this.AD_IMAGE_16_TAG_REQUIRED = AD_IMAGE_16_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_17_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_17_LINK_DUPLICATED) {
    this.AD_IMAGE_17_LINK_DUPLICATED = AD_IMAGE_17_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_17_LINK_DUPLICATED
   * @return AD_IMAGE_17_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_17_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_17_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE17LINKDUPLICATED() {
    return AD_IMAGE_17_LINK_DUPLICATED;
  }

  public void setADIMAGE17LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_17_LINK_DUPLICATED) {
    this.AD_IMAGE_17_LINK_DUPLICATED = AD_IMAGE_17_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_17_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_17_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_17_LINK_LENGTH_TOO_LONG = AD_IMAGE_17_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_17_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_17_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_17_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_17_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE17LINKLENGTHTOOLONG() {
    return AD_IMAGE_17_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE17LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_17_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_17_LINK_LENGTH_TOO_LONG = AD_IMAGE_17_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_17_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_17_LINK_REQUIRED) {
    this.AD_IMAGE_17_LINK_REQUIRED = AD_IMAGE_17_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_17_LINK_REQUIRED
   * @return AD_IMAGE_17_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_17_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_17_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE17LINKREQUIRED() {
    return AD_IMAGE_17_LINK_REQUIRED;
  }

  public void setADIMAGE17LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_17_LINK_REQUIRED) {
    this.AD_IMAGE_17_LINK_REQUIRED = AD_IMAGE_17_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_17_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_17_LINK_WARNING) {
    this.AD_IMAGE_17_LINK_WARNING = AD_IMAGE_17_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_17_LINK_WARNING
   * @return AD_IMAGE_17_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_17_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_17_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE17LINKWARNING() {
    return AD_IMAGE_17_LINK_WARNING;
  }

  public void setADIMAGE17LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_17_LINK_WARNING) {
    this.AD_IMAGE_17_LINK_WARNING = AD_IMAGE_17_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_17_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_17_TAG_DUPLICATED) {
    this.AD_IMAGE_17_TAG_DUPLICATED = AD_IMAGE_17_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_17_TAG_DUPLICATED
   * @return AD_IMAGE_17_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_17_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_17_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE17TAGDUPLICATED() {
    return AD_IMAGE_17_TAG_DUPLICATED;
  }

  public void setADIMAGE17TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_17_TAG_DUPLICATED) {
    this.AD_IMAGE_17_TAG_DUPLICATED = AD_IMAGE_17_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_17_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_17_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_17_TAG_LENGTH_TOO_LONG = AD_IMAGE_17_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_17_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_17_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_17_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_17_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE17TAGLENGTHTOOLONG() {
    return AD_IMAGE_17_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE17TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_17_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_17_TAG_LENGTH_TOO_LONG = AD_IMAGE_17_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_17_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_17_TAG_REQUIRED) {
    this.AD_IMAGE_17_TAG_REQUIRED = AD_IMAGE_17_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_17_TAG_REQUIRED
   * @return AD_IMAGE_17_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_17_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_17_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE17TAGREQUIRED() {
    return AD_IMAGE_17_TAG_REQUIRED;
  }

  public void setADIMAGE17TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_17_TAG_REQUIRED) {
    this.AD_IMAGE_17_TAG_REQUIRED = AD_IMAGE_17_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_18_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_18_LINK_DUPLICATED) {
    this.AD_IMAGE_18_LINK_DUPLICATED = AD_IMAGE_18_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_18_LINK_DUPLICATED
   * @return AD_IMAGE_18_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_18_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_18_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE18LINKDUPLICATED() {
    return AD_IMAGE_18_LINK_DUPLICATED;
  }

  public void setADIMAGE18LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_18_LINK_DUPLICATED) {
    this.AD_IMAGE_18_LINK_DUPLICATED = AD_IMAGE_18_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_18_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_18_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_18_LINK_LENGTH_TOO_LONG = AD_IMAGE_18_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_18_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_18_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_18_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_18_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE18LINKLENGTHTOOLONG() {
    return AD_IMAGE_18_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE18LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_18_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_18_LINK_LENGTH_TOO_LONG = AD_IMAGE_18_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_18_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_18_LINK_REQUIRED) {
    this.AD_IMAGE_18_LINK_REQUIRED = AD_IMAGE_18_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_18_LINK_REQUIRED
   * @return AD_IMAGE_18_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_18_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_18_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE18LINKREQUIRED() {
    return AD_IMAGE_18_LINK_REQUIRED;
  }

  public void setADIMAGE18LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_18_LINK_REQUIRED) {
    this.AD_IMAGE_18_LINK_REQUIRED = AD_IMAGE_18_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_18_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_18_LINK_WARNING) {
    this.AD_IMAGE_18_LINK_WARNING = AD_IMAGE_18_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_18_LINK_WARNING
   * @return AD_IMAGE_18_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_18_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_18_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE18LINKWARNING() {
    return AD_IMAGE_18_LINK_WARNING;
  }

  public void setADIMAGE18LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_18_LINK_WARNING) {
    this.AD_IMAGE_18_LINK_WARNING = AD_IMAGE_18_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_18_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_18_TAG_DUPLICATED) {
    this.AD_IMAGE_18_TAG_DUPLICATED = AD_IMAGE_18_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_18_TAG_DUPLICATED
   * @return AD_IMAGE_18_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_18_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_18_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE18TAGDUPLICATED() {
    return AD_IMAGE_18_TAG_DUPLICATED;
  }

  public void setADIMAGE18TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_18_TAG_DUPLICATED) {
    this.AD_IMAGE_18_TAG_DUPLICATED = AD_IMAGE_18_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_18_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_18_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_18_TAG_LENGTH_TOO_LONG = AD_IMAGE_18_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_18_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_18_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_18_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_18_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE18TAGLENGTHTOOLONG() {
    return AD_IMAGE_18_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE18TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_18_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_18_TAG_LENGTH_TOO_LONG = AD_IMAGE_18_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_18_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_18_TAG_REQUIRED) {
    this.AD_IMAGE_18_TAG_REQUIRED = AD_IMAGE_18_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_18_TAG_REQUIRED
   * @return AD_IMAGE_18_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_18_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_18_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE18TAGREQUIRED() {
    return AD_IMAGE_18_TAG_REQUIRED;
  }

  public void setADIMAGE18TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_18_TAG_REQUIRED) {
    this.AD_IMAGE_18_TAG_REQUIRED = AD_IMAGE_18_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_19_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_19_LINK_DUPLICATED) {
    this.AD_IMAGE_19_LINK_DUPLICATED = AD_IMAGE_19_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_19_LINK_DUPLICATED
   * @return AD_IMAGE_19_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_19_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_19_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE19LINKDUPLICATED() {
    return AD_IMAGE_19_LINK_DUPLICATED;
  }

  public void setADIMAGE19LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_19_LINK_DUPLICATED) {
    this.AD_IMAGE_19_LINK_DUPLICATED = AD_IMAGE_19_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_19_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_19_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_19_LINK_LENGTH_TOO_LONG = AD_IMAGE_19_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_19_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_19_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_19_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_19_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE19LINKLENGTHTOOLONG() {
    return AD_IMAGE_19_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE19LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_19_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_19_LINK_LENGTH_TOO_LONG = AD_IMAGE_19_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_19_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_19_LINK_REQUIRED) {
    this.AD_IMAGE_19_LINK_REQUIRED = AD_IMAGE_19_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_19_LINK_REQUIRED
   * @return AD_IMAGE_19_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_19_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_19_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE19LINKREQUIRED() {
    return AD_IMAGE_19_LINK_REQUIRED;
  }

  public void setADIMAGE19LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_19_LINK_REQUIRED) {
    this.AD_IMAGE_19_LINK_REQUIRED = AD_IMAGE_19_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_19_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_19_LINK_WARNING) {
    this.AD_IMAGE_19_LINK_WARNING = AD_IMAGE_19_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_19_LINK_WARNING
   * @return AD_IMAGE_19_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_19_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_19_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE19LINKWARNING() {
    return AD_IMAGE_19_LINK_WARNING;
  }

  public void setADIMAGE19LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_19_LINK_WARNING) {
    this.AD_IMAGE_19_LINK_WARNING = AD_IMAGE_19_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_19_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_19_TAG_DUPLICATED) {
    this.AD_IMAGE_19_TAG_DUPLICATED = AD_IMAGE_19_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_19_TAG_DUPLICATED
   * @return AD_IMAGE_19_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_19_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_19_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE19TAGDUPLICATED() {
    return AD_IMAGE_19_TAG_DUPLICATED;
  }

  public void setADIMAGE19TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_19_TAG_DUPLICATED) {
    this.AD_IMAGE_19_TAG_DUPLICATED = AD_IMAGE_19_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_19_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_19_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_19_TAG_LENGTH_TOO_LONG = AD_IMAGE_19_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_19_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_19_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_19_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_19_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE19TAGLENGTHTOOLONG() {
    return AD_IMAGE_19_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE19TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_19_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_19_TAG_LENGTH_TOO_LONG = AD_IMAGE_19_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_19_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_19_TAG_REQUIRED) {
    this.AD_IMAGE_19_TAG_REQUIRED = AD_IMAGE_19_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_19_TAG_REQUIRED
   * @return AD_IMAGE_19_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_19_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_19_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE19TAGREQUIRED() {
    return AD_IMAGE_19_TAG_REQUIRED;
  }

  public void setADIMAGE19TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_19_TAG_REQUIRED) {
    this.AD_IMAGE_19_TAG_REQUIRED = AD_IMAGE_19_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_1_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_1_LINK_DUPLICATED) {
    this.AD_IMAGE_1_LINK_DUPLICATED = AD_IMAGE_1_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_1_LINK_DUPLICATED
   * @return AD_IMAGE_1_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_1_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_1_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE1LINKDUPLICATED() {
    return AD_IMAGE_1_LINK_DUPLICATED;
  }

  public void setADIMAGE1LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_1_LINK_DUPLICATED) {
    this.AD_IMAGE_1_LINK_DUPLICATED = AD_IMAGE_1_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_1_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_1_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_1_LINK_LENGTH_TOO_LONG = AD_IMAGE_1_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_1_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_1_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_1_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_1_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE1LINKLENGTHTOOLONG() {
    return AD_IMAGE_1_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE1LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_1_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_1_LINK_LENGTH_TOO_LONG = AD_IMAGE_1_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_1_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_1_LINK_REQUIRED) {
    this.AD_IMAGE_1_LINK_REQUIRED = AD_IMAGE_1_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_1_LINK_REQUIRED
   * @return AD_IMAGE_1_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_1_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_1_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE1LINKREQUIRED() {
    return AD_IMAGE_1_LINK_REQUIRED;
  }

  public void setADIMAGE1LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_1_LINK_REQUIRED) {
    this.AD_IMAGE_1_LINK_REQUIRED = AD_IMAGE_1_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_1_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_1_LINK_WARNING) {
    this.AD_IMAGE_1_LINK_WARNING = AD_IMAGE_1_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_1_LINK_WARNING
   * @return AD_IMAGE_1_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_1_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_1_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE1LINKWARNING() {
    return AD_IMAGE_1_LINK_WARNING;
  }

  public void setADIMAGE1LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_1_LINK_WARNING) {
    this.AD_IMAGE_1_LINK_WARNING = AD_IMAGE_1_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_1_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_1_TAG_DUPLICATED) {
    this.AD_IMAGE_1_TAG_DUPLICATED = AD_IMAGE_1_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_1_TAG_DUPLICATED
   * @return AD_IMAGE_1_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_1_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_1_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE1TAGDUPLICATED() {
    return AD_IMAGE_1_TAG_DUPLICATED;
  }

  public void setADIMAGE1TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_1_TAG_DUPLICATED) {
    this.AD_IMAGE_1_TAG_DUPLICATED = AD_IMAGE_1_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_1_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_1_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_1_TAG_LENGTH_TOO_LONG = AD_IMAGE_1_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_1_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_1_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_1_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_1_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE1TAGLENGTHTOOLONG() {
    return AD_IMAGE_1_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE1TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_1_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_1_TAG_LENGTH_TOO_LONG = AD_IMAGE_1_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_1_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_1_TAG_REQUIRED) {
    this.AD_IMAGE_1_TAG_REQUIRED = AD_IMAGE_1_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_1_TAG_REQUIRED
   * @return AD_IMAGE_1_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_1_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_1_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE1TAGREQUIRED() {
    return AD_IMAGE_1_TAG_REQUIRED;
  }

  public void setADIMAGE1TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_1_TAG_REQUIRED) {
    this.AD_IMAGE_1_TAG_REQUIRED = AD_IMAGE_1_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_2_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_2_LINK_DUPLICATED) {
    this.AD_IMAGE_2_LINK_DUPLICATED = AD_IMAGE_2_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_2_LINK_DUPLICATED
   * @return AD_IMAGE_2_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_2_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_2_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE2LINKDUPLICATED() {
    return AD_IMAGE_2_LINK_DUPLICATED;
  }

  public void setADIMAGE2LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_2_LINK_DUPLICATED) {
    this.AD_IMAGE_2_LINK_DUPLICATED = AD_IMAGE_2_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_2_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_2_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_2_LINK_LENGTH_TOO_LONG = AD_IMAGE_2_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_2_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_2_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_2_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_2_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE2LINKLENGTHTOOLONG() {
    return AD_IMAGE_2_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE2LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_2_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_2_LINK_LENGTH_TOO_LONG = AD_IMAGE_2_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_2_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_2_LINK_REQUIRED) {
    this.AD_IMAGE_2_LINK_REQUIRED = AD_IMAGE_2_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_2_LINK_REQUIRED
   * @return AD_IMAGE_2_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_2_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_2_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE2LINKREQUIRED() {
    return AD_IMAGE_2_LINK_REQUIRED;
  }

  public void setADIMAGE2LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_2_LINK_REQUIRED) {
    this.AD_IMAGE_2_LINK_REQUIRED = AD_IMAGE_2_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_2_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_2_LINK_WARNING) {
    this.AD_IMAGE_2_LINK_WARNING = AD_IMAGE_2_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_2_LINK_WARNING
   * @return AD_IMAGE_2_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_2_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_2_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE2LINKWARNING() {
    return AD_IMAGE_2_LINK_WARNING;
  }

  public void setADIMAGE2LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_2_LINK_WARNING) {
    this.AD_IMAGE_2_LINK_WARNING = AD_IMAGE_2_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_2_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_2_TAG_DUPLICATED) {
    this.AD_IMAGE_2_TAG_DUPLICATED = AD_IMAGE_2_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_2_TAG_DUPLICATED
   * @return AD_IMAGE_2_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_2_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_2_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE2TAGDUPLICATED() {
    return AD_IMAGE_2_TAG_DUPLICATED;
  }

  public void setADIMAGE2TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_2_TAG_DUPLICATED) {
    this.AD_IMAGE_2_TAG_DUPLICATED = AD_IMAGE_2_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_2_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_2_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_2_TAG_LENGTH_TOO_LONG = AD_IMAGE_2_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_2_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_2_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_2_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_2_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE2TAGLENGTHTOOLONG() {
    return AD_IMAGE_2_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE2TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_2_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_2_TAG_LENGTH_TOO_LONG = AD_IMAGE_2_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_2_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_2_TAG_REQUIRED) {
    this.AD_IMAGE_2_TAG_REQUIRED = AD_IMAGE_2_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_2_TAG_REQUIRED
   * @return AD_IMAGE_2_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_2_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_2_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE2TAGREQUIRED() {
    return AD_IMAGE_2_TAG_REQUIRED;
  }

  public void setADIMAGE2TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_2_TAG_REQUIRED) {
    this.AD_IMAGE_2_TAG_REQUIRED = AD_IMAGE_2_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_3_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_3_LINK_DUPLICATED) {
    this.AD_IMAGE_3_LINK_DUPLICATED = AD_IMAGE_3_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_3_LINK_DUPLICATED
   * @return AD_IMAGE_3_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_3_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_3_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE3LINKDUPLICATED() {
    return AD_IMAGE_3_LINK_DUPLICATED;
  }

  public void setADIMAGE3LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_3_LINK_DUPLICATED) {
    this.AD_IMAGE_3_LINK_DUPLICATED = AD_IMAGE_3_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_3_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_3_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_3_LINK_LENGTH_TOO_LONG = AD_IMAGE_3_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_3_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_3_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_3_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_3_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE3LINKLENGTHTOOLONG() {
    return AD_IMAGE_3_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE3LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_3_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_3_LINK_LENGTH_TOO_LONG = AD_IMAGE_3_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_3_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_3_LINK_REQUIRED) {
    this.AD_IMAGE_3_LINK_REQUIRED = AD_IMAGE_3_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_3_LINK_REQUIRED
   * @return AD_IMAGE_3_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_3_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_3_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE3LINKREQUIRED() {
    return AD_IMAGE_3_LINK_REQUIRED;
  }

  public void setADIMAGE3LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_3_LINK_REQUIRED) {
    this.AD_IMAGE_3_LINK_REQUIRED = AD_IMAGE_3_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_3_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_3_LINK_WARNING) {
    this.AD_IMAGE_3_LINK_WARNING = AD_IMAGE_3_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_3_LINK_WARNING
   * @return AD_IMAGE_3_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_3_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_3_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE3LINKWARNING() {
    return AD_IMAGE_3_LINK_WARNING;
  }

  public void setADIMAGE3LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_3_LINK_WARNING) {
    this.AD_IMAGE_3_LINK_WARNING = AD_IMAGE_3_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_3_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_3_TAG_DUPLICATED) {
    this.AD_IMAGE_3_TAG_DUPLICATED = AD_IMAGE_3_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_3_TAG_DUPLICATED
   * @return AD_IMAGE_3_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_3_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_3_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE3TAGDUPLICATED() {
    return AD_IMAGE_3_TAG_DUPLICATED;
  }

  public void setADIMAGE3TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_3_TAG_DUPLICATED) {
    this.AD_IMAGE_3_TAG_DUPLICATED = AD_IMAGE_3_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_3_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_3_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_3_TAG_LENGTH_TOO_LONG = AD_IMAGE_3_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_3_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_3_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_3_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_3_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE3TAGLENGTHTOOLONG() {
    return AD_IMAGE_3_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE3TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_3_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_3_TAG_LENGTH_TOO_LONG = AD_IMAGE_3_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_3_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_3_TAG_REQUIRED) {
    this.AD_IMAGE_3_TAG_REQUIRED = AD_IMAGE_3_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_3_TAG_REQUIRED
   * @return AD_IMAGE_3_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_3_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_3_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE3TAGREQUIRED() {
    return AD_IMAGE_3_TAG_REQUIRED;
  }

  public void setADIMAGE3TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_3_TAG_REQUIRED) {
    this.AD_IMAGE_3_TAG_REQUIRED = AD_IMAGE_3_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_4_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_4_LINK_DUPLICATED) {
    this.AD_IMAGE_4_LINK_DUPLICATED = AD_IMAGE_4_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_4_LINK_DUPLICATED
   * @return AD_IMAGE_4_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_4_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_4_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE4LINKDUPLICATED() {
    return AD_IMAGE_4_LINK_DUPLICATED;
  }

  public void setADIMAGE4LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_4_LINK_DUPLICATED) {
    this.AD_IMAGE_4_LINK_DUPLICATED = AD_IMAGE_4_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_4_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_4_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_4_LINK_LENGTH_TOO_LONG = AD_IMAGE_4_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_4_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_4_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_4_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_4_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE4LINKLENGTHTOOLONG() {
    return AD_IMAGE_4_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE4LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_4_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_4_LINK_LENGTH_TOO_LONG = AD_IMAGE_4_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_4_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_4_LINK_REQUIRED) {
    this.AD_IMAGE_4_LINK_REQUIRED = AD_IMAGE_4_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_4_LINK_REQUIRED
   * @return AD_IMAGE_4_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_4_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_4_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE4LINKREQUIRED() {
    return AD_IMAGE_4_LINK_REQUIRED;
  }

  public void setADIMAGE4LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_4_LINK_REQUIRED) {
    this.AD_IMAGE_4_LINK_REQUIRED = AD_IMAGE_4_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_4_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_4_LINK_WARNING) {
    this.AD_IMAGE_4_LINK_WARNING = AD_IMAGE_4_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_4_LINK_WARNING
   * @return AD_IMAGE_4_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_4_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_4_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE4LINKWARNING() {
    return AD_IMAGE_4_LINK_WARNING;
  }

  public void setADIMAGE4LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_4_LINK_WARNING) {
    this.AD_IMAGE_4_LINK_WARNING = AD_IMAGE_4_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_4_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_4_TAG_DUPLICATED) {
    this.AD_IMAGE_4_TAG_DUPLICATED = AD_IMAGE_4_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_4_TAG_DUPLICATED
   * @return AD_IMAGE_4_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_4_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_4_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE4TAGDUPLICATED() {
    return AD_IMAGE_4_TAG_DUPLICATED;
  }

  public void setADIMAGE4TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_4_TAG_DUPLICATED) {
    this.AD_IMAGE_4_TAG_DUPLICATED = AD_IMAGE_4_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_4_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_4_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_4_TAG_LENGTH_TOO_LONG = AD_IMAGE_4_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_4_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_4_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_4_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_4_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE4TAGLENGTHTOOLONG() {
    return AD_IMAGE_4_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE4TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_4_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_4_TAG_LENGTH_TOO_LONG = AD_IMAGE_4_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_4_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_4_TAG_REQUIRED) {
    this.AD_IMAGE_4_TAG_REQUIRED = AD_IMAGE_4_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_4_TAG_REQUIRED
   * @return AD_IMAGE_4_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_4_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_4_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE4TAGREQUIRED() {
    return AD_IMAGE_4_TAG_REQUIRED;
  }

  public void setADIMAGE4TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_4_TAG_REQUIRED) {
    this.AD_IMAGE_4_TAG_REQUIRED = AD_IMAGE_4_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_5_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_5_LINK_DUPLICATED) {
    this.AD_IMAGE_5_LINK_DUPLICATED = AD_IMAGE_5_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_5_LINK_DUPLICATED
   * @return AD_IMAGE_5_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_5_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_5_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE5LINKDUPLICATED() {
    return AD_IMAGE_5_LINK_DUPLICATED;
  }

  public void setADIMAGE5LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_5_LINK_DUPLICATED) {
    this.AD_IMAGE_5_LINK_DUPLICATED = AD_IMAGE_5_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_5_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_5_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_5_LINK_LENGTH_TOO_LONG = AD_IMAGE_5_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_5_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_5_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_5_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_5_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE5LINKLENGTHTOOLONG() {
    return AD_IMAGE_5_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE5LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_5_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_5_LINK_LENGTH_TOO_LONG = AD_IMAGE_5_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_5_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_5_LINK_REQUIRED) {
    this.AD_IMAGE_5_LINK_REQUIRED = AD_IMAGE_5_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_5_LINK_REQUIRED
   * @return AD_IMAGE_5_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_5_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_5_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE5LINKREQUIRED() {
    return AD_IMAGE_5_LINK_REQUIRED;
  }

  public void setADIMAGE5LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_5_LINK_REQUIRED) {
    this.AD_IMAGE_5_LINK_REQUIRED = AD_IMAGE_5_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_5_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_5_LINK_WARNING) {
    this.AD_IMAGE_5_LINK_WARNING = AD_IMAGE_5_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_5_LINK_WARNING
   * @return AD_IMAGE_5_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_5_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_5_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE5LINKWARNING() {
    return AD_IMAGE_5_LINK_WARNING;
  }

  public void setADIMAGE5LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_5_LINK_WARNING) {
    this.AD_IMAGE_5_LINK_WARNING = AD_IMAGE_5_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_5_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_5_TAG_DUPLICATED) {
    this.AD_IMAGE_5_TAG_DUPLICATED = AD_IMAGE_5_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_5_TAG_DUPLICATED
   * @return AD_IMAGE_5_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_5_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_5_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE5TAGDUPLICATED() {
    return AD_IMAGE_5_TAG_DUPLICATED;
  }

  public void setADIMAGE5TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_5_TAG_DUPLICATED) {
    this.AD_IMAGE_5_TAG_DUPLICATED = AD_IMAGE_5_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_5_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_5_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_5_TAG_LENGTH_TOO_LONG = AD_IMAGE_5_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_5_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_5_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_5_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_5_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE5TAGLENGTHTOOLONG() {
    return AD_IMAGE_5_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE5TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_5_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_5_TAG_LENGTH_TOO_LONG = AD_IMAGE_5_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_5_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_5_TAG_REQUIRED) {
    this.AD_IMAGE_5_TAG_REQUIRED = AD_IMAGE_5_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_5_TAG_REQUIRED
   * @return AD_IMAGE_5_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_5_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_5_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE5TAGREQUIRED() {
    return AD_IMAGE_5_TAG_REQUIRED;
  }

  public void setADIMAGE5TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_5_TAG_REQUIRED) {
    this.AD_IMAGE_5_TAG_REQUIRED = AD_IMAGE_5_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_6_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_6_LINK_DUPLICATED) {
    this.AD_IMAGE_6_LINK_DUPLICATED = AD_IMAGE_6_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_6_LINK_DUPLICATED
   * @return AD_IMAGE_6_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_6_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_6_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE6LINKDUPLICATED() {
    return AD_IMAGE_6_LINK_DUPLICATED;
  }

  public void setADIMAGE6LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_6_LINK_DUPLICATED) {
    this.AD_IMAGE_6_LINK_DUPLICATED = AD_IMAGE_6_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_6_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_6_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_6_LINK_LENGTH_TOO_LONG = AD_IMAGE_6_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_6_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_6_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_6_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_6_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE6LINKLENGTHTOOLONG() {
    return AD_IMAGE_6_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE6LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_6_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_6_LINK_LENGTH_TOO_LONG = AD_IMAGE_6_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_6_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_6_LINK_REQUIRED) {
    this.AD_IMAGE_6_LINK_REQUIRED = AD_IMAGE_6_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_6_LINK_REQUIRED
   * @return AD_IMAGE_6_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_6_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_6_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE6LINKREQUIRED() {
    return AD_IMAGE_6_LINK_REQUIRED;
  }

  public void setADIMAGE6LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_6_LINK_REQUIRED) {
    this.AD_IMAGE_6_LINK_REQUIRED = AD_IMAGE_6_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_6_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_6_LINK_WARNING) {
    this.AD_IMAGE_6_LINK_WARNING = AD_IMAGE_6_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_6_LINK_WARNING
   * @return AD_IMAGE_6_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_6_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_6_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE6LINKWARNING() {
    return AD_IMAGE_6_LINK_WARNING;
  }

  public void setADIMAGE6LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_6_LINK_WARNING) {
    this.AD_IMAGE_6_LINK_WARNING = AD_IMAGE_6_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_6_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_6_TAG_DUPLICATED) {
    this.AD_IMAGE_6_TAG_DUPLICATED = AD_IMAGE_6_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_6_TAG_DUPLICATED
   * @return AD_IMAGE_6_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_6_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_6_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE6TAGDUPLICATED() {
    return AD_IMAGE_6_TAG_DUPLICATED;
  }

  public void setADIMAGE6TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_6_TAG_DUPLICATED) {
    this.AD_IMAGE_6_TAG_DUPLICATED = AD_IMAGE_6_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_6_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_6_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_6_TAG_LENGTH_TOO_LONG = AD_IMAGE_6_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_6_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_6_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_6_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_6_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE6TAGLENGTHTOOLONG() {
    return AD_IMAGE_6_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE6TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_6_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_6_TAG_LENGTH_TOO_LONG = AD_IMAGE_6_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_6_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_6_TAG_REQUIRED) {
    this.AD_IMAGE_6_TAG_REQUIRED = AD_IMAGE_6_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_6_TAG_REQUIRED
   * @return AD_IMAGE_6_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_6_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_6_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE6TAGREQUIRED() {
    return AD_IMAGE_6_TAG_REQUIRED;
  }

  public void setADIMAGE6TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_6_TAG_REQUIRED) {
    this.AD_IMAGE_6_TAG_REQUIRED = AD_IMAGE_6_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_7_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_7_LINK_DUPLICATED) {
    this.AD_IMAGE_7_LINK_DUPLICATED = AD_IMAGE_7_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_7_LINK_DUPLICATED
   * @return AD_IMAGE_7_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_7_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_7_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE7LINKDUPLICATED() {
    return AD_IMAGE_7_LINK_DUPLICATED;
  }

  public void setADIMAGE7LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_7_LINK_DUPLICATED) {
    this.AD_IMAGE_7_LINK_DUPLICATED = AD_IMAGE_7_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_7_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_7_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_7_LINK_LENGTH_TOO_LONG = AD_IMAGE_7_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_7_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_7_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_7_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_7_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE7LINKLENGTHTOOLONG() {
    return AD_IMAGE_7_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE7LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_7_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_7_LINK_LENGTH_TOO_LONG = AD_IMAGE_7_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_7_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_7_LINK_REQUIRED) {
    this.AD_IMAGE_7_LINK_REQUIRED = AD_IMAGE_7_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_7_LINK_REQUIRED
   * @return AD_IMAGE_7_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_7_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_7_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE7LINKREQUIRED() {
    return AD_IMAGE_7_LINK_REQUIRED;
  }

  public void setADIMAGE7LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_7_LINK_REQUIRED) {
    this.AD_IMAGE_7_LINK_REQUIRED = AD_IMAGE_7_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_7_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_7_LINK_WARNING) {
    this.AD_IMAGE_7_LINK_WARNING = AD_IMAGE_7_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_7_LINK_WARNING
   * @return AD_IMAGE_7_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_7_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_7_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE7LINKWARNING() {
    return AD_IMAGE_7_LINK_WARNING;
  }

  public void setADIMAGE7LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_7_LINK_WARNING) {
    this.AD_IMAGE_7_LINK_WARNING = AD_IMAGE_7_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_7_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_7_TAG_DUPLICATED) {
    this.AD_IMAGE_7_TAG_DUPLICATED = AD_IMAGE_7_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_7_TAG_DUPLICATED
   * @return AD_IMAGE_7_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_7_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_7_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE7TAGDUPLICATED() {
    return AD_IMAGE_7_TAG_DUPLICATED;
  }

  public void setADIMAGE7TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_7_TAG_DUPLICATED) {
    this.AD_IMAGE_7_TAG_DUPLICATED = AD_IMAGE_7_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_7_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_7_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_7_TAG_LENGTH_TOO_LONG = AD_IMAGE_7_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_7_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_7_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_7_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_7_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE7TAGLENGTHTOOLONG() {
    return AD_IMAGE_7_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE7TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_7_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_7_TAG_LENGTH_TOO_LONG = AD_IMAGE_7_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_7_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_7_TAG_REQUIRED) {
    this.AD_IMAGE_7_TAG_REQUIRED = AD_IMAGE_7_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_7_TAG_REQUIRED
   * @return AD_IMAGE_7_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_7_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_7_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE7TAGREQUIRED() {
    return AD_IMAGE_7_TAG_REQUIRED;
  }

  public void setADIMAGE7TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_7_TAG_REQUIRED) {
    this.AD_IMAGE_7_TAG_REQUIRED = AD_IMAGE_7_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_8_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_8_LINK_DUPLICATED) {
    this.AD_IMAGE_8_LINK_DUPLICATED = AD_IMAGE_8_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_8_LINK_DUPLICATED
   * @return AD_IMAGE_8_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_8_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_8_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE8LINKDUPLICATED() {
    return AD_IMAGE_8_LINK_DUPLICATED;
  }

  public void setADIMAGE8LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_8_LINK_DUPLICATED) {
    this.AD_IMAGE_8_LINK_DUPLICATED = AD_IMAGE_8_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_8_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_8_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_8_LINK_LENGTH_TOO_LONG = AD_IMAGE_8_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_8_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_8_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_8_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_8_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE8LINKLENGTHTOOLONG() {
    return AD_IMAGE_8_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE8LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_8_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_8_LINK_LENGTH_TOO_LONG = AD_IMAGE_8_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_8_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_8_LINK_REQUIRED) {
    this.AD_IMAGE_8_LINK_REQUIRED = AD_IMAGE_8_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_8_LINK_REQUIRED
   * @return AD_IMAGE_8_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_8_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_8_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE8LINKREQUIRED() {
    return AD_IMAGE_8_LINK_REQUIRED;
  }

  public void setADIMAGE8LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_8_LINK_REQUIRED) {
    this.AD_IMAGE_8_LINK_REQUIRED = AD_IMAGE_8_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_8_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_8_LINK_WARNING) {
    this.AD_IMAGE_8_LINK_WARNING = AD_IMAGE_8_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_8_LINK_WARNING
   * @return AD_IMAGE_8_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_8_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_8_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE8LINKWARNING() {
    return AD_IMAGE_8_LINK_WARNING;
  }

  public void setADIMAGE8LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_8_LINK_WARNING) {
    this.AD_IMAGE_8_LINK_WARNING = AD_IMAGE_8_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_8_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_8_TAG_DUPLICATED) {
    this.AD_IMAGE_8_TAG_DUPLICATED = AD_IMAGE_8_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_8_TAG_DUPLICATED
   * @return AD_IMAGE_8_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_8_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_8_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE8TAGDUPLICATED() {
    return AD_IMAGE_8_TAG_DUPLICATED;
  }

  public void setADIMAGE8TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_8_TAG_DUPLICATED) {
    this.AD_IMAGE_8_TAG_DUPLICATED = AD_IMAGE_8_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_8_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_8_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_8_TAG_LENGTH_TOO_LONG = AD_IMAGE_8_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_8_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_8_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_8_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_8_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE8TAGLENGTHTOOLONG() {
    return AD_IMAGE_8_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE8TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_8_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_8_TAG_LENGTH_TOO_LONG = AD_IMAGE_8_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_8_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_8_TAG_REQUIRED) {
    this.AD_IMAGE_8_TAG_REQUIRED = AD_IMAGE_8_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_8_TAG_REQUIRED
   * @return AD_IMAGE_8_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_8_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_8_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE8TAGREQUIRED() {
    return AD_IMAGE_8_TAG_REQUIRED;
  }

  public void setADIMAGE8TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_8_TAG_REQUIRED) {
    this.AD_IMAGE_8_TAG_REQUIRED = AD_IMAGE_8_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_9_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_9_LINK_DUPLICATED) {
    this.AD_IMAGE_9_LINK_DUPLICATED = AD_IMAGE_9_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_9_LINK_DUPLICATED
   * @return AD_IMAGE_9_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_9_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_9_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE9LINKDUPLICATED() {
    return AD_IMAGE_9_LINK_DUPLICATED;
  }

  public void setADIMAGE9LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_9_LINK_DUPLICATED) {
    this.AD_IMAGE_9_LINK_DUPLICATED = AD_IMAGE_9_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_9_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_9_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_9_LINK_LENGTH_TOO_LONG = AD_IMAGE_9_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_9_LINK_LENGTH_TOO_LONG
   * @return AD_IMAGE_9_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_9_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_9_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE9LINKLENGTHTOOLONG() {
    return AD_IMAGE_9_LINK_LENGTH_TOO_LONG;
  }

  public void setADIMAGE9LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_9_LINK_LENGTH_TOO_LONG) {
    this.AD_IMAGE_9_LINK_LENGTH_TOO_LONG = AD_IMAGE_9_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_9_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_9_LINK_REQUIRED) {
    this.AD_IMAGE_9_LINK_REQUIRED = AD_IMAGE_9_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_9_LINK_REQUIRED
   * @return AD_IMAGE_9_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_9_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_9_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE9LINKREQUIRED() {
    return AD_IMAGE_9_LINK_REQUIRED;
  }

  public void setADIMAGE9LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_9_LINK_REQUIRED) {
    this.AD_IMAGE_9_LINK_REQUIRED = AD_IMAGE_9_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_9_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_9_LINK_WARNING) {
    this.AD_IMAGE_9_LINK_WARNING = AD_IMAGE_9_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_IMAGE_9_LINK_WARNING
   * @return AD_IMAGE_9_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_IMAGE_9_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_9_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADIMAGE9LINKWARNING() {
    return AD_IMAGE_9_LINK_WARNING;
  }

  public void setADIMAGE9LINKWARNING(@Nullable CatalogsItemValidationDetails AD_IMAGE_9_LINK_WARNING) {
    this.AD_IMAGE_9_LINK_WARNING = AD_IMAGE_9_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_9_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_9_TAG_DUPLICATED) {
    this.AD_IMAGE_9_TAG_DUPLICATED = AD_IMAGE_9_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_IMAGE_9_TAG_DUPLICATED
   * @return AD_IMAGE_9_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_9_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_9_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE9TAGDUPLICATED() {
    return AD_IMAGE_9_TAG_DUPLICATED;
  }

  public void setADIMAGE9TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_IMAGE_9_TAG_DUPLICATED) {
    this.AD_IMAGE_9_TAG_DUPLICATED = AD_IMAGE_9_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_9_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_9_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_9_TAG_LENGTH_TOO_LONG = AD_IMAGE_9_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_IMAGE_9_TAG_LENGTH_TOO_LONG
   * @return AD_IMAGE_9_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_IMAGE_9_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_9_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADIMAGE9TAGLENGTHTOOLONG() {
    return AD_IMAGE_9_TAG_LENGTH_TOO_LONG;
  }

  public void setADIMAGE9TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_IMAGE_9_TAG_LENGTH_TOO_LONG) {
    this.AD_IMAGE_9_TAG_LENGTH_TOO_LONG = AD_IMAGE_9_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_IMAGE_9_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_9_TAG_REQUIRED) {
    this.AD_IMAGE_9_TAG_REQUIRED = AD_IMAGE_9_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_IMAGE_9_TAG_REQUIRED
   * @return AD_IMAGE_9_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_IMAGE_9_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_IMAGE_9_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADIMAGE9TAGREQUIRED() {
    return AD_IMAGE_9_TAG_REQUIRED;
  }

  public void setADIMAGE9TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_IMAGE_9_TAG_REQUIRED) {
    this.AD_IMAGE_9_TAG_REQUIRED = AD_IMAGE_9_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_LINK_FORMAT_WARNING(@Nullable CatalogsItemValidationDetails AD_LINK_FORMAT_WARNING) {
    this.AD_LINK_FORMAT_WARNING = AD_LINK_FORMAT_WARNING;
    return this;
  }

  /**
   * Get AD_LINK_FORMAT_WARNING
   * @return AD_LINK_FORMAT_WARNING
   */
  @Valid 
  @Schema(name = "AD_LINK_FORMAT_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_LINK_FORMAT_WARNING")
  public @Nullable CatalogsItemValidationDetails getADLINKFORMATWARNING() {
    return AD_LINK_FORMAT_WARNING;
  }

  public void setADLINKFORMATWARNING(@Nullable CatalogsItemValidationDetails AD_LINK_FORMAT_WARNING) {
    this.AD_LINK_FORMAT_WARNING = AD_LINK_FORMAT_WARNING;
  }

  public CatalogsItemValidationWarnings AD_LINK_SAME_AS_LINK(@Nullable CatalogsItemValidationDetails AD_LINK_SAME_AS_LINK) {
    this.AD_LINK_SAME_AS_LINK = AD_LINK_SAME_AS_LINK;
    return this;
  }

  /**
   * Get AD_LINK_SAME_AS_LINK
   * @return AD_LINK_SAME_AS_LINK
   */
  @Valid 
  @Schema(name = "AD_LINK_SAME_AS_LINK", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_LINK_SAME_AS_LINK")
  public @Nullable CatalogsItemValidationDetails getADLINKSAMEASLINK() {
    return AD_LINK_SAME_AS_LINK;
  }

  public void setADLINKSAMEASLINK(@Nullable CatalogsItemValidationDetails AD_LINK_SAME_AS_LINK) {
    this.AD_LINK_SAME_AS_LINK = AD_LINK_SAME_AS_LINK;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_0_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_VIDEO_0_LINK_DUPLICATED) {
    this.AD_VIDEO_0_LINK_DUPLICATED = AD_VIDEO_0_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_VIDEO_0_LINK_DUPLICATED
   * @return AD_VIDEO_0_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_VIDEO_0_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_0_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADVIDEO0LINKDUPLICATED() {
    return AD_VIDEO_0_LINK_DUPLICATED;
  }

  public void setADVIDEO0LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_VIDEO_0_LINK_DUPLICATED) {
    this.AD_VIDEO_0_LINK_DUPLICATED = AD_VIDEO_0_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_0_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_VIDEO_0_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_0_LINK_LENGTH_TOO_LONG = AD_VIDEO_0_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_VIDEO_0_LINK_LENGTH_TOO_LONG
   * @return AD_VIDEO_0_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_VIDEO_0_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_0_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADVIDEO0LINKLENGTHTOOLONG() {
    return AD_VIDEO_0_LINK_LENGTH_TOO_LONG;
  }

  public void setADVIDEO0LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_VIDEO_0_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_0_LINK_LENGTH_TOO_LONG = AD_VIDEO_0_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_0_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_VIDEO_0_LINK_REQUIRED) {
    this.AD_VIDEO_0_LINK_REQUIRED = AD_VIDEO_0_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_VIDEO_0_LINK_REQUIRED
   * @return AD_VIDEO_0_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_VIDEO_0_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_0_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADVIDEO0LINKREQUIRED() {
    return AD_VIDEO_0_LINK_REQUIRED;
  }

  public void setADVIDEO0LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_VIDEO_0_LINK_REQUIRED) {
    this.AD_VIDEO_0_LINK_REQUIRED = AD_VIDEO_0_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_0_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_VIDEO_0_LINK_WARNING) {
    this.AD_VIDEO_0_LINK_WARNING = AD_VIDEO_0_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_VIDEO_0_LINK_WARNING
   * @return AD_VIDEO_0_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_VIDEO_0_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_0_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADVIDEO0LINKWARNING() {
    return AD_VIDEO_0_LINK_WARNING;
  }

  public void setADVIDEO0LINKWARNING(@Nullable CatalogsItemValidationDetails AD_VIDEO_0_LINK_WARNING) {
    this.AD_VIDEO_0_LINK_WARNING = AD_VIDEO_0_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_0_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_VIDEO_0_TAG_DUPLICATED) {
    this.AD_VIDEO_0_TAG_DUPLICATED = AD_VIDEO_0_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_VIDEO_0_TAG_DUPLICATED
   * @return AD_VIDEO_0_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_VIDEO_0_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_0_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADVIDEO0TAGDUPLICATED() {
    return AD_VIDEO_0_TAG_DUPLICATED;
  }

  public void setADVIDEO0TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_VIDEO_0_TAG_DUPLICATED) {
    this.AD_VIDEO_0_TAG_DUPLICATED = AD_VIDEO_0_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_0_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_VIDEO_0_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_0_TAG_LENGTH_TOO_LONG = AD_VIDEO_0_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_VIDEO_0_TAG_LENGTH_TOO_LONG
   * @return AD_VIDEO_0_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_VIDEO_0_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_0_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADVIDEO0TAGLENGTHTOOLONG() {
    return AD_VIDEO_0_TAG_LENGTH_TOO_LONG;
  }

  public void setADVIDEO0TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_VIDEO_0_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_0_TAG_LENGTH_TOO_LONG = AD_VIDEO_0_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_0_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_VIDEO_0_TAG_REQUIRED) {
    this.AD_VIDEO_0_TAG_REQUIRED = AD_VIDEO_0_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_VIDEO_0_TAG_REQUIRED
   * @return AD_VIDEO_0_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_VIDEO_0_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_0_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADVIDEO0TAGREQUIRED() {
    return AD_VIDEO_0_TAG_REQUIRED;
  }

  public void setADVIDEO0TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_VIDEO_0_TAG_REQUIRED) {
    this.AD_VIDEO_0_TAG_REQUIRED = AD_VIDEO_0_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_1_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_VIDEO_1_LINK_DUPLICATED) {
    this.AD_VIDEO_1_LINK_DUPLICATED = AD_VIDEO_1_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_VIDEO_1_LINK_DUPLICATED
   * @return AD_VIDEO_1_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_VIDEO_1_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_1_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADVIDEO1LINKDUPLICATED() {
    return AD_VIDEO_1_LINK_DUPLICATED;
  }

  public void setADVIDEO1LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_VIDEO_1_LINK_DUPLICATED) {
    this.AD_VIDEO_1_LINK_DUPLICATED = AD_VIDEO_1_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_1_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_VIDEO_1_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_1_LINK_LENGTH_TOO_LONG = AD_VIDEO_1_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_VIDEO_1_LINK_LENGTH_TOO_LONG
   * @return AD_VIDEO_1_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_VIDEO_1_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_1_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADVIDEO1LINKLENGTHTOOLONG() {
    return AD_VIDEO_1_LINK_LENGTH_TOO_LONG;
  }

  public void setADVIDEO1LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_VIDEO_1_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_1_LINK_LENGTH_TOO_LONG = AD_VIDEO_1_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_1_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_VIDEO_1_LINK_REQUIRED) {
    this.AD_VIDEO_1_LINK_REQUIRED = AD_VIDEO_1_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_VIDEO_1_LINK_REQUIRED
   * @return AD_VIDEO_1_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_VIDEO_1_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_1_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADVIDEO1LINKREQUIRED() {
    return AD_VIDEO_1_LINK_REQUIRED;
  }

  public void setADVIDEO1LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_VIDEO_1_LINK_REQUIRED) {
    this.AD_VIDEO_1_LINK_REQUIRED = AD_VIDEO_1_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_1_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_VIDEO_1_LINK_WARNING) {
    this.AD_VIDEO_1_LINK_WARNING = AD_VIDEO_1_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_VIDEO_1_LINK_WARNING
   * @return AD_VIDEO_1_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_VIDEO_1_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_1_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADVIDEO1LINKWARNING() {
    return AD_VIDEO_1_LINK_WARNING;
  }

  public void setADVIDEO1LINKWARNING(@Nullable CatalogsItemValidationDetails AD_VIDEO_1_LINK_WARNING) {
    this.AD_VIDEO_1_LINK_WARNING = AD_VIDEO_1_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_1_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_VIDEO_1_TAG_DUPLICATED) {
    this.AD_VIDEO_1_TAG_DUPLICATED = AD_VIDEO_1_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_VIDEO_1_TAG_DUPLICATED
   * @return AD_VIDEO_1_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_VIDEO_1_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_1_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADVIDEO1TAGDUPLICATED() {
    return AD_VIDEO_1_TAG_DUPLICATED;
  }

  public void setADVIDEO1TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_VIDEO_1_TAG_DUPLICATED) {
    this.AD_VIDEO_1_TAG_DUPLICATED = AD_VIDEO_1_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_1_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_VIDEO_1_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_1_TAG_LENGTH_TOO_LONG = AD_VIDEO_1_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_VIDEO_1_TAG_LENGTH_TOO_LONG
   * @return AD_VIDEO_1_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_VIDEO_1_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_1_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADVIDEO1TAGLENGTHTOOLONG() {
    return AD_VIDEO_1_TAG_LENGTH_TOO_LONG;
  }

  public void setADVIDEO1TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_VIDEO_1_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_1_TAG_LENGTH_TOO_LONG = AD_VIDEO_1_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_1_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_VIDEO_1_TAG_REQUIRED) {
    this.AD_VIDEO_1_TAG_REQUIRED = AD_VIDEO_1_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_VIDEO_1_TAG_REQUIRED
   * @return AD_VIDEO_1_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_VIDEO_1_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_1_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADVIDEO1TAGREQUIRED() {
    return AD_VIDEO_1_TAG_REQUIRED;
  }

  public void setADVIDEO1TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_VIDEO_1_TAG_REQUIRED) {
    this.AD_VIDEO_1_TAG_REQUIRED = AD_VIDEO_1_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_2_LINK_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_VIDEO_2_LINK_DUPLICATED) {
    this.AD_VIDEO_2_LINK_DUPLICATED = AD_VIDEO_2_LINK_DUPLICATED;
    return this;
  }

  /**
   * Get AD_VIDEO_2_LINK_DUPLICATED
   * @return AD_VIDEO_2_LINK_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_VIDEO_2_LINK_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_2_LINK_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADVIDEO2LINKDUPLICATED() {
    return AD_VIDEO_2_LINK_DUPLICATED;
  }

  public void setADVIDEO2LINKDUPLICATED(@Nullable CatalogsItemValidationDetails AD_VIDEO_2_LINK_DUPLICATED) {
    this.AD_VIDEO_2_LINK_DUPLICATED = AD_VIDEO_2_LINK_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_2_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_VIDEO_2_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_2_LINK_LENGTH_TOO_LONG = AD_VIDEO_2_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_VIDEO_2_LINK_LENGTH_TOO_LONG
   * @return AD_VIDEO_2_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_VIDEO_2_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_2_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADVIDEO2LINKLENGTHTOOLONG() {
    return AD_VIDEO_2_LINK_LENGTH_TOO_LONG;
  }

  public void setADVIDEO2LINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_VIDEO_2_LINK_LENGTH_TOO_LONG) {
    this.AD_VIDEO_2_LINK_LENGTH_TOO_LONG = AD_VIDEO_2_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_2_LINK_REQUIRED(@Nullable CatalogsItemValidationDetails AD_VIDEO_2_LINK_REQUIRED) {
    this.AD_VIDEO_2_LINK_REQUIRED = AD_VIDEO_2_LINK_REQUIRED;
    return this;
  }

  /**
   * Get AD_VIDEO_2_LINK_REQUIRED
   * @return AD_VIDEO_2_LINK_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_VIDEO_2_LINK_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_2_LINK_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADVIDEO2LINKREQUIRED() {
    return AD_VIDEO_2_LINK_REQUIRED;
  }

  public void setADVIDEO2LINKREQUIRED(@Nullable CatalogsItemValidationDetails AD_VIDEO_2_LINK_REQUIRED) {
    this.AD_VIDEO_2_LINK_REQUIRED = AD_VIDEO_2_LINK_REQUIRED;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_2_LINK_WARNING(@Nullable CatalogsItemValidationDetails AD_VIDEO_2_LINK_WARNING) {
    this.AD_VIDEO_2_LINK_WARNING = AD_VIDEO_2_LINK_WARNING;
    return this;
  }

  /**
   * Get AD_VIDEO_2_LINK_WARNING
   * @return AD_VIDEO_2_LINK_WARNING
   */
  @Valid 
  @Schema(name = "AD_VIDEO_2_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_2_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADVIDEO2LINKWARNING() {
    return AD_VIDEO_2_LINK_WARNING;
  }

  public void setADVIDEO2LINKWARNING(@Nullable CatalogsItemValidationDetails AD_VIDEO_2_LINK_WARNING) {
    this.AD_VIDEO_2_LINK_WARNING = AD_VIDEO_2_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_2_TAG_DUPLICATED(@Nullable CatalogsItemValidationDetails AD_VIDEO_2_TAG_DUPLICATED) {
    this.AD_VIDEO_2_TAG_DUPLICATED = AD_VIDEO_2_TAG_DUPLICATED;
    return this;
  }

  /**
   * Get AD_VIDEO_2_TAG_DUPLICATED
   * @return AD_VIDEO_2_TAG_DUPLICATED
   */
  @Valid 
  @Schema(name = "AD_VIDEO_2_TAG_DUPLICATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_2_TAG_DUPLICATED")
  public @Nullable CatalogsItemValidationDetails getADVIDEO2TAGDUPLICATED() {
    return AD_VIDEO_2_TAG_DUPLICATED;
  }

  public void setADVIDEO2TAGDUPLICATED(@Nullable CatalogsItemValidationDetails AD_VIDEO_2_TAG_DUPLICATED) {
    this.AD_VIDEO_2_TAG_DUPLICATED = AD_VIDEO_2_TAG_DUPLICATED;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_2_TAG_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails AD_VIDEO_2_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_2_TAG_LENGTH_TOO_LONG = AD_VIDEO_2_TAG_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get AD_VIDEO_2_TAG_LENGTH_TOO_LONG
   * @return AD_VIDEO_2_TAG_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "AD_VIDEO_2_TAG_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_2_TAG_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADVIDEO2TAGLENGTHTOOLONG() {
    return AD_VIDEO_2_TAG_LENGTH_TOO_LONG;
  }

  public void setADVIDEO2TAGLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails AD_VIDEO_2_TAG_LENGTH_TOO_LONG) {
    this.AD_VIDEO_2_TAG_LENGTH_TOO_LONG = AD_VIDEO_2_TAG_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings AD_VIDEO_2_TAG_REQUIRED(@Nullable CatalogsItemValidationDetails AD_VIDEO_2_TAG_REQUIRED) {
    this.AD_VIDEO_2_TAG_REQUIRED = AD_VIDEO_2_TAG_REQUIRED;
    return this;
  }

  /**
   * Get AD_VIDEO_2_TAG_REQUIRED
   * @return AD_VIDEO_2_TAG_REQUIRED
   */
  @Valid 
  @Schema(name = "AD_VIDEO_2_TAG_REQUIRED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_VIDEO_2_TAG_REQUIRED")
  public @Nullable CatalogsItemValidationDetails getADVIDEO2TAGREQUIRED() {
    return AD_VIDEO_2_TAG_REQUIRED;
  }

  public void setADVIDEO2TAGREQUIRED(@Nullable CatalogsItemValidationDetails AD_VIDEO_2_TAG_REQUIRED) {
    this.AD_VIDEO_2_TAG_REQUIRED = AD_VIDEO_2_TAG_REQUIRED;
  }

  public CatalogsItemValidationWarnings ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG) {
    this.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG = ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG
   * @return ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getADDITIONALIMAGELINKLENGTHTOOLONG() {
    return ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
  }

  public void setADDITIONALIMAGELINKLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG) {
    this.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG = ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings ADDITIONAL_IMAGE_LINK_WARNING(@Nullable CatalogsItemValidationDetails ADDITIONAL_IMAGE_LINK_WARNING) {
    this.ADDITIONAL_IMAGE_LINK_WARNING = ADDITIONAL_IMAGE_LINK_WARNING;
    return this;
  }

  /**
   * Get ADDITIONAL_IMAGE_LINK_WARNING
   * @return ADDITIONAL_IMAGE_LINK_WARNING
   */
  @Valid 
  @Schema(name = "ADDITIONAL_IMAGE_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADDITIONAL_IMAGE_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getADDITIONALIMAGELINKWARNING() {
    return ADDITIONAL_IMAGE_LINK_WARNING;
  }

  public void setADDITIONALIMAGELINKWARNING(@Nullable CatalogsItemValidationDetails ADDITIONAL_IMAGE_LINK_WARNING) {
    this.ADDITIONAL_IMAGE_LINK_WARNING = ADDITIONAL_IMAGE_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings ADWORDS_FORMAT_WARNING(@Nullable CatalogsItemValidationDetails ADWORDS_FORMAT_WARNING) {
    this.ADWORDS_FORMAT_WARNING = ADWORDS_FORMAT_WARNING;
    return this;
  }

  /**
   * Get ADWORDS_FORMAT_WARNING
   * @return ADWORDS_FORMAT_WARNING
   */
  @Valid 
  @Schema(name = "ADWORDS_FORMAT_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADWORDS_FORMAT_WARNING")
  public @Nullable CatalogsItemValidationDetails getADWORDSFORMATWARNING() {
    return ADWORDS_FORMAT_WARNING;
  }

  public void setADWORDSFORMATWARNING(@Nullable CatalogsItemValidationDetails ADWORDS_FORMAT_WARNING) {
    this.ADWORDS_FORMAT_WARNING = ADWORDS_FORMAT_WARNING;
  }

  public CatalogsItemValidationWarnings ADWORDS_SAME_AS_LINK(@Nullable CatalogsItemValidationDetails ADWORDS_SAME_AS_LINK) {
    this.ADWORDS_SAME_AS_LINK = ADWORDS_SAME_AS_LINK;
    return this;
  }

  /**
   * Get ADWORDS_SAME_AS_LINK
   * @return ADWORDS_SAME_AS_LINK
   */
  @Valid 
  @Schema(name = "ADWORDS_SAME_AS_LINK", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ADWORDS_SAME_AS_LINK")
  public @Nullable CatalogsItemValidationDetails getADWORDSSAMEASLINK() {
    return ADWORDS_SAME_AS_LINK;
  }

  public void setADWORDSSAMEASLINK(@Nullable CatalogsItemValidationDetails ADWORDS_SAME_AS_LINK) {
    this.ADWORDS_SAME_AS_LINK = ADWORDS_SAME_AS_LINK;
  }

  public CatalogsItemValidationWarnings AGE_GROUP_INVALID(@Nullable CatalogsItemValidationDetails AGE_GROUP_INVALID) {
    this.AGE_GROUP_INVALID = AGE_GROUP_INVALID;
    return this;
  }

  /**
   * Get AGE_GROUP_INVALID
   * @return AGE_GROUP_INVALID
   */
  @Valid 
  @Schema(name = "AGE_GROUP_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AGE_GROUP_INVALID")
  public @Nullable CatalogsItemValidationDetails getAGEGROUPINVALID() {
    return AGE_GROUP_INVALID;
  }

  public void setAGEGROUPINVALID(@Nullable CatalogsItemValidationDetails AGE_GROUP_INVALID) {
    this.AGE_GROUP_INVALID = AGE_GROUP_INVALID;
  }

  public CatalogsItemValidationWarnings ANDROID_DEEP_LINK_INVALID(@Nullable CatalogsItemValidationDetails ANDROID_DEEP_LINK_INVALID) {
    this.ANDROID_DEEP_LINK_INVALID = ANDROID_DEEP_LINK_INVALID;
    return this;
  }

  /**
   * Get ANDROID_DEEP_LINK_INVALID
   * @return ANDROID_DEEP_LINK_INVALID
   */
  @Valid 
  @Schema(name = "ANDROID_DEEP_LINK_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ANDROID_DEEP_LINK_INVALID")
  public @Nullable CatalogsItemValidationDetails getANDROIDDEEPLINKINVALID() {
    return ANDROID_DEEP_LINK_INVALID;
  }

  public void setANDROIDDEEPLINKINVALID(@Nullable CatalogsItemValidationDetails ANDROID_DEEP_LINK_INVALID) {
    this.ANDROID_DEEP_LINK_INVALID = ANDROID_DEEP_LINK_INVALID;
  }

  public CatalogsItemValidationWarnings AVAILABILITY_DATE_INVALID(@Nullable CatalogsItemValidationDetails AVAILABILITY_DATE_INVALID) {
    this.AVAILABILITY_DATE_INVALID = AVAILABILITY_DATE_INVALID;
    return this;
  }

  /**
   * Get AVAILABILITY_DATE_INVALID
   * @return AVAILABILITY_DATE_INVALID
   */
  @Valid 
  @Schema(name = "AVAILABILITY_DATE_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AVAILABILITY_DATE_INVALID")
  public @Nullable CatalogsItemValidationDetails getAVAILABILITYDATEINVALID() {
    return AVAILABILITY_DATE_INVALID;
  }

  public void setAVAILABILITYDATEINVALID(@Nullable CatalogsItemValidationDetails AVAILABILITY_DATE_INVALID) {
    this.AVAILABILITY_DATE_INVALID = AVAILABILITY_DATE_INVALID;
  }

  public CatalogsItemValidationWarnings COUNTRY_DOES_NOT_MAP_TO_CURRENCY(@Nullable CatalogsItemValidationDetails COUNTRY_DOES_NOT_MAP_TO_CURRENCY) {
    this.COUNTRY_DOES_NOT_MAP_TO_CURRENCY = COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
    return this;
  }

  /**
   * Get COUNTRY_DOES_NOT_MAP_TO_CURRENCY
   * @return COUNTRY_DOES_NOT_MAP_TO_CURRENCY
   */
  @Valid 
  @Schema(name = "COUNTRY_DOES_NOT_MAP_TO_CURRENCY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("COUNTRY_DOES_NOT_MAP_TO_CURRENCY")
  public @Nullable CatalogsItemValidationDetails getCOUNTRYDOESNOTMAPTOCURRENCY() {
    return COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
  }

  public void setCOUNTRYDOESNOTMAPTOCURRENCY(@Nullable CatalogsItemValidationDetails COUNTRY_DOES_NOT_MAP_TO_CURRENCY) {
    this.COUNTRY_DOES_NOT_MAP_TO_CURRENCY = COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
  }

  public CatalogsItemValidationWarnings CUSTOM_LABEL_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails CUSTOM_LABEL_LENGTH_TOO_LONG) {
    this.CUSTOM_LABEL_LENGTH_TOO_LONG = CUSTOM_LABEL_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get CUSTOM_LABEL_LENGTH_TOO_LONG
   * @return CUSTOM_LABEL_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "CUSTOM_LABEL_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CUSTOM_LABEL_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getCUSTOMLABELLENGTHTOOLONG() {
    return CUSTOM_LABEL_LENGTH_TOO_LONG;
  }

  public void setCUSTOMLABELLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails CUSTOM_LABEL_LENGTH_TOO_LONG) {
    this.CUSTOM_LABEL_LENGTH_TOO_LONG = CUSTOM_LABEL_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings DESCRIPTION_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails DESCRIPTION_LENGTH_TOO_LONG) {
    this.DESCRIPTION_LENGTH_TOO_LONG = DESCRIPTION_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get DESCRIPTION_LENGTH_TOO_LONG
   * @return DESCRIPTION_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "DESCRIPTION_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DESCRIPTION_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getDESCRIPTIONLENGTHTOOLONG() {
    return DESCRIPTION_LENGTH_TOO_LONG;
  }

  public void setDESCRIPTIONLENGTHTOOLONG(@Nullable CatalogsItemValidationDetails DESCRIPTION_LENGTH_TOO_LONG) {
    this.DESCRIPTION_LENGTH_TOO_LONG = DESCRIPTION_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings EXPIRATION_DATE_INVALID(@Nullable CatalogsItemValidationDetails EXPIRATION_DATE_INVALID) {
    this.EXPIRATION_DATE_INVALID = EXPIRATION_DATE_INVALID;
    return this;
  }

  /**
   * Get EXPIRATION_DATE_INVALID
   * @return EXPIRATION_DATE_INVALID
   */
  @Valid 
  @Schema(name = "EXPIRATION_DATE_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EXPIRATION_DATE_INVALID")
  public @Nullable CatalogsItemValidationDetails getEXPIRATIONDATEINVALID() {
    return EXPIRATION_DATE_INVALID;
  }

  public void setEXPIRATIONDATEINVALID(@Nullable CatalogsItemValidationDetails EXPIRATION_DATE_INVALID) {
    this.EXPIRATION_DATE_INVALID = EXPIRATION_DATE_INVALID;
  }

  public CatalogsItemValidationWarnings GENDER_INVALID(@Nullable CatalogsItemValidationDetails GENDER_INVALID) {
    this.GENDER_INVALID = GENDER_INVALID;
    return this;
  }

  /**
   * Get GENDER_INVALID
   * @return GENDER_INVALID
   */
  @Valid 
  @Schema(name = "GENDER_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GENDER_INVALID")
  public @Nullable CatalogsItemValidationDetails getGENDERINVALID() {
    return GENDER_INVALID;
  }

  public void setGENDERINVALID(@Nullable CatalogsItemValidationDetails GENDER_INVALID) {
    this.GENDER_INVALID = GENDER_INVALID;
  }

  public CatalogsItemValidationWarnings GTIN_INVALID(@Nullable CatalogsItemValidationDetails GTIN_INVALID) {
    this.GTIN_INVALID = GTIN_INVALID;
    return this;
  }

  /**
   * Get GTIN_INVALID
   * @return GTIN_INVALID
   */
  @Valid 
  @Schema(name = "GTIN_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GTIN_INVALID")
  public @Nullable CatalogsItemValidationDetails getGTININVALID() {
    return GTIN_INVALID;
  }

  public void setGTININVALID(@Nullable CatalogsItemValidationDetails GTIN_INVALID) {
    this.GTIN_INVALID = GTIN_INVALID;
  }

  public CatalogsItemValidationWarnings IMAGE_LINK_WARNING(@Nullable CatalogsItemValidationDetails IMAGE_LINK_WARNING) {
    this.IMAGE_LINK_WARNING = IMAGE_LINK_WARNING;
    return this;
  }

  /**
   * Get IMAGE_LINK_WARNING
   * @return IMAGE_LINK_WARNING
   */
  @Valid 
  @Schema(name = "IMAGE_LINK_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IMAGE_LINK_WARNING")
  public @Nullable CatalogsItemValidationDetails getIMAGELINKWARNING() {
    return IMAGE_LINK_WARNING;
  }

  public void setIMAGELINKWARNING(@Nullable CatalogsItemValidationDetails IMAGE_LINK_WARNING) {
    this.IMAGE_LINK_WARNING = IMAGE_LINK_WARNING;
  }

  public CatalogsItemValidationWarnings IOS_DEEP_LINK_INVALID(@Nullable CatalogsItemValidationDetails IOS_DEEP_LINK_INVALID) {
    this.IOS_DEEP_LINK_INVALID = IOS_DEEP_LINK_INVALID;
    return this;
  }

  /**
   * Get IOS_DEEP_LINK_INVALID
   * @return IOS_DEEP_LINK_INVALID
   */
  @Valid 
  @Schema(name = "IOS_DEEP_LINK_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IOS_DEEP_LINK_INVALID")
  public @Nullable CatalogsItemValidationDetails getIOSDEEPLINKINVALID() {
    return IOS_DEEP_LINK_INVALID;
  }

  public void setIOSDEEPLINKINVALID(@Nullable CatalogsItemValidationDetails IOS_DEEP_LINK_INVALID) {
    this.IOS_DEEP_LINK_INVALID = IOS_DEEP_LINK_INVALID;
  }

  public CatalogsItemValidationWarnings IS_BUNDLE_INVALID(@Nullable CatalogsItemValidationDetails IS_BUNDLE_INVALID) {
    this.IS_BUNDLE_INVALID = IS_BUNDLE_INVALID;
    return this;
  }

  /**
   * Get IS_BUNDLE_INVALID
   * @return IS_BUNDLE_INVALID
   */
  @Valid 
  @Schema(name = "IS_BUNDLE_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IS_BUNDLE_INVALID")
  public @Nullable CatalogsItemValidationDetails getISBUNDLEINVALID() {
    return IS_BUNDLE_INVALID;
  }

  public void setISBUNDLEINVALID(@Nullable CatalogsItemValidationDetails IS_BUNDLE_INVALID) {
    this.IS_BUNDLE_INVALID = IS_BUNDLE_INVALID;
  }

  public CatalogsItemValidationWarnings ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE(@Nullable CatalogsItemValidationDetails ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE = ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
    return this;
  }

  /**
   * Get ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE
   * @return ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE
   */
  @Valid 
  @Schema(name = "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE")
  public @Nullable CatalogsItemValidationDetails getITEMADDITIONALIMAGEDOWNLOADFAILURE() {
    return ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
  }

  public void setITEMADDITIONALIMAGEDOWNLOADFAILURE(@Nullable CatalogsItemValidationDetails ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE = ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
  }

  public CatalogsItemValidationWarnings LINK_FORMAT_WARNING(@Nullable CatalogsItemValidationDetails LINK_FORMAT_WARNING) {
    this.LINK_FORMAT_WARNING = LINK_FORMAT_WARNING;
    return this;
  }

  /**
   * Get LINK_FORMAT_WARNING
   * @return LINK_FORMAT_WARNING
   */
  @Valid 
  @Schema(name = "LINK_FORMAT_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LINK_FORMAT_WARNING")
  public @Nullable CatalogsItemValidationDetails getLINKFORMATWARNING() {
    return LINK_FORMAT_WARNING;
  }

  public void setLINKFORMATWARNING(@Nullable CatalogsItemValidationDetails LINK_FORMAT_WARNING) {
    this.LINK_FORMAT_WARNING = LINK_FORMAT_WARNING;
  }

  public CatalogsItemValidationWarnings MIN_AD_PRICE_INVALID(@Nullable CatalogsItemValidationDetails MIN_AD_PRICE_INVALID) {
    this.MIN_AD_PRICE_INVALID = MIN_AD_PRICE_INVALID;
    return this;
  }

  /**
   * Get MIN_AD_PRICE_INVALID
   * @return MIN_AD_PRICE_INVALID
   */
  @Valid 
  @Schema(name = "MIN_AD_PRICE_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MIN_AD_PRICE_INVALID")
  public @Nullable CatalogsItemValidationDetails getMINADPRICEINVALID() {
    return MIN_AD_PRICE_INVALID;
  }

  public void setMINADPRICEINVALID(@Nullable CatalogsItemValidationDetails MIN_AD_PRICE_INVALID) {
    this.MIN_AD_PRICE_INVALID = MIN_AD_PRICE_INVALID;
  }

  public CatalogsItemValidationWarnings MPN_INVALID(@Nullable CatalogsItemValidationDetails MPN_INVALID) {
    this.MPN_INVALID = MPN_INVALID;
    return this;
  }

  /**
   * Get MPN_INVALID
   * @return MPN_INVALID
   */
  @Valid 
  @Schema(name = "MPN_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MPN_INVALID")
  public @Nullable CatalogsItemValidationDetails getMPNINVALID() {
    return MPN_INVALID;
  }

  public void setMPNINVALID(@Nullable CatalogsItemValidationDetails MPN_INVALID) {
    this.MPN_INVALID = MPN_INVALID;
  }

  public CatalogsItemValidationWarnings MULTIPACK_INVALID(@Nullable CatalogsItemValidationDetails MULTIPACK_INVALID) {
    this.MULTIPACK_INVALID = MULTIPACK_INVALID;
    return this;
  }

  /**
   * Get MULTIPACK_INVALID
   * @return MULTIPACK_INVALID
   */
  @Valid 
  @Schema(name = "MULTIPACK_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MULTIPACK_INVALID")
  public @Nullable CatalogsItemValidationDetails getMULTIPACKINVALID() {
    return MULTIPACK_INVALID;
  }

  public void setMULTIPACKINVALID(@Nullable CatalogsItemValidationDetails MULTIPACK_INVALID) {
    this.MULTIPACK_INVALID = MULTIPACK_INVALID;
  }

  public CatalogsItemValidationWarnings OPTIONAL_CONDITION_INVALID(@Nullable CatalogsItemValidationDetails OPTIONAL_CONDITION_INVALID) {
    this.OPTIONAL_CONDITION_INVALID = OPTIONAL_CONDITION_INVALID;
    return this;
  }

  /**
   * Get OPTIONAL_CONDITION_INVALID
   * @return OPTIONAL_CONDITION_INVALID
   */
  @Valid 
  @Schema(name = "OPTIONAL_CONDITION_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OPTIONAL_CONDITION_INVALID")
  public @Nullable CatalogsItemValidationDetails getOPTIONALCONDITIONINVALID() {
    return OPTIONAL_CONDITION_INVALID;
  }

  public void setOPTIONALCONDITIONINVALID(@Nullable CatalogsItemValidationDetails OPTIONAL_CONDITION_INVALID) {
    this.OPTIONAL_CONDITION_INVALID = OPTIONAL_CONDITION_INVALID;
  }

  public CatalogsItemValidationWarnings OPTIONAL_CONDITION_MISSING(@Nullable CatalogsItemValidationDetails OPTIONAL_CONDITION_MISSING) {
    this.OPTIONAL_CONDITION_MISSING = OPTIONAL_CONDITION_MISSING;
    return this;
  }

  /**
   * Get OPTIONAL_CONDITION_MISSING
   * @return OPTIONAL_CONDITION_MISSING
   */
  @Valid 
  @Schema(name = "OPTIONAL_CONDITION_MISSING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OPTIONAL_CONDITION_MISSING")
  public @Nullable CatalogsItemValidationDetails getOPTIONALCONDITIONMISSING() {
    return OPTIONAL_CONDITION_MISSING;
  }

  public void setOPTIONALCONDITIONMISSING(@Nullable CatalogsItemValidationDetails OPTIONAL_CONDITION_MISSING) {
    this.OPTIONAL_CONDITION_MISSING = OPTIONAL_CONDITION_MISSING;
  }

  public CatalogsItemValidationWarnings OPTIONAL_PRODUCT_CATEGORY_INVALID(@Nullable CatalogsItemValidationDetails OPTIONAL_PRODUCT_CATEGORY_INVALID) {
    this.OPTIONAL_PRODUCT_CATEGORY_INVALID = OPTIONAL_PRODUCT_CATEGORY_INVALID;
    return this;
  }

  /**
   * Get OPTIONAL_PRODUCT_CATEGORY_INVALID
   * @return OPTIONAL_PRODUCT_CATEGORY_INVALID
   */
  @Valid 
  @Schema(name = "OPTIONAL_PRODUCT_CATEGORY_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OPTIONAL_PRODUCT_CATEGORY_INVALID")
  public @Nullable CatalogsItemValidationDetails getOPTIONALPRODUCTCATEGORYINVALID() {
    return OPTIONAL_PRODUCT_CATEGORY_INVALID;
  }

  public void setOPTIONALPRODUCTCATEGORYINVALID(@Nullable CatalogsItemValidationDetails OPTIONAL_PRODUCT_CATEGORY_INVALID) {
    this.OPTIONAL_PRODUCT_CATEGORY_INVALID = OPTIONAL_PRODUCT_CATEGORY_INVALID;
  }

  public CatalogsItemValidationWarnings OPTIONAL_PRODUCT_CATEGORY_MISSING(@Nullable CatalogsItemValidationDetails OPTIONAL_PRODUCT_CATEGORY_MISSING) {
    this.OPTIONAL_PRODUCT_CATEGORY_MISSING = OPTIONAL_PRODUCT_CATEGORY_MISSING;
    return this;
  }

  /**
   * Get OPTIONAL_PRODUCT_CATEGORY_MISSING
   * @return OPTIONAL_PRODUCT_CATEGORY_MISSING
   */
  @Valid 
  @Schema(name = "OPTIONAL_PRODUCT_CATEGORY_MISSING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OPTIONAL_PRODUCT_CATEGORY_MISSING")
  public @Nullable CatalogsItemValidationDetails getOPTIONALPRODUCTCATEGORYMISSING() {
    return OPTIONAL_PRODUCT_CATEGORY_MISSING;
  }

  public void setOPTIONALPRODUCTCATEGORYMISSING(@Nullable CatalogsItemValidationDetails OPTIONAL_PRODUCT_CATEGORY_MISSING) {
    this.OPTIONAL_PRODUCT_CATEGORY_MISSING = OPTIONAL_PRODUCT_CATEGORY_MISSING;
  }

  public CatalogsItemValidationWarnings PRODUCT_CATEGORY_DEPTH_WARNING(@Nullable CatalogsItemValidationDetails PRODUCT_CATEGORY_DEPTH_WARNING) {
    this.PRODUCT_CATEGORY_DEPTH_WARNING = PRODUCT_CATEGORY_DEPTH_WARNING;
    return this;
  }

  /**
   * Get PRODUCT_CATEGORY_DEPTH_WARNING
   * @return PRODUCT_CATEGORY_DEPTH_WARNING
   */
  @Valid 
  @Schema(name = "PRODUCT_CATEGORY_DEPTH_WARNING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PRODUCT_CATEGORY_DEPTH_WARNING")
  public @Nullable CatalogsItemValidationDetails getPRODUCTCATEGORYDEPTHWARNING() {
    return PRODUCT_CATEGORY_DEPTH_WARNING;
  }

  public void setPRODUCTCATEGORYDEPTHWARNING(@Nullable CatalogsItemValidationDetails PRODUCT_CATEGORY_DEPTH_WARNING) {
    this.PRODUCT_CATEGORY_DEPTH_WARNING = PRODUCT_CATEGORY_DEPTH_WARNING;
  }

  public CatalogsItemValidationWarnings PRODUCT_TYPE_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails PRODUCT_TYPE_LENGTH_TOO_LONG) {
    this.PRODUCT_TYPE_LENGTH_TOO_LONG = PRODUCT_TYPE_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get PRODUCT_TYPE_LENGTH_TOO_LONG
   * @return PRODUCT_TYPE_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "PRODUCT_TYPE_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PRODUCT_TYPE_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getPRODUCTTYPELENGTHTOOLONG() {
    return PRODUCT_TYPE_LENGTH_TOO_LONG;
  }

  public void setPRODUCTTYPELENGTHTOOLONG(@Nullable CatalogsItemValidationDetails PRODUCT_TYPE_LENGTH_TOO_LONG) {
    this.PRODUCT_TYPE_LENGTH_TOO_LONG = PRODUCT_TYPE_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings SALE_DATE_INVALID(@Nullable CatalogsItemValidationDetails SALE_DATE_INVALID) {
    this.SALE_DATE_INVALID = SALE_DATE_INVALID;
    return this;
  }

  /**
   * Get SALE_DATE_INVALID
   * @return SALE_DATE_INVALID
   */
  @Valid 
  @Schema(name = "SALE_DATE_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SALE_DATE_INVALID")
  public @Nullable CatalogsItemValidationDetails getSALEDATEINVALID() {
    return SALE_DATE_INVALID;
  }

  public void setSALEDATEINVALID(@Nullable CatalogsItemValidationDetails SALE_DATE_INVALID) {
    this.SALE_DATE_INVALID = SALE_DATE_INVALID;
  }

  public CatalogsItemValidationWarnings SALES_PRICE_INVALID(@Nullable CatalogsItemValidationDetails SALES_PRICE_INVALID) {
    this.SALES_PRICE_INVALID = SALES_PRICE_INVALID;
    return this;
  }

  /**
   * Get SALES_PRICE_INVALID
   * @return SALES_PRICE_INVALID
   */
  @Valid 
  @Schema(name = "SALES_PRICE_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SALES_PRICE_INVALID")
  public @Nullable CatalogsItemValidationDetails getSALESPRICEINVALID() {
    return SALES_PRICE_INVALID;
  }

  public void setSALESPRICEINVALID(@Nullable CatalogsItemValidationDetails SALES_PRICE_INVALID) {
    this.SALES_PRICE_INVALID = SALES_PRICE_INVALID;
  }

  public CatalogsItemValidationWarnings SALES_PRICE_TOO_HIGH(@Nullable CatalogsItemValidationDetails SALES_PRICE_TOO_HIGH) {
    this.SALES_PRICE_TOO_HIGH = SALES_PRICE_TOO_HIGH;
    return this;
  }

  /**
   * Get SALES_PRICE_TOO_HIGH
   * @return SALES_PRICE_TOO_HIGH
   */
  @Valid 
  @Schema(name = "SALES_PRICE_TOO_HIGH", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SALES_PRICE_TOO_HIGH")
  public @Nullable CatalogsItemValidationDetails getSALESPRICETOOHIGH() {
    return SALES_PRICE_TOO_HIGH;
  }

  public void setSALESPRICETOOHIGH(@Nullable CatalogsItemValidationDetails SALES_PRICE_TOO_HIGH) {
    this.SALES_PRICE_TOO_HIGH = SALES_PRICE_TOO_HIGH;
  }

  public CatalogsItemValidationWarnings SALES_PRICE_TOO_LOW(@Nullable CatalogsItemValidationDetails SALES_PRICE_TOO_LOW) {
    this.SALES_PRICE_TOO_LOW = SALES_PRICE_TOO_LOW;
    return this;
  }

  /**
   * Get SALES_PRICE_TOO_LOW
   * @return SALES_PRICE_TOO_LOW
   */
  @Valid 
  @Schema(name = "SALES_PRICE_TOO_LOW", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SALES_PRICE_TOO_LOW")
  public @Nullable CatalogsItemValidationDetails getSALESPRICETOOLOW() {
    return SALES_PRICE_TOO_LOW;
  }

  public void setSALESPRICETOOLOW(@Nullable CatalogsItemValidationDetails SALES_PRICE_TOO_LOW) {
    this.SALES_PRICE_TOO_LOW = SALES_PRICE_TOO_LOW;
  }

  public CatalogsItemValidationWarnings SHIPPING_HEIGHT_INVALID(@Nullable CatalogsItemValidationDetails SHIPPING_HEIGHT_INVALID) {
    this.SHIPPING_HEIGHT_INVALID = SHIPPING_HEIGHT_INVALID;
    return this;
  }

  /**
   * Get SHIPPING_HEIGHT_INVALID
   * @return SHIPPING_HEIGHT_INVALID
   */
  @Valid 
  @Schema(name = "SHIPPING_HEIGHT_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SHIPPING_HEIGHT_INVALID")
  public @Nullable CatalogsItemValidationDetails getSHIPPINGHEIGHTINVALID() {
    return SHIPPING_HEIGHT_INVALID;
  }

  public void setSHIPPINGHEIGHTINVALID(@Nullable CatalogsItemValidationDetails SHIPPING_HEIGHT_INVALID) {
    this.SHIPPING_HEIGHT_INVALID = SHIPPING_HEIGHT_INVALID;
  }

  public CatalogsItemValidationWarnings SHIPPING_INVALID(@Nullable CatalogsItemValidationDetails SHIPPING_INVALID) {
    this.SHIPPING_INVALID = SHIPPING_INVALID;
    return this;
  }

  /**
   * Get SHIPPING_INVALID
   * @return SHIPPING_INVALID
   */
  @Valid 
  @Schema(name = "SHIPPING_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SHIPPING_INVALID")
  public @Nullable CatalogsItemValidationDetails getSHIPPINGINVALID() {
    return SHIPPING_INVALID;
  }

  public void setSHIPPINGINVALID(@Nullable CatalogsItemValidationDetails SHIPPING_INVALID) {
    this.SHIPPING_INVALID = SHIPPING_INVALID;
  }

  public CatalogsItemValidationWarnings SHIPPING_WEIGHT_INVALID(@Nullable CatalogsItemValidationDetails SHIPPING_WEIGHT_INVALID) {
    this.SHIPPING_WEIGHT_INVALID = SHIPPING_WEIGHT_INVALID;
    return this;
  }

  /**
   * Get SHIPPING_WEIGHT_INVALID
   * @return SHIPPING_WEIGHT_INVALID
   */
  @Valid 
  @Schema(name = "SHIPPING_WEIGHT_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SHIPPING_WEIGHT_INVALID")
  public @Nullable CatalogsItemValidationDetails getSHIPPINGWEIGHTINVALID() {
    return SHIPPING_WEIGHT_INVALID;
  }

  public void setSHIPPINGWEIGHTINVALID(@Nullable CatalogsItemValidationDetails SHIPPING_WEIGHT_INVALID) {
    this.SHIPPING_WEIGHT_INVALID = SHIPPING_WEIGHT_INVALID;
  }

  public CatalogsItemValidationWarnings SHIPPING_WIDTH_INVALID(@Nullable CatalogsItemValidationDetails SHIPPING_WIDTH_INVALID) {
    this.SHIPPING_WIDTH_INVALID = SHIPPING_WIDTH_INVALID;
    return this;
  }

  /**
   * Get SHIPPING_WIDTH_INVALID
   * @return SHIPPING_WIDTH_INVALID
   */
  @Valid 
  @Schema(name = "SHIPPING_WIDTH_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SHIPPING_WIDTH_INVALID")
  public @Nullable CatalogsItemValidationDetails getSHIPPINGWIDTHINVALID() {
    return SHIPPING_WIDTH_INVALID;
  }

  public void setSHIPPINGWIDTHINVALID(@Nullable CatalogsItemValidationDetails SHIPPING_WIDTH_INVALID) {
    this.SHIPPING_WIDTH_INVALID = SHIPPING_WIDTH_INVALID;
  }

  public CatalogsItemValidationWarnings SIZE_SYSTEM_INVALID(@Nullable CatalogsItemValidationDetails SIZE_SYSTEM_INVALID) {
    this.SIZE_SYSTEM_INVALID = SIZE_SYSTEM_INVALID;
    return this;
  }

  /**
   * Get SIZE_SYSTEM_INVALID
   * @return SIZE_SYSTEM_INVALID
   */
  @Valid 
  @Schema(name = "SIZE_SYSTEM_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SIZE_SYSTEM_INVALID")
  public @Nullable CatalogsItemValidationDetails getSIZESYSTEMINVALID() {
    return SIZE_SYSTEM_INVALID;
  }

  public void setSIZESYSTEMINVALID(@Nullable CatalogsItemValidationDetails SIZE_SYSTEM_INVALID) {
    this.SIZE_SYSTEM_INVALID = SIZE_SYSTEM_INVALID;
  }

  public CatalogsItemValidationWarnings SIZE_TYPE_INVALID(@Nullable CatalogsItemValidationDetails SIZE_TYPE_INVALID) {
    this.SIZE_TYPE_INVALID = SIZE_TYPE_INVALID;
    return this;
  }

  /**
   * Get SIZE_TYPE_INVALID
   * @return SIZE_TYPE_INVALID
   */
  @Valid 
  @Schema(name = "SIZE_TYPE_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SIZE_TYPE_INVALID")
  public @Nullable CatalogsItemValidationDetails getSIZETYPEINVALID() {
    return SIZE_TYPE_INVALID;
  }

  public void setSIZETYPEINVALID(@Nullable CatalogsItemValidationDetails SIZE_TYPE_INVALID) {
    this.SIZE_TYPE_INVALID = SIZE_TYPE_INVALID;
  }

  public CatalogsItemValidationWarnings TAX_INVALID(@Nullable CatalogsItemValidationDetails TAX_INVALID) {
    this.TAX_INVALID = TAX_INVALID;
    return this;
  }

  /**
   * Get TAX_INVALID
   * @return TAX_INVALID
   */
  @Valid 
  @Schema(name = "TAX_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TAX_INVALID")
  public @Nullable CatalogsItemValidationDetails getTAXINVALID() {
    return TAX_INVALID;
  }

  public void setTAXINVALID(@Nullable CatalogsItemValidationDetails TAX_INVALID) {
    this.TAX_INVALID = TAX_INVALID;
  }

  public CatalogsItemValidationWarnings TITLE_LENGTH_TOO_LONG(@Nullable CatalogsItemValidationDetails TITLE_LENGTH_TOO_LONG) {
    this.TITLE_LENGTH_TOO_LONG = TITLE_LENGTH_TOO_LONG;
    return this;
  }

  /**
   * Get TITLE_LENGTH_TOO_LONG
   * @return TITLE_LENGTH_TOO_LONG
   */
  @Valid 
  @Schema(name = "TITLE_LENGTH_TOO_LONG", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TITLE_LENGTH_TOO_LONG")
  public @Nullable CatalogsItemValidationDetails getTITLELENGTHTOOLONG() {
    return TITLE_LENGTH_TOO_LONG;
  }

  public void setTITLELENGTHTOOLONG(@Nullable CatalogsItemValidationDetails TITLE_LENGTH_TOO_LONG) {
    this.TITLE_LENGTH_TOO_LONG = TITLE_LENGTH_TOO_LONG;
  }

  public CatalogsItemValidationWarnings TOO_MANY_ADDITIONAL_IMAGE_LINKS(@Nullable CatalogsItemValidationDetails TOO_MANY_ADDITIONAL_IMAGE_LINKS) {
    this.TOO_MANY_ADDITIONAL_IMAGE_LINKS = TOO_MANY_ADDITIONAL_IMAGE_LINKS;
    return this;
  }

  /**
   * Get TOO_MANY_ADDITIONAL_IMAGE_LINKS
   * @return TOO_MANY_ADDITIONAL_IMAGE_LINKS
   */
  @Valid 
  @Schema(name = "TOO_MANY_ADDITIONAL_IMAGE_LINKS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TOO_MANY_ADDITIONAL_IMAGE_LINKS")
  public @Nullable CatalogsItemValidationDetails getTOOMANYADDITIONALIMAGELINKS() {
    return TOO_MANY_ADDITIONAL_IMAGE_LINKS;
  }

  public void setTOOMANYADDITIONALIMAGELINKS(@Nullable CatalogsItemValidationDetails TOO_MANY_ADDITIONAL_IMAGE_LINKS) {
    this.TOO_MANY_ADDITIONAL_IMAGE_LINKS = TOO_MANY_ADDITIONAL_IMAGE_LINKS;
  }

  public CatalogsItemValidationWarnings UTM_SOURCE_AUTO_CORRECTED(@Nullable CatalogsItemValidationDetails UTM_SOURCE_AUTO_CORRECTED) {
    this.UTM_SOURCE_AUTO_CORRECTED = UTM_SOURCE_AUTO_CORRECTED;
    return this;
  }

  /**
   * Get UTM_SOURCE_AUTO_CORRECTED
   * @return UTM_SOURCE_AUTO_CORRECTED
   */
  @Valid 
  @Schema(name = "UTM_SOURCE_AUTO_CORRECTED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UTM_SOURCE_AUTO_CORRECTED")
  public @Nullable CatalogsItemValidationDetails getUTMSOURCEAUTOCORRECTED() {
    return UTM_SOURCE_AUTO_CORRECTED;
  }

  public void setUTMSOURCEAUTOCORRECTED(@Nullable CatalogsItemValidationDetails UTM_SOURCE_AUTO_CORRECTED) {
    this.UTM_SOURCE_AUTO_CORRECTED = UTM_SOURCE_AUTO_CORRECTED;
  }

  public CatalogsItemValidationWarnings VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED(@Nullable CatalogsItemValidationDetails VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED) {
    this.VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED = VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED;
    return this;
  }

  /**
   * Get VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED
   * @return VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED
   */
  @Valid 
  @Schema(name = "VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED")
  public @Nullable CatalogsItemValidationDetails getVIDEOREQUIREDWHENADVIDEOPROVIDED() {
    return VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED;
  }

  public void setVIDEOREQUIREDWHENADVIDEOPROVIDED(@Nullable CatalogsItemValidationDetails VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED) {
    this.VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED = VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED;
  }

  public CatalogsItemValidationWarnings WEIGHT_UNIT_INVALID(@Nullable CatalogsItemValidationDetails WEIGHT_UNIT_INVALID) {
    this.WEIGHT_UNIT_INVALID = WEIGHT_UNIT_INVALID;
    return this;
  }

  /**
   * Get WEIGHT_UNIT_INVALID
   * @return WEIGHT_UNIT_INVALID
   */
  @Valid 
  @Schema(name = "WEIGHT_UNIT_INVALID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WEIGHT_UNIT_INVALID")
  public @Nullable CatalogsItemValidationDetails getWEIGHTUNITINVALID() {
    return WEIGHT_UNIT_INVALID;
  }

  public void setWEIGHTUNITINVALID(@Nullable CatalogsItemValidationDetails WEIGHT_UNIT_INVALID) {
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
    CatalogsItemValidationWarnings catalogsItemValidationWarnings = (CatalogsItemValidationWarnings) o;
    return Objects.equals(this.AD_IMAGE_0_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_0_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_0_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_0_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_0_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_0_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_0_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_0_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_0_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_0_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_0_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_0_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_0_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_0_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_10_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_10_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_10_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_10_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_10_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_10_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_10_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_10_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_10_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_10_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_10_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_10_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_10_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_10_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_11_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_11_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_11_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_11_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_11_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_11_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_11_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_11_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_11_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_11_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_11_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_11_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_11_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_11_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_12_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_12_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_12_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_12_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_12_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_12_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_12_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_12_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_12_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_12_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_12_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_12_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_12_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_12_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_13_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_13_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_13_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_13_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_13_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_13_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_13_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_13_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_13_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_13_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_13_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_13_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_13_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_13_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_14_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_14_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_14_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_14_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_14_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_14_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_14_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_14_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_14_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_14_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_14_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_14_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_14_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_14_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_15_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_15_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_15_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_15_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_15_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_15_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_15_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_15_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_15_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_15_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_15_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_15_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_15_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_15_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_16_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_16_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_16_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_16_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_16_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_16_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_16_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_16_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_16_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_16_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_16_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_16_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_16_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_16_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_17_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_17_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_17_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_17_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_17_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_17_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_17_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_17_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_17_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_17_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_17_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_17_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_17_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_17_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_18_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_18_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_18_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_18_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_18_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_18_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_18_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_18_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_18_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_18_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_18_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_18_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_18_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_18_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_19_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_19_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_19_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_19_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_19_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_19_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_19_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_19_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_19_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_19_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_19_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_19_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_19_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_19_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_1_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_1_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_1_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_1_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_1_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_1_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_1_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_1_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_1_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_1_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_1_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_1_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_1_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_1_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_2_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_2_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_2_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_2_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_2_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_2_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_2_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_2_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_2_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_2_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_2_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_2_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_2_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_2_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_3_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_3_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_3_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_3_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_3_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_3_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_3_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_3_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_3_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_3_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_3_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_3_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_3_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_3_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_4_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_4_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_4_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_4_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_4_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_4_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_4_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_4_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_4_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_4_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_4_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_4_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_4_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_4_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_5_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_5_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_5_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_5_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_5_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_5_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_5_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_5_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_5_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_5_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_5_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_5_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_5_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_5_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_6_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_6_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_6_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_6_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_6_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_6_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_6_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_6_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_6_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_6_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_6_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_6_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_6_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_6_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_7_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_7_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_7_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_7_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_7_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_7_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_7_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_7_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_7_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_7_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_7_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_7_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_7_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_7_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_8_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_8_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_8_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_8_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_8_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_8_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_8_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_8_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_8_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_8_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_8_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_8_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_8_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_8_TAG_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_9_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_9_LINK_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_9_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_9_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_9_LINK_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_9_LINK_REQUIRED) &&
        Objects.equals(this.AD_IMAGE_9_LINK_WARNING, catalogsItemValidationWarnings.AD_IMAGE_9_LINK_WARNING) &&
        Objects.equals(this.AD_IMAGE_9_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_IMAGE_9_TAG_DUPLICATED) &&
        Objects.equals(this.AD_IMAGE_9_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_IMAGE_9_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_IMAGE_9_TAG_REQUIRED, catalogsItemValidationWarnings.AD_IMAGE_9_TAG_REQUIRED) &&
        Objects.equals(this.AD_LINK_FORMAT_WARNING, catalogsItemValidationWarnings.AD_LINK_FORMAT_WARNING) &&
        Objects.equals(this.AD_LINK_SAME_AS_LINK, catalogsItemValidationWarnings.AD_LINK_SAME_AS_LINK) &&
        Objects.equals(this.AD_VIDEO_0_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_VIDEO_0_LINK_DUPLICATED) &&
        Objects.equals(this.AD_VIDEO_0_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_VIDEO_0_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_VIDEO_0_LINK_REQUIRED, catalogsItemValidationWarnings.AD_VIDEO_0_LINK_REQUIRED) &&
        Objects.equals(this.AD_VIDEO_0_LINK_WARNING, catalogsItemValidationWarnings.AD_VIDEO_0_LINK_WARNING) &&
        Objects.equals(this.AD_VIDEO_0_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_VIDEO_0_TAG_DUPLICATED) &&
        Objects.equals(this.AD_VIDEO_0_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_VIDEO_0_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_VIDEO_0_TAG_REQUIRED, catalogsItemValidationWarnings.AD_VIDEO_0_TAG_REQUIRED) &&
        Objects.equals(this.AD_VIDEO_1_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_VIDEO_1_LINK_DUPLICATED) &&
        Objects.equals(this.AD_VIDEO_1_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_VIDEO_1_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_VIDEO_1_LINK_REQUIRED, catalogsItemValidationWarnings.AD_VIDEO_1_LINK_REQUIRED) &&
        Objects.equals(this.AD_VIDEO_1_LINK_WARNING, catalogsItemValidationWarnings.AD_VIDEO_1_LINK_WARNING) &&
        Objects.equals(this.AD_VIDEO_1_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_VIDEO_1_TAG_DUPLICATED) &&
        Objects.equals(this.AD_VIDEO_1_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_VIDEO_1_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_VIDEO_1_TAG_REQUIRED, catalogsItemValidationWarnings.AD_VIDEO_1_TAG_REQUIRED) &&
        Objects.equals(this.AD_VIDEO_2_LINK_DUPLICATED, catalogsItemValidationWarnings.AD_VIDEO_2_LINK_DUPLICATED) &&
        Objects.equals(this.AD_VIDEO_2_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_VIDEO_2_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_VIDEO_2_LINK_REQUIRED, catalogsItemValidationWarnings.AD_VIDEO_2_LINK_REQUIRED) &&
        Objects.equals(this.AD_VIDEO_2_LINK_WARNING, catalogsItemValidationWarnings.AD_VIDEO_2_LINK_WARNING) &&
        Objects.equals(this.AD_VIDEO_2_TAG_DUPLICATED, catalogsItemValidationWarnings.AD_VIDEO_2_TAG_DUPLICATED) &&
        Objects.equals(this.AD_VIDEO_2_TAG_LENGTH_TOO_LONG, catalogsItemValidationWarnings.AD_VIDEO_2_TAG_LENGTH_TOO_LONG) &&
        Objects.equals(this.AD_VIDEO_2_TAG_REQUIRED, catalogsItemValidationWarnings.AD_VIDEO_2_TAG_REQUIRED) &&
        Objects.equals(this.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.ADDITIONAL_IMAGE_LINK_WARNING, catalogsItemValidationWarnings.ADDITIONAL_IMAGE_LINK_WARNING) &&
        Objects.equals(this.ADWORDS_FORMAT_WARNING, catalogsItemValidationWarnings.ADWORDS_FORMAT_WARNING) &&
        Objects.equals(this.ADWORDS_SAME_AS_LINK, catalogsItemValidationWarnings.ADWORDS_SAME_AS_LINK) &&
        Objects.equals(this.AGE_GROUP_INVALID, catalogsItemValidationWarnings.AGE_GROUP_INVALID) &&
        Objects.equals(this.ANDROID_DEEP_LINK_INVALID, catalogsItemValidationWarnings.ANDROID_DEEP_LINK_INVALID) &&
        Objects.equals(this.AVAILABILITY_DATE_INVALID, catalogsItemValidationWarnings.AVAILABILITY_DATE_INVALID) &&
        Objects.equals(this.COUNTRY_DOES_NOT_MAP_TO_CURRENCY, catalogsItemValidationWarnings.COUNTRY_DOES_NOT_MAP_TO_CURRENCY) &&
        Objects.equals(this.CUSTOM_LABEL_LENGTH_TOO_LONG, catalogsItemValidationWarnings.CUSTOM_LABEL_LENGTH_TOO_LONG) &&
        Objects.equals(this.DESCRIPTION_LENGTH_TOO_LONG, catalogsItemValidationWarnings.DESCRIPTION_LENGTH_TOO_LONG) &&
        Objects.equals(this.EXPIRATION_DATE_INVALID, catalogsItemValidationWarnings.EXPIRATION_DATE_INVALID) &&
        Objects.equals(this.GENDER_INVALID, catalogsItemValidationWarnings.GENDER_INVALID) &&
        Objects.equals(this.GTIN_INVALID, catalogsItemValidationWarnings.GTIN_INVALID) &&
        Objects.equals(this.IMAGE_LINK_WARNING, catalogsItemValidationWarnings.IMAGE_LINK_WARNING) &&
        Objects.equals(this.IOS_DEEP_LINK_INVALID, catalogsItemValidationWarnings.IOS_DEEP_LINK_INVALID) &&
        Objects.equals(this.IS_BUNDLE_INVALID, catalogsItemValidationWarnings.IS_BUNDLE_INVALID) &&
        Objects.equals(this.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, catalogsItemValidationWarnings.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE) &&
        Objects.equals(this.LINK_FORMAT_WARNING, catalogsItemValidationWarnings.LINK_FORMAT_WARNING) &&
        Objects.equals(this.MIN_AD_PRICE_INVALID, catalogsItemValidationWarnings.MIN_AD_PRICE_INVALID) &&
        Objects.equals(this.MPN_INVALID, catalogsItemValidationWarnings.MPN_INVALID) &&
        Objects.equals(this.MULTIPACK_INVALID, catalogsItemValidationWarnings.MULTIPACK_INVALID) &&
        Objects.equals(this.OPTIONAL_CONDITION_INVALID, catalogsItemValidationWarnings.OPTIONAL_CONDITION_INVALID) &&
        Objects.equals(this.OPTIONAL_CONDITION_MISSING, catalogsItemValidationWarnings.OPTIONAL_CONDITION_MISSING) &&
        Objects.equals(this.OPTIONAL_PRODUCT_CATEGORY_INVALID, catalogsItemValidationWarnings.OPTIONAL_PRODUCT_CATEGORY_INVALID) &&
        Objects.equals(this.OPTIONAL_PRODUCT_CATEGORY_MISSING, catalogsItemValidationWarnings.OPTIONAL_PRODUCT_CATEGORY_MISSING) &&
        Objects.equals(this.PRODUCT_CATEGORY_DEPTH_WARNING, catalogsItemValidationWarnings.PRODUCT_CATEGORY_DEPTH_WARNING) &&
        Objects.equals(this.PRODUCT_TYPE_LENGTH_TOO_LONG, catalogsItemValidationWarnings.PRODUCT_TYPE_LENGTH_TOO_LONG) &&
        Objects.equals(this.SALE_DATE_INVALID, catalogsItemValidationWarnings.SALE_DATE_INVALID) &&
        Objects.equals(this.SALES_PRICE_INVALID, catalogsItemValidationWarnings.SALES_PRICE_INVALID) &&
        Objects.equals(this.SALES_PRICE_TOO_HIGH, catalogsItemValidationWarnings.SALES_PRICE_TOO_HIGH) &&
        Objects.equals(this.SALES_PRICE_TOO_LOW, catalogsItemValidationWarnings.SALES_PRICE_TOO_LOW) &&
        Objects.equals(this.SHIPPING_HEIGHT_INVALID, catalogsItemValidationWarnings.SHIPPING_HEIGHT_INVALID) &&
        Objects.equals(this.SHIPPING_INVALID, catalogsItemValidationWarnings.SHIPPING_INVALID) &&
        Objects.equals(this.SHIPPING_WEIGHT_INVALID, catalogsItemValidationWarnings.SHIPPING_WEIGHT_INVALID) &&
        Objects.equals(this.SHIPPING_WIDTH_INVALID, catalogsItemValidationWarnings.SHIPPING_WIDTH_INVALID) &&
        Objects.equals(this.SIZE_SYSTEM_INVALID, catalogsItemValidationWarnings.SIZE_SYSTEM_INVALID) &&
        Objects.equals(this.SIZE_TYPE_INVALID, catalogsItemValidationWarnings.SIZE_TYPE_INVALID) &&
        Objects.equals(this.TAX_INVALID, catalogsItemValidationWarnings.TAX_INVALID) &&
        Objects.equals(this.TITLE_LENGTH_TOO_LONG, catalogsItemValidationWarnings.TITLE_LENGTH_TOO_LONG) &&
        Objects.equals(this.TOO_MANY_ADDITIONAL_IMAGE_LINKS, catalogsItemValidationWarnings.TOO_MANY_ADDITIONAL_IMAGE_LINKS) &&
        Objects.equals(this.UTM_SOURCE_AUTO_CORRECTED, catalogsItemValidationWarnings.UTM_SOURCE_AUTO_CORRECTED) &&
        Objects.equals(this.VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED, catalogsItemValidationWarnings.VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED) &&
        Objects.equals(this.WEIGHT_UNIT_INVALID, catalogsItemValidationWarnings.WEIGHT_UNIT_INVALID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_IMAGE_0_LINK_DUPLICATED, AD_IMAGE_0_LINK_LENGTH_TOO_LONG, AD_IMAGE_0_LINK_REQUIRED, AD_IMAGE_0_LINK_WARNING, AD_IMAGE_0_TAG_DUPLICATED, AD_IMAGE_0_TAG_LENGTH_TOO_LONG, AD_IMAGE_0_TAG_REQUIRED, AD_IMAGE_10_LINK_DUPLICATED, AD_IMAGE_10_LINK_LENGTH_TOO_LONG, AD_IMAGE_10_LINK_REQUIRED, AD_IMAGE_10_LINK_WARNING, AD_IMAGE_10_TAG_DUPLICATED, AD_IMAGE_10_TAG_LENGTH_TOO_LONG, AD_IMAGE_10_TAG_REQUIRED, AD_IMAGE_11_LINK_DUPLICATED, AD_IMAGE_11_LINK_LENGTH_TOO_LONG, AD_IMAGE_11_LINK_REQUIRED, AD_IMAGE_11_LINK_WARNING, AD_IMAGE_11_TAG_DUPLICATED, AD_IMAGE_11_TAG_LENGTH_TOO_LONG, AD_IMAGE_11_TAG_REQUIRED, AD_IMAGE_12_LINK_DUPLICATED, AD_IMAGE_12_LINK_LENGTH_TOO_LONG, AD_IMAGE_12_LINK_REQUIRED, AD_IMAGE_12_LINK_WARNING, AD_IMAGE_12_TAG_DUPLICATED, AD_IMAGE_12_TAG_LENGTH_TOO_LONG, AD_IMAGE_12_TAG_REQUIRED, AD_IMAGE_13_LINK_DUPLICATED, AD_IMAGE_13_LINK_LENGTH_TOO_LONG, AD_IMAGE_13_LINK_REQUIRED, AD_IMAGE_13_LINK_WARNING, AD_IMAGE_13_TAG_DUPLICATED, AD_IMAGE_13_TAG_LENGTH_TOO_LONG, AD_IMAGE_13_TAG_REQUIRED, AD_IMAGE_14_LINK_DUPLICATED, AD_IMAGE_14_LINK_LENGTH_TOO_LONG, AD_IMAGE_14_LINK_REQUIRED, AD_IMAGE_14_LINK_WARNING, AD_IMAGE_14_TAG_DUPLICATED, AD_IMAGE_14_TAG_LENGTH_TOO_LONG, AD_IMAGE_14_TAG_REQUIRED, AD_IMAGE_15_LINK_DUPLICATED, AD_IMAGE_15_LINK_LENGTH_TOO_LONG, AD_IMAGE_15_LINK_REQUIRED, AD_IMAGE_15_LINK_WARNING, AD_IMAGE_15_TAG_DUPLICATED, AD_IMAGE_15_TAG_LENGTH_TOO_LONG, AD_IMAGE_15_TAG_REQUIRED, AD_IMAGE_16_LINK_DUPLICATED, AD_IMAGE_16_LINK_LENGTH_TOO_LONG, AD_IMAGE_16_LINK_REQUIRED, AD_IMAGE_16_LINK_WARNING, AD_IMAGE_16_TAG_DUPLICATED, AD_IMAGE_16_TAG_LENGTH_TOO_LONG, AD_IMAGE_16_TAG_REQUIRED, AD_IMAGE_17_LINK_DUPLICATED, AD_IMAGE_17_LINK_LENGTH_TOO_LONG, AD_IMAGE_17_LINK_REQUIRED, AD_IMAGE_17_LINK_WARNING, AD_IMAGE_17_TAG_DUPLICATED, AD_IMAGE_17_TAG_LENGTH_TOO_LONG, AD_IMAGE_17_TAG_REQUIRED, AD_IMAGE_18_LINK_DUPLICATED, AD_IMAGE_18_LINK_LENGTH_TOO_LONG, AD_IMAGE_18_LINK_REQUIRED, AD_IMAGE_18_LINK_WARNING, AD_IMAGE_18_TAG_DUPLICATED, AD_IMAGE_18_TAG_LENGTH_TOO_LONG, AD_IMAGE_18_TAG_REQUIRED, AD_IMAGE_19_LINK_DUPLICATED, AD_IMAGE_19_LINK_LENGTH_TOO_LONG, AD_IMAGE_19_LINK_REQUIRED, AD_IMAGE_19_LINK_WARNING, AD_IMAGE_19_TAG_DUPLICATED, AD_IMAGE_19_TAG_LENGTH_TOO_LONG, AD_IMAGE_19_TAG_REQUIRED, AD_IMAGE_1_LINK_DUPLICATED, AD_IMAGE_1_LINK_LENGTH_TOO_LONG, AD_IMAGE_1_LINK_REQUIRED, AD_IMAGE_1_LINK_WARNING, AD_IMAGE_1_TAG_DUPLICATED, AD_IMAGE_1_TAG_LENGTH_TOO_LONG, AD_IMAGE_1_TAG_REQUIRED, AD_IMAGE_2_LINK_DUPLICATED, AD_IMAGE_2_LINK_LENGTH_TOO_LONG, AD_IMAGE_2_LINK_REQUIRED, AD_IMAGE_2_LINK_WARNING, AD_IMAGE_2_TAG_DUPLICATED, AD_IMAGE_2_TAG_LENGTH_TOO_LONG, AD_IMAGE_2_TAG_REQUIRED, AD_IMAGE_3_LINK_DUPLICATED, AD_IMAGE_3_LINK_LENGTH_TOO_LONG, AD_IMAGE_3_LINK_REQUIRED, AD_IMAGE_3_LINK_WARNING, AD_IMAGE_3_TAG_DUPLICATED, AD_IMAGE_3_TAG_LENGTH_TOO_LONG, AD_IMAGE_3_TAG_REQUIRED, AD_IMAGE_4_LINK_DUPLICATED, AD_IMAGE_4_LINK_LENGTH_TOO_LONG, AD_IMAGE_4_LINK_REQUIRED, AD_IMAGE_4_LINK_WARNING, AD_IMAGE_4_TAG_DUPLICATED, AD_IMAGE_4_TAG_LENGTH_TOO_LONG, AD_IMAGE_4_TAG_REQUIRED, AD_IMAGE_5_LINK_DUPLICATED, AD_IMAGE_5_LINK_LENGTH_TOO_LONG, AD_IMAGE_5_LINK_REQUIRED, AD_IMAGE_5_LINK_WARNING, AD_IMAGE_5_TAG_DUPLICATED, AD_IMAGE_5_TAG_LENGTH_TOO_LONG, AD_IMAGE_5_TAG_REQUIRED, AD_IMAGE_6_LINK_DUPLICATED, AD_IMAGE_6_LINK_LENGTH_TOO_LONG, AD_IMAGE_6_LINK_REQUIRED, AD_IMAGE_6_LINK_WARNING, AD_IMAGE_6_TAG_DUPLICATED, AD_IMAGE_6_TAG_LENGTH_TOO_LONG, AD_IMAGE_6_TAG_REQUIRED, AD_IMAGE_7_LINK_DUPLICATED, AD_IMAGE_7_LINK_LENGTH_TOO_LONG, AD_IMAGE_7_LINK_REQUIRED, AD_IMAGE_7_LINK_WARNING, AD_IMAGE_7_TAG_DUPLICATED, AD_IMAGE_7_TAG_LENGTH_TOO_LONG, AD_IMAGE_7_TAG_REQUIRED, AD_IMAGE_8_LINK_DUPLICATED, AD_IMAGE_8_LINK_LENGTH_TOO_LONG, AD_IMAGE_8_LINK_REQUIRED, AD_IMAGE_8_LINK_WARNING, AD_IMAGE_8_TAG_DUPLICATED, AD_IMAGE_8_TAG_LENGTH_TOO_LONG, AD_IMAGE_8_TAG_REQUIRED, AD_IMAGE_9_LINK_DUPLICATED, AD_IMAGE_9_LINK_LENGTH_TOO_LONG, AD_IMAGE_9_LINK_REQUIRED, AD_IMAGE_9_LINK_WARNING, AD_IMAGE_9_TAG_DUPLICATED, AD_IMAGE_9_TAG_LENGTH_TOO_LONG, AD_IMAGE_9_TAG_REQUIRED, AD_LINK_FORMAT_WARNING, AD_LINK_SAME_AS_LINK, AD_VIDEO_0_LINK_DUPLICATED, AD_VIDEO_0_LINK_LENGTH_TOO_LONG, AD_VIDEO_0_LINK_REQUIRED, AD_VIDEO_0_LINK_WARNING, AD_VIDEO_0_TAG_DUPLICATED, AD_VIDEO_0_TAG_LENGTH_TOO_LONG, AD_VIDEO_0_TAG_REQUIRED, AD_VIDEO_1_LINK_DUPLICATED, AD_VIDEO_1_LINK_LENGTH_TOO_LONG, AD_VIDEO_1_LINK_REQUIRED, AD_VIDEO_1_LINK_WARNING, AD_VIDEO_1_TAG_DUPLICATED, AD_VIDEO_1_TAG_LENGTH_TOO_LONG, AD_VIDEO_1_TAG_REQUIRED, AD_VIDEO_2_LINK_DUPLICATED, AD_VIDEO_2_LINK_LENGTH_TOO_LONG, AD_VIDEO_2_LINK_REQUIRED, AD_VIDEO_2_LINK_WARNING, AD_VIDEO_2_TAG_DUPLICATED, AD_VIDEO_2_TAG_LENGTH_TOO_LONG, AD_VIDEO_2_TAG_REQUIRED, ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, ADDITIONAL_IMAGE_LINK_WARNING, ADWORDS_FORMAT_WARNING, ADWORDS_SAME_AS_LINK, AGE_GROUP_INVALID, ANDROID_DEEP_LINK_INVALID, AVAILABILITY_DATE_INVALID, COUNTRY_DOES_NOT_MAP_TO_CURRENCY, CUSTOM_LABEL_LENGTH_TOO_LONG, DESCRIPTION_LENGTH_TOO_LONG, EXPIRATION_DATE_INVALID, GENDER_INVALID, GTIN_INVALID, IMAGE_LINK_WARNING, IOS_DEEP_LINK_INVALID, IS_BUNDLE_INVALID, ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, LINK_FORMAT_WARNING, MIN_AD_PRICE_INVALID, MPN_INVALID, MULTIPACK_INVALID, OPTIONAL_CONDITION_INVALID, OPTIONAL_CONDITION_MISSING, OPTIONAL_PRODUCT_CATEGORY_INVALID, OPTIONAL_PRODUCT_CATEGORY_MISSING, PRODUCT_CATEGORY_DEPTH_WARNING, PRODUCT_TYPE_LENGTH_TOO_LONG, SALE_DATE_INVALID, SALES_PRICE_INVALID, SALES_PRICE_TOO_HIGH, SALES_PRICE_TOO_LOW, SHIPPING_HEIGHT_INVALID, SHIPPING_INVALID, SHIPPING_WEIGHT_INVALID, SHIPPING_WIDTH_INVALID, SIZE_SYSTEM_INVALID, SIZE_TYPE_INVALID, TAX_INVALID, TITLE_LENGTH_TOO_LONG, TOO_MANY_ADDITIONAL_IMAGE_LINKS, UTM_SOURCE_AUTO_CORRECTED, VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED, WEIGHT_UNIT_INVALID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemValidationWarnings {\n");
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
    sb.append("    EXPIRATION_DATE_INVALID: ").append(toIndentedString(EXPIRATION_DATE_INVALID)).append("\n");
    sb.append("    GENDER_INVALID: ").append(toIndentedString(GENDER_INVALID)).append("\n");
    sb.append("    GTIN_INVALID: ").append(toIndentedString(GTIN_INVALID)).append("\n");
    sb.append("    IMAGE_LINK_WARNING: ").append(toIndentedString(IMAGE_LINK_WARNING)).append("\n");
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

