# CatalogsReportFeedIngestionFilter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportType** | **String** |  | 
**FeedId** | **String** | ID of the feed entity. | 
**ProcessingResultId** | **String** | Unique identifier of a feed processing result. It can be acquired from the &quot;&quot;id&quot;&quot; field of the &quot;&quot;items&quot;&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsReportFeedIngestionFilter = Initialize-PSOpenAPIToolsCatalogsReportFeedIngestionFilter  -ReportType null `
 -FeedId null `
 -ProcessingResultId null
```

- Convert the resource to JSON
```powershell
$CatalogsReportFeedIngestionFilter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

