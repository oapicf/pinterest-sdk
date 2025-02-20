package models

// ItemUpdateBatchRecord - Object describing an item batch record to update items
type ItemUpdateBatchRecord struct {

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id,omitempty"`

	Attributes UpdatableItemAttributes `json:"attributes,omitempty"`

	// The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
	UpdateMask *[]UpdateMaskFieldType `json:"update_mask,omitempty"`
}
