# AdGroupsCreate200ResponseItemsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**AdGroup**](AdGroup.md) |  | [optional] 
**Exceptions** | [**PinterestLibBatchItemException[]**](PinterestLibBatchItemException.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdGroupsCreate200ResponseItemsInner = Initialize-PSOpenAPIToolsAdGroupsCreate200ResponseItemsInner  -VarData null `
 -Exceptions null
```

- Convert the resource to JSON
```powershell
$AdGroupsCreate200ResponseItemsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

