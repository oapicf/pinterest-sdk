package models

// BrandAccountCreate - Resource create operation model.
type BrandAccountCreate struct {

	// Brand Account about information
	About string `json:"about,omitempty"`

	Country Country `json:"country"`

	// Brand Account name
	Name string `json:"name"`

	ProfileImage BrandAccountProfileImage `json:"profile_image,omitempty"`

	// Brand Account username
	Username string `json:"username"`

	// Brand Account website
	Website string `json:"website,omitempty"`
}
