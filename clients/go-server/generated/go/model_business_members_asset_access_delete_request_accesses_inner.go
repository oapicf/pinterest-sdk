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




type BusinessMembersAssetAccessDeleteRequestAccessesInner struct {

	// Id of the asset on which to remove member permissions.
	AssetId string `json:"asset_id" validate:"regexp=^\\\\d+$"`

	// Unique identifier of the member on which to perform the asset permission removal
	MemberId string `json:"member_id" validate:"regexp=^\\\\d+$"`
}

// AssertBusinessMembersAssetAccessDeleteRequestAccessesInnerRequired checks if the required fields are not zero-ed
func AssertBusinessMembersAssetAccessDeleteRequestAccessesInnerRequired(obj BusinessMembersAssetAccessDeleteRequestAccessesInner) error {
	elements := map[string]interface{}{
		"asset_id": obj.AssetId,
		"member_id": obj.MemberId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertBusinessMembersAssetAccessDeleteRequestAccessesInnerConstraints checks if the values respects the defined constraints
func AssertBusinessMembersAssetAccessDeleteRequestAccessesInnerConstraints(obj BusinessMembersAssetAccessDeleteRequestAccessesInner) error {
	return nil
}
