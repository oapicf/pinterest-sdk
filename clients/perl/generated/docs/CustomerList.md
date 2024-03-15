# WWW::OpenAPIClient::Object::CustomerList

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CustomerList;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Associated ad account ID. | [optional] 
**created_time** | **double** | Creation time. Unix timestamp in seconds. | [optional] 
**id** | **string** | Customer list ID. | [optional] 
**name** | **string** | Customer list name. | [optional] 
**num_batches** | **double** | Total number of list updates.  List creation counts as one batch. Each &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. | [optional] 
**num_removed_user_records** | **double** | Number of removed user records. In a &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call, this counter increases even if the user is not found in the list. | [optional] 
**num_uploaded_user_records** | **double** | Number of uploaded user records. In an &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append API&lt;/a&gt; call, this counter increases even if the uploaded user is already in the list. | [optional] 
**status** | **string** | Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. | [optional] 
**type** | **string** | Always \&quot;customerlist\&quot;. | [optional] 
**updated_time** | **double** | Last update time. Unix timestamp in seconds. | [optional] 
**exceptions** | **object** | Customer list errors | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


