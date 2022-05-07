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
  public class CampaignResponseAllOf1 {
    /// <summary>
    /// Gets or Sets ObjectiveType
    /// </summary>
    [DataMember(Name="objective_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "objective_type")]
    public ObjectiveType ObjectiveType { get; set; }

    /// <summary>
    /// Campaign creation time. Unix timestamp in seconds.
    /// </summary>
    /// <value>Campaign creation time. Unix timestamp in seconds.</value>
    [DataMember(Name="created_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "created_time")]
    public int? CreatedTime { get; set; }

    /// <summary>
    /// UTC timestamp. Last update time.
    /// </summary>
    /// <value>UTC timestamp. Last update time.</value>
    [DataMember(Name="updated_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "updated_time")]
    public int? UpdatedTime { get; set; }

    /// <summary>
    /// Always \"campaign\".
    /// </summary>
    /// <value>Always \"campaign\".</value>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public string Type { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CampaignResponseAllOf1 {\n");
      sb.Append("  ObjectiveType: ").Append(ObjectiveType).Append("\n");
      sb.Append("  CreatedTime: ").Append(CreatedTime).Append("\n");
      sb.Append("  UpdatedTime: ").Append(UpdatedTime).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
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
