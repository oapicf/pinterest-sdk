# openapi::CatalogsRetailItemErrorResponse

Object describing a retail item error

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [RETAIL]] 
**errors** | [**array[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**item_id** | **character** | The catalog item id in the merchant namespace | [optional] 
**item_response_kind** | **character** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | [Enum: [retail_item_error]] 


