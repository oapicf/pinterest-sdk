# TemplateResponseDateRangeRelativeDateRange
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EndDaysInPast** | **Decimal** | The end date of the date range | [optional] 
**StartDaysInPast** | **Decimal** | The start date of the date range | [optional] 
**Type** | **String** | The date range type | [optional] 

## Examples

- Prepare the resource
```powershell
$TemplateResponseDateRangeRelativeDateRange = Initialize-PSOpenAPIToolsTemplateResponseDateRangeRelativeDateRange  -EndDaysInPast 7 `
 -StartDaysInPast 14 `
 -Type relative
```

- Convert the resource to JSON
```powershell
$TemplateResponseDateRangeRelativeDateRange | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

