# CustomerSegmentCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceIds** | **String[]** | Audience IDs included in the customer segment. | 
**Name** | **String** | Customer segment name. | 

## Examples

- Prepare the resource
```powershell
$CustomerSegmentCreate = Initialize-PSOpenAPIToolsCustomerSegmentCreate  -AudienceIds null `
 -Name null
```

- Convert the resource to JSON
```powershell
$CustomerSegmentCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

