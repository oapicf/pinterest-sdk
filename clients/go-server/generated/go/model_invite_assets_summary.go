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




// InviteAssetsSummary - Ad accounts and profiles the member/partner will be granted access to with this invite/request.
type InviteAssetsSummary struct {

	// List of ad account IDs and respective permission levels that will be assigned.
	AdAccounts []InviteAssetsSummaryAdAccountsInner `json:"ad_accounts,omitempty"`

	// List of profile IDs and respective permission levels that will be assigned.
	Profiles []InviteAssetsSummaryProfilesInner `json:"profiles,omitempty"`
}

// AssertInviteAssetsSummaryRequired checks if the required fields are not zero-ed
func AssertInviteAssetsSummaryRequired(obj InviteAssetsSummary) error {
	for _, el := range obj.AdAccounts {
		if err := AssertInviteAssetsSummaryAdAccountsInnerRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Profiles {
		if err := AssertInviteAssetsSummaryProfilesInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertInviteAssetsSummaryConstraints checks if the values respects the defined constraints
func AssertInviteAssetsSummaryConstraints(obj InviteAssetsSummary) error {
	for _, el := range obj.AdAccounts {
		if err := AssertInviteAssetsSummaryAdAccountsInnerConstraints(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Profiles {
		if err := AssertInviteAssetsSummaryProfilesInnerConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
