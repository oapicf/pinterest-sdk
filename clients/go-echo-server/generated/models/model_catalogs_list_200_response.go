package models

type CatalogsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []Catalog `json:"items"`
}
