# BoardSectionsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**BoardSection[]**](BoardSection.md) | Board sections | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BoardSectionsList200Response = Initialize-PSOpenAPIToolsBoardSectionsList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$BoardSectionsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

