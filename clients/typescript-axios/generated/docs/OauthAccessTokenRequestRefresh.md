# OauthAccessTokenRequestRefresh


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**refresh_token** | **string** |  | [default to undefined]
**scope** | **string** |  | [optional] [default to undefined]
**refresh_on** | **boolean** | Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;. | [optional] [default to undefined]
**grant_type** | **string** |  | [default to undefined]

## Example

```typescript
import { OauthAccessTokenRequestRefresh } from './api';

const instance: OauthAccessTokenRequestRefresh = {
    refresh_token,
    scope,
    refresh_on,
    grant_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
