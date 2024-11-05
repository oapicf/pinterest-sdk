package models

type DeletePartnerAssetAccessBodyAccessesInner struct {

	// Unique identifier of a business partner to update asset access to.
	PartnerId string `json:"partner_id" validate:"regexp=^\\\\d+$"`

	// Unique identifier of the business asset.
	AssetId string `json:"asset_id" validate:"regexp=^\\\\d+$"`

	// If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
	PartnerType string `json:"partner_type,omitempty"`
}
