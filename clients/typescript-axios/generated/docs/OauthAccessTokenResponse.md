# OauthAccessTokenResponse

A successful OAuth access token response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | **string** |  | [default to undefined]
**expires_in** | **number** |  | [default to undefined]
**response_type** | **string** |  | [optional] [default to undefined]
**scope** | **string** |  | [default to undefined]
**token_type** | **string** |  | [default to 'bearer']

## Example

```typescript
import { OauthAccessTokenResponse } from './api';

const instance: OauthAccessTokenResponse = {
    access_token,
    expires_in,
    response_type,
    scope,
    token_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
