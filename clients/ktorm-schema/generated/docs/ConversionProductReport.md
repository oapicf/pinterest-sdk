
# Table `ConversionProductReport`
(mapped from: ConversionProductReport)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**message** | message | text |  | **kotlin.String** | Message returned from the create report request |  [optional] [readonly]
**reportStatus** | report_status | long |  | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) | Async report status |  [optional] [readonly] [foreignkey]
**propertySize** | size | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Size of the report in bytes |  [optional] [readonly]
**token** | token | text |  | **kotlin.String** | Token returned from the create report request |  [optional] [readonly]
**url** | url | text |  | **kotlin.String** | URL of the report |  [optional] [readonly]







