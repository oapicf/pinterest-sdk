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




type IntegrationLogsInvalidLogResponseRejectedLogsInner struct {

	// Index of the log in the batch.
	LogIndex int32 `json:"log_index,omitempty"`

	// The field name containing an invalid value.
	Field string `json:"field"`

	// The value that is invalid.
	Value string `json:"value"`

	// The reason the value is invalid.
	Reason string `json:"reason"`
}

// AssertIntegrationLogsInvalidLogResponseRejectedLogsInnerRequired checks if the required fields are not zero-ed
func AssertIntegrationLogsInvalidLogResponseRejectedLogsInnerRequired(obj IntegrationLogsInvalidLogResponseRejectedLogsInner) error {
	elements := map[string]interface{}{
		"field": obj.Field,
		"value": obj.Value,
		"reason": obj.Reason,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertIntegrationLogsInvalidLogResponseRejectedLogsInnerConstraints checks if the values respects the defined constraints
func AssertIntegrationLogsInvalidLogResponseRejectedLogsInnerConstraints(obj IntegrationLogsInvalidLogResponseRejectedLogsInner) error {
	return nil
}
