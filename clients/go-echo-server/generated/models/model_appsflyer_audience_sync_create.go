package models

// AppsflyerAudienceSyncCreate - Resource create operation model.
type AppsflyerAudienceSyncCreate struct {

	// The container ID of the audience
	ContainerId string `json:"container_id"`

	// The pre-signed URL for SHA256 hashed GAID/IDFA file
	UrlAdidSha256 string `json:"url_adid_sha256,omitempty"`

	// The pre-signed URL for SHA256 hashed email file
	UrlEmailSha256 string `json:"url_email_sha256,omitempty"`
}
