package models

// CatalogUpdate - Resource create or update operation model.
type CatalogUpdate struct {

	CatalogType CatalogsType `json:"catalog_type,omitempty"`

	// A human-friendly name associated to a catalog entity.
	Name string `json:"name,omitempty"`
}
