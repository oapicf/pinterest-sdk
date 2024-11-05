package models

type UpdatePartnerAssetAccessBodyAccessesInner struct {

	// Unique identifier of a business partner to update asset access to.
	PartnerId string `json:"partner_id" validate:"regexp=^\\\\d+$"`

	// Unique identifier of the business asset.
	AssetId string `json:"asset_id" validate:"regexp=^\\\\d+$"`

	// A non-empty array of permissions to assign to the partner.
	Permissions []Permissions `json:"permissions"`
}
