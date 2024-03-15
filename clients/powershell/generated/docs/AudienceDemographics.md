# AudienceDemographics
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ages** | [**AudienceDemographicValue[]**](AudienceDemographicValue.md) | Ages distribution. | [optional] 
**Genders** | [**AudienceDemographicValue[]**](AudienceDemographicValue.md) | Gender distribution. | [optional] 
**Devices** | [**AudienceDemographicValue[]**](AudienceDemographicValue.md) | Device usage distribution. | [optional] 
**Metros** | [**AudienceDemographicValue[]**](AudienceDemographicValue.md) | Geographic metro area distribution. | [optional] 
**Countries** | [**AudienceDemographicValue[]**](AudienceDemographicValue.md) | Country area distribution. | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceDemographics = Initialize-PSOpenAPIToolsAudienceDemographics  -Ages null `
 -Genders null `
 -Devices null `
 -Metros null `
 -Countries null
```

- Convert the resource to JSON
```powershell
$AudienceDemographics | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

