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




type RelatedTermsRelatedTermsListInner struct {

	Term string `json:"term,omitempty"`

	RelatedTerms []string `json:"related_terms,omitempty"`
}

// AssertRelatedTermsRelatedTermsListInnerRequired checks if the required fields are not zero-ed
func AssertRelatedTermsRelatedTermsListInnerRequired(obj RelatedTermsRelatedTermsListInner) error {
	return nil
}

// AssertRelatedTermsRelatedTermsListInnerConstraints checks if the values respects the defined constraints
func AssertRelatedTermsRelatedTermsListInnerConstraints(obj RelatedTermsRelatedTermsListInner) error {
	return nil
}
