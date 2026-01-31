package models

// CatalogsCreateRequest - Request object for creating a catalog.
type CatalogsCreateRequest struct {

	CatalogType CatalogsType `json:"catalog_type"`

	// A human-friendly name associated to a given catalog.
	Name string `json:"name"`
}
