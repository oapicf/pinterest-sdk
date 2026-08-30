package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BidOptionsAppTypeMultipliers   {
  @JsonProperty("android_mobile")
  @Valid

  private BigDecimal androidMobile;

  @JsonProperty("android_tablet")
  @Valid

  private BigDecimal androidTablet;

  @JsonProperty("ipad")
  @Valid

  private BigDecimal ipad;

  @JsonProperty("iphone")
  @Valid

  private BigDecimal iphone;

  @JsonProperty("web")
  @Valid

  private BigDecimal web;

  @JsonProperty("web_mobile")
  @Valid

  private BigDecimal webMobile;

  public BidOptionsAppTypeMultipliers androidMobile(BigDecimal androidMobile) {
    this.androidMobile = androidMobile;
    return this;
  }

   /**
   * Get androidMobile
   * @return androidMobile
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

