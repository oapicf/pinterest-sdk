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




// CatalogsCreativeAssetsProductGroupFilters - Object holding a group of filters for a creative assets product group
type CatalogsCreativeAssetsProductGroupFilters struct {

	AnyOf []CatalogsCreativeAssetsProductGroupFilterKeys `json:"any_of"`

	AllOf []CatalogsCreativeAssetsProductGroupFilterKeys `json:"all_of"`
}

// AssertCatalogsCreativeAssetsProductGroupFiltersRequired checks if the required fields are not zero-ed
func AssertCatalogsCreativeAssetsProductGroupFiltersRequired(obj CatalogsCreativeAssetsProductGroupFilters) error {
	elements := map[string]interface{}{
		"any_of": obj.AnyOf,
		"all_of": obj.AllOf,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.AnyOf {
		if err := AssertCatalogsCreativeAssetsProductGroupFilterKeysRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.AllOf {
		if err := AssertCatalogsCreativeAssetsProductGroupFilterKeysRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCatalogsCreativeAssetsProductGroupFiltersConstraints checks if the values respects the defined constraints
func AssertCatalogsCreativeAssetsProductGroupFiltersConstraints(obj CatalogsCreativeAssetsProductGroupFilters) error {
	for _, el := range obj.AnyOf {
		if err := AssertCatalogsCreativeAssetsProductGroupFilterKeysConstraints(el); err != nil {
			return err
		}
	}
	for _, el := range obj.AllOf {
		if err := AssertCatalogsCreativeAssetsProductGroupFilterKeysConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
