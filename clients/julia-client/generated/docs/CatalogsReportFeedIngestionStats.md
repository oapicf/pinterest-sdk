# CatalogsReportFeedIngestionStats


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`catalog_id`** | **`String`** | ID of the catalog entity. | [optional] [default to nothing]
**`code`** | **`Int64`** | The event code that a diagnostics aggregated number references | [optional] [default to nothing]
**`code_label`** | **`String`** | A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;) | [optional] [default to nothing]
**`message`** | **`String`** | Title message describing the diagnostic issue | [optional] [default to nothing]
**`occurrences`** | **`Int64`** | Number of occurrences of the issue | [optional] [default to nothing]
**`report_type`** | **`String`** |  | [optional] [default to nothing]
**`severity`** | **`String`** | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


