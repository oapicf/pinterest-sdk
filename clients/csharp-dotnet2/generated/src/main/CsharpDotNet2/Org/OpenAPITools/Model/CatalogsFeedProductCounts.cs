using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// The counts can be null early in the process.
  /// </summary>
  [DataContract]
  public class CatalogsFeedProductCounts {
    /// <summary>
    /// The number of products in the feed file
    /// </summary>
    /// <value>The number of products in the feed file</value>
    [DataMember(Name="original", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "original")]
    public int? Original { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CatalogsFeedProductCounts {\n");
      sb.Append("  Original: ").Append(Original).Append("\n");
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
