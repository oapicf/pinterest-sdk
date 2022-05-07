# openapi::CampaignResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | Campaign ID. | 
**ad_account_id** | **character** | Campaign&#39;s Advertiser ID. | 
**name** | **character** | Campaign name. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to &#39;ACTIVE&#39;]
**lifetime_spend_cap** | **integer** | Campaign total spending cap. | [optional] 
**daily_spend_cap** | **integer** | Campaign daily spending cap. | [optional] 
**order_line_id** | **character** | Order line ID that appears on the invoice. | [optional] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**start_time** | **integer** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**end_time** | **integer** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**objective_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] 
**created_time** | **integer** | Campaign creation time. Unix timestamp in seconds. | [optional] 
**updated_time** | **integer** | UTC timestamp. Last update time. | [optional] 
**type** | **character** | Always \&quot;campaign\&quot;. | [optional] 


