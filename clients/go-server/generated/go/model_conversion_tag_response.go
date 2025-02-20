// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




type ConversionTagResponse struct {

	// Ad account ID.
	AdAccountId string `json:"ad_account_id,omitempty"`

	// Tag code snippet.
	CodeSnippet string `json:"code_snippet,omitempty"`

	EnhancedMatchStatus *EnhancedMatchStatusType `json:"enhanced_match_status,omitempty"`

	// Tag ID.
	Id string `json:"id,omitempty"`

	// Time for the last event fired.
	LastFiredTimeMs *float32 `json:"last_fired_time_ms,omitempty"`

	// Conversion tag name.
	Name string `json:"name,omitempty"`

	Status EntityStatus `json:"status,omitempty"`

	// Version number.
	Version string `json:"version,omitempty"`

	Configs ConversionTagConfigs `json:"configs,omitempty"`
}

// AssertConversionTagResponseRequired checks if the required fields are not zero-ed
func AssertConversionTagResponseRequired(obj ConversionTagResponse) error {
	if err := AssertConversionTagConfigsRequired(obj.Configs); err != nil {
		return err
	}
	return nil
}

// AssertConversionTagResponseConstraints checks if the values respects the defined constraints
func AssertConversionTagResponseConstraints(obj ConversionTagResponse) error {
	if err := AssertConversionTagConfigsConstraints(obj.Configs); err != nil {
		return err
	}
	return nil
}
