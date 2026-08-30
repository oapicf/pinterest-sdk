# ConversionDeletionRequest

Conversion deletion request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_time** | **string** | Timestamp when the conversion deletion request was succesfully created. | [readonly] [default to undefined]
**processed_time** | **string** | Timestamp when the conversion deletion request was processed. | [optional] [readonly] [default to undefined]
**request_id** | **string** | Unique identifier of the conversion deletion request | [default to undefined]
**status** | [**ConversionDeletionRequestStatus**](ConversionDeletionRequestStatus.md) | Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled. | [readonly] [default to undefined]

## Example

```typescript
import { ConversionDeletionRequest } from './api';

const instance: ConversionDeletionRequest = {
    created_time,
    processed_time,
    request_id,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
