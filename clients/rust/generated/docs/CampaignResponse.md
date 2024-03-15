# CampaignResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**String**> | Campaign ID. | [optional]
**ad_account_id** | Option<**String**> | Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional]
**name** | Option<**String**> | Campaign name. | [optional]
**status** | Option<[**models::EntityStatus**](EntityStatus.md)> |  | [optional]
**lifetime_spend_cap** | Option<**i32**> | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. | [optional]
**daily_spend_cap** | Option<**i32**> | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. | [optional]
**order_line_id** | Option<**String**> | Order line ID that appears on the invoice. | [optional]
**tracking_urls** | Option<[**models::AdCommonTrackingUrls**](AdCommon_tracking_urls.md)> |  | [optional]
**start_time** | Option<**i32**> | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional]
**end_time** | Option<**i32**> | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional]
**summary_status** | Option<[**models::CampaignSummaryStatus**](CampaignSummaryStatus.md)> |  | [optional]
**objective_type** | Option<[**models::ObjectiveType**](ObjectiveType.md)> |  | [optional]
**created_time** | Option<**i32**> | Campaign creation time. Unix timestamp in seconds. | [optional]
**updated_time** | Option<**i32**> | UTC timestamp. Last update time. | [optional]
**r#type** | Option<**String**> | Always \"campaign\". | [optional]
**is_flexible_daily_budgets** | Option<**bool**> | Determines if a campaign has flexible daily budgets setup. | [optional]
**is_campaign_budget_optimization** | Option<**bool**> | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


