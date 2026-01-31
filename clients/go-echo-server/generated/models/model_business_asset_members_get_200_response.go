package models

type BusinessAssetMembersGet200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	// List of members with permissions to the asset.
	Items []UserSingleAssetBinding `json:"items"`
}
