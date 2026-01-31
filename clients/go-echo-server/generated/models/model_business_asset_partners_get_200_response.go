package models

type BusinessAssetPartnersGet200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	// List of partners with permissions to the asset.
	Items []UserSingleAssetBinding `json:"items"`
}
