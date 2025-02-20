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




// CatalogsUpdateHotelItem - Object describing an hotel item batch record
type CatalogsUpdateHotelItem struct {

	// The catalog hotel item id in the merchant namespace
	HotelId string `json:"hotel_id"`

	Operation string `json:"operation"`

	Attributes CatalogsUpdatableHotelAttributes `json:"attributes"`
}

// AssertCatalogsUpdateHotelItemRequired checks if the required fields are not zero-ed
func AssertCatalogsUpdateHotelItemRequired(obj CatalogsUpdateHotelItem) error {
	elements := map[string]interface{}{
		"hotel_id": obj.HotelId,
		"operation": obj.Operation,
		"attributes": obj.Attributes,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertCatalogsUpdatableHotelAttributesRequired(obj.Attributes); err != nil {
		return err
	}
	return nil
}

// AssertCatalogsUpdateHotelItemConstraints checks if the values respects the defined constraints
func AssertCatalogsUpdateHotelItemConstraints(obj CatalogsUpdateHotelItem) error {
	if err := AssertCatalogsUpdatableHotelAttributesConstraints(obj.Attributes); err != nil {
		return err
	}
	return nil
}
