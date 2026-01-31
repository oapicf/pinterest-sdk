package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

/**
 * This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppTypeMultipliers extends HashMap<String, Double>  {
  


  public enum APPTYPEEnum {
    ANDROID_MOBILE("android_mobile"),
    ANDROID_TABLET("android_tablet"),
    IPAD("ipad"),
    IPHONE("iphone"),
    WEB("web"),
    WEB_MOBILE("web_mobile");

    private String value;

    APPTYPEEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private APPTYPEEnum APP_TYPE;

  public AppTypeMultipliers () {

  }

  public AppTypeMultipliers (APPTYPEEnum APP_TYPE) {
    this.APP_TYPE = APP_TYPE;
  }

    
  @JsonProperty("APP_TYPE")
  public APPTYPEEnum getAPPTYPE() {
    return APP_TYPE;
  }
  public void setAPPTYPE(APPTYPEEnum APP_TYPE) {
    this.APP_TYPE = APP_TYPE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppTypeMultipliers appTypeMultipliers = (AppTypeMultipliers) o;
    return super.equals(o) && Objects.equals(APP_TYPE, appTypeMultipliers.APP_TYPE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), APP_TYPE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppTypeMultipliers {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    APP_TYPE: ").append(toIndentedString(APP_TYPE)).append("\n");
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
