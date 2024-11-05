package models

type BusinessMembersAssetAccessDeleteRequest struct {

	// List of members asset access to be deleted
	Accesses []BusinessMembersAssetAccessDeleteRequestAccessesInner `json:"accesses"`
}
