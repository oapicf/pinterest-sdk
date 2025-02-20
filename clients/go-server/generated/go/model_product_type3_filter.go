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




type ProductType3Filter struct {

	PRODUCTTYPE3 CatalogsProductGroupMultipleStringListCriteria `json:"PRODUCT_TYPE_3"`
}

// AssertProductType3FilterRequired checks if the required fields are not zero-ed
func AssertProductType3FilterRequired(obj ProductType3Filter) error {
	elements := map[string]interface{}{
		"PRODUCT_TYPE_3": obj.PRODUCTTYPE3,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertProductType3FilterConstraints checks if the values respects the defined constraints
func AssertProductType3FilterConstraints(obj ProductType3Filter) error {
	return nil
}
