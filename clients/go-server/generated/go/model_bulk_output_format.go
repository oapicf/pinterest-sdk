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
	"fmt"
)


// BulkOutputFormat : Bulk file output format
type BulkOutputFormat string

// List of BulkOutputFormat
const (
	CSV BulkOutputFormat = "CSV"
	JSON BulkOutputFormat = "JSON"
)

// AllowedBulkOutputFormatEnumValues is all the allowed values of BulkOutputFormat enum
var AllowedBulkOutputFormatEnumValues = []BulkOutputFormat{
	"CSV",
	"JSON",
}

// validBulkOutputFormatEnumValue provides a map of BulkOutputFormats for fast verification of use input
var validBulkOutputFormatEnumValues = map[BulkOutputFormat]struct{}{
	"CSV": {},
	"JSON": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v BulkOutputFormat) IsValid() bool {
	_, ok := validBulkOutputFormatEnumValues[v]
	return ok
}

// NewBulkOutputFormatFromValue returns a pointer to a valid BulkOutputFormat
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewBulkOutputFormatFromValue(v string) (BulkOutputFormat, error) {
	ev := BulkOutputFormat(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for BulkOutputFormat: valid values are %v", v, AllowedBulkOutputFormatEnumValues)
}



// AssertBulkOutputFormatRequired checks if the required fields are not zero-ed
func AssertBulkOutputFormatRequired(obj BulkOutputFormat) error {
	return nil
}

// AssertBulkOutputFormatConstraints checks if the values respects the defined constraints
func AssertBulkOutputFormatConstraints(obj BulkOutputFormat) error {
	return nil
}
