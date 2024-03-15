# AdsAnalyticsCreateAsyncResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportStatus** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] 
**Token** | **String** |  | [optional] 
**Message** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdsAnalyticsCreateAsyncResponse = Initialize-PSOpenAPIToolsAdsAnalyticsCreateAsyncResponse  -ReportStatus null `
 -Token null `
 -Message null
```

- Convert the resource to JSON
```powershell
$AdsAnalyticsCreateAsyncResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

