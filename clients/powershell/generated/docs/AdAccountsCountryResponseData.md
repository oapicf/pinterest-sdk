# AdAccountsCountryResponseData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | [**AdCountry**](AdCountry.md) |  | [optional] 
**Currency** | **String** | Country currency. | [optional] 
**Index** | **Decimal** | Country index | [optional] 
**Name** | **String** | Country name | [optional] 

## Examples

- Prepare the resource
```powershell
$AdAccountsCountryResponseData = Initialize-PSOpenAPIToolsAdAccountsCountryResponseData  -Code null `
 -Currency Dollars `
 -Index 1 `
 -Name United States of America
```

- Convert the resource to JSON
```powershell
$AdAccountsCountryResponseData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

