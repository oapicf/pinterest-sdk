# ConversionProductReport


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **string** | Message returned from the create report request | [optional] [readonly] [default to undefined]
**report_status** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) | Async report status | [optional] [readonly] [default to undefined]
**size** | **number** | Size of the report in bytes | [optional] [readonly] [default to undefined]
**token** | **string** | Token returned from the create report request | [optional] [readonly] [default to undefined]
**url** | **string** | URL of the report | [optional] [readonly] [default to undefined]

## Example

```typescript
import { ConversionProductReport } from './api';

const instance: ConversionProductReport = {
    message,
    report_status,
    size,
    token,
    url,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
