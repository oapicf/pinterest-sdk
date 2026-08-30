package models

// AppsflyerAudience - Request model for creating an AppsFlyer audience
type AppsflyerAudience struct {

	// The ID of the audience container
	ContainerId string `json:"container_id"`

	// The name of the audience
	Name string `json:"name"`

	// The platform of the audience
	Platform AppsflyerPlatform `json:"platform"`
}
