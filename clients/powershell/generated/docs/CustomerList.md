# CustomerList
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Associated ad account ID. | [optional] 
**CreatedTime** | **Decimal** | Creation time. Unix timestamp in seconds. | [optional] 
**Id** | **String** | Customer list ID. | [optional] 
**Name** | **String** | Customer list name. | [optional] 
**NumBatches** | **Decimal** | Total number of list updates.  List creation counts as one batch. Each &lt;a href&#x3D;&quot;&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT&quot;&quot;&gt;Append&lt;/a&gt; or &lt;a href&#x3D;&quot;&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT&quot;&quot;&gt;Remove API&lt;/a&gt; call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. | [optional] 
**NumRemovedUserRecords** | **Decimal** | Number of removed user records. In a &lt;a href&#x3D;&quot;&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT&quot;&quot;&gt;Remove API&lt;/a&gt; call, this counter increases even if the user is not found in the list. | [optional] 
**NumUploadedUserRecords** | **Decimal** | Number of uploaded user records. In an &lt;a href&#x3D;&quot;&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT&quot;&quot;&gt;Append API&lt;/a&gt; call, this counter increases even if the uploaded user is already in the list. | [optional] 
**Status** | **String** | Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. | [optional] 
**Type** | **String** | Always &quot;&quot;customerlist&quot;&quot;. | [optional] 
**UpdatedTime** | **Decimal** | Last update time. Unix timestamp in seconds. | [optional] 
**Exceptions** | [**SystemCollectionsHashtable**](.md) | Customer list errors | [optional] 

## Examples

- Prepare the resource
```powershell
$CustomerList = Initialize-PSOpenAPIToolsCustomerList  -AdAccountId 549756359984 `
 -CreatedTime 1452208622 `
 -Id 643 `
 -Name The Glengarry Glen Ross leads `
 -NumBatches 2 `
 -NumRemovedUserRecords 0 `
 -NumUploadedUserRecords 11 `
 -Status PROCESSING `
 -Type customerlist `
 -UpdatedTime 1461269616 `
 -Exceptions null
```

- Convert the resource to JSON
```powershell
$CustomerList | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

