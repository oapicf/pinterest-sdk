# TopVideoPinsAnalyticsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateAvailability** | [**TopVideoPinsAnalyticsResponseDateAvailability**](TopVideoPinsAnalyticsResponseDateAvailability.md) |  | [optional] 
**Pins** | [**TopVideoPinsAnalyticsResponsePinsItems[]**](TopVideoPinsAnalyticsResponsePinsItems.md) |  | [optional] 
**SortBy** | [**TopVideoPinsSortBy**](TopVideoPinsSortBy.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TopVideoPinsAnalyticsResponse = Initialize-PSOpenAPIToolsTopVideoPinsAnalyticsResponse  -DateAvailability null `
 -Pins null `
 -SortBy null
```

- Convert the resource to JSON
```powershell
$TopVideoPinsAnalyticsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

