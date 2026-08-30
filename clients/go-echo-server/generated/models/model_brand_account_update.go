package models

// BrandAccountUpdate - Resource create or update operation model.
type BrandAccountUpdate struct {

	// Brand Account about information
	About string `json:"about,omitempty"`

	Country Country `json:"country,omitempty"`

	// Brand Account name
	Name string `json:"name,omitempty"`

	ProfileImage BrandAccountProfileImageUpdate `json:"profile_image,omitempty"`

	// Brand Account username
	Username string `json:"username,omitempty"`

	// Brand Account website
	Website string `json:"website,omitempty"`
}
