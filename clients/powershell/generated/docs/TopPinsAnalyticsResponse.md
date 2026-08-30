# TopPinsAnalyticsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateAvailability** | [**TopPinsAnalyticsResponseDateAvailability**](TopPinsAnalyticsResponseDateAvailability.md) |  | [optional] 
**Pins** | [**TopPinsAnalyticsResponsePinsItems[]**](TopPinsAnalyticsResponsePinsItems.md) |  | [optional] 
**SortBy** | [**TopPinsSortBy**](TopPinsSortBy.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TopPinsAnalyticsResponse = Initialize-PSOpenAPIToolsTopPinsAnalyticsResponse  -DateAvailability null `
 -Pins null `
 -SortBy null
```

- Convert the resource to JSON
```powershell
$TopPinsAnalyticsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

