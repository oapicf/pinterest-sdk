package models

type BusinessMembersAssetAccessDeleteRequestAccessesInner struct {

	// Id of the asset on which to remove member permissions.
	AssetId string `json:"asset_id" validate:"regexp=^\\\\d+$"`

	// Unique identifier of the member on which to perform the asset permission removal
	MemberId string `json:"member_id" validate:"regexp=^\\\\d+$"`
}
