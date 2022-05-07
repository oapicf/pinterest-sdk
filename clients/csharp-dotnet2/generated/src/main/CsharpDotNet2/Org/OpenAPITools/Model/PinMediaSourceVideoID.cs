using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Video ID-based media source
  /// </summary>
  [DataContract]
  public class PinMediaSourceVideoID {
    /// <summary>
    /// Gets or Sets SourceType
    /// </summary>
    [DataMember(Name="source_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "source_type")]
    public string SourceType { get; set; }

    /// <summary>
    /// Gets or Sets CoverImageUrl
    /// </summary>
    [DataMember(Name="cover_image_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cover_image_url")]
    public string CoverImageUrl { get; set; }

    /// <summary>
    /// Gets or Sets MediaId
    /// </summary>
    [DataMember(Name="media_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "media_id")]
    public string MediaId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PinMediaSourceVideoID {\n");
      sb.Append("  SourceType: ").Append(SourceType).Append("\n");
      sb.Append("  CoverImageUrl: ").Append(CoverImageUrl).Append("\n");
      sb.Append("  MediaId: ").Append(MediaId).Append("\n");
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
