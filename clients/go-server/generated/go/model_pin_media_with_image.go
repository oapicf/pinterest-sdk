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




// PinMediaWithImage - Pin with image.
type PinMediaWithImage struct {

	Images PinMediaWithImageAllOfImages `json:"images,omitempty"`
}

// AssertPinMediaWithImageRequired checks if the required fields are not zero-ed
func AssertPinMediaWithImageRequired(obj PinMediaWithImage) error {
	if err := AssertPinMediaWithImageAllOfImagesRequired(obj.Images); err != nil {
		return err
	}
	return nil
}

// AssertPinMediaWithImageConstraints checks if the values respects the defined constraints
func AssertPinMediaWithImageConstraints(obj PinMediaWithImage) error {
	if err := AssertPinMediaWithImageAllOfImagesConstraints(obj.Images); err != nil {
		return err
	}
	return nil
}
