package models

// BusinessMemberAssetsSummary - Ad accounts and profiles the business member/partner has access to.
type BusinessMemberAssetsSummary struct {

	// List of ad account IDs and respective permission levels.
	AdAccounts []BusinessMemberAssetsSummaryAdAccountsInner `json:"ad_accounts,omitempty"`

	// List of profile IDs and respective permission levels.
	Profiles []BusinessMemberAssetsSummaryProfilesInner `json:"profiles,omitempty"`
}
