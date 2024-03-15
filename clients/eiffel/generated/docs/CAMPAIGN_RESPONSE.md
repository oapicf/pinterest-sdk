# CAMPAIGN_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | Campaign ID. | [optional] [default to null]
**ad_account_id** | [**STRING_32**](STRING_32.md) | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Campaign name. | [optional] [default to null]
**status** | [**ENTITY_STATUS**](EntityStatus.md) |  | [optional] [default to null]
**lifetime_spend_cap** | **INTEGER_32** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] [default to null]
**daily_spend_cap** | **INTEGER_32** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] [default to null]
**order_line_id** | [**STRING_32**](STRING_32.md) | Order line ID that appears on the invoice. | [optional] [default to null]
**tracking_urls** | [**AD_COMMON_TRACKING_URLS**](AdCommon_tracking_urls.md) |  | [optional] [default to null]
**start_time** | **INTEGER_32** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null]
**end_time** | **INTEGER_32** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null]
**summary_status** | [**CAMPAIGN_SUMMARY_STATUS**](CampaignSummaryStatus.md) |  | [optional] [default to null]
**objective_type** | [**OBJECTIVE_TYPE**](ObjectiveType.md) |  | [optional] [default to null]
**created_time** | **INTEGER_32** | Campaign creation time. Unix timestamp in seconds. | [optional] [default to null]
**updated_time** | **INTEGER_32** | UTC timestamp. Last update time. | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Always \&quot;campaign\&quot;. | [optional] [default to null]
**is_flexible_daily_budgets** | **BOOLEAN** | Determines if a campaign has flexible daily budgets setup. | [optional] [default to null]
**is_campaign_budget_optimization** | **BOOLEAN** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


