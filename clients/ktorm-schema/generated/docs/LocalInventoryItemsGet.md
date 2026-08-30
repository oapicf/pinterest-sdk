
# Table `LocalInventoryItemsGet`
(mapped from: LocalInventoryItemsGet)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocalInventoryItemResponse&gt;**](LocalInventoryItemResponse.md) | Array of local inventory items |  [readonly]


# **Table `LocalInventoryItemsGetLocalInventoryItemResponse`**
(mapped from: LocalInventoryItemsGetLocalInventoryItemResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
localInventoryItemsGet | localInventoryItemsGet | long | | kotlin.Long | Primary Key | *one*
localInventoryItemResponse | localInventoryItemResponse | long | | kotlin.Long | Foreign Key | *many*



