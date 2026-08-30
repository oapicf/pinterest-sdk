package models

type BusinessPartnerAssetAccessGet200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []BaseBusinessAssets `json:"items"`
}
