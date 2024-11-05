package models

// UsersForIndividualAssetResponse - An object containing the permissions a business member has on the asset.
type UsersForIndividualAssetResponse struct {

	// Unique identifier of a business asset.
	AssetId string `json:"asset_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Unique identifier of the business member with asset access.
	MemberId string `json:"member_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Permission levels member or partner has on an asset.
	Permissions []string `json:"permissions,omitempty"`
}
