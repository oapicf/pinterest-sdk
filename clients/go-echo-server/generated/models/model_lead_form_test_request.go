package models

// LeadFormTestRequest - Request to create test data for lead data test API.
type LeadFormTestRequest struct {

	// Test lead answers. Should follow the creation order.
	Answers []string `json:"answers"`
}
