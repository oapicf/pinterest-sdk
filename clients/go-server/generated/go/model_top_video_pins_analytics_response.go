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




type TopVideoPinsAnalyticsResponse struct {

	DateAvailability TopPinsAnalyticsResponseDateAvailability `json:"date_availability,omitempty"`

	Pins []TopVideoPinsAnalyticsResponsePinsInner `json:"pins,omitempty"`

	SortBy string `json:"sort_by,omitempty"`
}

// AssertTopVideoPinsAnalyticsResponseRequired checks if the required fields are not zero-ed
func AssertTopVideoPinsAnalyticsResponseRequired(obj TopVideoPinsAnalyticsResponse) error {
	if err := AssertTopPinsAnalyticsResponseDateAvailabilityRequired(obj.DateAvailability); err != nil {
		return err
	}
	for _, el := range obj.Pins {
		if err := AssertTopVideoPinsAnalyticsResponsePinsInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertTopVideoPinsAnalyticsResponseConstraints checks if the values respects the defined constraints
func AssertTopVideoPinsAnalyticsResponseConstraints(obj TopVideoPinsAnalyticsResponse) error {
	if err := AssertTopPinsAnalyticsResponseDateAvailabilityConstraints(obj.DateAvailability); err != nil {
		return err
	}
	for _, el := range obj.Pins {
		if err := AssertTopVideoPinsAnalyticsResponsePinsInnerConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
