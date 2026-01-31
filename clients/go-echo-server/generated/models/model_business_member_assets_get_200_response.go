package models

type BusinessMemberAssetsGet200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	// List asset permissions the given member was granted.
	Items []AssetIdPermissions `json:"items"`
}
