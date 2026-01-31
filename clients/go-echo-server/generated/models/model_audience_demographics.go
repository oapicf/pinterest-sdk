package models

// AudienceDemographics - Audience demographics
type AudienceDemographics struct {

	// Ages distribution.
	Ages []AudienceDemographicValue `json:"ages,omitempty"`

	// Country area distribution.
	Countries []AudienceDemographicValue `json:"countries,omitempty"`

	// Device usage distribution.
	Devices []AudienceDemographicValue `json:"devices,omitempty"`

	// Gender distribution.
	Genders []AudienceDemographicValue `json:"genders,omitempty"`

	// Geographic metro area distribution.
	Metros []AudienceDemographicValue `json:"metros,omitempty"`
}
