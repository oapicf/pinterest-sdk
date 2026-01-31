# AuthRespondInvitesBodyInvitesInnerAction


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accept_invite** | **boolean** | Whether the invite/request is accepted. | [default to undefined]
**asset_id_to_permissions** | **{ [key: string]: Array&lt;Permissions&gt;; }** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | [optional] [default to undefined]

## Example

```typescript
import { AuthRespondInvitesBodyInvitesInnerAction } from './api';

const instance: AuthRespondInvitesBodyInvitesInnerAction = {
    accept_invite,
    asset_id_to_permissions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
