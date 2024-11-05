package models

// CatalogsCreativeAssetsProductGroupFilters - Object holding a group of filters for a creative assets product group
type CatalogsCreativeAssetsProductGroupFilters struct {

	AnyOf []CatalogsCreativeAssetsProductGroupFilterKeys `json:"any_of"`

	AllOf []CatalogsCreativeAssetsProductGroupFilterKeys `json:"all_of"`
}
