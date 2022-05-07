using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Request object for updating a product group.
  /// </summary>
  [DataContract]
  public class CatalogsProductGroupUpdateRequest {
    /// <summary>
    /// Catalog Feed id pertaining to the catalog product group.
    /// </summary>
    /// <value>Catalog Feed id pertaining to the catalog product group.</value>
    [DataMember(Name="feed_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "feed_id")]
    public string FeedId { get; set; }

    /// <summary>
    /// Gets or Sets Name
    /// </summary>
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
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CatalogsProductGroupUpdateRequest {\n");
      sb.Append("  FeedId: ").Append(FeedId).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  Filters: ").Append(Filters).Append("\n");
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
