# DeleteMemberAccessResultsResponseArray
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**DeleteMemberAccessResult[]**](DeleteMemberAccessResult.md) | List of member asset permissions that were deleted. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeleteMemberAccessResultsResponseArray = Initialize-PSOpenAPIToolsDeleteMemberAccessResultsResponseArray  -Items null
```

- Convert the resource to JSON
```powershell
$DeleteMemberAccessResultsResponseArray | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

