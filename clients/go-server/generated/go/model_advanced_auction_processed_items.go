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




// AdvancedAuctionProcessedItems - Response object containing the results of an operation on an item bid option
type AdvancedAuctionProcessedItems struct {

	// Catalog id pertaining to all items
	CatalogId string `json:"catalog_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Array of advanced auction processed items
	Items []AdvancedAuctionProcessedItem `json:"items,omitempty"`
}

// AssertAdvancedAuctionProcessedItemsRequired checks if the required fields are not zero-ed
func AssertAdvancedAuctionProcessedItemsRequired(obj AdvancedAuctionProcessedItems) error {
	for _, el := range obj.Items {
		if err := AssertAdvancedAuctionProcessedItemRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertAdvancedAuctionProcessedItemsConstraints checks if the values respects the defined constraints
func AssertAdvancedAuctionProcessedItemsConstraints(obj AdvancedAuctionProcessedItems) error {
	for _, el := range obj.Items {
		if err := AssertAdvancedAuctionProcessedItemConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
