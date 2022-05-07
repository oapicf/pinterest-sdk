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
  public class AdGroupResponseAllOf {
    /// <summary>
    /// Ad group name.
    /// </summary>
    /// <value>Ad group name.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Ad group/entity status.
    /// </summary>
    /// <value>Ad group/entity status.</value>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public EntityStatus Status { get; set; }

    /// <summary>
    /// Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
    /// </summary>
    /// <value>Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.</value>
    [DataMember(Name="budget_in_micro_currency", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "budget_in_micro_currency")]
    public int? BudgetInMicroCurrency { get; set; }

    /// <summary>
    /// Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
    /// </summary>
    /// <value>Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.</value>
    [DataMember(Name="bid_in_micro_currency", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "bid_in_micro_currency")]
    public int? BidInMicroCurrency { get; set; }

    /// <summary>
    /// Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
    /// </summary>
    /// <value>Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.</value>
    [DataMember(Name="budget_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "budget_type")]
    public string BudgetType { get; set; }

    /// <summary>
    /// Ad group start time. Unix timestamp in seconds. Defaults to current time.
    /// </summary>
    /// <value>Ad group start time. Unix timestamp in seconds. Defaults to current time.</value>
    [DataMember(Name="start_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "start_time")]
    public int? StartTime { get; set; }

    /// <summary>
    /// Ad group end time. Unix timestamp in seconds.
    /// </summary>
    /// <value>Ad group end time. Unix timestamp in seconds.</value>
    [DataMember(Name="end_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "end_time")]
    public int? EndTime { get; set; }

    /// <summary>
    /// Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'
    /// </summary>
    /// <value>Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'</value>
    [DataMember(Name="targeting_spec", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "targeting_spec")]
    public Dictionary<string, List<string>> TargetingSpec { get; set; }

    /// <summary>
    /// Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
    /// </summary>
    /// <value>Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.</value>
    [DataMember(Name="lifetime_frequency_cap", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lifetime_frequency_cap")]
    public int? LifetimeFrequencyCap { get; set; }

    /// <summary>
    /// Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
    /// </summary>
    /// <value>Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.</value>
    [DataMember(Name="tracking_urls", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tracking_urls")]
    public TrackingUrls TrackingUrls { get; set; }

    /// <summary>
    /// Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
    /// </summary>
    /// <value>Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.</value>
    [DataMember(Name="auto_targeting_enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auto_targeting_enabled")]
    public bool? AutoTargetingEnabled { get; set; }

    /// <summary>
    /// <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.
    /// </summary>
    /// <value><a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.</value>
    [DataMember(Name="placement_group", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "placement_group")]
    public PlacementGroupType PlacementGroup { get; set; }

    /// <summary>
    /// Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.
    /// </summary>
    /// <value>Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.</value>
    [DataMember(Name="pacing_delivery_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pacing_delivery_type")]
    public PacingDeliveryType PacingDeliveryType { get; set; }

    /// <summary>
    /// oCPM learn mode
    /// </summary>
    /// <value>oCPM learn mode</value>
    [DataMember(Name="conversion_learning_mode_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "conversion_learning_mode_type")]
    public string ConversionLearningModeType { get; set; }

    /// <summary>
    /// Ad group summary status.
    /// </summary>
    /// <value>Ad group summary status.</value>
    [DataMember(Name="summary_status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "summary_status")]
    public AdGroupSummaryStatus SummaryStatus { get; set; }

    /// <summary>
    /// Feed Profile ID associated to the adgroup.
    /// </summary>
    /// <value>Feed Profile ID associated to the adgroup.</value>
    [DataMember(Name="feed_profile_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "feed_profile_id")]
    public string FeedProfileId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AdGroupResponseAllOf {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
      sb.Append("  BudgetInMicroCurrency: ").Append(BudgetInMicroCurrency).Append("\n");
      sb.Append("  BidInMicroCurrency: ").Append(BidInMicroCurrency).Append("\n");
      sb.Append("  BudgetType: ").Append(BudgetType).Append("\n");
      sb.Append("  StartTime: ").Append(StartTime).Append("\n");
      sb.Append("  EndTime: ").Append(EndTime).Append("\n");
      sb.Append("  TargetingSpec: ").Append(TargetingSpec).Append("\n");
      sb.Append("  LifetimeFrequencyCap: ").Append(LifetimeFrequencyCap).Append("\n");
      sb.Append("  TrackingUrls: ").Append(TrackingUrls).Append("\n");
      sb.Append("  AutoTargetingEnabled: ").Append(AutoTargetingEnabled).Append("\n");
      sb.Append("  PlacementGroup: ").Append(PlacementGroup).Append("\n");
      sb.Append("  PacingDeliveryType: ").Append(PacingDeliveryType).Append("\n");
      sb.Append("  ConversionLearningModeType: ").Append(ConversionLearningModeType).Append("\n");
      sb.Append("  SummaryStatus: ").Append(SummaryStatus).Append("\n");
      sb.Append("  FeedProfileId: ").Append(FeedProfileId).Append("\n");
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
