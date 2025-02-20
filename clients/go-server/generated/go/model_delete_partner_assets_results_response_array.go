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




type DeletePartnerAssetsResultsResponseArray struct {

	// List of terminated asset access.
	Items []DeletePartnerAssetsResult `json:"items,omitempty"`
}

// AssertDeletePartnerAssetsResultsResponseArrayRequired checks if the required fields are not zero-ed
func AssertDeletePartnerAssetsResultsResponseArrayRequired(obj DeletePartnerAssetsResultsResponseArray) error {
	return nil
}

// AssertDeletePartnerAssetsResultsResponseArrayConstraints checks if the values respects the defined constraints
func AssertDeletePartnerAssetsResultsResponseArrayConstraints(obj DeletePartnerAssetsResultsResponseArray) error {
	return nil
}
