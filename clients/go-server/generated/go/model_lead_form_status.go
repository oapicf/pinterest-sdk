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


import (
	"fmt"
)


// LeadFormStatus : Status of the lead form
type LeadFormStatus string

// List of LeadFormStatus
const (
	DRAFT LeadFormStatus = "DRAFT"
	ACTIVE LeadFormStatus = "ACTIVE"
)

// AllowedLeadFormStatusEnumValues is all the allowed values of LeadFormStatus enum
var AllowedLeadFormStatusEnumValues = []LeadFormStatus{
	"DRAFT",
	"ACTIVE",
}

// validLeadFormStatusEnumValue provides a map of LeadFormStatuss for fast verification of use input
var validLeadFormStatusEnumValues = map[LeadFormStatus]struct{}{
	"DRAFT": {},
	"ACTIVE": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v LeadFormStatus) IsValid() bool {
	_, ok := validLeadFormStatusEnumValues[v]
	return ok
}

// NewLeadFormStatusFromValue returns a pointer to a valid LeadFormStatus
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewLeadFormStatusFromValue(v string) (LeadFormStatus, error) {
	ev := LeadFormStatus(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for LeadFormStatus: valid values are %v", v, AllowedLeadFormStatusEnumValues)
	}
}



// AssertLeadFormStatusRequired checks if the required fields are not zero-ed
func AssertLeadFormStatusRequired(obj LeadFormStatus) error {
	return nil
}

// AssertLeadFormStatusConstraints checks if the values respects the defined constraints
func AssertLeadFormStatusConstraints(obj LeadFormStatus) error {
	return nil
}