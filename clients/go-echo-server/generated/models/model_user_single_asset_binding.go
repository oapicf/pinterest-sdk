package models

// UserSingleAssetBinding - An object containing the permissions a business member/partner has on the asset.
type UserSingleAssetBinding struct {

	// Permission levels member or partner has on an asset.
	Permissions []string `json:"permissions,omitempty"`

	User BusinessAccessUserSummary `json:"user,omitempty"`
}
