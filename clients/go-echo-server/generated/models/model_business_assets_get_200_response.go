package models

type BusinessAssetsGet200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []BusinessAssets `json:"items"`
}
