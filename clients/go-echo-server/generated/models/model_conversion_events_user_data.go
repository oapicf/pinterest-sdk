package models

// ConversionEventsUserData - Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
type ConversionEventsUserData struct {

	// Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
	Ph []string `json:"ph,omitempty"`

	// Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender.
	Ge []string `json:"ge,omitempty"`

	// Sha256 hashes of user's date of birthday, given as year, month, and day.
	Db []string `json:"db,omitempty"`

	// Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
	Ln []string `json:"ln,omitempty"`

	// Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
	Fn []string `json:"fn,omitempty"`

	// Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing).
	Ct []string `json:"ct,omitempty"`

	// Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing).
	St []string `json:"st,omitempty"`

	// Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing).
	Zp []string `json:"zp,omitempty"`

	// Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase.
	Country []string `json:"country,omitempty"`

	// Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA.
	ExternalId []string `json:"external_id,omitempty"`

	// The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
	ClickId *string `json:"click_id,omitempty"`

	// A unique identifier of visitors' information defined by third party partners. e.g RampID
	PartnerId *string `json:"partner_id,omitempty"`
}
