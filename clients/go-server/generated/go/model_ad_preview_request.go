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




type AdPreviewRequest struct {

	// Image URL.
	ImageUrl string `json:"image_url"`

	// Title displayed below ad.
	Title string `json:"title"`

	// Pin ID.
	PinId string `json:"pin_id"`
}

// AssertAdPreviewRequestRequired checks if the required fields are not zero-ed
func AssertAdPreviewRequestRequired(obj AdPreviewRequest) error {
	elements := map[string]interface{}{
		"image_url": obj.ImageUrl,
		"title": obj.Title,
		"pin_id": obj.PinId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertAdPreviewRequestConstraints checks if the values respects the defined constraints
func AssertAdPreviewRequestConstraints(obj AdPreviewRequest) error {
	return nil
}