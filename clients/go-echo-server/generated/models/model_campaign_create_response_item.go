package models

type CampaignCreateResponseItem struct {

	Data CampaignCreateResponseData `json:"data,omitempty"`

	Exceptions []Exception `json:"exceptions,omitempty"`
}
