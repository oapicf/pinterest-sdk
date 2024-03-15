# campaign_create_common_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **char \*** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional] 
**name** | **char \*** | Campaign name. | [optional] 
**status** | **entity_status_t \*** |  | [optional] [default to 'ACTIVE']
**lifetime_spend_cap** | **int** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] 
**daily_spend_cap** | **int** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] 
**order_line_id** | **char \*** | Order line ID that appears on the invoice. | [optional] 
**tracking_urls** | [**ad_common_tracking_urls_t**](ad_common_tracking_urls.md) \* |  | [optional] 
**start_time** | **int** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**end_time** | **int** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**summary_status** | **campaign_summary_status_t \*** |  | [optional] 
**is_flexible_daily_budgets** | **int** | Determine if a campaign has flexible daily budgets setup. | [optional] [default to false]
**default_ad_group_budget_in_micro_currency** | **int** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] 
**is_automated_campaign** | **int** | Specifies whether the campaign was created in the automated campaign flow | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


