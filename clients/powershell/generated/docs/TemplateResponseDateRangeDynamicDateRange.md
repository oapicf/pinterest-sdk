# TemplateResponseDateRangeDynamicDateRange
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Range** | **String** | The dynamic range type | [optional] 
**Type** | **String** | The date range type | [optional] 

## Examples

- Prepare the resource
```powershell
$TemplateResponseDateRangeDynamicDateRange = Initialize-PSOpenAPIToolsTemplateResponseDateRangeDynamicDateRange  -Range YEAR_TO_DATE `
 -Type dynamic
```

- Convert the resource to JSON
```powershell
$TemplateResponseDateRangeDynamicDateRange | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

