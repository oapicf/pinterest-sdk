
# Table `LocalInventoryItemsBatchCreate`
(mapped from: LocalInventoryItemsBatchCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**operations** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocalInventoryOperation&gt;**](LocalInventoryOperation.md) | Array of inventory operations. Up to 1000 items per request. | 


# **Table `LocalInventoryItemsBatchCreateLocalInventoryOperation`**
(mapped from: LocalInventoryItemsBatchCreateLocalInventoryOperation)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
localInventoryItemsBatchCreate | localInventoryItemsBatchCreate | long | | kotlin.Long | Primary Key | *one*
localInventoryOperation | localInventoryOperation | long | | kotlin.Long | Foreign Key | *many*



