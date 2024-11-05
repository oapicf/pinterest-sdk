package models

type AuthRespondInvitesBodyInvitesInnerAction struct {

	// Whether the invite/request is accepted.
	AcceptInvite bool `json:"accept_invite"`

	// An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
	AssetIdToPermissions map[string][]Permissions `json:"asset_id_to_permissions,omitempty"`
}
