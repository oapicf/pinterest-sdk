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




// CatalogsItemsUpdateBatchRequest - Request object to update catalogs items
type CatalogsItemsUpdateBatchRequest struct {

	Country Country `json:"country"`

	Language CatalogsItemsRequestLanguage `json:"language"`

	Operation BatchOperation `json:"operation"`

	// Array with catalogs items
	Items []ItemUpdateBatchRecord `json:"items"`
}

// AssertCatalogsItemsUpdateBatchRequestRequired checks if the required fields are not zero-ed
func AssertCatalogsItemsUpdateBatchRequestRequired(obj CatalogsItemsUpdateBatchRequest) error {
	elements := map[string]interface{}{
		"country": obj.Country,
		"language": obj.Language,
		"operation": obj.Operation,
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
		if err := AssertItemUpdateBatchRecordRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCatalogsItemsUpdateBatchRequestConstraints checks if the values respects the defined constraints
func AssertCatalogsItemsUpdateBatchRequestConstraints(obj CatalogsItemsUpdateBatchRequest) error {
	if err := AssertCatalogsItemsRequestLanguageConstraints(obj.Language); err != nil {
		return err
	}
	for _, el := range obj.Items {
		if err := AssertItemUpdateBatchRecordConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
