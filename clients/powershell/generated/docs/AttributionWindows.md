# AttributionWindows
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClickWindowDays** | **Int32** |  | [optional] 
**EngagementWindowDays** | **Int32** |  | [optional] 
**ViewWindowDays** | **Int32** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AttributionWindows = Initialize-PSOpenAPIToolsAttributionWindows  -ClickWindowDays null `
 -EngagementWindowDays null `
 -ViewWindowDays null
```

- Convert the resource to JSON
```powershell
$AttributionWindows | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

