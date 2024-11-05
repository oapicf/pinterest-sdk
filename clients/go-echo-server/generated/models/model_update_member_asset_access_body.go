package models

// UpdateMemberAssetAccessBody - An object with a list of all the new accesses.
type UpdateMemberAssetAccessBody struct {

	Accesses []UpdateMemberAssetAccessBodyAccessesInner `json:"accesses"`
}
