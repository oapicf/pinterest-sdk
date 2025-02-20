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




type CatalogsFeedIngestionDetails struct {

	Errors CatalogsFeedIngestionErrors `json:"errors"`

	Info CatalogsFeedIngestionInfo `json:"info"`

	Warnings CatalogsFeedIngestionWarnings `json:"warnings"`
}

// AssertCatalogsFeedIngestionDetailsRequired checks if the required fields are not zero-ed
func AssertCatalogsFeedIngestionDetailsRequired(obj CatalogsFeedIngestionDetails) error {
	elements := map[string]interface{}{
		"errors": obj.Errors,
		"info": obj.Info,
		"warnings": obj.Warnings,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertCatalogsFeedIngestionErrorsRequired(obj.Errors); err != nil {
		return err
	}
	if err := AssertCatalogsFeedIngestionInfoRequired(obj.Info); err != nil {
		return err
	}
	if err := AssertCatalogsFeedIngestionWarningsRequired(obj.Warnings); err != nil {
		return err
	}
	return nil
}

// AssertCatalogsFeedIngestionDetailsConstraints checks if the values respects the defined constraints
func AssertCatalogsFeedIngestionDetailsConstraints(obj CatalogsFeedIngestionDetails) error {
	if err := AssertCatalogsFeedIngestionErrorsConstraints(obj.Errors); err != nil {
		return err
	}
	if err := AssertCatalogsFeedIngestionInfoConstraints(obj.Info); err != nil {
		return err
	}
	if err := AssertCatalogsFeedIngestionWarningsConstraints(obj.Warnings); err != nil {
		return err
	}
	return nil
}
