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
  public class CatalogsFeedIngestionInfo {
    /// <summary>
    /// Gets or Sets InStock
    /// </summary>
    [DataMember(Name="in_stock", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "in_stock")]
    public int? InStock { get; set; }

    /// <summary>
    /// Gets or Sets OutOfStock
    /// </summary>
    [DataMember(Name="out_of_stock", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "out_of_stock")]
    public int? OutOfStock { get; set; }

    /// <summary>
    /// Gets or Sets Preorder
    /// </summary>
    [DataMember(Name="preorder", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "preorder")]
    public int? Preorder { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CatalogsFeedIngestionInfo {\n");
      sb.Append("  InStock: ").Append(InStock).Append("\n");
      sb.Append("  OutOfStock: ").Append(OutOfStock).Append("\n");
      sb.Append("  Preorder: ").Append(Preorder).Append("\n");
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
