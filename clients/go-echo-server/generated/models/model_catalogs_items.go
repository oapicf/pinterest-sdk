package models

// CatalogsItems - Response object of catalogs items
type CatalogsItems struct {

	// Array with catalogs items
	Items []ItemResponse `json:"items,omitempty"`
}
