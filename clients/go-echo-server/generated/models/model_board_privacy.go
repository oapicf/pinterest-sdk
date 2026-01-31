package models

type BoardPrivacy string

// List of BoardPrivacy
const (
	PUBLIC BoardPrivacy = "PUBLIC"
	PROTECTED BoardPrivacy = "PROTECTED"
	SECRET BoardPrivacy = "SECRET"
)
