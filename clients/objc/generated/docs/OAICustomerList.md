# OAICustomerList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **NSString*** | Associated ad account ID. | [optional] [readonly] 
**createdTime** | **NSNumber*** | Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**exceptions** | [**NSObject***](.md) | Customer list errors. | [optional] [readonly] 
**_id** | **NSString*** | Customer list ID. | [readonly] 
**isNca** | **NSNumber*** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] 
**name** | **NSString*** | Customer list name. | 
**numBatches** | **NSNumber*** | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. | [optional] [readonly] 
**numRemovedUserRecords** | **NSNumber*** | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. | [optional] [readonly] 
**numUploadedUserRecords** | **NSNumber*** | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. | [optional] [readonly] 
**status** | [**OAICustomerListStatus***](OAICustomerListStatus.md) | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. | [optional] [readonly] 
**type** | **NSString*** | Always &#x60;customerlist&#x60;. | [optional] [readonly] 
**updatedTime** | **NSNumber*** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


