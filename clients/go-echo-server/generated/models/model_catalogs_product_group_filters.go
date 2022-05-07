package models

// CatalogsProductGroupFilters - Object holding a group of filters for a catalog product group
type CatalogsProductGroupFilters struct {

	AnyOf []CatalogsProductGroupFilterKeys `json:"any_of,omitempty"`

	AllOf []CatalogsProductGroupFilterKeys `json:"all_of,omitempty"`
}
