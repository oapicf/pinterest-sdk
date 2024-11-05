# UpdateMemberResultsResponseArray
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**UpdateMemberResult[]**](UpdateMemberResult.md) | List of members with updated business access role. | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateMemberResultsResponseArray = Initialize-PSOpenAPIToolsUpdateMemberResultsResponseArray  -Items null
```

- Convert the resource to JSON
```powershell
$UpdateMemberResultsResponseArray | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

