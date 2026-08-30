# openapi::CartingProduct


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**carting_product_id** | **character** | the internal Pinterest carting product id (different from industry product id) | [Pattern: ^\\d+$] 
**display_preferred_retailers_only** | **character** | Whether to display only the preferred retailers for the carting product | [optional] 
**display_product_price** | **character** | Whether to display the price for the carting product | [optional] 
**preferred_retailers** | [**array[CartingRetailer]**](CartingRetailer.md) | A sorted array of preferred retailers for the carting product | [optional] 
**randomize_preferred_retailers** | **character** | Whether to randomize preferred retailers for the carting product | [optional] 


