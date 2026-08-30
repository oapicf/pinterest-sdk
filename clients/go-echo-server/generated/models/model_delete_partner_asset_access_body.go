package models

// DeletePartnerAssetAccessBody - An object with a list of partner asset accesses to delete.
type DeletePartnerAssetAccessBody struct {

	// List of partner asset accesses to delete.
	Accesses []DeletePartnerAssetAccessItem `json:"accesses"`
}
