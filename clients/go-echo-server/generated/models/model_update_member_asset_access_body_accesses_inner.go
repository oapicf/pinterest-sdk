package models

type UpdateMemberAssetAccessBodyAccessesInner struct {

	// Id of the asset to update.
	AssetId string `json:"asset_id" validate:"regexp=^\\\\d+$"`

	// Unique identifier of the member on which to perform the update
	MemberId string `json:"member_id" validate:"regexp=^\\\\d+$"`

	// A non-empty array of permissions to assign to the member.
	Permissions []Permissions `json:"permissions"`
}
