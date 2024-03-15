# FeedProcessingResultsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**CatalogsFeedProcessingResult[]**](CatalogsFeedProcessingResult.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedProcessingResultsList200Response = Initialize-PSOpenAPIToolsFeedProcessingResultsList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$FeedProcessingResultsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

