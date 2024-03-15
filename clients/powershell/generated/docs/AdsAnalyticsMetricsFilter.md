# AdsAnalyticsMetricsFilter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Field** | [**AdsAnalyticsFilterColumn**](AdsAnalyticsFilterColumn.md) |  | 
**Operator** | [**AdsAnalyticsFilterOperator**](AdsAnalyticsFilterOperator.md) |  | 
**Values** | **Decimal[]** | List of values for filtering | 

## Examples

- Prepare the resource
```powershell
$AdsAnalyticsMetricsFilter = Initialize-PSOpenAPIToolsAdsAnalyticsMetricsFilter  -Field null `
 -Operator null `
 -Values null
```

- Convert the resource to JSON
```powershell
$AdsAnalyticsMetricsFilter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

