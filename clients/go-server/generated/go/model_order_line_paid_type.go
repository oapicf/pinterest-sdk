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


// OrderLinePaidType : Order Line Paid Type
type OrderLinePaidType string

// List of OrderLinePaidType
const (
	PAID OrderLinePaidType = "PAID"
	BONUS OrderLinePaidType = "BONUS"
	MAKE_GOOD OrderLinePaidType = "MAKE_GOOD"
	TEST OrderLinePaidType = "TEST"
)

// AllowedOrderLinePaidTypeEnumValues is all the allowed values of OrderLinePaidType enum
var AllowedOrderLinePaidTypeEnumValues = []OrderLinePaidType{
	"PAID",
	"BONUS",
	"MAKE_GOOD",
	"TEST",
}

// validOrderLinePaidTypeEnumValue provides a map of OrderLinePaidTypes for fast verification of use input
var validOrderLinePaidTypeEnumValues = map[OrderLinePaidType]struct{}{
	"PAID": {},
	"BONUS": {},
	"MAKE_GOOD": {},
	"TEST": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v OrderLinePaidType) IsValid() bool {
	_, ok := validOrderLinePaidTypeEnumValues[v]
	return ok
}

// NewOrderLinePaidTypeFromValue returns a pointer to a valid OrderLinePaidType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewOrderLinePaidTypeFromValue(v string) (OrderLinePaidType, error) {
	ev := OrderLinePaidType(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for OrderLinePaidType: valid values are %v", v, AllowedOrderLinePaidTypeEnumValues)
}



// AssertOrderLinePaidTypeRequired checks if the required fields are not zero-ed
func AssertOrderLinePaidTypeRequired(obj OrderLinePaidType) error {
	return nil
}

// AssertOrderLinePaidTypeConstraints checks if the values respects the defined constraints
func AssertOrderLinePaidTypeConstraints(obj OrderLinePaidType) error {
	return nil
}
