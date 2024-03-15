# # CampaignCreateResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional]
**name** | **string** | Campaign name. | [optional]
**status** | [**\OpenAPI\Client\Model\EntityStatus**](EntityStatus.md) |  | [optional]
**lifetime_spend_cap** | **int** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional]
**daily_spend_cap** | **int** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional]
**order_line_id** | **string** | Order line ID that appears on the invoice. | [optional]
**tracking_urls** | [**\OpenAPI\Client\Model\AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional]
**start_time** | **int** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional]
**end_time** | **int** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional]
**summary_status** | [**\OpenAPI\Client\Model\CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional]
**is_flexible_daily_budgets** | **bool** | Determines if a campaign has flexible daily budgets setup. | [optional]
**default_ad_group_budget_in_micro_currency** | **int** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional]
**is_automated_campaign** | **bool** | Specifies whether the campaign was created in the automated campaign flow | [optional] [default to false]
**id** | **string** | Campaign ID. | [optional]
**objective_type** | [**\OpenAPI\Client\Model\ObjectiveType**](ObjectiveType.md) |  | [optional]
**created_time** | **int** | Campaign creation time. Unix timestamp in seconds. | [optional]
**updated_time** | **int** | UTC timestamp. Last update time. | [optional]
**type** | **string** | Always \&quot;campaign\&quot;. | [optional]
**is_campaign_budget_optimization** | **bool** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
