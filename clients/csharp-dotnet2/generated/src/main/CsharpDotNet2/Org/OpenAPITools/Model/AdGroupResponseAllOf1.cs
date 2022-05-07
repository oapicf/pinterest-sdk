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
  public class AdGroupResponseAllOf1 {
    /// <summary>
    /// Campaign ID of the ad group.
    /// </summary>
    /// <value>Campaign ID of the ad group.</value>
    [DataMember(Name="campaign_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "campaign_id")]
    public string CampaignId { get; set; }

    /// <summary>
    /// Gets or Sets BillableEvent
    /// </summary>
    [DataMember(Name="billable_event", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "billable_event")]
    public ActionType BillableEvent { get; set; }

    /// <summary>
    /// Ad group ID.
    /// </summary>
    /// <value>Ad group ID.</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// Always \"adgroup\".
    /// </summary>
    /// <value>Always \"adgroup\".</value>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public string Type { get; set; }

    /// <summary>
    /// Advertiser ID.
    /// </summary>
    /// <value>Advertiser ID.</value>
    [DataMember(Name="ad_account_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ad_account_id")]
    public string AdAccountId { get; set; }

    /// <summary>
    /// Ad group creation time. Unix timestamp in seconds.
    /// </summary>
    /// <value>Ad group creation time. Unix timestamp in seconds.</value>
    [DataMember(Name="created_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "created_time")]
    public int? CreatedTime { get; set; }

    /// <summary>
    /// Ad group last update time. Unix timestamp in seconds.
    /// </summary>
    /// <value>Ad group last update time. Unix timestamp in seconds.</value>
    [DataMember(Name="updated_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "updated_time")]
    public int? UpdatedTime { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AdGroupResponseAllOf1 {\n");
      sb.Append("  CampaignId: ").Append(CampaignId).Append("\n");
      sb.Append("  BillableEvent: ").Append(BillableEvent).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  AdAccountId: ").Append(AdAccountId).Append("\n");
      sb.Append("  CreatedTime: ").Append(CreatedTime).Append("\n");
      sb.Append("  UpdatedTime: ").Append(UpdatedTime).Append("\n");
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
