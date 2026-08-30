package models

// BulkCampaignDeliveryEstimatesResponse - Bulk campaign delivery estimates response.
type BulkCampaignDeliveryEstimatesResponse struct {

	// Per-campaign delivery estimate results, in the same order as the request.
	Data []BulkCampaignDeliveryEstimatesItem `json:"data"`
}
