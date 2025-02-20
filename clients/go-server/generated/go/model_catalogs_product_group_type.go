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


import (
	"fmt"
)


// CatalogsProductGroupType : <p>Catalog product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_PRODUCTS: Consists of every product in your latest successful feed upload. <br>BEST_DEALS: Consists of products with the deepest drop in price. <br>PINNER_FAVORITES: Consists of products that are resonating most with people on Pinterest, based on engagement. <br>TOP_SELLERS: Consists of products with the highest conversion rate, if you have the conversion tag installed. <br>BACK_IN_STOCK: Consists of products that were previously out of stock and are now in stock. <br>NEW_ARRIVALS: Consists of products that are new to your Catalog. <br>SHOPIFY_COLLECTION: Product groups created based on Shopify Product Collections. <br>I2PC: Product groups created based on predicted product category.</p>
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
	SHOPIFY_COLLECTIONS CatalogsProductGroupType = "SHOPIFY_COLLECTIONS"
	I2_PC CatalogsProductGroupType = "I2PC"
)

// AllowedCatalogsProductGroupTypeEnumValues is all the allowed values of CatalogsProductGroupType enum
var AllowedCatalogsProductGroupTypeEnumValues = []CatalogsProductGroupType{
	"MERCHANT_CREATED",
	"ALL_PRODUCTS",
	"BEST_DEALS",
	"PINNER_FAVORITES",
	"TOP_SELLERS",
	"BACK_IN_STOCK",
	"NEW_ARRIVALS",
	"SHOPIFY_COLLECTIONS",
	"I2PC",
}

// validCatalogsProductGroupTypeEnumValue provides a map of CatalogsProductGroupTypes for fast verification of use input
var validCatalogsProductGroupTypeEnumValues = map[CatalogsProductGroupType]struct{}{
	"MERCHANT_CREATED": {},
	"ALL_PRODUCTS": {},
	"BEST_DEALS": {},
	"PINNER_FAVORITES": {},
	"TOP_SELLERS": {},
	"BACK_IN_STOCK": {},
	"NEW_ARRIVALS": {},
	"SHOPIFY_COLLECTIONS": {},
	"I2PC": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v CatalogsProductGroupType) IsValid() bool {
	_, ok := validCatalogsProductGroupTypeEnumValues[v]
	return ok
}

// NewCatalogsProductGroupTypeFromValue returns a pointer to a valid CatalogsProductGroupType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewCatalogsProductGroupTypeFromValue(v string) (CatalogsProductGroupType, error) {
	ev := CatalogsProductGroupType(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for CatalogsProductGroupType: valid values are %v", v, AllowedCatalogsProductGroupTypeEnumValues)
}



// AssertCatalogsProductGroupTypeRequired checks if the required fields are not zero-ed
func AssertCatalogsProductGroupTypeRequired(obj CatalogsProductGroupType) error {
	return nil
}

// AssertCatalogsProductGroupTypeConstraints checks if the values respects the defined constraints
func AssertCatalogsProductGroupTypeConstraints(obj CatalogsProductGroupType) error {
	return nil
}
