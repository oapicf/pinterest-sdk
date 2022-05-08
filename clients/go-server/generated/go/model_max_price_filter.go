/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.3.0
 * Contact: pinterest-api@pinterest.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type MaxPriceFilter struct {

	MAX_PRICE CatalogsProductGroupPricingCriteria `json:"MAX_PRICE"`
}

// AssertMaxPriceFilterRequired checks if the required fields are not zero-ed
func AssertMaxPriceFilterRequired(obj MaxPriceFilter) error {
	elements := map[string]interface{}{
		"MAX_PRICE": obj.MAX_PRICE,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertRecurseMaxPriceFilterRequired recursively checks if required fields are not zero-ed in a nested slice.
// Accepts only nested slice of MaxPriceFilter (e.g. [][]MaxPriceFilter), otherwise ErrTypeAssertionError is thrown.
func AssertRecurseMaxPriceFilterRequired(objSlice interface{}) error {
	return AssertRecurseInterfaceRequired(objSlice, func(obj interface{}) error {
		aMaxPriceFilter, ok := obj.(MaxPriceFilter)
		if !ok {
			return ErrTypeAssertionError
		}
		return AssertMaxPriceFilterRequired(aMaxPriceFilter)
	})
}