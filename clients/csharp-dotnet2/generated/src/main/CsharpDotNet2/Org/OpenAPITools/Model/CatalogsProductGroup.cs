using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// catalog product group entity
  /// </summary>
  [DataContract]
  public class CatalogsProductGroup {
    /// <summary>
    /// ID of the catalog product group.
    /// </summary>
    /// <value>ID of the catalog product group.</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// Name of catalog product group
    /// </summary>
    /// <value>Name of catalog product group</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets Description
    /// </summary>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// Gets or Sets Filters
    /// </summary>
    [DataMember(Name="filters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "filters")]
    public CatalogsProductGroupFilters Filters { get; set; }

    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public CatalogsProductGroupType Type { get; set; }

    /// <summary>
    /// Gets or Sets Status
    /// </summary>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public CatalogsProductGroupStatus Status { get; set; }

    /// <summary>
    /// id of the catalogs feed belonging to this catalog product group
    /// </summary>
    /// <value>id of the catalogs feed belonging to this catalog product group</value>
    [DataMember(Name="feed_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "feed_id")]
    public string FeedId { get; set; }

    /// <summary>
    /// Unix timestamp in seconds of when catalog product group was created.
    /// </summary>
    /// <value>Unix timestamp in seconds of when catalog product group was created.</value>
    [DataMember(Name="created_at", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "created_at")]
    public int? CreatedAt { get; set; }

    /// <summary>
    /// Unix timestamp in seconds of last time catalog product group was updated.
    /// </summary>
    /// <value>Unix timestamp in seconds of last time catalog product group was updated.</value>
    [DataMember(Name="updated_at", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "updated_at")]
    public int? UpdatedAt { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CatalogsProductGroup {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  Filters: ").Append(Filters).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
      sb.Append("  FeedId: ").Append(FeedId).Append("\n");
      sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
      sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
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
