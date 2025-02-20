// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




// CatalogsCreativeAssetsProductGroupUpdateRequest - Request object for updating a creative assets product group.
type CatalogsCreativeAssetsProductGroupUpdateRequest struct {

	CatalogType string `json:"catalog_type,omitempty"`

	Name string `json:"name,omitempty"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsCreativeAssetsProductGroupFilters `json:"filters,omitempty"`
}

// AssertCatalogsCreativeAssetsProductGroupUpdateRequestRequired checks if the required fields are not zero-ed
func AssertCatalogsCreativeAssetsProductGroupUpdateRequestRequired(obj CatalogsCreativeAssetsProductGroupUpdateRequest) error {
	if err := AssertCatalogsCreativeAssetsProductGroupFiltersRequired(obj.Filters); err != nil {
		return err
	}
	return nil
}

// AssertCatalogsCreativeAssetsProductGroupUpdateRequestConstraints checks if the values respects the defined constraints
func AssertCatalogsCreativeAssetsProductGroupUpdateRequestConstraints(obj CatalogsCreativeAssetsProductGroupUpdateRequest) error {
	if err := AssertCatalogsCreativeAssetsProductGroupFiltersConstraints(obj.Filters); err != nil {
		return err
	}
	return nil
}
