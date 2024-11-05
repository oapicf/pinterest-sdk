package models

// CatalogsItemsRequest - Request object of catalogs items
type CatalogsItemsRequest struct {

	Country Country `json:"country"`

	Language CatalogsItemsRequestLanguage `json:"language"`

	Filters CatalogsItemsPostFilters `json:"filters"`
}
