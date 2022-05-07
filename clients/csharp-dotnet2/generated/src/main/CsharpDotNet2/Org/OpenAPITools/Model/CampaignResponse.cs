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
  public class CampaignResponse {
    /// <summary>
    /// Campaign ID.
    /// </summary>
    /// <value>Campaign ID.</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// Campaign's Advertiser ID.
    /// </summary>
    /// <value>Campaign's Advertiser ID.</value>
    [DataMember(Name="ad_account_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ad_account_id")]
    public string AdAccountId { get; set; }

    /// <summary>
    /// Campaign name.
    /// </summary>
    /// <value>Campaign name.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets Status
    /// </summary>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public EntityStatus Status { get; set; }

    /// <summary>
    /// Campaign total spending cap.
    /// </summary>
    /// <value>Campaign total spending cap.</value>
    [DataMember(Name="lifetime_spend_cap", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lifetime_spend_cap")]
    public int? LifetimeSpendCap { get; set; }

    /// <summary>
    /// Campaign daily spending cap.
    /// </summary>
    /// <value>Campaign daily spending cap.</value>
    [DataMember(Name="daily_spend_cap", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "daily_spend_cap")]
    public int? DailySpendCap { get; set; }

    /// <summary>
    /// Order line ID that appears on the invoice.
    /// </summary>
    /// <value>Order line ID that appears on the invoice.</value>
    [DataMember(Name="order_line_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "order_line_id")]
    public string OrderLineId { get; set; }

    /// <summary>
    /// Gets or Sets TrackingUrls
    /// </summary>
    [DataMember(Name="tracking_urls", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tracking_urls")]
    public TrackingUrls TrackingUrls { get; set; }

    /// <summary>
    /// Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
    /// </summary>
    /// <value>Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.</value>
    [DataMember(Name="start_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "start_time")]
    public int? StartTime { get; set; }

    /// <summary>
    /// Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
    /// </summary>
    /// <value>Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.</value>
    [DataMember(Name="end_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "end_time")]
    public int? EndTime { get; set; }

    /// <summary>
    /// Gets or Sets ObjectiveType
    /// </summary>
    [DataMember(Name="objective_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "objective_type")]
    public ObjectiveType ObjectiveType { get; set; }

    /// <summary>
    /// Campaign creation time. Unix timestamp in seconds.
    /// </summary>
    /// <value>Campaign creation time. Unix timestamp in seconds.</value>
    [DataMember(Name="created_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "created_time")]
    public int? CreatedTime { get; set; }

    /// <summary>
    /// UTC timestamp. Last update time.
    /// </summary>
    /// <value>UTC timestamp. Last update time.</value>
    [DataMember(Name="updated_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "updated_time")]
    public int? UpdatedTime { get; set; }

    /// <summary>
    /// Always \"campaign\".
    /// </summary>
    /// <value>Always \"campaign\".</value>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public string Type { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CampaignResponse {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  AdAccountId: ").Append(AdAccountId).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
      sb.Append("  LifetimeSpendCap: ").Append(LifetimeSpendCap).Append("\n");
      sb.Append("  DailySpendCap: ").Append(DailySpendCap).Append("\n");
      sb.Append("  OrderLineId: ").Append(OrderLineId).Append("\n");
      sb.Append("  TrackingUrls: ").Append(TrackingUrls).Append("\n");
      sb.Append("  StartTime: ").Append(StartTime).Append("\n");
      sb.Append("  EndTime: ").Append(EndTime).Append("\n");
      sb.Append("  ObjectiveType: ").Append(ObjectiveType).Append("\n");
      sb.Append("  CreatedTime: ").Append(CreatedTime).Append("\n");
      sb.Append("  UpdatedTime: ").Append(UpdatedTime).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
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
