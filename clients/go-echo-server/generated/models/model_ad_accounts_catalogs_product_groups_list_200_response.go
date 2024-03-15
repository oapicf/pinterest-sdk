package models

type AdAccountsCatalogsProductGroupsList200Response struct {

	Items []CatalogProductGroup `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
