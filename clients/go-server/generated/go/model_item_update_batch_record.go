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




// ItemUpdateBatchRecord - Object describing an item batch record to update items
type ItemUpdateBatchRecord struct {

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id,omitempty"`

	Attributes UpdatableItemAttributes `json:"attributes,omitempty"`

	// The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
	UpdateMask *[]UpdateMaskFieldType `json:"update_mask,omitempty"`
}

// AssertItemUpdateBatchRecordRequired checks if the required fields are not zero-ed
func AssertItemUpdateBatchRecordRequired(obj ItemUpdateBatchRecord) error {
	if err := AssertUpdatableItemAttributesRequired(obj.Attributes); err != nil {
		return err
	}
	return nil
}

// AssertItemUpdateBatchRecordConstraints checks if the values respects the defined constraints
func AssertItemUpdateBatchRecordConstraints(obj ItemUpdateBatchRecord) error {
	if err := AssertUpdatableItemAttributesConstraints(obj.Attributes); err != nil {
		return err
	}
	return nil
}
