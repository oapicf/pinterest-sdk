# TemplateResponseDateRange
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DynamicDateRange** | [**TemplateResponseDateRangeDynamicDateRange**](TemplateResponseDateRangeDynamicDateRange.md) |  | [optional] 
**RelativeDateRange** | [**TemplateResponseDateRangeRelativeDateRange**](TemplateResponseDateRangeRelativeDateRange.md) |  | [optional] 
**AbsoluteDateRange** | [**TemplateResponseDateRangeAbsoluteDateRange**](TemplateResponseDateRangeAbsoluteDateRange.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TemplateResponseDateRange = Initialize-PSOpenAPIToolsTemplateResponseDateRange  -DynamicDateRange null `
 -RelativeDateRange null `
 -AbsoluteDateRange null
```

- Convert the resource to JSON
```powershell
$TemplateResponseDateRange | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

