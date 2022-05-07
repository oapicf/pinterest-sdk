package models

type Account struct {

	// Type of account
	AccountType string `json:"account_type,omitempty"`

	ProfileImage string `json:"profile_image,omitempty"`

	WebsiteUrl string `json:"website_url,omitempty"`

	Username string `json:"username,omitempty"`
}
