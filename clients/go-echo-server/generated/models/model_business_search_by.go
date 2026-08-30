package models
// BusinessSearchBy : The names of fields that business accounts are searched by
type BusinessSearchBy string

// List of BusinessSearchBy
const (
	FULL_NAME BusinessSearchBy = "FULL_NAME"
	USERNAME BusinessSearchBy = "USERNAME"
	BUSINESS_ID BusinessSearchBy = "BUSINESS_ID"
	EMAIL BusinessSearchBy = "EMAIL"
)
