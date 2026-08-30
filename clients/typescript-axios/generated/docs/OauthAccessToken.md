# OauthAccessToken

Describes the valid schema for possible OAuth access token requests.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | **string** |  | [readonly] [default to undefined]
**expires_in** | **number** |  | [readonly] [default to undefined]
**refresh_token** | **string** |  | [optional] [default to undefined]
**refresh_token_expires_at** | **number** |  | [optional] [readonly] [default to undefined]
**refresh_token_expires_in** | **number** |  | [optional] [readonly] [default to undefined]
**response_type** | [**TokenGrantType**](TokenGrantType.md) |  | [optional] [readonly] [default to undefined]
**scope** | **string** |  | [optional] [default to undefined]
**token_type** | **string** |  | [readonly] [default to 'bearer']

## Example

```typescript
import { OauthAccessToken } from './api';

const instance: OauthAccessToken = {
    access_token,
    expires_in,
    refresh_token,
    refresh_token_expires_at,
    refresh_token_expires_in,
    response_type,
    scope,
    token_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
