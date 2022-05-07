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
  public class AdResponseAllOf1 {
    /// <summary>
    /// The ID of the advertiser that this ad belongs to.
    /// </summary>
    /// <value>The ID of the advertiser that this ad belongs to.</value>
    [DataMember(Name="ad_account_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ad_account_id")]
    public string AdAccountId { get; set; }

    /// <summary>
    /// ID of the ad campaign that contains this ad.
    /// </summary>
    /// <value>ID of the ad campaign that contains this ad.</value>
    [DataMember(Name="campaign_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "campaign_id")]
    public string CampaignId { get; set; }

    /// <summary>
    /// Destination URL template for all items within a collections drawer.
    /// </summary>
    /// <value>Destination URL template for all items within a collections drawer.</value>
    [DataMember(Name="collection_items_destination_url_template", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "collection_items_destination_url_template")]
    public string CollectionItemsDestinationUrlTemplate { get; set; }

    /// <summary>
    /// Pin creation time. Unix timestamp in seconds.
    /// </summary>
    /// <value>Pin creation time. Unix timestamp in seconds.</value>
    [DataMember(Name="created_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "created_time")]
    public int? CreatedTime { get; set; }

    /// <summary>
    /// The ID of this ad.
    /// </summary>
    /// <value>The ID of this ad.</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
    /// </summary>
    /// <value>Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".</value>
    [DataMember(Name="rejected_reasons", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rejected_reasons")]
    public List<string> RejectedReasons { get; set; }

    /// <summary>
    /// Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
    /// </summary>
    /// <value>Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".</value>
    [DataMember(Name="rejection_labels", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rejection_labels")]
    public List<string> RejectionLabels { get; set; }

    /// <summary>
    /// Ad review status
    /// </summary>
    /// <value>Ad review status</value>
    [DataMember(Name="review_status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "review_status")]
    public string ReviewStatus { get; set; }

    /// <summary>
    /// Always \"ad\".
    /// </summary>
    /// <value>Always \"ad\".</value>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public string Type { get; set; }

    /// <summary>
    /// Last update time. Unix timestamp in seconds.
    /// </summary>
    /// <value>Last update time. Unix timestamp in seconds.</value>
    [DataMember(Name="updated_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "updated_time")]
    public int? UpdatedTime { get; set; }

    /// <summary>
    /// Ad summary status
    /// </summary>
    /// <value>Ad summary status</value>
    [DataMember(Name="summary_status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "summary_status")]
    public PinPromotionSummaryStatus SummaryStatus { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AdResponseAllOf1 {\n");
      sb.Append("  AdAccountId: ").Append(AdAccountId).Append("\n");
      sb.Append("  CampaignId: ").Append(CampaignId).Append("\n");
      sb.Append("  CollectionItemsDestinationUrlTemplate: ").Append(CollectionItemsDestinationUrlTemplate).Append("\n");
      sb.Append("  CreatedTime: ").Append(CreatedTime).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  RejectedReasons: ").Append(RejectedReasons).Append("\n");
      sb.Append("  RejectionLabels: ").Append(RejectionLabels).Append("\n");
      sb.Append("  ReviewStatus: ").Append(ReviewStatus).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  UpdatedTime: ").Append(UpdatedTime).Append("\n");
      sb.Append("  SummaryStatus: ").Append(SummaryStatus).Append("\n");
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
