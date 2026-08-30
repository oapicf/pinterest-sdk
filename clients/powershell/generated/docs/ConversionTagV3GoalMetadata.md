# ConversionTagV3GoalMetadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AttributionWindows** | [**AttributionWindows**](AttributionWindows.md) |  | [optional] 
**ConversionEvent** | [**ConversionEvent**](ConversionEvent.md) |  | [optional] 
**ConversionTagId** | **String** |  | [optional] 
**CpaGoalValueInMicroCurrency** | **String** |  | [optional] 
**IsRoasOptimized** | **Boolean** | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;&quot;&quot;CHECKOUT&quot;&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;&quot;&quot;AUTOMATIC_BID&quot;&quot;&#x60;. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/). | [optional] 
**ReportingEvent** | **String** | Event name for custom or standard events mapped to an oCPM model | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionTagV3GoalMetadata = Initialize-PSOpenAPIToolsConversionTagV3GoalMetadata  -AttributionWindows null `
 -ConversionEvent null `
 -ConversionTagId null `
 -CpaGoalValueInMicroCurrency null `
 -IsRoasOptimized null `
 -ReportingEvent null
```

- Convert the resource to JSON
```powershell
$ConversionTagV3GoalMetadata | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

