package models

type CampaignsList200Response struct {

	Items []CampaignResponse `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
