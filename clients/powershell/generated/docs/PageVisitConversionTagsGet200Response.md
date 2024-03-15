# PageVisitConversionTagsGet200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**ConversionEventResponse[]**](ConversionEventResponse.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$PageVisitConversionTagsGet200Response = Initialize-PSOpenAPIToolsPageVisitConversionTagsGet200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$PageVisitConversionTagsGet200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

