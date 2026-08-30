
# Table `RetailLocalInventoryItemAttributes`
(mapped from: RetailLocalInventoryItemAttributes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**availability** | availability | long NOT NULL |  | [**ItemAvailability**](ItemAvailability.md) | Availability status of the item |  [foreignkey]
**price** | price | text NOT NULL |  | **kotlin.String** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | 
**adLink** | ad_link | text |  | **kotlin.String** | Ad link for the item |  [optional]
**salePrice** | sale_price | text |  | **kotlin.String** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. |  [optional]






