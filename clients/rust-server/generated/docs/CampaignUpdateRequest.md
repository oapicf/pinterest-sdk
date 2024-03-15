# CampaignUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Campaign ID. | 
**ad_account_id** | **String** | Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | 
**name** | **String** | Campaign name. | [optional] [default to None]
**status** | [***models::EntityStatus**](EntityStatus.md) |  | [optional] [default to None]
**lifetime_spend_cap** | **i32** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. | [optional] [default to None]
**daily_spend_cap** | **i32** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. | [optional] [default to None]
**order_line_id** | **String** | Order line ID that appears on the invoice. | [optional] [default to None]
**tracking_urls** | [***models::AdCommonTrackingUrls**](AdCommon_tracking_urls.md) |  | [optional] [default to None]
**start_time** | **i32** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to None]
**end_time** | **i32** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to None]
**summary_status** | [***models::CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional] [default to None]
**is_flexible_daily_budgets** | **bool** | Determine if a campaign has flexible daily budgets setup. | [optional] [default to None]
**default_ad_group_budget_in_micro_currency** | **i32** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] [default to None]
**is_automated_campaign** | **bool** | Specifies whether the campaign was created in the automated campaign flow | [optional] [default to None]
**is_campaign_budget_optimization** | **bool** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] [default to None]
**objective_type** | [***models::ObjectiveType**](ObjectiveType.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


