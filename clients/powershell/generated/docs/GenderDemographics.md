# GenderDemographics
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Female** | **Decimal** | Percentage of female users | 
**Male** | **Decimal** | Percentage of male users | 
**Unspecified** | **Decimal** | Percentage of users with unspecified gender | 

## Examples

- Prepare the resource
```powershell
$GenderDemographics = Initialize-PSOpenAPIToolsGenderDemographics  -Female null `
 -Male null `
 -Unspecified null
```

- Convert the resource to JSON
```powershell
$GenderDemographics | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

