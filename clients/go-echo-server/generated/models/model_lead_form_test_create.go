package models

// LeadFormTestCreate - Resource create operation model.
type LeadFormTestCreate struct {

	// Test lead answers. Should follow the creation order.
	Answers []string `json:"answers"`
}
