/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




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

// AssertAudienceDemographicsRequired checks if the required fields are not zero-ed
func AssertAudienceDemographicsRequired(obj AudienceDemographics) error {
	for _, el := range obj.Ages {
		if err := AssertAudienceDemographicValueRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Genders {
		if err := AssertAudienceDemographicValueRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Devices {
		if err := AssertAudienceDemographicValueRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Metros {
		if err := AssertAudienceDemographicValueRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Countries {
		if err := AssertAudienceDemographicValueRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertAudienceDemographicsConstraints checks if the values respects the defined constraints
func AssertAudienceDemographicsConstraints(obj AudienceDemographics) error {
	return nil
}