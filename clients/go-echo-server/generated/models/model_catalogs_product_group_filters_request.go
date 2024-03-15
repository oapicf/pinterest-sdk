package models

// CatalogsProductGroupFiltersRequest - Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
type CatalogsProductGroupFiltersRequest struct {

	AnyOf []CatalogsProductGroupFilterKeys `json:"any_of"`

	AllOf []CatalogsProductGroupFilterKeys `json:"all_of"`
}
