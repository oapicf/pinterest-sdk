# LeadsExportCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **string** | Export leads collected on and after start date (UTC). Format: YYYY-MM-DD | [default to undefined]
**end_date** | **string** | Export leads collected on and before end date (UTC). Format: YYYY-MM-DD | [default to undefined]
**ad_id** | **string** | ID for the ad collecting leads | [default to undefined]

## Example

```typescript
import { LeadsExportCreateRequest } from './api';

const instance: LeadsExportCreateRequest = {
    start_date,
    end_date,
    ad_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
