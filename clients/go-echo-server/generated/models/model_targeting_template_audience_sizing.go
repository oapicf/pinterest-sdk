package models

// TargetingTemplateAudienceSizing - Gets an audience size estimate for a set of given targeting spec data. <p>Returns:</p> An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. 
type TargetingTemplateAudienceSizing struct {

	ReachEstimate TargetingTemplateAudienceSizingReachEstimate `json:"reach_estimate,omitempty"`
}
