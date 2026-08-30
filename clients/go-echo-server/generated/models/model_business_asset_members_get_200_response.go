package models

type BusinessAssetMembersGet200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []UserSingleAssetBinding `json:"items"`
}
