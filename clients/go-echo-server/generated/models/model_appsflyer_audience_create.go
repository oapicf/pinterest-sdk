package models

// AppsflyerAudienceCreate - Resource create operation model.
type AppsflyerAudienceCreate struct {

	// The name of the audience
	Name string `json:"name"`

	// The platform of the audience
	Platform AppsflyerPlatform `json:"platform"`
}
