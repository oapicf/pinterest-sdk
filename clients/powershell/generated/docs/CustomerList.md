# CustomerList
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Associated ad account ID. | [optional] [readonly] 
**CreatedTime** | **Decimal** | Creation time. Unix timestamp in seconds. | [optional] [readonly] 
**Exceptions** | [**SystemCollectionsHashtable**](.md) | Customer list errors. | [optional] [readonly] 
**Id** | **String** | Customer list ID. | [readonly] 
**IsNca** | **Boolean** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] 
**Name** | **String** | Customer list name. | 
**NumBatches** | **Decimal** | Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. | [optional] [readonly] 
**NumRemovedUserRecords** | **Decimal** | Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. | [optional] [readonly] 
**NumUploadedUserRecords** | **Decimal** | Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. | [optional] [readonly] 
**Status** | [**CustomerListStatus**](CustomerListStatus.md) | Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users. | [optional] [readonly] 
**Type** | **String** | Always &#x60;customerlist&#x60;. | [optional] [readonly] 
**UpdatedTime** | **Decimal** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$CustomerList = Initialize-PSOpenAPIToolsCustomerList  -AdAccountId 549756359984 `
 -CreatedTime 1452208622 `
 -Exceptions null `
 -Id 643 `
 -IsNca null `
 -Name The Glengarry Glen Ross leads `
 -NumBatches 2 `
 -NumRemovedUserRecords 0 `
 -NumUploadedUserRecords 11 `
 -Status PROCESSING `
 -Type customerlist `
 -UpdatedTime 1461269616
```

- Convert the resource to JSON
```powershell
$CustomerList | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

