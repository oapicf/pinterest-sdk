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




// MediaUploadRequest - Media upload request
type MediaUploadRequest struct {

	MediaType MediaUploadType `json:"media_type"`
}

// AssertMediaUploadRequestRequired checks if the required fields are not zero-ed
func AssertMediaUploadRequestRequired(obj MediaUploadRequest) error {
	elements := map[string]interface{}{
		"media_type": obj.MediaType,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertMediaUploadRequestConstraints checks if the values respects the defined constraints
func AssertMediaUploadRequestConstraints(obj MediaUploadRequest) error {
	return nil
}
