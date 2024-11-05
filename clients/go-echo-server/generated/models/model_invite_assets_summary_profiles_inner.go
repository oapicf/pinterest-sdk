package models

type InviteAssetsSummaryProfilesInner struct {

	// Unique identifier of a business profile.
	Id string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`

	// Permission levels member or partner has on an asset.
	Permissions []string `json:"permissions,omitempty"`
}
