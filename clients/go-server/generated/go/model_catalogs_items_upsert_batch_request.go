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




// CatalogsItemsUpsertBatchRequest - Request object to upsert catalogs items
type CatalogsItemsUpsertBatchRequest struct {

	Country Country `json:"country"`

	Language Language `json:"language"`

	Operation BatchOperation `json:"operation"`

	// Array with catalogs items
	Items []ItemUpsertBatchRecord `json:"items"`
}

// AssertCatalogsItemsUpsertBatchRequestRequired checks if the required fields are not zero-ed
func AssertCatalogsItemsUpsertBatchRequestRequired(obj CatalogsItemsUpsertBatchRequest) error {
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

	for _, el := range obj.Items {
		if err := AssertItemUpsertBatchRecordRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCatalogsItemsUpsertBatchRequestConstraints checks if the values respects the defined constraints
func AssertCatalogsItemsUpsertBatchRequestConstraints(obj CatalogsItemsUpsertBatchRequest) error {
	return nil
}