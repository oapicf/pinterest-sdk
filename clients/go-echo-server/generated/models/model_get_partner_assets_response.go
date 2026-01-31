package models

// GetPartnerAssetsResponse - An object containing the permissions a you/your business partner has on the asset.
type GetPartnerAssetsResponse struct {

	AssetGroupInfo AssetGroupBinding `json:"asset_group_info,omitempty"`

	// Unique identifier of a business asset.
	AssetId string `json:"asset_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
	AssetType string `json:"asset_type,omitempty"`

	// The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset.
	Permissions []string `json:"permissions,omitempty"`
}
