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




type ProductGroupPromotionResponseItem struct {

	Data ProductGroupPromotionResponseElement `json:"data,omitempty"`

	Exceptions *[]Exception `json:"exceptions,omitempty"`
}

// AssertProductGroupPromotionResponseItemRequired checks if the required fields are not zero-ed
func AssertProductGroupPromotionResponseItemRequired(obj ProductGroupPromotionResponseItem) error {
	if err := AssertProductGroupPromotionResponseElementRequired(obj.Data); err != nil {
		return err
	}
	if obj.Exceptions != nil {
		for _, el := range *obj.Exceptions {
			if err := AssertExceptionRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertProductGroupPromotionResponseItemConstraints checks if the values respects the defined constraints
func AssertProductGroupPromotionResponseItemConstraints(obj ProductGroupPromotionResponseItem) error {
	if err := AssertProductGroupPromotionResponseElementConstraints(obj.Data); err != nil {
		return err
	}
    if obj.Exceptions != nil {
     	for _, el := range *obj.Exceptions {
     		if err := AssertExceptionConstraints(el); err != nil {
     			return err
     		}
     	}
    }
	return nil
}
