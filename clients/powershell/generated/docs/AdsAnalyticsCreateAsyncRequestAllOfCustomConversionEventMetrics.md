# AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CustomEventMetricsType** | **String** | Metrics for custom defined conversion event. | 
**CustomEventName** | **String** | Name of the advertiser-defined custom conversion event | 

## Examples

- Prepare the resource
```powershell
$AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics = Initialize-PSOpenAPIToolsAdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics  -CustomEventMetricsType ADE_COST_PER_ACTION `
 -CustomEventName null
```

- Convert the resource to JSON
```powershell
$AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

