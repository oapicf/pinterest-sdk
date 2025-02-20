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


import (
	"gopkg.in/validator.v2"
)



// CatalogsVerticalFeedsUpdateRequest - Request object for updating a feed.
type CatalogsVerticalFeedsUpdateRequest struct {

	DefaultCurrency *NullableCurrency `json:"default_currency,omitempty"`

	// A human-friendly name associated to a given feed.
	Name string `json:"name,omitempty"`

	Format CatalogsFormat `json:"format,omitempty"`

	Credentials *CatalogsFeedCredentials `json:"credentials,omitempty"`

	// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
	Location string `json:"location,omitempty"`

	PreferredProcessingSchedule *CatalogsFeedProcessingSchedule `json:"preferred_processing_schedule,omitempty"`

	Status CatalogsStatus `json:"status,omitempty"`

	CatalogType CatalogsType `json:"catalog_type"`

	DefaultAvailability *ProductAvailabilityType `json:"default_availability,omitempty"`
}

// AssertCatalogsVerticalFeedsUpdateRequestRequired checks if the required fields are not zero-ed
func AssertCatalogsVerticalFeedsUpdateRequestRequired(obj CatalogsVerticalFeedsUpdateRequest) error {
	elements := map[string]interface{}{
		"catalog_type": obj.CatalogType,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if obj.Credentials != nil {
		if err := AssertCatalogsFeedCredentialsRequired(*obj.Credentials); err != nil {
			return err
		}
	}
	if obj.PreferredProcessingSchedule != nil {
		if err := AssertCatalogsFeedProcessingScheduleRequired(*obj.PreferredProcessingSchedule); err != nil {
			return err
		}
	}
	return nil
}

// AssertCatalogsVerticalFeedsUpdateRequestConstraints checks if the values respects the defined constraints
func AssertCatalogsVerticalFeedsUpdateRequestConstraints(obj CatalogsVerticalFeedsUpdateRequest) error {
    if obj.Credentials != nil {
     	if err := AssertCatalogsFeedCredentialsConstraints(*obj.Credentials); err != nil {
     		return err
     	}
    }
    if obj.PreferredProcessingSchedule != nil {
     	if err := AssertCatalogsFeedProcessingScheduleConstraints(*obj.PreferredProcessingSchedule); err != nil {
     		return err
     	}
    }
	return nil
}
