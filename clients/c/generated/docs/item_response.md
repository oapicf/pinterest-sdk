# item_response_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**catalogs_creative_assets_attributes_t**](catalogs_creative_assets_attributes.md) \* |  | [optional] 
**catalog_type** | **pinterest_rest_api_item_response_CATALOGTYPE_e** |  | 
**item_id** | **char \*** | The catalog item id in the merchant namespace | [optional] 
**item_response_kind** | **pinterest_rest_api_item_response_ITEMRESPONSEKIND_e** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**list_t**](pin.md) \* | The pins mapped to the item | [optional] 
**hotel_id** | **char \*** | The catalog hotel id in the merchant namespace | [optional] 
**creative_assets_id** | **char \*** | The catalog creative assets id in the merchant namespace | [optional] 
**errors** | [**list_t**](item_validation_event.md) \* | Array with the errors for the item id requested | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


