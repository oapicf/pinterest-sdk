package models

// CatalogsHotelProductGroupFilters - Object holding a group of filters for a hotel product group
type CatalogsHotelProductGroupFilters struct {

	AnyOf []CatalogsHotelProductGroupFilterKeys `json:"any_of"`

	AllOf []CatalogsHotelProductGroupFilterKeys `json:"all_of"`
}
