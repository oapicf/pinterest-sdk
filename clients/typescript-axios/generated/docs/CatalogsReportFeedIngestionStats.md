# CatalogsReportFeedIngestionStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_type** | **string** |  | [optional] [default to undefined]
**catalog_id** | **string** | ID of the catalog entity. | [optional] [default to undefined]
**code** | **number** | The event code that a diagnostics aggregated number references | [optional] [default to undefined]
**code_label** | **string** | A human-friendly label for the event code (e.g, \&#39;AVAILABILITY_INVALID\&#39;) | [optional] [default to undefined]
**message** | **string** | Title message describing the diagnostic issue | [optional] [default to undefined]
**occurrences** | **number** | Number of occurrences of the issue | [optional] [default to undefined]
**severity** | **string** | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional] [default to undefined]

## Example

```typescript
import { CatalogsReportFeedIngestionStats } from './api';

const instance: CatalogsReportFeedIngestionStats = {
    report_type,
    catalog_id,
    code,
    code_label,
    message,
    occurrences,
    severity,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
