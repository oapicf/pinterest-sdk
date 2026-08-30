package models

// LocalInventoryItemsGetCreate - Resource create operation model.
type LocalInventoryItemsGetCreate struct {

	// Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
	ItemFilters []ItemIdStoreCodePair `json:"item_filters"`
}
