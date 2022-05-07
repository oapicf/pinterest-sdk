using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Third-party tracking URLs. Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
  /// </summary>
  [DataContract]
  public class TrackingUrls {
    /// <summary>
    /// Gets or Sets Impression
    /// </summary>
    [DataMember(Name="impression", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "impression")]
    public List<string> Impression { get; set; }

    /// <summary>
    /// Gets or Sets Click
    /// </summary>
    [DataMember(Name="click", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "click")]
    public List<string> Click { get; set; }

    /// <summary>
    /// Gets or Sets Engagement
    /// </summary>
    [DataMember(Name="engagement", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "engagement")]
    public List<string> Engagement { get; set; }

    /// <summary>
    /// Gets or Sets BuyableButton
    /// </summary>
    [DataMember(Name="buyable_button", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "buyable_button")]
    public List<string> BuyableButton { get; set; }

    /// <summary>
    /// Gets or Sets AudienceVerification
    /// </summary>
    [DataMember(Name="audience_verification", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "audience_verification")]
    public List<string> AudienceVerification { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TrackingUrls {\n");
      sb.Append("  Impression: ").Append(Impression).Append("\n");
      sb.Append("  Click: ").Append(Click).Append("\n");
      sb.Append("  Engagement: ").Append(Engagement).Append("\n");
      sb.Append("  BuyableButton: ").Append(BuyableButton).Append("\n");
      sb.Append("  AudienceVerification: ").Append(AudienceVerification).Append("\n");
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
