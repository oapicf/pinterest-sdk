# CampaignBatchResponseData

Campaign data in batch response, with all fields optional to support error cases where data may be empty.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Campaign\&#39;s Advertiser ID. | [optional] [default to undefined]
**bid_options** | [**CampaignBidOptions**](CampaignBidOptions.md) | [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers. | [optional] [default to undefined]
**created_time** | **number** | Campaign creation time. Unix timestamp in seconds. | [optional] [readonly] [default to undefined]
**daily_spend_cap** | **number** | Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. | [optional] [default to undefined]
**default_ad_group_budget_in_micro_currency** | **number** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] [default to undefined]
**end_time** | **number** | Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign\&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. | [optional] [default to undefined]
**id** | **string** | Campaign ID. | [optional] [default to undefined]
**intended_promotion_type** | [**IntendedPromotionType**](IntendedPromotionType.md) |  | [optional] [default to undefined]
**is_automated_campaign** | **boolean** | Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES | [optional] [default to undefined]
**is_campaign_budget_optimization** | **boolean** | Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. | [optional] [default to undefined]
**is_carting** | **boolean** | Whether the campaign contains a carting(where-to-buy link) ad. | [optional] [readonly] [default to undefined]
**is_flexible_daily_budgets** | **boolean** | Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. | [optional] [default to undefined]
**is_ltv_optimized** | **boolean** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. | [optional] [default to undefined]
**is_performance_plus** | **boolean** | Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/) | [optional] [default to undefined]
**is_top_of_search** | **boolean** | Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled. | [optional] [default to undefined]
**lifetime_spend_cap** | **number** | Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. | [optional] [default to undefined]
**name** | **string** | Campaign name - 255 chars max. | [optional] [default to undefined]
**objective_type** | [**CampaignObjectiveType**](CampaignObjectiveType.md) |  | [optional] [default to undefined]
**order_line_id** | **string** | Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired. | [optional] [default to undefined]
**performance_plus_campaign_settings** | [**PerformancePlusCampaignSettings**](PerformancePlusCampaignSettings.md) | Pinterest Performance+ campaign settings. | [optional] [default to undefined]
**start_time** | **number** | Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign\&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. | [optional] [default to undefined]
**status** | [**NullableEntityStatus**](NullableEntityStatus.md) |  | [optional] [default to undefined]
**summary_status** | [**SummaryStatus**](SummaryStatus.md) |  | [optional] [readonly] [default to undefined]
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] [default to undefined]
**type** | **string** | Always \&quot;campaign\&quot;. | [optional] [readonly] [default to undefined]
**updated_time** | **number** | UTC timestamp. Last update time. | [optional] [readonly] [default to undefined]

## Example

```typescript
import { CampaignBatchResponseData } from './api';

const instance: CampaignBatchResponseData = {
    ad_account_id,
    bid_options,
    created_time,
    daily_spend_cap,
    default_ad_group_budget_in_micro_currency,
    end_time,
    id,
    intended_promotion_type,
    is_automated_campaign,
    is_campaign_budget_optimization,
    is_carting,
    is_flexible_daily_budgets,
    is_ltv_optimized,
    is_performance_plus,
    is_top_of_search,
    lifetime_spend_cap,
    name,
    objective_type,
    order_line_id,
    performance_plus_campaign_settings,
    start_time,
    status,
    summary_status,
    tracking_urls,
    type,
    updated_time,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
