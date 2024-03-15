# TemplateResponseDateRangeAbsoluteDateRange
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The date range type | [optional] 
**StartDate** | **Decimal** | The start date of the date range | [optional] 
**EndDate** | **Decimal** | The end date of the date range | [optional] 

## Examples

- Prepare the resource
```powershell
$TemplateResponseDateRangeAbsoluteDateRange = Initialize-PSOpenAPIToolsTemplateResponseDateRangeAbsoluteDateRange  -Type absolute `
 -StartDate 0.8008281904610115 `
 -EndDate 6.027456183070403
```

- Convert the resource to JSON
```powershell
$TemplateResponseDateRangeAbsoluteDateRange | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

