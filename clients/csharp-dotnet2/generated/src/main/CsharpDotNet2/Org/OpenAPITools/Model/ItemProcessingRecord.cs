using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Object describing an item processing record
  /// </summary>
  [DataContract]
  public class ItemProcessingRecord {
    /// <summary>
    /// The catalog item id in the merchant namespace
    /// </summary>
    /// <value>The catalog item id in the merchant namespace</value>
    [DataMember(Name="item_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "item_id")]
    public string ItemId { get; set; }

    /// <summary>
    /// Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
    /// </summary>
    /// <value>Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.</value>
    [DataMember(Name="errors", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "errors")]
    public List<ItemValidationEvent> Errors { get; set; }

    /// <summary>
    /// Array with the validation warnings for the item processing record
    /// </summary>
    /// <value>Array with the validation warnings for the item processing record</value>
    [DataMember(Name="warnings", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "warnings")]
    public List<ItemValidationEvent> Warnings { get; set; }

    /// <summary>
    /// Gets or Sets Status
    /// </summary>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public ItemProcessingStatus Status { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ItemProcessingRecord {\n");
      sb.Append("  ItemId: ").Append(ItemId).Append("\n");
      sb.Append("  Errors: ").Append(Errors).Append("\n");
      sb.Append("  Warnings: ").Append(Warnings).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
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
