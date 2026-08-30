
# Table `LocalInventoryItemResponse`
(mapped from: LocalInventoryItemResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**createdAt** | created_at | long NOT NULL |  | **kotlin.Long** | The millisecond timestamp when the local inventory item was created | 
**itemId** | item_id | text NOT NULL |  | **kotlin.String** | The catalog item id in the merchant namespace | 
**lastUpdatedTime** | last_updated_time | long NOT NULL |  | **kotlin.Long** | The millisecond timestamp when the local inventory item was lastly modified by the merchant. | 
**storeMetadata** | store_metadata | long NOT NULL |  | [**StoreMetadata**](StoreMetadata.md) | Store metadata for this local inventory item |  [foreignkey]
**adLink** | ad_link | text |  | **kotlin.String** | Ad link for the item |  [optional]
**availability** | availability | long |  | [**ItemAvailability**](ItemAvailability.md) | Availability status of the item |  [optional] [foreignkey]
**price** | price | text |  | **kotlin.String** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. |  [optional]
**salePrice** | sale_price | text |  | **kotlin.String** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. |  [optional]










