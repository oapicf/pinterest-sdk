# PinterestSdkClient::AuthRespondInvitesBodyInvitesInnerAction

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **accept_invite** | **Boolean** | Whether the invite/request is accepted. |  |
| **asset_id_to_permissions** | **Hash&lt;String, Array&lt;Permissions&gt;&gt;** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AuthRespondInvitesBodyInvitesInnerAction.new(
  accept_invite: null,
  asset_id_to_permissions: {&quot;549760723247&quot;:[&quot;ANALYST&quot;],&quot;549760723248&quot;:[&quot;ANALYST&quot;,&quot;ADMIN&quot;],&quot;809944451643622187&quot;:[&quot;PROFILE_PUBLISHER&quot;]}
)
```

