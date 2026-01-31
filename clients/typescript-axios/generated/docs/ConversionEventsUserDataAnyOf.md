# ConversionEventsUserDataAnyOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**em** | **Array&lt;string&gt;** | Sha256 hashes of lowercase version of user\&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [default to undefined]
**hashed_maids** | **Array&lt;string&gt;** | Sha256 hashes of user\&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple\&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] [default to undefined]
**client_ip_address** | **string** | The user\&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [optional] [default to undefined]
**client_user_agent** | **string** | The user agent string of the user\&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [optional] [default to undefined]

## Example

```typescript
import { ConversionEventsUserDataAnyOf } from './api';

const instance: ConversionEventsUserDataAnyOf = {
    em,
    hashed_maids,
    client_ip_address,
    client_user_agent,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
