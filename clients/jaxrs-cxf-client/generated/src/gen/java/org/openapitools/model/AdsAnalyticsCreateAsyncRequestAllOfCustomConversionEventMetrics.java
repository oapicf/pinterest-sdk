package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics  {
  
public enum CustomEventMetricsTypeEnum {

ADE_COST_PER_ACTION(String.valueOf("ADE_COST_PER_ACTION")), ADE_ROAS(String.valueOf("ADE_ROAS")), ADE_TOTAL_CONVERSIONS(String.valueOf("ADE_TOTAL_CONVERSIONS")), ADE_TOTAL_VALUE_IN_MICRO_DOLLAR(String.valueOf("ADE_TOTAL_VALUE_IN_MICRO_DOLLAR")), ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR(String.valueOf("ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR")), ADE_TOTAL_CLICK(String.valueOf("ADE_TOTAL_CLICK")), ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR(String.valueOf("ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR")), ADE_TOTAL_VIEW(String.valueOf("ADE_TOTAL_VIEW")), ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR(String.valueOf("ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR")), ADE_TOTAL_CONVERSION_RATE(String.valueOf("ADE_TOTAL_CONVERSION_RATE")), ADE_WEB_COST_PER_ACTION(String.valueOf("ADE_WEB_COST_PER_ACTION")), ADE_WEB_ROAS(String.valueOf("ADE_WEB_ROAS")), ADE_TOTAL_WEB_CONVERSIONS(String.valueOf("ADE_TOTAL_WEB_CONVERSIONS")), ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR(String.valueOf("ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR")), ADE_TOTAL_WEB_CLICK(String.valueOf("ADE_TOTAL_WEB_CLICK")), ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR(String.valueOf("ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR")), ADE_TOTAL_WEB_VIEW(String.valueOf("ADE_TOTAL_WEB_VIEW")), ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR(String.valueOf("ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR")), ADE_INAPP_COST_PER_ACTION(String.valueOf("ADE_INAPP_COST_PER_ACTION")), ADE_INAPP_ROAS(String.valueOf("ADE_INAPP_ROAS")), ADE_TOTAL_INAPP_CONVERSIONS(String.valueOf("ADE_TOTAL_INAPP_CONVERSIONS")), ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR(String.valueOf("ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR")), ADE_TOTAL_INAPP_CLICK(String.valueOf("ADE_TOTAL_INAPP_CLICK")), ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR(String.valueOf("ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR")), ADE_TOTAL_INAPP_VIEW(String.valueOf("ADE_TOTAL_INAPP_VIEW")), ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR(String.valueOf("ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR")), ADE_OFFLINE_COST_PER_ACTION(String.valueOf("ADE_OFFLINE_COST_PER_ACTION")), ADE_OFFLINE_ROAS(String.valueOf("ADE_OFFLINE_ROAS")), ADE_TOTAL_OFFLINE_CONVERSIONS(String.valueOf("ADE_TOTAL_OFFLINE_CONVERSIONS")), ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR(String.valueOf("ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR")), ADE_TOTAL_OFFLINE_CLICK(String.valueOf("ADE_TOTAL_OFFLINE_CLICK")), ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR(String.valueOf("ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR")), ADE_TOTAL_OFFLINE_VIEW(String.valueOf("ADE_TOTAL_OFFLINE_VIEW")), ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR(String.valueOf("ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR")), ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY(String.valueOf("ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY")), ADE_TOTAL_CONVERSION_PRODUCT_VALUE(String.valueOf("ADE_TOTAL_CONVERSION_PRODUCT_VALUE")), ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS(String.valueOf("ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS")), ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD(String.valueOf("ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD")), ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD(String.valueOf("ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD")), ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY(String.valueOf("ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY")), ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE(String.valueOf("ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE")), ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS(String.valueOf("ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS")), ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD(String.valueOf("ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD")), ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD(String.valueOf("ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD")), ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY(String.valueOf("ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY")), ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE(String.valueOf("ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE")), ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS(String.valueOf("ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS")), ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD(String.valueOf("ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD")), ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD(String.valueOf("ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD")), ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY(String.valueOf("ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY")), ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE(String.valueOf("ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE")), ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS(String.valueOf("ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS")), ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD(String.valueOf("ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD")), ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD(String.valueOf("ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD"));


    private String value;

    CustomEventMetricsTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CustomEventMetricsTypeEnum fromValue(String value) {
        for (CustomEventMetricsTypeEnum b : CustomEventMetricsTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Metrics for custom defined conversion event.
  */
  @ApiModelProperty(example = "ADE_COST_PER_ACTION", required = true, value = "Metrics for custom defined conversion event.")

  private CustomEventMetricsTypeEnum customEventMetricsType;

 /**
  * Name of the advertiser-defined custom conversion event
  */
  @ApiModelProperty(required = true, value = "Name of the advertiser-defined custom conversion event")

  private String customEventName;
 /**
   * Metrics for custom defined conversion event.
   * @return customEventMetricsType
  **/
  @JsonProperty("custom_event_metrics_type")
  public String getCustomEventMetricsType() {
    if (customEventMetricsType == null) {
      return null;
    }
    return customEventMetricsType.value();
  }

  public void setCustomEventMetricsType(CustomEventMetricsTypeEnum customEventMetricsType) {
    this.customEventMetricsType = customEventMetricsType;
  }

  public AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics customEventMetricsType(CustomEventMetricsTypeEnum customEventMetricsType) {
    this.customEventMetricsType = customEventMetricsType;
    return this;
  }

 /**
   * Name of the advertiser-defined custom conversion event
   * @return customEventName
  **/
  @JsonProperty("custom_event_name")
  public String getCustomEventName() {
    return customEventName;
  }

  public void setCustomEventName(String customEventName) {
    this.customEventName = customEventName;
  }

  public AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics customEventName(String customEventName) {
    this.customEventName = customEventName;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

