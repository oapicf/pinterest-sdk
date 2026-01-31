package models

type BoardPrivacyFilter string

// List of BoardPrivacyFilter
const (
	ALL BoardPrivacyFilter = "ALL"
	PUBLIC BoardPrivacyFilter = "PUBLIC"
	PROTECTED BoardPrivacyFilter = "PROTECTED"
	SECRET BoardPrivacyFilter = "SECRET"
	PUBLIC_AND_SECRET BoardPrivacyFilter = "PUBLIC_AND_SECRET"
)
