# CustomerList


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ad_account_id`** | **`String`** | Associated ad account ID. | [optional] [readonly] [default to nothing]
**`created_time`** | **`Float64`** | Creation time. Unix timestamp in seconds. | [optional] [readonly] [default to nothing]
**`exceptions`** | **`Any`** | Customer list errors. | [optional] [readonly] [default to nothing]
**`id`** | **`String`** | Customer list ID. | [readonly] [default to nothing]
**`is_nca`** | **`Bool`** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] [default to nothing]
**`name`** | **`String`** | Customer list name. | [default to nothing]
**`num_batches`** | **`Float64`** | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. | [optional] [readonly] [default to nothing]
**`num_removed_user_records`** | **`Float64`** | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. | [optional] [readonly] [default to nothing]
**`num_uploaded_user_records`** | **`Float64`** | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. | [optional] [readonly] [default to nothing]
**`status`** | [**`*CustomerListStatus`**](CustomerListStatus.md) | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. | [optional] [readonly] [default to nothing]
**`type`** | **`String`** | Always &#x60;customerlist&#x60;. | [optional] [readonly] [default to nothing]
**`updated_time`** | **`Float64`** | Last update time. Unix timestamp in seconds. | [optional] [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


