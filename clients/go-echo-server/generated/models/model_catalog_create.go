package models

// CatalogCreate - Resource create operation model.
type CatalogCreate struct {

	CatalogType CatalogsType `json:"catalog_type"`

	// A human-friendly name associated to a catalog entity.
	Name string `json:"name"`
}
