/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// PinMediaSourceImagesBase64 - Multiple Base64-encoded images media source
type PinMediaSourceImagesBase64 struct {

	SourceType string `json:"source_type,omitempty"`

	// Array with image objects.
	Items []PinMediaSourceImagesBase64ItemsInner `json:"items"`

	Index int32 `json:"index,omitempty"`
}
