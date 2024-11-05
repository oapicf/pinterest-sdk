package models

type BusinessAssetsGet200Response struct {

	// List of assets the requesting business has access to.
	Items []GetBusinessAssetsResponse `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
