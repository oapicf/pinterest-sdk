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




// CatalogsRetailBatchRequest - A request object that can have multiple operations on a single retail batch
type CatalogsRetailBatchRequest struct {

	CatalogType string `json:"catalog_type"`

	Country Country `json:"country"`

	Language CatalogsItemsRequestLanguage `json:"language"`

	// Array with catalogs item operations
	Items []CatalogsRetailBatchRequestItemsInner `json:"items"`
}

// AssertCatalogsRetailBatchRequestRequired checks if the required fields are not zero-ed
func AssertCatalogsRetailBatchRequestRequired(obj CatalogsRetailBatchRequest) error {
	elements := map[string]interface{}{
		"catalog_type": obj.CatalogType,
		"country": obj.Country,
		"language": obj.Language,
		"items": obj.Items,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertCatalogsItemsRequestLanguageRequired(obj.Language); err != nil {
		return err
	}
	for _, el := range obj.Items {
		if err := AssertCatalogsRetailBatchRequestItemsInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCatalogsRetailBatchRequestConstraints checks if the values respects the defined constraints
func AssertCatalogsRetailBatchRequestConstraints(obj CatalogsRetailBatchRequest) error {
	if err := AssertCatalogsItemsRequestLanguageConstraints(obj.Language); err != nil {
		return err
	}
	for _, el := range obj.Items {
		if err := AssertCatalogsRetailBatchRequestItemsInnerConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
