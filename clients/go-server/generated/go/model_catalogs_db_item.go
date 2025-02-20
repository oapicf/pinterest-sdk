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
	"time"
)



type CatalogsDbItem struct {

	CreatedAt time.Time `json:"created_at"`

	Id string `json:"id"`

	UpdatedAt time.Time `json:"updated_at"`
}

// AssertCatalogsDbItemRequired checks if the required fields are not zero-ed
func AssertCatalogsDbItemRequired(obj CatalogsDbItem) error {
	elements := map[string]interface{}{
		"created_at": obj.CreatedAt,
		"id": obj.Id,
		"updated_at": obj.UpdatedAt,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertCatalogsDbItemConstraints checks if the values respects the defined constraints
func AssertCatalogsDbItemConstraints(obj CatalogsDbItem) error {
	return nil
}
