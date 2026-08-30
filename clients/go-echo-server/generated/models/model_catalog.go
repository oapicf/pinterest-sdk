package models

import (
	"time"
)

// Catalog - Catalog entity
type Catalog struct {

	CatalogType CatalogsType `json:"catalog_type"`

	CreatedAt time.Time `json:"created_at"`

	// ID of the catalog entity.
	Id string `json:"id" validate:"regexp=^\\d+$"`

	// A human-friendly name associated to a catalog entity.
	Name string `json:"name"`

	UpdatedAt time.Time `json:"updated_at"`
}
