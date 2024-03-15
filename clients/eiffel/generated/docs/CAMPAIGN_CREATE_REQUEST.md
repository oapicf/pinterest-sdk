# CAMPAIGN_CREATE_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | [**STRING_32**](STRING_32.md) | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [default to null]
**name** | [**STRING_32**](STRING_32.md) | Campaign name. | [default to null]
**status** | [**ENTITY_STATUS**](EntityStatus.md) |  | [optional] [default to ACTIVE]
**lifetime_spend_cap** | **INTEGER_32** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] [default to null]
**daily_spend_cap** | **INTEGER_32** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] [default to null]
**order_line_id** | [**STRING_32**](STRING_32.md) | Order line ID that appears on the invoice. | [optional] [default to null]
**tracking_urls** | [**AD_COMMON_TRACKING_URLS**](AdCommon_tracking_urls.md) |  | [optional] [default to null]
**start_time** | **INTEGER_32** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null]
**end_time** | **INTEGER_32** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null]
**summary_status** | [**CAMPAIGN_SUMMARY_STATUS**](CampaignSummaryStatus.md) |  | [optional] [default to null]
**is_flexible_daily_budgets** | **BOOLEAN** | Determine if a campaign has flexible daily budgets setup. | [optional] [default to false]
**default_ad_group_budget_in_micro_currency** | **INTEGER_32** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] [default to null]
**is_automated_campaign** | **BOOLEAN** | Specifies whether the campaign was created in the automated campaign flow | [optional] [default to false]
**objective_type** | [**OBJECTIVE_TYPE**](ObjectiveType.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


