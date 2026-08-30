# WWW::OpenAPIClient::Object::CustomerList

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CustomerList;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Associated ad account ID. | [optional] [readonly] 
**created_time** | **double** | Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**exceptions** | **object** | Customer list errors. | [optional] [readonly] 
**id** | **string** | Customer list ID. | [readonly] 
**is_nca** | **boolean** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] 
**name** | **string** | Customer list name. | 
**num_batches** | **double** | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. | [optional] [readonly] 
**num_removed_user_records** | **double** | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. | [optional] [readonly] 
**num_uploaded_user_records** | **double** | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. | [optional] [readonly] 
**status** | [**CustomerListStatus**](CustomerListStatus.md) | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. | [optional] [readonly] 
**type** | **string** | Always &#x60;customerlist&#x60;. | [optional] [readonly] 
**updated_time** | **double** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


