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
	"errors"
)



type ImageDetails struct {

	Width int32 `json:"width"`

	Height *int32 `json:"height"`

	Url string `json:"url"`
}

// AssertImageDetailsRequired checks if the required fields are not zero-ed
func AssertImageDetailsRequired(obj ImageDetails) error {
	elements := map[string]interface{}{
		"width": obj.Width,
		"height": obj.Height,
		"url": obj.Url,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertImageDetailsConstraints checks if the values respects the defined constraints
func AssertImageDetailsConstraints(obj ImageDetails) error {
	if obj.Width < 100 {
		return &ParsingError{Param: "Width", Err: errors.New(errMsgMinValueConstraint)}
	}
	if obj.Height != nil && *obj.Height < 100 {
		return &ParsingError{Param: "Height", Err: errors.New(errMsgMinValueConstraint)}
	}
	return nil
}
