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
  public class MediaUploadAllOf {
    /// <summary>
    /// Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
    /// </summary>
    /// <value>Unique identifier for this media upload. Used to track status and for attaching during Pin creation.</value>
    [DataMember(Name="media_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "media_id")]
    public string MediaId { get; set; }

    /// <summary>
    /// Gets or Sets MediaType
    /// </summary>
    [DataMember(Name="media_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "media_type")]
    public MediaUploadType MediaType { get; set; }

    /// <summary>
    /// The URL where you will POST your media file.
    /// </summary>
    /// <value>The URL where you will POST your media file.</value>
    [DataMember(Name="upload_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "upload_url")]
    public string UploadUrl { get; set; }

    /// <summary>
    /// Gets or Sets UploadParameters
    /// </summary>
    [DataMember(Name="upload_parameters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "upload_parameters")]
    public MediaUploadAllOfUploadParameters UploadParameters { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class MediaUploadAllOf {\n");
      sb.Append("  MediaId: ").Append(MediaId).Append("\n");
      sb.Append("  MediaType: ").Append(MediaType).Append("\n");
      sb.Append("  UploadUrl: ").Append(UploadUrl).Append("\n");
      sb.Append("  UploadParameters: ").Append(UploadParameters).Append("\n");
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
