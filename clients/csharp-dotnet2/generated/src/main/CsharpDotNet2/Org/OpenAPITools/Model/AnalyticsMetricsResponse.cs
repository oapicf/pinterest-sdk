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
  public class AnalyticsMetricsResponse {
    /// <summary>
    /// Array with the requested daily metric records
    /// </summary>
    /// <value>Array with the requested daily metric records</value>
    [DataMember(Name="daily_metrics", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "daily_metrics")]
    public List<AnalyticsMetricsResponseDailyMetrics> DailyMetrics { get; set; }

    /// <summary>
    /// The metric name and value over the requested period for each requested metric
    /// </summary>
    /// <value>The metric name and value over the requested period for each requested metric</value>
    [DataMember(Name="summary_metrics", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "summary_metrics")]
    public Dictionary<string, decimal?> SummaryMetrics { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AnalyticsMetricsResponse {\n");
      sb.Append("  DailyMetrics: ").Append(DailyMetrics).Append("\n");
      sb.Append("  SummaryMetrics: ").Append(SummaryMetrics).Append("\n");
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
