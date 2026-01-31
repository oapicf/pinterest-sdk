package models

// GenderDemographics - Gender demographic distribution
type GenderDemographics struct {

	// Percentage of female users
	Female float32 `json:"female"`

	// Percentage of male users
	Male float32 `json:"male"`

	// Percentage of users with unspecified gender
	Unspecified float32 `json:"unspecified"`
}
