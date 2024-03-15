# AudienceDemographicValue
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | **String** | Unique key for demographic item | [optional] 
**Name** | **String** | Display name for demographic | [optional] 
**Ratio** | **Decimal** | Value of demographic item as a percent of total audience | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceDemographicValue = Initialize-PSOpenAPIToolsAudienceDemographicValue  -Key us `
 -Name United States `
 -Ratio 0.551
```

- Convert the resource to JSON
```powershell
$AudienceDemographicValue | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

