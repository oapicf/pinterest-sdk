package models

// UpdateMemberAssetAccessBody - An object with a list of all the new member asset accesses.
type UpdateMemberAssetAccessBody struct {

	// List of member asset accesses to assign or update.
	Accesses []UpdateMemberAssetAccessItem `json:"accesses"`
}
