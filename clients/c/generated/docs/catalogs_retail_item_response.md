# catalogs_retail_item_response_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**item_attributes_t**](item_attributes.md) \* |  | [optional] 
**catalog_type** | **pinterest_rest_api_catalogs_retail_item_response_CATALOGTYPE_e** |  | 
**item_id** | **char \*** | The catalog retail item id in the merchant namespace | [optional] 
**item_response_kind** | **pinterest_rest_api_catalogs_retail_item_response_ITEMRESPONSEKIND_e** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**list_t**](pin.md) \* | The pins mapped to the item | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


