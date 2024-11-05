package models

// AssetIdPermissions - An object containing the permissions a business member has on the asset.
type AssetIdPermissions struct {

	// Unique identifier of a business asset.
	AssetId string `json:"asset_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
	AssetType string `json:"asset_type,omitempty"`

	// Permission levels member or partner has on an asset.
	Permissions []string `json:"permissions,omitempty"`

	AssetGroupInfo AssetGroupBinding `json:"asset_group_info,omitempty"`
}
