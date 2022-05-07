using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Media upload details
  /// </summary>
  [DataContract]
  public class MediaUploadDetails {
    /// <summary>
    /// Gets or Sets MediaId
    /// </summary>
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
    /// Gets or Sets Status
    /// </summary>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public MediaUploadStatus Status { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class MediaUploadDetails {\n");
      sb.Append("  MediaId: ").Append(MediaId).Append("\n");
      sb.Append("  MediaType: ").Append(MediaType).Append("\n");
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
