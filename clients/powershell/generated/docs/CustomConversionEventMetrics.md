# CustomConversionEventMetrics
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CustomEventMetricsType** | [**AdeColumnType**](AdeColumnType.md) |  | 
**CustomEventName** | **String** | Name of the advertiser-defined custom conversion event | 

## Examples

- Prepare the resource
```powershell
$CustomConversionEventMetrics = Initialize-PSOpenAPIToolsCustomConversionEventMetrics  -CustomEventMetricsType null `
 -CustomEventName null
```

- Convert the resource to JSON
```powershell
$CustomConversionEventMetrics | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

