package models

// AudienceDemographics - Audience demographics
type AudienceDemographics struct {

	// Ages distribution.
	Ages []AudienceDemographicValue `json:"ages,omitempty"`

	// Gender distribution.
	Genders []AudienceDemographicValue `json:"genders,omitempty"`

	// Device usage distribution.
	Devices []AudienceDemographicValue `json:"devices,omitempty"`

	// Geographic metro area distribution.
	Metros []AudienceDemographicValue `json:"metros,omitempty"`

	// Country area distribution.
	Countries []AudienceDemographicValue `json:"countries,omitempty"`
}
