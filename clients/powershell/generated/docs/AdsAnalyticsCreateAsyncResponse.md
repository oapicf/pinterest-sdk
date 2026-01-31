# AdsAnalyticsCreateAsyncResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **String** |  | [optional] 
**ReportStatus** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] 
**Token** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdsAnalyticsCreateAsyncResponse = Initialize-PSOpenAPIToolsAdsAnalyticsCreateAsyncResponse  -Message null `
 -ReportStatus null `
 -Token null
```

- Convert the resource to JSON
```powershell
$AdsAnalyticsCreateAsyncResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

