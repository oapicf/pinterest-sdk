# catalogs_hotel_item_response_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**catalogs_hotel_attributes_t**](catalogs_hotel_attributes.md) \* |  | [optional] 
**catalog_type** | **pinterest_rest_api_catalogs_hotel_item_response_CATALOGTYPE_e** |  | 
**hotel_id** | **char \*** | The catalog hotel id in the merchant namespace | [optional] 
**item_response_kind** | **pinterest_rest_api_catalogs_hotel_item_response_ITEMRESPONSEKIND_e** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**list_t**](pin.md) \* | The pins mapped to the item | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


