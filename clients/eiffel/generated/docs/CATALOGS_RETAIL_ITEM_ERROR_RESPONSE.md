# CATALOGS_RETAIL_ITEM_ERROR_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**STRING_32**](STRING_32.md) |  | [default to null]
**errors** | [**LIST [ITEM_VALIDATION_EVENT]**](ItemValidationEvent.md) | Array with the errors for the item id requested | [default to null]
**item_id** | [**STRING_32**](STRING_32.md) | The catalog item id in the merchant namespace | [optional] [default to null]
**item_response_kind** | [**STRING_32**](STRING_32.md) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


