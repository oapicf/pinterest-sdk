using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Request object of catalogs items batch
  /// </summary>
  [DataContract]
  public class CatalogsItemsBatchRequest {
    /// <summary>
    /// Gets or Sets Country
    /// </summary>
    [DataMember(Name="country", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "country")]
    public Country Country { get; set; }

    /// <summary>
    /// Gets or Sets Language
    /// </summary>
    [DataMember(Name="language", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "language")]
    public Language Language { get; set; }

    /// <summary>
    /// Gets or Sets Operation
    /// </summary>
    [DataMember(Name="operation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "operation")]
    public BatchOperation Operation { get; set; }

    /// <summary>
    /// Array with catalogs items
    /// </summary>
    /// <value>Array with catalogs items</value>
    [DataMember(Name="items", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "items")]
    public List<ItemBatchRecord> Items { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CatalogsItemsBatchRequest {\n");
      sb.Append("  Country: ").Append(Country).Append("\n");
      sb.Append("  Language: ").Append(Language).Append("\n");
      sb.Append("  Operation: ").Append(Operation).Append("\n");
      sb.Append("  Items: ").Append(Items).Append("\n");
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
