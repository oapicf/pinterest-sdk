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




// ConversionEvents - A list of events (one or more) encapsulated by a data object.
type ConversionEvents struct {

	Data []ConversionEventsDataInner `json:"data"`
}

// AssertConversionEventsRequired checks if the required fields are not zero-ed
func AssertConversionEventsRequired(obj ConversionEvents) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Data {
		if err := AssertConversionEventsDataInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertConversionEventsConstraints checks if the values respects the defined constraints
func AssertConversionEventsConstraints(obj ConversionEvents) error {
	for _, el := range obj.Data {
		if err := AssertConversionEventsDataInnerConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
