package models

// CampaignBatchItem - Item in a batch campaign response.
type CampaignBatchItem struct {

	// Campaign data on success.
	Data CampaignBatchResponseData `json:"data,omitempty"`

	// Exceptions on failure.
	Exceptions []Exception `json:"exceptions,omitempty"`
}
