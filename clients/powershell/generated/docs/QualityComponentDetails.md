# QualityComponentDetails
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Coverage** | **Decimal** | Coverage percentage for this event type. | 
**Issues** | [**QualityComponentIssue[]**](QualityComponentIssue.md) | List of issues detected for this event type, if any. | [optional] 
**Overlap** | **Decimal** | Overlap percentage for this event type. Only populated for external_event_id | [optional] 

## Examples

- Prepare the resource
```powershell
$QualityComponentDetails = Initialize-PSOpenAPIToolsQualityComponentDetails  -Coverage null `
 -Issues null `
 -Overlap null
```

- Convert the resource to JSON
```powershell
$QualityComponentDetails | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

