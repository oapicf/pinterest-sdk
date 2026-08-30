package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BidOptionsAppTypeMultipliers {

  private BigDecimal androidMobile;

  private BigDecimal androidTablet;

  private BigDecimal ipad;

  private BigDecimal iphone;

  private BigDecimal web;

  private BigDecimal webMobile;

  public BidOptionsAppTypeMultipliers androidMobile(BigDecimal androidMobile) {
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
  public BigDecimal getAndroidMobile() {
    return androidMobile;
  }

  public void setAndroidMobile(BigDecimal androidMobile) {
    this.androidMobile = androidMobile;
  }

  public BidOptionsAppTypeMultipliers androidTablet(BigDecimal androidTablet) {
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
  public BigDecimal getAndroidTablet() {
    return androidTablet;
  }

  public void setAndroidTablet(BigDecimal androidTablet) {
    this.androidTablet = androidTablet;
  }

  public BidOptionsAppTypeMultipliers ipad(BigDecimal ipad) {
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
  public BigDecimal getIpad() {
    return ipad;
  }

  public void setIpad(BigDecimal ipad) {
    this.ipad = ipad;
  }

  public BidOptionsAppTypeMultipliers iphone(BigDecimal iphone) {
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
  public BigDecimal getIphone() {
    return iphone;
  }

  public void setIphone(BigDecimal iphone) {
    this.iphone = iphone;
  }

  public BidOptionsAppTypeMultipliers web(BigDecimal web) {
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
  public BigDecimal getWeb() {
    return web;
  }

  public void setWeb(BigDecimal web) {
    this.web = web;
  }

  public BidOptionsAppTypeMultipliers webMobile(BigDecimal webMobile) {
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
  public BigDecimal getWebMobile() {
    return webMobile;
  }

  public void setWebMobile(BigDecimal webMobile) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

