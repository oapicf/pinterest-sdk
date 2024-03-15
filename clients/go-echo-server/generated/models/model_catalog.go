package models

import (
	"time"
)

// Catalog - Catalog entity
type Catalog struct {

	CreatedAt time.Time `json:"created_at,omitempty"`

	// ID of the catalog entity.
	Id string `json:"id"`

	UpdatedAt time.Time `json:"updated_at,omitempty"`

	// A human-friendly name associated to a catalog entity.
	Name *string `json:"name"`

	CatalogType CatalogsType `json:"catalog_type"`
}
