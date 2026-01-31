# CatalogsReportDistributionStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_type** | **string** |  | [optional] [default to undefined]
**catalog_id** | **string** | ID of the catalog entity. | [optional] [default to undefined]
**code** | **number** | The event code that a diagnostics aggregated number references | [optional] [default to undefined]
**code_label** | **string** | A human-friendly label for the event code (e.g, \&#39;SPAM\&#39;) | [optional] [default to undefined]
**message** | **string** | Title message describing the diagnostic issue | [optional] [default to undefined]
**occurrences** | **number** | Number of occurrences of the issue | [optional] [default to undefined]
**ineligible_for_ads** | **boolean** | Indicates if issue makes items ineligible for ads distribution | [optional] [default to undefined]
**ineligible_for_organic** | **boolean** | Indicates if issue makes items ineligible for organic distribution | [optional] [default to undefined]

## Example

```typescript
import { CatalogsReportDistributionStats } from './api';

const instance: CatalogsReportDistributionStats = {
    report_type,
    catalog_id,
    code,
    code_label,
    message,
    occurrences,
    ineligible_for_ads,
    ineligible_for_organic,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
