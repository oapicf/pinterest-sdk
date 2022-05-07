using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Optional daily processing schedule. Use this to configure the preferred time for processing a feed (otherwise random).
  /// </summary>
  [DataContract]
  public class CatalogsFeedProcessingSchedule {
    /// <summary>
    /// A time in format HH:MM with leading 0 (zero)
    /// </summary>
    /// <value>A time in format HH:MM with leading 0 (zero)</value>
    [DataMember(Name="time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "time")]
    public string Time { get; set; }

    /// <summary>
    /// The timezone considered for the processing schedule time.
    /// </summary>
    /// <value>The timezone considered for the processing schedule time.</value>
    [DataMember(Name="timezone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timezone")]
    public string Timezone { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CatalogsFeedProcessingSchedule {\n");
      sb.Append("  Time: ").Append(Time).Append("\n");
      sb.Append("  Timezone: ").Append(Timezone).Append("\n");
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
