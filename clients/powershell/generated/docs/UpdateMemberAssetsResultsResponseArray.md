# UpdateMemberAssetsResultsResponseArray
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**UpdateMemberAssetsResultsResponseArrayItemsInner[]**](UpdateMemberAssetsResultsResponseArrayItemsInner.md) | List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned. | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateMemberAssetsResultsResponseArray = Initialize-PSOpenAPIToolsUpdateMemberAssetsResultsResponseArray  -Items null
```

- Convert the resource to JSON
```powershell
$UpdateMemberAssetsResultsResponseArray | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

