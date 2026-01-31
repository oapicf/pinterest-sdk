# OauthAccessTokenResponse

A successful OAuth access token response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response_type** | **string** |  | [optional] [default to undefined]
**access_token** | **string** |  | [default to undefined]
**token_type** | **string** |  | [default to 'bearer']
**expires_in** | **number** |  | [default to undefined]
**scope** | **string** |  | [default to undefined]

## Example

```typescript
import { OauthAccessTokenResponse } from './api';

const instance: OauthAccessTokenResponse = {
    response_type,
    access_token,
    token_type,
    expires_in,
    scope,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
