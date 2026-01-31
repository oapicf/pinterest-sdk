# AdsAnalyticsGetAsyncResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportStatus** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] 
**Size** | **Decimal** |  | [optional] 
**Url** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdsAnalyticsGetAsyncResponse = Initialize-PSOpenAPIToolsAdsAnalyticsGetAsyncResponse  -ReportStatus null `
 -Size null `
 -Url null
```

- Convert the resource to JSON
```powershell
$AdsAnalyticsGetAsyncResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

