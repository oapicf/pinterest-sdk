# CampaignResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Campaign ID. | 
**ad_account_id** | **String** | Campaign's Advertiser ID. | 
**name** | **String** | Campaign name. | [optional] [default to None]
**status** | [***EntityStatus**](EntityStatus.md) |  | [optional] [default to Some("ACTIVE".to_string())]
**lifetime_spend_cap** | **isize** | Campaign total spending cap. | [optional] [default to None]
**daily_spend_cap** | **isize** | Campaign daily spending cap. | [optional] [default to None]
**order_line_id** | **String** | Order line ID that appears on the invoice. | [optional] [default to None]
**tracking_urls** | [***TrackingUrls**](TrackingUrls.md) |  | [optional] [default to None]
**start_time** | **isize** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to None]
**end_time** | **isize** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to None]
**objective_type** | [***models::ObjectiveType**](ObjectiveType.md) |  | [optional] [default to None]
**created_time** | **isize** | Campaign creation time. Unix timestamp in seconds. | [optional] [default to None]
**updated_time** | **isize** | UTC timestamp. Last update time. | [optional] [default to None]
**type_** | **String** | Always \"campaign\". | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


