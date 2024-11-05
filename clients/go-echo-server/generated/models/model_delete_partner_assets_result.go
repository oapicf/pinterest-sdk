package models

// DeletePartnerAssetsResult - The terminated asset access.
type DeletePartnerAssetsResult struct {

	// Unique identifier of a business asset.
	AssetId string `json:"asset_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
	AssetType string `json:"asset_type,omitempty"`

	// Permission levels member or partner has on an asset.
	Permissions []string `json:"permissions,omitempty"`

	// If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
	IsSharedPartner bool `json:"is_shared_partner,omitempty"`

	// Unique identifier of a business partner.
	PartnerId string `json:"partner_id,omitempty" validate:"regexp=^\\\\d+$"`
}
