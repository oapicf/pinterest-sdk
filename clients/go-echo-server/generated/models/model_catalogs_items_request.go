package models

// CatalogsItemsRequest - Request object of catalogs items
type CatalogsItemsRequest struct {

	Country Country `json:"country"`

	Filters CatalogsItemsPostFilters `json:"filters"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`
}
