# AppsflyerAudienceSyncCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**container_id** | **string** | The container ID of the audience | [default to undefined]
**url_adid_sha256** | **string** | The pre-signed URL for SHA256 hashed GAID/IDFA file | [optional] [default to undefined]
**url_email_sha256** | **string** | The pre-signed URL for SHA256 hashed email file | [optional] [default to undefined]

## Example

```typescript
import { AppsflyerAudienceSyncCreate } from './api';

const instance: AppsflyerAudienceSyncCreate = {
    container_id,
    url_adid_sha256,
    url_email_sha256,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
