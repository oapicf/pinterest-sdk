# CUSTOMER_LIST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | [**STRING_32**](STRING_32.md) | Associated ad account ID. | [optional] [default to null]
**created_time** | **REAL_32** | Creation time. Unix timestamp in seconds. | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Customer list ID. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Customer list name. | [optional] [default to null]
**num_batches** | **REAL_32** | Total number of list updates.  List creation counts as one batch. Each &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. | [optional] [default to null]
**num_removed_user_records** | **REAL_32** | Number of removed user records. In a &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call, this counter increases even if the user is not found in the list. | [optional] [default to null]
**num_uploaded_user_records** | **REAL_32** | Number of uploaded user records. In an &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append API&lt;/a&gt; call, this counter increases even if the uploaded user is already in the list. | [optional] [default to null]
**status** | [**STRING_32**](STRING_32.md) | Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Always \&quot;customerlist\&quot;. | [optional] [default to null]
**updated_time** | **REAL_32** | Last update time. Unix timestamp in seconds. | [optional] [default to null]
**exceptions** | [**ANY**](.md) | Customer list errors | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


