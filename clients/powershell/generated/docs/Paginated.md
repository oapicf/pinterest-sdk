# Paginated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**SystemCollectionsHashtable[]**](SystemCollectionsHashtable.md) |  | 

## Examples

- Prepare the resource
```powershell
$Paginated = Initialize-PSOpenAPIToolsPaginated  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$Paginated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

