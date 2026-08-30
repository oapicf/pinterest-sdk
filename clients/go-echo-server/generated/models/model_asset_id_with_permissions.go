package models

// AssetIdWithPermissions - Asset ID with permission levels.
type AssetIdWithPermissions struct {

	// Unique identifier of a business asset.
	Id string `json:"id,omitempty" validate:"regexp=^\\d+$"`

	// Permission levels member or partner has on an asset.
	Permissions []string `json:"permissions,omitempty"`
}
