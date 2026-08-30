# TopVideoPinsAnalyticsResponsePinsItems
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DataStatus** | [**System.Collections.Hashtable**](DataStatus.md) |  | [optional] 
**Metrics** | **System.Collections.Hashtable** |  | [optional] 
**PinId** | **String** | The pin id | [optional] 

## Examples

- Prepare the resource
```powershell
$TopVideoPinsAnalyticsResponsePinsItems = Initialize-PSOpenAPIToolsTopVideoPinsAnalyticsResponsePinsItems  -DataStatus null `
 -Metrics null `
 -PinId null
```

- Convert the resource to JSON
```powershell
$TopVideoPinsAnalyticsResponsePinsItems | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

