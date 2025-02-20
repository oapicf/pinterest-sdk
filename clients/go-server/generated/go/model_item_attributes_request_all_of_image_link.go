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


import (
	"gopkg.in/validator.v2"
)



// ItemAttributesRequestAllOfImageLink - <p><= 2000 characters</p> <p>The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>
type ItemAttributesRequestAllOfImageLink struct {
}

// AssertItemAttributesRequestAllOfImageLinkRequired checks if the required fields are not zero-ed
func AssertItemAttributesRequestAllOfImageLinkRequired(obj ItemAttributesRequestAllOfImageLink) error {
	return nil
}

// AssertItemAttributesRequestAllOfImageLinkConstraints checks if the values respects the defined constraints
func AssertItemAttributesRequestAllOfImageLinkConstraints(obj ItemAttributesRequestAllOfImageLink) error {
	return nil
}
