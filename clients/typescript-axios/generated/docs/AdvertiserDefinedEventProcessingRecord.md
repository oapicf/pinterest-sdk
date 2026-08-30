# AdvertiserDefinedEventProcessingRecord

Processing record for an advertiser defined event operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exceptions** | **Array&lt;string&gt;** | List of exception messages if the operation failed | [optional] [default to undefined]
**name** | **string** | Name of the advertiser defined event | [default to undefined]
**status** | **string** | Processing status (success or failure) | [default to undefined]

## Example

```typescript
import { AdvertiserDefinedEventProcessingRecord } from './api';

const instance: AdvertiserDefinedEventProcessingRecord = {
    exceptions,
    name,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
