# TemplateResponseDateRangeAbsoluteDateRange
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EndDate** | **Decimal** | The end date of the date range | [optional] 
**StartDate** | **Decimal** | The start date of the date range | [optional] 
**Type** | **String** | The date range type | [optional] 

## Examples

- Prepare the resource
```powershell
$TemplateResponseDateRangeAbsoluteDateRange = Initialize-PSOpenAPIToolsTemplateResponseDateRangeAbsoluteDateRange  -EndDate 6.027456183070403 `
 -StartDate 0.8008281904610115 `
 -Type absolute
```

- Convert the resource to JSON
```powershell
$TemplateResponseDateRangeAbsoluteDateRange | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

