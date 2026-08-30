package models

// CampaignBatchWriteResponseModel - Response model for batch campaign write operations.
type CampaignBatchWriteResponseModel struct {

	Items []CampaignBatchItem `json:"items"`
}
