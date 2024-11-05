package models

type BusinessAssetPartnersGet200Response struct {

	// List of partners with permissions to the asset.
	Items []UserSingleAssetBinding `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
