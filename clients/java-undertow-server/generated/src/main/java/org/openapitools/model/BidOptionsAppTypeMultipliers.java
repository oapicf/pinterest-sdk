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
import java.math.BigDecimal;



/**
 * This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

@ApiModel(description = "This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BidOptionsAppTypeMultipliers   {
  
  private BigDecimal androidMobile;
  private BigDecimal androidTablet;
  private BigDecimal ipad;
  private BigDecimal iphone;
  private BigDecimal web;
  private BigDecimal webMobile;

  /**
   */
  public BidOptionsAppTypeMultipliers androidMobile(BigDecimal androidMobile) {
    this.androidMobile = androidMobile;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("android_mobile")
  public BigDecimal getAndroidMobile() {
    return androidMobile;
  }
  public void setAndroidMobile(BigDecimal androidMobile) {
    this.androidMobile = androidMobile;
  }

  /**
   */
  public BidOptionsAppTypeMultipliers androidTablet(BigDecimal androidTablet) {
    this.androidTablet = androidTablet;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("android_tablet")
  public BigDecimal getAndroidTablet() {
    return androidTablet;
  }
  public void setAndroidTablet(BigDecimal androidTablet) {
    this.androidTablet = androidTablet;
  }

  /**
   */
  public BidOptionsAppTypeMultipliers ipad(BigDecimal ipad) {
    this.ipad = ipad;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ipad")
  public BigDecimal getIpad() {
    return ipad;
  }
  public void setIpad(BigDecimal ipad) {
    this.ipad = ipad;
  }

  /**
   */
  public BidOptionsAppTypeMultipliers iphone(BigDecimal iphone) {
    this.iphone = iphone;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("iphone")
  public BigDecimal getIphone() {
    return iphone;
  }
  public void setIphone(BigDecimal iphone) {
    this.iphone = iphone;
  }

  /**
   */
  public BidOptionsAppTypeMultipliers web(BigDecimal web) {
    this.web = web;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("web")
  public BigDecimal getWeb() {
    return web;
  }
  public void setWeb(BigDecimal web) {
    this.web = web;
  }

  /**
   */
  public BidOptionsAppTypeMultipliers webMobile(BigDecimal webMobile) {
    this.webMobile = webMobile;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return Objects.equals(androidMobile, bidOptionsAppTypeMultipliers.androidMobile) &&
        Objects.equals(androidTablet, bidOptionsAppTypeMultipliers.androidTablet) &&
        Objects.equals(ipad, bidOptionsAppTypeMultipliers.ipad) &&
        Objects.equals(iphone, bidOptionsAppTypeMultipliers.iphone) &&
        Objects.equals(web, bidOptionsAppTypeMultipliers.web) &&
        Objects.equals(webMobile, bidOptionsAppTypeMultipliers.webMobile);
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

