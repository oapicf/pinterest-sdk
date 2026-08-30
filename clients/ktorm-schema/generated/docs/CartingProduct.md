
# Table `CartingProduct`
(mapped from: CartingProduct)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**cartingProductId** | carting_product_id | text NOT NULL |  | **kotlin.String** | the internal Pinterest carting product id (different from industry product id) | 
**displayPreferredRetailersOnly** | display_preferred_retailers_only | boolean |  | **kotlin.Boolean** | Whether to display only the preferred retailers for the carting product |  [optional]
**displayProductPrice** | display_product_price | boolean |  | **kotlin.Boolean** | Whether to display the price for the carting product |  [optional]
**preferredRetailers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CartingRetailer&gt;**](CartingRetailer.md) | A sorted array of preferred retailers for the carting product |  [optional]
**randomizePreferredRetailers** | randomize_preferred_retailers | boolean |  | **kotlin.Boolean** | Whether to randomize preferred retailers for the carting product |  [optional]





# **Table `CartingProductCartingRetailer`**
(mapped from: CartingProductCartingRetailer)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
cartingProduct | cartingProduct | long | | kotlin.Long | Primary Key | *one*
cartingRetailer | cartingRetailer | long | | kotlin.Long | Foreign Key | *many*




