# BoardSectionsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**BoardSection[]**](BoardSection.md) | Board sections | 

## Examples

- Prepare the resource
```powershell
$BoardSectionsList200Response = Initialize-PSOpenAPIToolsBoardSectionsList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$BoardSectionsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

