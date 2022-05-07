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
  public class AdResponse {
    /// <summary>
    /// ID of the ad group that contains the ad.
    /// </summary>
    /// <value>ID of the ad group that contains the ad.</value>
    [DataMember(Name="ad_group_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ad_group_id")]
    public string AdGroupId { get; set; }

    /// <summary>
    /// Deep link URL for Android devices. Not currently available. Using this field will generate an error.
    /// </summary>
    /// <value>Deep link URL for Android devices. Not currently available. Using this field will generate an error.</value>
    [DataMember(Name="android_deep_link", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "android_deep_link")]
    public string AndroidDeepLink { get; set; }

    /// <summary>
    /// Comma-separated deep links for the carousel pin on Android.
    /// </summary>
    /// <value>Comma-separated deep links for the carousel pin on Android.</value>
    [DataMember(Name="carousel_android_deep_links", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "carousel_android_deep_links")]
    public List<string> CarouselAndroidDeepLinks { get; set; }

    /// <summary>
    /// Comma-separated destination URLs for the carousel pin to promote.
    /// </summary>
    /// <value>Comma-separated destination URLs for the carousel pin to promote.</value>
    [DataMember(Name="carousel_destination_urls", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "carousel_destination_urls")]
    public List<string> CarouselDestinationUrls { get; set; }

    /// <summary>
    /// Comma-separated deep links for the carousel pin on iOS.
    /// </summary>
    /// <value>Comma-separated deep links for the carousel pin on iOS.</value>
    [DataMember(Name="carousel_ios_deep_links", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "carousel_ios_deep_links")]
    public List<string> CarouselIosDeepLinks { get; set; }

    /// <summary>
    /// Tracking url for the ad clicks.
    /// </summary>
    /// <value>Tracking url for the ad clicks.</value>
    [DataMember(Name="click_tracking_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "click_tracking_url")]
    public string ClickTrackingUrl { get; set; }

    /// <summary>
    /// Ad creative type enum
    /// </summary>
    /// <value>Ad creative type enum</value>
    [DataMember(Name="creative_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "creative_type")]
    public string CreativeType { get; set; }

    /// <summary>
    /// Destination URL.
    /// </summary>
    /// <value>Destination URL.</value>
    [DataMember(Name="destination_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "destination_url")]
    public string DestinationUrl { get; set; }

    /// <summary>
    /// Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
    /// </summary>
    /// <value>Deep link URL for iOS devices. Not currently available. Using this field will generate an error.</value>
    [DataMember(Name="ios_deep_link", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ios_deep_link")]
    public string IosDeepLink { get; set; }

    /// <summary>
    /// Is original pin deleted?
    /// </summary>
    /// <value>Is original pin deleted?</value>
    [DataMember(Name="is_pin_deleted", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_pin_deleted")]
    public bool? IsPinDeleted { get; set; }

    /// <summary>
    /// Is pin repinnable?
    /// </summary>
    /// <value>Is pin repinnable?</value>
    [DataMember(Name="is_removable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_removable")]
    public bool? IsRemovable { get; set; }

    /// <summary>
    /// Name of the ad - 255 chars max.
    /// </summary>
    /// <value>Name of the ad - 255 chars max.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Pin ID.
    /// </summary>
    /// <value>Pin ID.</value>
    [DataMember(Name="pin_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pin_id")]
    public string PinId { get; set; }

    /// <summary>
    /// Gets or Sets Status
    /// </summary>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public EntityStatus Status { get; set; }

    /// <summary>
    /// Gets or Sets TrackingUrls
    /// </summary>
    [DataMember(Name="tracking_urls", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tracking_urls")]
    public TrackingUrls TrackingUrls { get; set; }

    /// <summary>
    /// Tracking URL for ad impressions.
    /// </summary>
    /// <value>Tracking URL for ad impressions.</value>
    [DataMember(Name="view_tracking_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "view_tracking_url")]
    public string ViewTrackingUrl { get; set; }

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
      sb.Append("class AdResponse {\n");
      sb.Append("  AdGroupId: ").Append(AdGroupId).Append("\n");
      sb.Append("  AndroidDeepLink: ").Append(AndroidDeepLink).Append("\n");
      sb.Append("  CarouselAndroidDeepLinks: ").Append(CarouselAndroidDeepLinks).Append("\n");
      sb.Append("  CarouselDestinationUrls: ").Append(CarouselDestinationUrls).Append("\n");
      sb.Append("  CarouselIosDeepLinks: ").Append(CarouselIosDeepLinks).Append("\n");
      sb.Append("  ClickTrackingUrl: ").Append(ClickTrackingUrl).Append("\n");
      sb.Append("  CreativeType: ").Append(CreativeType).Append("\n");
      sb.Append("  DestinationUrl: ").Append(DestinationUrl).Append("\n");
      sb.Append("  IosDeepLink: ").Append(IosDeepLink).Append("\n");
      sb.Append("  IsPinDeleted: ").Append(IsPinDeleted).Append("\n");
      sb.Append("  IsRemovable: ").Append(IsRemovable).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  PinId: ").Append(PinId).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
      sb.Append("  TrackingUrls: ").Append(TrackingUrls).Append("\n");
      sb.Append("  ViewTrackingUrl: ").Append(ViewTrackingUrl).Append("\n");
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
