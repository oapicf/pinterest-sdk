package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

@Schema(name = "BidOptionsAppTypeMultipliers", description = "This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BidOptionsAppTypeMultipliers {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal androidMobile;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal androidTablet;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal ipad;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal iphone;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal web;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal webMobile;

  public BidOptionsAppTypeMultipliers androidMobile(@Nullable BigDecimal androidMobile) {
    this.androidMobile = androidMobile;
    return this;
  }

  /**
   * Get androidMobile
   * @return androidMobile
   */
  @Valid 
  @Schema(name = "android_mobile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("android_mobile")
  public @Nullable BigDecimal getAndroidMobile() {
    return androidMobile;
  }

  @JsonProperty("android_mobile")
  public void setAndroidMobile(@Nullable BigDecimal androidMobile) {
    this.androidMobile = androidMobile;
  }

  public BidOptionsAppTypeMultipliers androidTablet(@Nullable BigDecimal androidTablet) {
    this.androidTablet = androidTablet;
    return this;
  }

  /**
   * Get androidTablet
   * @return androidTablet
   */
  @Valid 
  @Schema(name = "android_tablet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("android_tablet")
  public @Nullable BigDecimal getAndroidTablet() {
    return androidTablet;
  }

  @JsonProperty("android_tablet")
  public void setAndroidTablet(@Nullable BigDecimal androidTablet) {
    this.androidTablet = androidTablet;
  }

  public BidOptionsAppTypeMultipliers ipad(@Nullable BigDecimal ipad) {
    this.ipad = ipad;
    return this;
  }

  /**
   * Get ipad
   * @return ipad
   */
  @Valid 
  @Schema(name = "ipad", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ipad")
  public @Nullable BigDecimal getIpad() {
    return ipad;
  }

  @JsonProperty("ipad")
  public void setIpad(@Nullable BigDecimal ipad) {
    this.ipad = ipad;
  }

  public BidOptionsAppTypeMultipliers iphone(@Nullable BigDecimal iphone) {
    this.iphone = iphone;
    return this;
  }

  /**
   * Get iphone
   * @return iphone
   */
  @Valid 
  @Schema(name = "iphone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iphone")
  public @Nullable BigDecimal getIphone() {
    return iphone;
  }

  @JsonProperty("iphone")
  public void setIphone(@Nullable BigDecimal iphone) {
    this.iphone = iphone;
  }

  public BidOptionsAppTypeMultipliers web(@Nullable BigDecimal web) {
    this.web = web;
    return this;
  }

  /**
   * Get web
   * @return web
   */
  @Valid 
  @Schema(name = "web", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("web")
  public @Nullable BigDecimal getWeb() {
    return web;
  }

  @JsonProperty("web")
  public void setWeb(@Nullable BigDecimal web) {
    this.web = web;
  }

  public BidOptionsAppTypeMultipliers webMobile(@Nullable BigDecimal webMobile) {
    this.webMobile = webMobile;
    return this;
  }

  /**
   * Get webMobile
   * @return webMobile
   */
  @Valid 
  @Schema(name = "web_mobile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("web_mobile")
  public @Nullable BigDecimal getWebMobile() {
    return webMobile;
  }

  @JsonProperty("web_mobile")
  public void setWebMobile(@Nullable BigDecimal webMobile) {
    this.webMobile = webMobile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidOptionsAppTypeMultipliers bidOptionsAppTypeMultipliers = (BidOptionsAppTypeMultipliers) o;
    return Objects.equals(this.androidMobile, bidOptionsAppTypeMultipliers.androidMobile) &&
        Objects.equals(this.androidTablet, bidOptionsAppTypeMultipliers.androidTablet) &&
        Objects.equals(this.ipad, bidOptionsAppTypeMultipliers.ipad) &&
        Objects.equals(this.iphone, bidOptionsAppTypeMultipliers.iphone) &&
        Objects.equals(this.web, bidOptionsAppTypeMultipliers.web) &&
        Objects.equals(this.webMobile, bidOptionsAppTypeMultipliers.webMobile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidMobile, androidTablet, ipad, iphone, web, webMobile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidOptionsAppTypeMultipliers {\n");
    sb.append("    androidMobile: ").append(toIndentedString(androidMobile)).append("\n");
    sb.append("    androidTablet: ").append(toIndentedString(androidTablet)).append("\n");
    sb.append("    ipad: ").append(toIndentedString(ipad)).append("\n");
    sb.append("    iphone: ").append(toIndentedString(iphone)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
    sb.append("    webMobile: ").append(toIndentedString(webMobile)).append("\n");
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

