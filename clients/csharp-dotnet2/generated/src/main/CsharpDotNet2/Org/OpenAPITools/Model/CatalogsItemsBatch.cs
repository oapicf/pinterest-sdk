using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Object describing the catalogs items batch
  /// </summary>
  [DataContract]
  public class CatalogsItemsBatch {
    /// <summary>
    /// Array with the catalogs items processing records part of the catalogs items batch
    /// </summary>
    /// <value>Array with the catalogs items processing records part of the catalogs items batch</value>
    [DataMember(Name="items", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "items")]
    public List<ItemProcessingRecord> Items { get; set; }

    /// <summary>
    /// Id of the catalogs items batch
    /// </summary>
    /// <value>Id of the catalogs items batch</value>
    [DataMember(Name="batch_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "batch_id")]
    public string BatchId { get; set; }

    /// <summary>
    /// Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
    /// </summary>
    /// <value>Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD</value>
    [DataMember(Name="created_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "created_time")]
    public DateTime? CreatedTime { get; set; }

    /// <summary>
    /// Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
    /// </summary>
    /// <value>Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD</value>
    [DataMember(Name="completed_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "completed_time")]
    public DateTime? CompletedTime { get; set; }

    /// <summary>
    /// Gets or Sets Status
    /// </summary>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public BatchOperationStatus Status { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CatalogsItemsBatch {\n");
      sb.Append("  Items: ").Append(Items).Append("\n");
      sb.Append("  BatchId: ").Append(BatchId).Append("\n");
      sb.Append("  CreatedTime: ").Append(CreatedTime).Append("\n");
      sb.Append("  CompletedTime: ").Append(CompletedTime).Append("\n");
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
