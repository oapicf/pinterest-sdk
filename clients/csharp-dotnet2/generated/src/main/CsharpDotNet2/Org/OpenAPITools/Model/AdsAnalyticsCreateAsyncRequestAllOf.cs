using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class AdsAnalyticsCreateAsyncRequestAllOf {
    /// <summary>
    /// Metric report start date (UTC). Format: YYYY-MM-DD
    /// </summary>
    /// <value>Metric report start date (UTC). Format: YYYY-MM-DD</value>
    [DataMember(Name="start_date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "start_date")]
    public string StartDate { get; set; }

    /// <summary>
    /// Metric report end date (UTC). Format: YYYY-MM-DD
    /// </summary>
    /// <value>Metric report end date (UTC). Format: YYYY-MM-DD</value>
    [DataMember(Name="end_date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "end_date")]
    public string EndDate { get; set; }

    /// <summary>
    /// TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
    /// </summary>
    /// <value>TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly</value>
    [DataMember(Name="granularity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granularity")]
    public Granularity Granularity { get; set; }

    /// <summary>
    /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    /// </summary>
    /// <value>Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</value>
    [DataMember(Name="click_window_days", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "click_window_days")]
    public ConversionAttributionWindowDays ClickWindowDays { get; set; }

    /// <summary>
    /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    /// </summary>
    /// <value>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</value>
    [DataMember(Name="engagement_window_days", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "engagement_window_days")]
    public ConversionAttributionWindowDays EngagementWindowDays { get; set; }

    /// <summary>
    /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
    /// </summary>
    /// <value>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</value>
    [DataMember(Name="view_window_days", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "view_window_days")]
    public ConversionAttributionWindowDays ViewWindowDays { get; set; }

    /// <summary>
    /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    /// </summary>
    /// <value>The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</value>
    [DataMember(Name="conversion_report_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "conversion_report_time")]
    public ConversionReportTimeType ConversionReportTime { get; set; }

    /// <summary>
    /// List of types of attribution for the conversion report
    /// </summary>
    /// <value>List of types of attribution for the conversion report</value>
    [DataMember(Name="attribution_types", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "attribution_types")]
    public List<ConversionReportAttributionType> AttributionTypes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AdsAnalyticsCreateAsyncRequestAllOf {\n");
      sb.Append("  StartDate: ").Append(StartDate).Append("\n");
      sb.Append("  EndDate: ").Append(EndDate).Append("\n");
      sb.Append("  Granularity: ").Append(Granularity).Append("\n");
      sb.Append("  ClickWindowDays: ").Append(ClickWindowDays).Append("\n");
      sb.Append("  EngagementWindowDays: ").Append(EngagementWindowDays).Append("\n");
      sb.Append("  ViewWindowDays: ").Append(ViewWindowDays).Append("\n");
      sb.Append("  ConversionReportTime: ").Append(ConversionReportTime).Append("\n");
      sb.Append("  AttributionTypes: ").Append(AttributionTypes).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

}
}
