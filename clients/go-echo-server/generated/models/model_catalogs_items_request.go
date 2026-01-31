package models

// CatalogsItemsRequest - Request object of catalogs items
type CatalogsItemsRequest struct {

	Country Country `json:"country"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`

	Filters CatalogsItemsPostFilters `json:"filters"`
}
