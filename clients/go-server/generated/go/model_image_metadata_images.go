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




type ImageMetadataImages struct {

	Var150x150 ImageDetails `json:"150x150,omitempty"`

	Var400x300 ImageDetails `json:"400x300,omitempty"`

	Var600x ImageDetails `json:"600x,omitempty"`

	Var1200x ImageDetails `json:"1200x,omitempty"`
}

// AssertImageMetadataImagesRequired checks if the required fields are not zero-ed
func AssertImageMetadataImagesRequired(obj ImageMetadataImages) error {
	return nil
}

// AssertImageMetadataImagesConstraints checks if the values respects the defined constraints
func AssertImageMetadataImagesConstraints(obj ImageMetadataImages) error {
	return nil
}