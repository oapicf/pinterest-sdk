package models

type CatalogsRetailBatchRequestItemsItems struct {

	Attributes ItemAttributesRequest `json:"attributes"`

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id"`

	Operation string `json:"operation"`

	// The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
	UpdateMask *[]UpdateMaskFieldType `json:"update_mask,omitempty"`

	// The millisecond timestamp when the item was lastly modified by the merchant.
	LastUpdatedTime int64 `json:"last_updated_time,omitempty"`
}
