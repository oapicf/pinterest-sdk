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




type AdAccountOwner struct {

	// Public username for the user account
	Username string `json:"username,omitempty"`

	// The owning account's user ID.
	Id string `json:"id,omitempty"`
}

// AssertAdAccountOwnerRequired checks if the required fields are not zero-ed
func AssertAdAccountOwnerRequired(obj AdAccountOwner) error {
	return nil
}

// AssertAdAccountOwnerConstraints checks if the values respects the defined constraints
func AssertAdAccountOwnerConstraints(obj AdAccountOwner) error {
	return nil
}
