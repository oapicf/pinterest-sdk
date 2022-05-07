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
  public class CatalogsFeedIngestionDetails {
    /// <summary>
    /// Gets or Sets Errors
    /// </summary>
    [DataMember(Name="errors", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "errors")]
    public CatalogsFeedIngestionErrors Errors { get; set; }

    /// <summary>
    /// Gets or Sets Info
    /// </summary>
    [DataMember(Name="info", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "info")]
    public CatalogsFeedIngestionInfo Info { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CatalogsFeedIngestionDetails {\n");
      sb.Append("  Errors: ").Append(Errors).Append("\n");
      sb.Append("  Info: ").Append(Info).Append("\n");
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
