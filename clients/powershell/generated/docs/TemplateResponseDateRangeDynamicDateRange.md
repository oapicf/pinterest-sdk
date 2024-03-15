# TemplateResponseDateRangeDynamicDateRange
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The date range type | [optional] 
**Range** | **String** | The dynamic range type | [optional] 

## Examples

- Prepare the resource
```powershell
$TemplateResponseDateRangeDynamicDateRange = Initialize-PSOpenAPIToolsTemplateResponseDateRangeDynamicDateRange  -Type dynamic `
 -Range YEAR_TO_DATE
```

- Convert the resource to JSON
```powershell
$TemplateResponseDateRangeDynamicDateRange | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

