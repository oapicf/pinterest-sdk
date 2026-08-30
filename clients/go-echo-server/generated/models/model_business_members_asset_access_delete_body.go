package models

// BusinessMembersAssetAccessDeleteBody - An object with a list of member asset accesses to delete.
type BusinessMembersAssetAccessDeleteBody struct {

	// List of members asset access to be deleted
	Accesses []DeleteMemberAssetAccessItem `json:"accesses"`
}
