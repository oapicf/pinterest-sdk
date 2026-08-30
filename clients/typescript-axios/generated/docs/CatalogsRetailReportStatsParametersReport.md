# CatalogsRetailReportStatsParametersReport


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feed_id** | **string** | ID of the feed entity. | [default to undefined]
**processing_result_id** | **string** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] [default to undefined]
**report_type** | **string** |  | [default to undefined]
**catalog_id** | **string** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] [default to undefined]

## Example

```typescript
import { CatalogsRetailReportStatsParametersReport } from './api';

const instance: CatalogsRetailReportStatsParametersReport = {
    feed_id,
    processing_result_id,
    report_type,
    catalog_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
