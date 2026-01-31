# TemplateResponseDateRange
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AbsoluteDateRange** | [**TemplateResponseDateRangeAbsoluteDateRange**](TemplateResponseDateRangeAbsoluteDateRange.md) |  | [optional] 
**DynamicDateRange** | [**TemplateResponseDateRangeDynamicDateRange**](TemplateResponseDateRangeDynamicDateRange.md) |  | [optional] 
**RelativeDateRange** | [**TemplateResponseDateRangeRelativeDateRange**](TemplateResponseDateRangeRelativeDateRange.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TemplateResponseDateRange = Initialize-PSOpenAPIToolsTemplateResponseDateRange  -AbsoluteDateRange null `
 -DynamicDateRange null `
 -RelativeDateRange null
```

- Convert the resource to JSON
```powershell
$TemplateResponseDateRange | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

