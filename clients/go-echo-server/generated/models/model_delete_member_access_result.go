package models

// DeleteMemberAccessResult - The terminated asset access.
type DeleteMemberAccessResult struct {

	// Unique identifier of the business asset.
	AssetId string `json:"asset_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Unique identifier of the business member.
	MemberId string `json:"member_id,omitempty" validate:"regexp=^\\\\d+$"`
}
