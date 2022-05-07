# WWW::OpenAPIClient::Object::CampaignResponse

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CampaignResponse;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Campaign ID. | 
**ad_account_id** | **string** | Campaign&#39;s Advertiser ID. | 
**name** | **string** | Campaign name. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to &#39;ACTIVE&#39;]
**lifetime_spend_cap** | **int** | Campaign total spending cap. | [optional] 
**daily_spend_cap** | **int** | Campaign daily spending cap. | [optional] 
**order_line_id** | **string** | Order line ID that appears on the invoice. | [optional] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**start_time** | **int** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**end_time** | **int** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**objective_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] 
**created_time** | **int** | Campaign creation time. Unix timestamp in seconds. | [optional] 
**updated_time** | **int** | UTC timestamp. Last update time. | [optional] 
**type** | **string** | Always \&quot;campaign\&quot;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


