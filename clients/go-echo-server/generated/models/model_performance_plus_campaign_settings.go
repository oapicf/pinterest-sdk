package models

// PerformancePlusCampaignSettings - Pinterest Performance+ campaign settings.
type PerformancePlusCampaignSettings struct {

	// Whether to boost prospecting ad group bid.
	BoostProspectingAdGroupBid bool `json:"boost_prospecting_ad_group_bid,omitempty"`

	// List of campaign-level exclusion pinner list IDs.
	PinnerListExclusions []string `json:"pinner_list_exclusions,omitempty"`
}
