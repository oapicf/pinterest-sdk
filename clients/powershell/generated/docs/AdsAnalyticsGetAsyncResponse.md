# AdsAnalyticsGetAsyncResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportStatus** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] 
**Url** | **String** |  | [optional] 
**Size** | **Decimal** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdsAnalyticsGetAsyncResponse = Initialize-PSOpenAPIToolsAdsAnalyticsGetAsyncResponse  -ReportStatus null `
 -Url null `
 -Size null
```

- Convert the resource to JSON
```powershell
$AdsAnalyticsGetAsyncResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

