# CustomerListRecordRow

A single row in a multi-field customer list (v2 format).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **string** | Email address (plain or hashed with SHA1, SHA256, or MD5). | [optional] [default to undefined]
**external_id** | **string** | External ID identifier (not hashed). | [optional] [default to undefined]
**hashed_phone_number** | **string** | Hashed phone number (hashed with SHA1, SHA256, or MD5). | [optional] [default to undefined]
**hashed_pinner_id** | **string** | Hashed pinner ID (hashed with SHA1, SHA256, or MD5). | [optional] [default to undefined]
**ip_address** | **string** | IP address (not hashed). | [optional] [default to undefined]
**liveramp_envelope** | **string** | LiveRamp envelope identifier (Base64-encoded, not hashed). | [optional] [default to undefined]
**maid** | **string** | Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5). | [optional] [default to undefined]
**user_agent** | **string** | User agent string (not hashed). | [optional] [default to undefined]

## Example

```typescript
import { CustomerListRecordRow } from './api';

const instance: CustomerListRecordRow = {
    email,
    external_id,
    hashed_phone_number,
    hashed_pinner_id,
    ip_address,
    liveramp_envelope,
    maid,
    user_agent,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
