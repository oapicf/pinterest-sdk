package models

// CatalogsRetailProductGroupUpdateRequest - Request object for updating a retail product group.
type CatalogsRetailProductGroupUpdateRequest struct {

	// Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
	CatalogType string `json:"catalog_type,omitempty"`

	Name string `json:"name,omitempty"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsProductGroupFiltersRequest `json:"filters,omitempty"`

	Country Country `json:"country,omitempty"`

	Locale CatalogsLocale `json:"locale,omitempty"`
}
