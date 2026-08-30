# CUSTOMER_LIST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | [**STRING_32**](STRING_32.md) | Associated ad account ID. | [optional] [readonly] [default to null]
**created_time** | **REAL_32** | Creation time. Unix timestamp in seconds. | [optional] [readonly] [default to null]
**exceptions** | [**ANY**](.md) | Customer list errors. | [optional] [readonly] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Customer list ID. | [readonly] [default to null]
**is_nca** | **BOOLEAN** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Customer list name. | [default to null]
**num_batches** | **REAL_32** | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. | [optional] [readonly] [default to null]
**num_removed_user_records** | **REAL_32** | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. | [optional] [readonly] [default to null]
**num_uploaded_user_records** | **REAL_32** | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. | [optional] [readonly] [default to null]
**status** | [**CUSTOMER_LIST_STATUS**](CustomerListStatus.md) | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. | [optional] [readonly] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Always &#x60;customerlist&#x60;. | [optional] [readonly] [default to null]
**updated_time** | **REAL_32** | Last update time. Unix timestamp in seconds. | [optional] [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


