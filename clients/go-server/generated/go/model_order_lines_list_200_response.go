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




type OrderLinesList200Response struct {

	Items []OrderLine `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}

// AssertOrderLinesList200ResponseRequired checks if the required fields are not zero-ed
func AssertOrderLinesList200ResponseRequired(obj OrderLinesList200Response) error {
	elements := map[string]interface{}{
		"items": obj.Items,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Items {
		if err := AssertOrderLineRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertOrderLinesList200ResponseConstraints checks if the values respects the defined constraints
func AssertOrderLinesList200ResponseConstraints(obj OrderLinesList200Response) error {
	for _, el := range obj.Items {
		if err := AssertOrderLineConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
