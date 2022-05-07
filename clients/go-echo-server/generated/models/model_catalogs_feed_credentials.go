package models

// CatalogsFeedCredentials - Use this if your feed file requires username and password.
type CatalogsFeedCredentials struct {

	// The required password for downloading a feed.
	Password string `json:"password"`

	// The required username for downloading a feed.
	Username string `json:"username"`
}
