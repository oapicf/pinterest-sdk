
# Table `AuthRespondInvitesBody_invites_inner_action`
(mapped from: AuthRespondInvitesBodyInvitesInnerAction)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**acceptInvite** | accept_invite | boolean NOT NULL |  | **kotlin.Boolean** | Whether the invite/request is accepted. | 
**assetIdToPermissions** | asset_id_to_permissions | blob |  | **kotlin.collections.Map&lt;kotlin.String, kotlin.Array&lt;Permissions&gt;&gt;** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  |  [optional]




