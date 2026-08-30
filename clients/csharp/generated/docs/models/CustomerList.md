# Org.OpenAPITools.Model.CustomerList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Customer list ID. | [readonly] 
**Name** | **string** | Customer list name. | 
**AdAccountId** | **string** | Associated ad account ID. | [optional] [readonly] 
**CreatedTime** | **decimal** | Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**Exceptions** | **Object** | Customer list errors. | [optional] [readonly] 
**IsNca** | **bool** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] 
**NumBatches** | **decimal** | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. | [optional] [readonly] 
**NumRemovedUserRecords** | **decimal** | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. | [optional] [readonly] 
**NumUploadedUserRecords** | **decimal** | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. | [optional] [readonly] 
**Status** | **CustomerListStatus** | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. | [optional] [readonly] 
**Type** | **string** | Always &#x60;customerlist&#x60;. | [optional] [readonly] 
**UpdatedTime** | **decimal** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

