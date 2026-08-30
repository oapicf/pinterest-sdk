package models
// AdReviewStatus : Ad review status
type AdReviewStatus string

// List of AdReviewStatus
const (
	OTHER AdReviewStatus = "OTHER"
	PENDING AdReviewStatus = "PENDING"
	REJECTED AdReviewStatus = "REJECTED"
	APPROVED AdReviewStatus = "APPROVED"
)
