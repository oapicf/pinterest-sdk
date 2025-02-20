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




type LeadFormArrayResponseItemsInner struct {

	Data LeadFormResponse `json:"data,omitempty"`

	Exceptions []Exception `json:"exceptions,omitempty"`
}

// AssertLeadFormArrayResponseItemsInnerRequired checks if the required fields are not zero-ed
func AssertLeadFormArrayResponseItemsInnerRequired(obj LeadFormArrayResponseItemsInner) error {
	if err := AssertLeadFormResponseRequired(obj.Data); err != nil {
		return err
	}
	for _, el := range obj.Exceptions {
		if err := AssertExceptionRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertLeadFormArrayResponseItemsInnerConstraints checks if the values respects the defined constraints
func AssertLeadFormArrayResponseItemsInnerConstraints(obj LeadFormArrayResponseItemsInner) error {
	if err := AssertLeadFormResponseConstraints(obj.Data); err != nil {
		return err
	}
	for _, el := range obj.Exceptions {
		if err := AssertExceptionConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
