package models

// UpdatePartnerAssetAccessBody - An object with a list of partner asset accesses to assign or update.
type UpdatePartnerAssetAccessBody struct {

	// List of partner asset accesses to assign or update.
	Accesses []UpdatePartnerAssetAccessItem `json:"accesses"`
}
