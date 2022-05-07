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
  public class AdsAnalyticsMetricsFilter {
    /// <summary>
    /// Gets or Sets Field
    /// </summary>
    [DataMember(Name="field", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "field")]
    public AdsAnalyticsFilterColumn Field { get; set; }

    /// <summary>
    /// Gets or Sets Operator
    /// </summary>
    [DataMember(Name="operator", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "operator")]
    public AdsAnalyticsFilterOperator Operator { get; set; }

    /// <summary>
    /// List of values for filtering
    /// </summary>
    /// <value>List of values for filtering</value>
    [DataMember(Name="values", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "values")]
    public List<decimal?> Values { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AdsAnalyticsMetricsFilter {\n");
      sb.Append("  Field: ").Append(Field).Append("\n");
      sb.Append("  Operator: ").Append(Operator).Append("\n");
      sb.Append("  Values: ").Append(Values).Append("\n");
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
