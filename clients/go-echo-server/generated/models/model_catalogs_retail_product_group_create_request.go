package models

// CatalogsRetailProductGroupCreateRequest - Request object for creating a product group.
type CatalogsRetailProductGroupCreateRequest struct {

	// Catalog id pertaining to the retail product group.
	CatalogId string `json:"catalog_id" validate:"regexp=^\\\\d+$"`

	// Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
	CatalogType string `json:"catalog_type"`

	Country Country `json:"country,omitempty"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsProductGroupFiltersRequest `json:"filters"`

	Locale CatalogsLocale `json:"locale,omitempty"`

	Name string `json:"name"`
}
