
# Table `CatalogsHotelReportParameters_report`
(mapped from: CatalogsHotelReportParametersReport)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**reportType** | report_type | text NOT NULL |  | [**report_type**](#ReportType) |  | 
**feedId** | feed_id | text NOT NULL |  | **kotlin.String** | ID of the feed entity. | 
**processingResultId** | processing_result_id | text |  | **kotlin.String** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. |  [optional]
**catalogId** | catalog_id | text |  | **kotlin.String** | Unique identifier of a catalog. If not given, oldest catalog will be used |  [optional]






