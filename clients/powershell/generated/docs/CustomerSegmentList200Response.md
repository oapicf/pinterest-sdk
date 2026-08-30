# CustomerSegmentList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**CustomerSegment[]**](CustomerSegment.md) |  | 

## Examples

- Prepare the resource
```powershell
$CustomerSegmentList200Response = Initialize-PSOpenAPIToolsCustomerSegmentList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$CustomerSegmentList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

