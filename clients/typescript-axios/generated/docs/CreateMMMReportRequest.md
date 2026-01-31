# CreateMMMReportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countries** | [**Array&lt;TargetingAdvertiserCountry&gt;**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] [default to undefined]
**report_name** | **string** | Name of the Marketing Mix Modeling (MMM) report | [default to undefined]
**start_date** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to undefined]
**end_date** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to undefined]
**granularity** | **string** | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | [default to undefined]
**level** | **string** | Level of the report | [default to undefined]
**targeting_types** | [**Array&lt;MMMReportingTargetingType&gt;**](MMMReportingTargetingType.md) | List of targeting types | [default to undefined]
**columns** | [**Array&lt;MMMReportingColumn&gt;**](MMMReportingColumn.md) | Metric and entity columns | [default to undefined]

## Example

```typescript
import { CreateMMMReportRequest } from './api';

const instance: CreateMMMReportRequest = {
    countries,
    report_name,
    start_date,
    end_date,
    granularity,
    level,
    targeting_types,
    columns,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
