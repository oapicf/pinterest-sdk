package models

type CreateAssetAccessRequestBodyAssetRequestsInner struct {

	// Unique identifier of a business partner to request asset access to.
	PartnerId string `json:"partner_id" validate:"regexp=^\\\\d+$"`

	// An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
	AssetIdToPermissions map[string][]Permissions `json:"asset_id_to_permissions"`
}
