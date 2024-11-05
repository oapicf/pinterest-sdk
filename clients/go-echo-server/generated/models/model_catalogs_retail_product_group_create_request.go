package models

// CatalogsRetailProductGroupCreateRequest - Request object for creating a product group.
type CatalogsRetailProductGroupCreateRequest struct {

	// Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
	CatalogType string `json:"catalog_type"`

	Name string `json:"name"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsProductGroupFiltersRequest `json:"filters"`

	// Catalog id pertaining to the retail product group.
	CatalogId string `json:"catalog_id" validate:"regexp=^\\\\d+$"`

	Country Country `json:"country"`

	Locale CatalogsLocale `json:"locale"`
}
