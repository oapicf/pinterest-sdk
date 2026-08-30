package models

// IneligibleProductTagsErrorDetails - Details about ineligible product tags in the request.
type IneligibleProductTagsErrorDetails struct {

	// List of product tags that failed eligibility check.
	ProductTags []IneligibleProductTagErrorItem `json:"product_tags"`
}
