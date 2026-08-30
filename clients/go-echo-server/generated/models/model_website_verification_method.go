package models
// WebsiteVerificationMethod : Method used to verify website ownership.
type WebsiteVerificationMethod string

// List of WebsiteVerificationMethod
const (
	FILENAME WebsiteVerificationMethod = "FILENAME"
	METATAG WebsiteVerificationMethod = "METATAG"
	DNSTXT WebsiteVerificationMethod = "DNSTXT"
)
