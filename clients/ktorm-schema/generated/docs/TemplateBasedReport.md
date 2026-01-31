
# Table `TemplateBasedReport`
(mapped from: TemplateBasedReport)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**reportStatus** | report_status | long NOT NULL |  | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  |  [foreignkey]
**templateId** | template_id | text NOT NULL |  | **kotlin.String** | Unique identifier of a template. | 
**message** | message | text |  | **kotlin.String** |  |  [optional]
**token** | token | text |  | **kotlin.String** |  |  [optional]






