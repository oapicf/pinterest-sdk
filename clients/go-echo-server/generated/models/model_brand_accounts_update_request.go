package models

type BrandAccountsUpdateRequest struct {

	// Brand Account name
	Name string `json:"name,omitempty"`

	// Brand Account username
	Username string `json:"username,omitempty"`

	Country Country `json:"country,omitempty"`

	// Brand Account about information
	About string `json:"about,omitempty"`

	// Brand Account website
	Website string `json:"website,omitempty"`

	ProfileImage ImageBase64 `json:"profile_image,omitempty"`
}
