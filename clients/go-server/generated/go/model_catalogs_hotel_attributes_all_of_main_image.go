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




// CatalogsHotelAttributesAllOfMainImage - The main hotel image
type CatalogsHotelAttributesAllOfMainImage struct {

	// <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>
	Link string `json:"link,omitempty"`

	// Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
	Tag *[]string `json:"tag,omitempty"`
}

// AssertCatalogsHotelAttributesAllOfMainImageRequired checks if the required fields are not zero-ed
func AssertCatalogsHotelAttributesAllOfMainImageRequired(obj CatalogsHotelAttributesAllOfMainImage) error {
	return nil
}

// AssertCatalogsHotelAttributesAllOfMainImageConstraints checks if the values respects the defined constraints
func AssertCatalogsHotelAttributesAllOfMainImageConstraints(obj CatalogsHotelAttributesAllOfMainImage) error {
	return nil
}
