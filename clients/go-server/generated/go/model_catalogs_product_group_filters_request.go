/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// CatalogsProductGroupFiltersRequest - Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
type CatalogsProductGroupFiltersRequest struct {

	AnyOf []CatalogsProductGroupFilterKeys `json:"any_of"`

	AllOf []CatalogsProductGroupFilterKeys `json:"all_of"`
}

// AssertCatalogsProductGroupFiltersRequestRequired checks if the required fields are not zero-ed
func AssertCatalogsProductGroupFiltersRequestRequired(obj CatalogsProductGroupFiltersRequest) error {
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
		if err := AssertCatalogsProductGroupFilterKeysRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.AllOf {
		if err := AssertCatalogsProductGroupFilterKeysRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCatalogsProductGroupFiltersRequestConstraints checks if the values respects the defined constraints
func AssertCatalogsProductGroupFiltersRequestConstraints(obj CatalogsProductGroupFiltersRequest) error {
	return nil
}