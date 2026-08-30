# CustomerList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Associated ad account ID. | [optional] [readonly]
**created_time** | **float** | Creation time. Unix timestamp in seconds. | [optional] [readonly]
**exceptions** | **object** | Customer list errors. | [optional] [readonly]
**id** | **string** | Customer list ID. | [readonly]
**is_nca** | **bool** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional]
**name** | **string** | Customer list name. |
**num_batches** | **float** | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. | [optional] [readonly]
**num_removed_user_records** | **float** | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. | [optional] [readonly]
**num_uploaded_user_records** | **float** | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. | [optional] [readonly]
**status** | [**\OpenAPI\Client\Model\CustomerListStatus**](CustomerListStatus.md) | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. | [optional] [readonly]
**type** | **string** | Always &#x60;customerlist&#x60;. | [optional] [readonly]
**updated_time** | **float** | Last update time. Unix timestamp in seconds. | [optional] [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
