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




// PinMediaWithImageAndVideo - Pin with a mix of images and videos.
type PinMediaWithImageAndVideo struct {
	PinMedia

	Items []PinMediaMetadata `json:"items,omitempty"`
}

// AssertPinMediaWithImageAndVideoRequired checks if the required fields are not zero-ed
func AssertPinMediaWithImageAndVideoRequired(obj PinMediaWithImageAndVideo) error {
	if err := AssertPinMediaRequired(obj.PinMedia); err != nil {
		return err
	}

	for _, el := range obj.Items {
		if err := AssertPinMediaMetadataRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertPinMediaWithImageAndVideoConstraints checks if the values respects the defined constraints
func AssertPinMediaWithImageAndVideoConstraints(obj PinMediaWithImageAndVideo) error {
	return nil
}