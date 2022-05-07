using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
  /// </summary>
  [DataContract]
  public class MediaUploadAllOfUploadParameters {
    /// <summary>
    /// Gets or Sets XAmzDate
    /// </summary>
    [DataMember(Name="x-amz-date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "x-amz-date")]
    public string XAmzDate { get; set; }

    /// <summary>
    /// Gets or Sets XAmzSignature
    /// </summary>
    [DataMember(Name="x-amz-signature", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "x-amz-signature")]
    public string XAmzSignature { get; set; }

    /// <summary>
    /// Gets or Sets XAmzSecurityToken
    /// </summary>
    [DataMember(Name="x-amz-security-token", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "x-amz-security-token")]
    public string XAmzSecurityToken { get; set; }

    /// <summary>
    /// Gets or Sets XAmzAlgorithm
    /// </summary>
    [DataMember(Name="x-amz-algorithm", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "x-amz-algorithm")]
    public string XAmzAlgorithm { get; set; }

    /// <summary>
    /// Gets or Sets Key
    /// </summary>
    [DataMember(Name="key", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "key")]
    public string Key { get; set; }

    /// <summary>
    /// Gets or Sets Policy
    /// </summary>
    [DataMember(Name="policy", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "policy")]
    public string Policy { get; set; }

    /// <summary>
    /// Gets or Sets XAmzCredential
    /// </summary>
    [DataMember(Name="x-amz-credential", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "x-amz-credential")]
    public string XAmzCredential { get; set; }

    /// <summary>
    /// Gets or Sets ContentType
    /// </summary>
    [DataMember(Name="Content-Type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Content-Type")]
    public string ContentType { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class MediaUploadAllOfUploadParameters {\n");
      sb.Append("  XAmzDate: ").Append(XAmzDate).Append("\n");
      sb.Append("  XAmzSignature: ").Append(XAmzSignature).Append("\n");
      sb.Append("  XAmzSecurityToken: ").Append(XAmzSecurityToken).Append("\n");
      sb.Append("  XAmzAlgorithm: ").Append(XAmzAlgorithm).Append("\n");
      sb.Append("  Key: ").Append(Key).Append("\n");
      sb.Append("  Policy: ").Append(Policy).Append("\n");
      sb.Append("  XAmzCredential: ").Append(XAmzCredential).Append("\n");
      sb.Append("  ContentType: ").Append(ContentType).Append("\n");
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
