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




// CatalogsRetailItemErrorResponse - Object describing a retail item error
type CatalogsRetailItemErrorResponse struct {

	CatalogType CatalogsType `json:"catalog_type"`

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id,omitempty"`

	// Array with the errors for the item id requested
	Errors []ItemValidationEvent `json:"errors,omitempty"`
}

// AssertCatalogsRetailItemErrorResponseRequired checks if the required fields are not zero-ed
func AssertCatalogsRetailItemErrorResponseRequired(obj CatalogsRetailItemErrorResponse) error {
	elements := map[string]interface{}{
		"catalog_type": obj.CatalogType,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Errors {
		if err := AssertItemValidationEventRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCatalogsRetailItemErrorResponseConstraints checks if the values respects the defined constraints
func AssertCatalogsRetailItemErrorResponseConstraints(obj CatalogsRetailItemErrorResponse) error {
	for _, el := range obj.Errors {
		if err := AssertItemValidationEventConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
