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




// DeleteMemberAccessResult - The terminated asset access.
type DeleteMemberAccessResult struct {

	// Unique identifier of the business asset.
	AssetId string `json:"asset_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Unique identifier of the business member.
	MemberId string `json:"member_id,omitempty" validate:"regexp=^\\\\d+$"`
}

// AssertDeleteMemberAccessResultRequired checks if the required fields are not zero-ed
func AssertDeleteMemberAccessResultRequired(obj DeleteMemberAccessResult) error {
	return nil
}

// AssertDeleteMemberAccessResultConstraints checks if the values respects the defined constraints
func AssertDeleteMemberAccessResultConstraints(obj DeleteMemberAccessResult) error {
	return nil
}
