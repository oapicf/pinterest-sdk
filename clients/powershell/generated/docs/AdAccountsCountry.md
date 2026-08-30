# AdAccountsCountry
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | [**Country**](Country.md) |  | 
**Currency** | **String** | Country currency. | 
**Index** | **Decimal** | Country index | 
**Name** | **String** | Country name | 

## Examples

- Prepare the resource
```powershell
$AdAccountsCountry = Initialize-PSOpenAPIToolsAdAccountsCountry  -Code US `
 -Currency Dollars `
 -Index 1 `
 -Name United States of America
```

- Convert the resource to JSON
```powershell
$AdAccountsCountry | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

