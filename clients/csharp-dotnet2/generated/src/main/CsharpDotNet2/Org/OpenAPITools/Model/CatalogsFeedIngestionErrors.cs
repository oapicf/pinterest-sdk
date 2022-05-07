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
  public class CatalogsFeedIngestionErrors {
    /// <summary>
    /// Gets or Sets ImageDownloadError
    /// </summary>
    [DataMember(Name="image_download_error", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "image_download_error")]
    public int? ImageDownloadError { get; set; }

    /// <summary>
    /// Gets or Sets ImageDownloadConnectionTimeout
    /// </summary>
    [DataMember(Name="image_download_connection_timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "image_download_connection_timeout")]
    public int? ImageDownloadConnectionTimeout { get; set; }

    /// <summary>
    /// Gets or Sets ImageFormatUnrecognize
    /// </summary>
    [DataMember(Name="image_format_unrecognize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "image_format_unrecognize")]
    public int? ImageFormatUnrecognize { get; set; }

    /// <summary>
    /// Gets or Sets LineLevelInternalError
    /// </summary>
    [DataMember(Name="line_level_internal_error", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "line_level_internal_error")]
    public int? LineLevelInternalError { get; set; }

    /// <summary>
    /// Gets or Sets LargeProductCountDecrease
    /// </summary>
    [DataMember(Name="large_product_count_decrease", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "large_product_count_decrease")]
    public int? LargeProductCountDecrease { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CatalogsFeedIngestionErrors {\n");
      sb.Append("  ImageDownloadError: ").Append(ImageDownloadError).Append("\n");
      sb.Append("  ImageDownloadConnectionTimeout: ").Append(ImageDownloadConnectionTimeout).Append("\n");
      sb.Append("  ImageFormatUnrecognize: ").Append(ImageFormatUnrecognize).Append("\n");
      sb.Append("  LineLevelInternalError: ").Append(LineLevelInternalError).Append("\n");
      sb.Append("  LargeProductCountDecrease: ").Append(LargeProductCountDecrease).Append("\n");
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
