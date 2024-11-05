# openapi::CampaignResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | Campaign ID. | [optional] [Pattern: ^\\d+$] 
**ad_account_id** | **character** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional] [Pattern: ^\\d+$] 
**name** | **character** | Campaign name. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [Enum: ] 
**lifetime_spend_cap** | **integer** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] 
**daily_spend_cap** | **integer** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] 
**order_line_id** | **character** | Order line ID that appears on the invoice. | [optional] [Pattern: ^\\d+$] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**start_time** | **integer** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**end_time** | **integer** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**is_flexible_daily_budgets** | **character** | Determine if a campaign has flexible daily budgets setup. | [optional] 
**objective_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] [Enum: ] 
**created_time** | **integer** | Campaign creation time. Unix timestamp in seconds. | [optional] 
**updated_time** | **integer** | UTC timestamp. Last update time. | [optional] 
**type** | **character** | Always \&quot;campaign\&quot;. | [optional] 
**is_campaign_budget_optimization** | **character** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] 
**summary_status** | [**CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional] [Enum: ] 


