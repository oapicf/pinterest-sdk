# LeadsExportCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_id** | **string** | ID for the ad collecting leads | [default to undefined]
**end_date** | **string** | Export leads collected on and before end date (UTC). Format: YYYY-MM-DD | [default to undefined]
**start_date** | **string** | Export leads collected on and after start date (UTC). Format: YYYY-MM-DD | [default to undefined]

## Example

```typescript
import { LeadsExportCreateRequest } from './api';

const instance: LeadsExportCreateRequest = {
    ad_id,
    end_date,
    start_date,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
