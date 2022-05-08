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

type ConditionFilter struct {

	CONDITION CatalogsProductGroupMultipleStringCriteria `json:"CONDITION"`
}

// AssertConditionFilterRequired checks if the required fields are not zero-ed
func AssertConditionFilterRequired(obj ConditionFilter) error {
	elements := map[string]interface{}{
		"CONDITION": obj.CONDITION,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertRecurseConditionFilterRequired recursively checks if required fields are not zero-ed in a nested slice.
// Accepts only nested slice of ConditionFilter (e.g. [][]ConditionFilter), otherwise ErrTypeAssertionError is thrown.
func AssertRecurseConditionFilterRequired(objSlice interface{}) error {
	return AssertRecurseInterfaceRequired(objSlice, func(obj interface{}) error {
		aConditionFilter, ok := obj.(ConditionFilter)
		if !ok {
			return ErrTypeAssertionError
		}
		return AssertConditionFilterRequired(aConditionFilter)
	})
}