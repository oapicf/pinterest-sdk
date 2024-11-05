package models

type CampaignId struct {

	// Campaign ID.
	Id string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`
}
