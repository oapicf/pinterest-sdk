package models

type InviteAssetsSummaryItem struct {

	// Unique identifier of the asset.
	Id string `json:"id,omitempty" validate:"regexp=^\\d+$"`

	// Permission levels member or partner has on an asset.
	Permissions []string `json:"permissions,omitempty"`
}
