package models

type BusinessMemberAssetsGet200Response struct {

	// List asset permissions the given member was granted.
	Items []AssetIdPermissions `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
