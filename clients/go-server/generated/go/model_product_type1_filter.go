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




type ProductType1Filter struct {

	PRODUCTTYPE1 CatalogsProductGroupMultipleStringListCriteria `json:"PRODUCT_TYPE_1"`
}

// AssertProductType1FilterRequired checks if the required fields are not zero-ed
func AssertProductType1FilterRequired(obj ProductType1Filter) error {
	elements := map[string]interface{}{
		"PRODUCT_TYPE_1": obj.PRODUCTTYPE1,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertProductType1FilterConstraints checks if the values respects the defined constraints
func AssertProductType1FilterConstraints(obj ProductType1Filter) error {
	return nil
}