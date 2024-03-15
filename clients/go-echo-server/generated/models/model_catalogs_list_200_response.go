package models

type CatalogsList200Response struct {

	Items []Catalog `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
