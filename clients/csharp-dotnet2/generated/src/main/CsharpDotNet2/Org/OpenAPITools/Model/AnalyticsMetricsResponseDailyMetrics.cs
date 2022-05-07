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
  public class AnalyticsMetricsResponseDailyMetrics {
    /// <summary>
    /// Metrics availablity, e.g., \"READY\".
    /// </summary>
    /// <value>Metrics availablity, e.g., \"READY\".</value>
    [DataMember(Name="data_status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "data_status")]
    public string DataStatus { get; set; }

    /// <summary>
    /// Metrics date (UTC): YYYY-MM-DD.
    /// </summary>
    /// <value>Metrics date (UTC): YYYY-MM-DD.</value>
    [DataMember(Name="date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "date")]
    public string Date { get; set; }

    /// <summary>
    /// The metric name and daily value for each requested metric
    /// </summary>
    /// <value>The metric name and daily value for each requested metric</value>
    [DataMember(Name="metrics", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "metrics")]
    public Dictionary<string, decimal?> Metrics { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AnalyticsMetricsResponseDailyMetrics {\n");
      sb.Append("  DataStatus: ").Append(DataStatus).Append("\n");
      sb.Append("  Date: ").Append(Date).Append("\n");
      sb.Append("  Metrics: ").Append(Metrics).Append("\n");
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
