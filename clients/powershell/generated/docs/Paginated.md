# Paginated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**SystemCollectionsHashtable[]**](SystemCollectionsHashtable.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$Paginated = Initialize-PSOpenAPIToolsPaginated  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$Paginated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

