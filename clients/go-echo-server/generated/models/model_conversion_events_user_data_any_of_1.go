package models

type ConversionEventsUserDataAnyOf1 struct {

	// Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	Em []string `json:"em,omitempty"`

	// Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	HashedMaids []string `json:"hashed_maids"`

	// The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
	ClientIpAddress string `json:"client_ip_address,omitempty"`

	// The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
	ClientUserAgent string `json:"client_user_agent,omitempty"`
}
