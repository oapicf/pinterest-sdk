# CustomerSegmentUpdateRequestUpdateWithRequiredBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceIds** | **String[]** | Audience IDs to update the customer segment to. Only applicable for UPDATE operations. | [optional] 
**Id** | **String** | Customer segment ID. | 
**OperationType** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  | 

## Examples

- Prepare the resource
```powershell
$CustomerSegmentUpdateRequestUpdateWithRequiredBody = Initialize-PSOpenAPIToolsCustomerSegmentUpdateRequestUpdateWithRequiredBody  -AudienceIds null `
 -Id null `
 -OperationType null
```

- Convert the resource to JSON
```powershell
$CustomerSegmentUpdateRequestUpdateWithRequiredBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

