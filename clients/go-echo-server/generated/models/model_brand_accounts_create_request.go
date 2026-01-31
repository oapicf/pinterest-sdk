package models

type BrandAccountsCreateRequest struct {

	// Brand Account name
	Name string `json:"name"`

	// Brand Account username
	Username string `json:"username"`

	Country Country `json:"country"`

	// Brand Account about information
	About string `json:"about,omitempty"`

	// Brand Account website
	Website string `json:"website,omitempty"`

	ProfileImage ImageBase64 `json:"profile_image,omitempty"`
}
