package models

// CampaignPlanningResponseError - Error encountered while estimating delivery for a campaign.
type CampaignPlanningResponseError struct {

	Code CampaignPlanningResponseErrorCode `json:"code,omitempty"`

	// Human-readable error message.
	Message string `json:"message,omitempty"`
}
