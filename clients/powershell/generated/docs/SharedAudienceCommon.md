# SharedAudienceCommon
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | **String** | Unique identifier of an audience | [optional] 
**OperationType** | [**OperationType**](OperationType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SharedAudienceCommon = Initialize-PSOpenAPIToolsSharedAudienceCommon  -AudienceId 2542621871096 `
 -OperationType null
```

- Convert the resource to JSON
```powershell
$SharedAudienceCommon | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

