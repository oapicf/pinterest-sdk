# FeedProcessingResultsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**CatalogsFeedProcessingResult[]**](CatalogsFeedProcessingResult.md) |  | 

## Examples

- Prepare the resource
```powershell
$FeedProcessingResultsList200Response = Initialize-PSOpenAPIToolsFeedProcessingResultsList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$FeedProcessingResultsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

