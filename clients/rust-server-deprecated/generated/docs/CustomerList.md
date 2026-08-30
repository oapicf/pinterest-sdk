# CustomerList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | Associated ad account ID. | [optional] [readonly] [default to None]
**created_time** | **f64** | Creation time. Unix timestamp in seconds. | [optional] [readonly] [default to None]
**exceptions** | [***serde_json::Value**](.md) | Customer list errors. | [optional] [readonly] [default to None]
**id** | **String** | Customer list ID. | [readonly] 
**is_nca** | **bool** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] [default to None]
**name** | **String** | Customer list name. | 
**num_batches** | **f64** | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. | [optional] [readonly] [default to None]
**num_removed_user_records** | **f64** | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. | [optional] [readonly] [default to None]
**num_uploaded_user_records** | **f64** | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. | [optional] [readonly] [default to None]
**status** | [***models::CustomerListStatus**](CustomerListStatus.md) | Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users. | [optional] [readonly] [default to None]
**r#type** | **String** | Always `customerlist`. | [optional] [readonly] [default to None]
**updated_time** | **f64** | Last update time. Unix timestamp in seconds. | [optional] [readonly] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


