package models

// InviteAssetsSummary - Ad accounts and profiles the member/partner will be granted access to with this invite/request.
type InviteAssetsSummary struct {

	// List of ad account IDs and respective permission levels that will be assigned.
	AdAccounts []InviteAssetsSummaryItem `json:"ad_accounts,omitempty"`

	// List of profile IDs and respective permission levels that will be assigned.
	Profiles []InviteAssetsSummaryItem `json:"profiles,omitempty"`
}
