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




// PinMediaWithVideos - Pin with multiple videos.
type PinMediaWithVideos struct {

	Items []VideoMetadata `json:"items,omitempty"`
}

// AssertPinMediaWithVideosRequired checks if the required fields are not zero-ed
func AssertPinMediaWithVideosRequired(obj PinMediaWithVideos) error {
	for _, el := range obj.Items {
		if err := AssertVideoMetadataRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertPinMediaWithVideosConstraints checks if the values respects the defined constraints
func AssertPinMediaWithVideosConstraints(obj PinMediaWithVideos) error {
	for _, el := range obj.Items {
		if err := AssertVideoMetadataConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
