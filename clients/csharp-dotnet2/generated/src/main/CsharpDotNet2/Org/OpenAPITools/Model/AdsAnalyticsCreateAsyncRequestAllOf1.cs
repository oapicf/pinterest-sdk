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
  public class AdsAnalyticsCreateAsyncRequestAllOf1 {
    /// <summary>
    /// Metric and entity columns
    /// </summary>
    /// <value>Metric and entity columns</value>
    [DataMember(Name="columns", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "columns")]
    public List<ReportingColumnAsync> Columns { get; set; }

    /// <summary>
    /// Level of the report
    /// </summary>
    /// <value>Level of the report</value>
    [DataMember(Name="level", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "level")]
    public MetricsReportingLevel Level { get; set; }

    /// <summary>
    /// Specification for formatting report data
    /// </summary>
    /// <value>Specification for formatting report data</value>
    [DataMember(Name="report_format", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "report_format")]
    public DataOutputFormat ReportFormat { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AdsAnalyticsCreateAsyncRequestAllOf1 {\n");
      sb.Append("  Columns: ").Append(Columns).Append("\n");
      sb.Append("  Level: ").Append(Level).Append("\n");
      sb.Append("  ReportFormat: ").Append(ReportFormat).Append("\n");
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
