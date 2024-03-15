# CustomerList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | Associated ad account ID. | [optional] [default to None]
**created_time** | **f64** | Creation time. Unix timestamp in seconds. | [optional] [default to None]
**id** | **String** | Customer list ID. | [optional] [default to None]
**name** | **String** | Customer list name. | [optional] [default to None]
**num_batches** | **f64** | Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. | [optional] [default to None]
**num_removed_user_records** | **f64** | Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list. | [optional] [default to None]
**num_uploaded_user_records** | **f64** | Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list. | [optional] [default to None]
**status** | **String** | Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. | [optional] [default to None]
**r#type** | **String** | Always \"customerlist\". | [optional] [default to None]
**updated_time** | **f64** | Last update time. Unix timestamp in seconds. | [optional] [default to None]
**exceptions** | [***serde_json::Value**](.md) | Customer list errors | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


