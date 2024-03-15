# ItemsIssuesList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**CatalogsItemValidationIssues[]**](CatalogsItemValidationIssues.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ItemsIssuesList200Response = Initialize-PSOpenAPIToolsItemsIssuesList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$ItemsIssuesList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

