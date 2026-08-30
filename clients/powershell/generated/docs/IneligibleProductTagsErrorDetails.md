# IneligibleProductTagsErrorDetails
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ProductTags** | [**IneligibleProductTagErrorItem[]**](IneligibleProductTagErrorItem.md) | List of product tags that failed eligibility check. | 

## Examples

- Prepare the resource
```powershell
$IneligibleProductTagsErrorDetails = Initialize-PSOpenAPIToolsIneligibleProductTagsErrorDetails  -ProductTags null
```

- Convert the resource to JSON
```powershell
$IneligibleProductTagsErrorDetails | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

