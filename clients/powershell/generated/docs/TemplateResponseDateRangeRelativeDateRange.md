# TemplateResponseDateRangeRelativeDateRange
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The date range type | [optional] 
**StartDaysInPast** | **Decimal** | The start date of the date range | [optional] 
**EndDaysInPast** | **Decimal** | The end date of the date range | [optional] 

## Examples

- Prepare the resource
```powershell
$TemplateResponseDateRangeRelativeDateRange = Initialize-PSOpenAPIToolsTemplateResponseDateRangeRelativeDateRange  -Type relative `
 -StartDaysInPast 14 `
 -EndDaysInPast 7
```

- Convert the resource to JSON
```powershell
$TemplateResponseDateRangeRelativeDateRange | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

