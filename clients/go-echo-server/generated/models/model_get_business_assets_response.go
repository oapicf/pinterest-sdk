package models

// GetBusinessAssetsResponse - An object containing the permissions a business has on the asset.
type GetBusinessAssetsResponse struct {

	AssetGroupInfo AssetGroupBinding `json:"asset_group_info,omitempty"`

	// Unique identifier of a business asset.
	AssetId string `json:"asset_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
	AssetType string `json:"asset_type,omitempty"`

	CatalogInfo *GetBusinessAssetsResponseCatalogInfo `json:"catalog_info,omitempty"`
}
