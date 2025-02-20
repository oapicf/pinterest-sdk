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




type ConversionEventResponse struct {

	ConversionEvent ConversionTagType `json:"conversion_event,omitempty"`

	// Id of the tag.
	ConversionTagId string `json:"conversion_tag_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Id of the ad account.
	AdAccountId string `json:"ad_account_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Creation date in epoch format.
	CreatedTime int32 `json:"created_time,omitempty"`
}

// AssertConversionEventResponseRequired checks if the required fields are not zero-ed
func AssertConversionEventResponseRequired(obj ConversionEventResponse) error {
	return nil
}

// AssertConversionEventResponseConstraints checks if the values respects the defined constraints
func AssertConversionEventResponseConstraints(obj ConversionEventResponse) error {
	return nil
}
