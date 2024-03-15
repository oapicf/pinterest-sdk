# CustomerList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | Option<**String**> | Associated ad account ID. | [optional]
**created_time** | Option<**f64**> | Creation time. Unix timestamp in seconds. | [optional]
**id** | Option<**String**> | Customer list ID. | [optional]
**name** | Option<**String**> | Customer list name. | [optional]
**num_batches** | Option<**f64**> | Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. | [optional]
**num_removed_user_records** | Option<**f64**> | Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list. | [optional]
**num_uploaded_user_records** | Option<**f64**> | Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list. | [optional]
**status** | Option<**String**> | Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. | [optional]
**r#type** | Option<**String**> | Always \"customerlist\". | [optional]
**updated_time** | Option<**f64**> | Last update time. Unix timestamp in seconds. | [optional]
**exceptions** | Option<[**serde_json::Value**](.md)> | Customer list errors | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


