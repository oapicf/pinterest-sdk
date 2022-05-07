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
  public class CatalogsFeedProcessingResult {
    /// <summary>
    /// Gets or Sets CreatedAt
    /// </summary>
    [DataMember(Name="created_at", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "created_at")]
    public DateTime? CreatedAt { get; set; }

    /// <summary>
    /// Gets or Sets Id
    /// </summary>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// Gets or Sets UpdatedAt
    /// </summary>
    [DataMember(Name="updated_at", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "updated_at")]
    public DateTime? UpdatedAt { get; set; }

    /// <summary>
    /// Gets or Sets IngestionDetails
    /// </summary>
    [DataMember(Name="ingestion_details", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ingestion_details")]
    public CatalogsFeedIngestionDetails IngestionDetails { get; set; }

    /// <summary>
    /// Gets or Sets Status
    /// </summary>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public CatalogsFeedProcessingStatus Status { get; set; }

    /// <summary>
    /// Gets or Sets ProductCounts
    /// </summary>
    [DataMember(Name="product_counts", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "product_counts")]
    public CatalogsFeedProductCounts ProductCounts { get; set; }

    /// <summary>
    /// Gets or Sets ValidationDetails
    /// </summary>
    [DataMember(Name="validation_details", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "validation_details")]
    public CatalogsFeedValidationDetails ValidationDetails { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CatalogsFeedProcessingResult {\n");
      sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
      sb.Append("  IngestionDetails: ").Append(IngestionDetails).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
      sb.Append("  ProductCounts: ").Append(ProductCounts).Append("\n");
      sb.Append("  ValidationDetails: ").Append(ValidationDetails).Append("\n");
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
