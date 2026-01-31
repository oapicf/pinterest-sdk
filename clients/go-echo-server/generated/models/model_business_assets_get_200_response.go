package models

type BusinessAssetsGet200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	// List of assets the requesting business has access to.
	Items []GetBusinessAssetsResponse `json:"items"`
}
