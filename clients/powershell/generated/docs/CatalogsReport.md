# CatalogsReport
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportStatus** | **String** |  | [optional] 
**Url** | **String** | URL to download the report | [optional] 
**Size** | **Decimal** | Size of the report in bytes | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsReport = Initialize-PSOpenAPIToolsCatalogsReport  -ReportStatus null `
 -Url null `
 -Size null
```

- Convert the resource to JSON
```powershell
$CatalogsReport | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

