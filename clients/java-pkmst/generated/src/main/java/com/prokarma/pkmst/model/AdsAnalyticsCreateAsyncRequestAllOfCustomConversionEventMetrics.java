package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics   {
  /**
   * Metrics for custom defined conversion event.
   */
  public enum CustomEventMetricsTypeEnum {
    ADE_COST_PER_ACTION("ADE_COST_PER_ACTION"),
    
    ADE_ROAS("ADE_ROAS"),
    
    ADE_TOTAL_CONVERSIONS("ADE_TOTAL_CONVERSIONS"),
    
    ADE_TOTAL_VALUE_IN_MICRO_DOLLAR("ADE_TOTAL_VALUE_IN_MICRO_DOLLAR"),
    
    ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR("ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR"),
    
    ADE_TOTAL_CLICK("ADE_TOTAL_CLICK"),
    
    ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR("ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR"),
    
    ADE_TOTAL_VIEW("ADE_TOTAL_VIEW"),
    
    ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR("ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR"),
    
    ADE_TOTAL_CONVERSION_RATE("ADE_TOTAL_CONVERSION_RATE"),
    
    ADE_WEB_COST_PER_ACTION("ADE_WEB_COST_PER_ACTION"),
    
    ADE_WEB_ROAS("ADE_WEB_ROAS"),
    
    ADE_TOTAL_WEB_CONVERSIONS("ADE_TOTAL_WEB_CONVERSIONS"),
    
    ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR("ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR"),
    
    ADE_TOTAL_WEB_CLICK("ADE_TOTAL_WEB_CLICK"),
    
    ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR("ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR"),
    
    ADE_TOTAL_WEB_VIEW("ADE_TOTAL_WEB_VIEW"),
    
    ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR("ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR"),
    
    ADE_INAPP_COST_PER_ACTION("ADE_INAPP_COST_PER_ACTION"),
    
    ADE_INAPP_ROAS("ADE_INAPP_ROAS"),
    
    ADE_TOTAL_INAPP_CONVERSIONS("ADE_TOTAL_INAPP_CONVERSIONS"),
    
    ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR("ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR"),
    
    ADE_TOTAL_INAPP_CLICK("ADE_TOTAL_INAPP_CLICK"),
    
    ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR("ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR"),
    
    ADE_TOTAL_INAPP_VIEW("ADE_TOTAL_INAPP_VIEW"),
    
    ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR("ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR"),
    
    ADE_OFFLINE_COST_PER_ACTION("ADE_OFFLINE_COST_PER_ACTION"),
    
    ADE_OFFLINE_ROAS("ADE_OFFLINE_ROAS"),
    
    ADE_TOTAL_OFFLINE_CONVERSIONS("ADE_TOTAL_OFFLINE_CONVERSIONS"),
    
    ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR("ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR"),
    
    ADE_TOTAL_OFFLINE_CLICK("ADE_TOTAL_OFFLINE_CLICK"),
    
    ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR("ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR"),
    
    ADE_TOTAL_OFFLINE_VIEW("ADE_TOTAL_OFFLINE_VIEW"),
    
    ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR("ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR"),
    
    ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY("ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY"),
    
    ADE_TOTAL_CONVERSION_PRODUCT_VALUE("ADE_TOTAL_CONVERSION_PRODUCT_VALUE"),
    
    ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS("ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"),
    
    ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD("ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD"),
    
    ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD("ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"),
    
    ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY("ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY"),
    
    ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE("ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE"),
    
    ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS("ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"),
    
    ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD("ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD"),
    
    ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD("ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"),
    
    ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY("ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY"),
    
    ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE("ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE"),
    
    ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS("ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"),
    
    ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD("ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD"),
    
    ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD("ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"),
    
    ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY("ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY"),
    
    ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE("ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE"),
    
    ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS("ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS"),
    
    ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD("ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD"),
    
    ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD("ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD");

    private String value;

    CustomEventMetricsTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomEventMetricsTypeEnum fromValue(String text) {
      for (CustomEventMetricsTypeEnum b : CustomEventMetricsTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("custom_event_metrics_type")
  private CustomEventMetricsTypeEnum customEventMetricsType;

  @JsonProperty("custom_event_name")
  private String customEventName;

  public AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics customEventMetricsType(CustomEventMetricsTypeEnum customEventMetricsType) {
    this.customEventMetricsType = customEventMetricsType;
    return this;
  }

  /**
   * Metrics for custom defined conversion event.
   * @return customEventMetricsType
   */
  @ApiModelProperty(example = "ADE_COST_PER_ACTION", required = true, value = "Metrics for custom defined conversion event.")
  public CustomEventMetricsTypeEnum getCustomEventMetricsType() {
    return customEventMetricsType;
  }

  public void setCustomEventMetricsType(CustomEventMetricsTypeEnum customEventMetricsType) {
    this.customEventMetricsType = customEventMetricsType;
  }

  public AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics customEventName(String customEventName) {
    this.customEventName = customEventName;
    return this;
  }

  /**
   * Name of the advertiser-defined custom conversion event
   * @return customEventName
   */
  @ApiModelProperty(required = true, value = "Name of the advertiser-defined custom conversion event")
  public String getCustomEventName() {
    return customEventName;
  }

  public void setCustomEventName(String customEventName) {
    this.customEventName = customEventName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics = (AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics) o;
    return Objects.equals(this.customEventMetricsType, adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics.customEventMetricsType) &&
        Objects.equals(this.customEventName, adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics.customEventName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customEventMetricsType, customEventName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics {\n");
    
    sb.append("    customEventMetricsType: ").append(toIndentedString(customEventMetricsType)).append("\n");
    sb.append("    customEventName: ").append(toIndentedString(customEventName)).append("\n");
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

