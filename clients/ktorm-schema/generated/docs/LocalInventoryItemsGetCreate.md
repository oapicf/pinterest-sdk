
# Table `LocalInventoryItemsGetCreate`
(mapped from: LocalInventoryItemsGetCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**itemFilters** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemIdStoreCodePair&gt;**](ItemIdStoreCodePair.md) | Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items. | 


# **Table `LocalInventoryItemsGetCreateItemIdStoreCodePair`**
(mapped from: LocalInventoryItemsGetCreateItemIdStoreCodePair)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
localInventoryItemsGetCreate | localInventoryItemsGetCreate | long | | kotlin.Long | Primary Key | *one*
itemIdStoreCodePair | itemIdStoreCodePair | long | | kotlin.Long | Foreign Key | *many*



