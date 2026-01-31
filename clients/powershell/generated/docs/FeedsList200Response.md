# FeedsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**CatalogsFeed[]**](CatalogsFeed.md) |  | 

## Examples

- Prepare the resource
```powershell
$FeedsList200Response = Initialize-PSOpenAPIToolsFeedsList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$FeedsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

