/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.3.0
 * Contact: pinterest-api@pinterest.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// CatalogsProductGroupType : Catalog product group type
type CatalogsProductGroupType string

// List of CatalogsProductGroupType
const (
	MERCHANT_CREATED CatalogsProductGroupType = "MERCHANT_CREATED"
	ALL_PRODUCTS CatalogsProductGroupType = "ALL_PRODUCTS"
	BEST_DEALS CatalogsProductGroupType = "BEST_DEALS"
	PINNER_FAVORITES CatalogsProductGroupType = "PINNER_FAVORITES"
	TOP_SELLERS CatalogsProductGroupType = "TOP_SELLERS"
	BACK_IN_STOCK CatalogsProductGroupType = "BACK_IN_STOCK"
	NEW_ARRIVALS CatalogsProductGroupType = "NEW_ARRIVALS"
)

// AssertCatalogsProductGroupTypeRequired checks if the required fields are not zero-ed
func AssertCatalogsProductGroupTypeRequired(obj CatalogsProductGroupType) error {
	return nil
}

// AssertRecurseCatalogsProductGroupTypeRequired recursively checks if required fields are not zero-ed in a nested slice.
// Accepts only nested slice of CatalogsProductGroupType (e.g. [][]CatalogsProductGroupType), otherwise ErrTypeAssertionError is thrown.
func AssertRecurseCatalogsProductGroupTypeRequired(objSlice interface{}) error {
	return AssertRecurseInterfaceRequired(objSlice, func(obj interface{}) error {
		aCatalogsProductGroupType, ok := obj.(CatalogsProductGroupType)
		if !ok {
			return ErrTypeAssertionError
		}
		return AssertCatalogsProductGroupTypeRequired(aCatalogsProductGroupType)
	})
}