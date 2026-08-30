# MMMReportCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_ids** | **Array&lt;string&gt;** | Advertiser IDs for multi-advertiser report | [optional] [default to undefined]
**columns** | [**Array&lt;MMMReportingColumn&gt;**](MMMReportingColumn.md) | Metric and entity columns | [default to undefined]
**countries** | [**Array&lt;TargetingAdvertiserCountry&gt;**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] [default to undefined]
**custom_column_ids** | **Array&lt;string&gt;** | List of custom column IDs | [optional] [default to undefined]
**end_date** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to undefined]
**granularity** | [**MMMReportGranularity**](MMMReportGranularity.md) |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | [default to undefined]
**level** | [**MMMReportLevel**](MMMReportLevel.md) | Level of the report | [default to undefined]
**report_name** | **string** | Name of the Marketing Mix Modeling (MMM) report | [default to undefined]
**start_date** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to undefined]
**targeting_types** | [**Array&lt;MMMReportingTargetingType&gt;**](MMMReportingTargetingType.md) | List of targeting types | [default to undefined]

## Example

```typescript
import { MMMReportCreate } from './api';

const instance: MMMReportCreate = {
    advertiser_ids,
    columns,
    countries,
    custom_column_ids,
    end_date,
    granularity,
    level,
    report_name,
    start_date,
    targeting_types,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
