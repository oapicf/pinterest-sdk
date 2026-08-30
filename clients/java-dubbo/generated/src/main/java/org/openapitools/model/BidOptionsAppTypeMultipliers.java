package org.openapitools.model;

import java.math.BigDecimal;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
public class BidOptionsAppTypeMultipliers implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("android_mobile")
  private BigDecimal androidMobile;

  @JsonProperty("android_tablet")
  private BigDecimal androidTablet;

  @JsonProperty("ipad")
  private BigDecimal ipad;

  @JsonProperty("iphone")
  private BigDecimal iphone;

  @JsonProperty("web")
  private BigDecimal web;

  @JsonProperty("web_mobile")
  private BigDecimal webMobile;

  /**
   * 
   * @return androidMobile
   */
  public BigDecimal getAndroidMobile() {
    return androidMobile;
  }

  public void setAndroidMobile(BigDecimal androidMobile) {
    this.androidMobile = androidMobile;
  }

  /**
   * 
   * @return androidTablet
   */
  public BigDecimal getAndroidTablet() {
    return androidTablet;
  }

  public void setAndroidTablet(BigDecimal androidTablet) {
    this.androidTablet = androidTablet;
  }

  /**
   * 
   * @return ipad
   */
  public BigDecimal getIpad() {
    return ipad;
  }

  public void setIpad(BigDecimal ipad) {
    this.ipad = ipad;
  }

  /**
   * 
   * @return iphone
   */
  public BigDecimal getIphone() {
    return iphone;
  }

  public void setIphone(BigDecimal iphone) {
    this.iphone = iphone;
  }

  /**
   * 
   * @return web
   */
  public BigDecimal getWeb() {
    return web;
  }

  public void setWeb(BigDecimal web) {
    this.web = web;
  }

  /**
   * 
   * @return webMobile
   */
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
