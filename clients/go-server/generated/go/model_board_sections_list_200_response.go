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




type BoardSectionsList200Response struct {

	// Board sections
	Items []BoardSection `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}

// AssertBoardSectionsList200ResponseRequired checks if the required fields are not zero-ed
func AssertBoardSectionsList200ResponseRequired(obj BoardSectionsList200Response) error {
	elements := map[string]interface{}{
		"items": obj.Items,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Items {
		if err := AssertBoardSectionRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertBoardSectionsList200ResponseConstraints checks if the values respects the defined constraints
func AssertBoardSectionsList200ResponseConstraints(obj BoardSectionsList200Response) error {
	for _, el := range obj.Items {
		if err := AssertBoardSectionConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
