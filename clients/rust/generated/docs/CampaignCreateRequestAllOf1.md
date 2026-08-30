# CampaignCreateRequestAllOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_options** | Option<[**models::CampaignBidOptionsCreate**](CampaignBidOptionsCreate.md)> |  | [optional]
**intended_promotion_type** | Option<[**models::IntendedPromotionType**](IntendedPromotionType.md)> |  | [optional]
**is_automated_campaign** | Option<**bool**> | Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES | [optional][default to false]
**is_campaign_budget_optimization** | Option<**bool**> | Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. | [optional][default to true]
**is_flexible_daily_budgets** | Option<**bool**> | Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. | [optional][default to false]
**is_ltv_optimized** | Option<**bool**> | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. | [optional]
**is_performance_plus** | Option<**bool**> | Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. | [optional][default to false]
**is_top_of_search** | Option<**bool**> | <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>. | [optional][default to false]
**objective_type** | [**models::ObjectiveType**](ObjectiveType.md) |  | 
**status** | Option<[**models::EntityStatus**](EntityStatus.md)> |  | [optional][default to Active]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


