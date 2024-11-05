package models

type BusinessAssetMembersGet200Response struct {

	// List of members with permissions to the asset.
	Items []UserSingleAssetBinding `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
