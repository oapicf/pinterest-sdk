package models

type CampaignsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []Campaign `json:"items"`
}
