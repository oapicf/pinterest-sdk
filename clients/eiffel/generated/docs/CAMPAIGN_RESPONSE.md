# CAMPAIGN_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | Campaign ID. | [default to null]
**ad_account_id** | [**STRING_32**](STRING_32.md) | Campaign&#39;s Advertiser ID. | [default to null]
**name** | [**STRING_32**](STRING_32.md) | Campaign name. | [optional] [default to null]
**status** | [**ENTITY_STATUS**](EntityStatus.md) |  | [optional] [default to ACTIVE]
**lifetime_spend_cap** | **INTEGER_32** | Campaign total spending cap. | [optional] [default to null]
**daily_spend_cap** | **INTEGER_32** | Campaign daily spending cap. | [optional] [default to null]
**order_line_id** | [**STRING_32**](STRING_32.md) | Order line ID that appears on the invoice. | [optional] [default to null]
**tracking_urls** | [**TRACKING_URLS**](TrackingUrls.md) |  | [optional] [default to null]
**start_time** | **INTEGER_32** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null]
**end_time** | **INTEGER_32** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null]
**objective_type** | [**OBJECTIVE_TYPE**](ObjectiveType.md) |  | [optional] [default to null]
**created_time** | **INTEGER_32** | Campaign creation time. Unix timestamp in seconds. | [optional] [default to null]
**updated_time** | **INTEGER_32** | UTC timestamp. Last update time. | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Always \&quot;campaign\&quot;. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


