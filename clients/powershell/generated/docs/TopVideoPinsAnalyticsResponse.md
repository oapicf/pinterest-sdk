# TopVideoPinsAnalyticsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateAvailability** | [**TopPinsAnalyticsResponseDateAvailability**](TopPinsAnalyticsResponseDateAvailability.md) |  | [optional] 
**Pins** | [**TopVideoPinsAnalyticsResponsePinsInner[]**](TopVideoPinsAnalyticsResponsePinsInner.md) |  | [optional] 
**SortBy** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TopVideoPinsAnalyticsResponse = Initialize-PSOpenAPIToolsTopVideoPinsAnalyticsResponse  -DateAvailability null `
 -Pins null `
 -SortBy IMPRESSION
```

- Convert the resource to JSON
```powershell
$TopVideoPinsAnalyticsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

