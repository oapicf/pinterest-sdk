# ITEM_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CATALOGS_TYPE**](CatalogsType.md) |  | [default to null]
**item_id** | [**STRING_32**](STRING_32.md) | The catalog item id in the merchant namespace | [optional] [default to null]
**pins** | [**LIST [PIN]**](Pin.md) | The pins mapped to the item | [optional] [default to null]
**attributes** | [**CATALOGS_CREATIVE_ASSETS_ATTRIBUTES**](CatalogsCreativeAssetsAttributes.md) |  | [optional] [default to null]
**hotel_id** | [**STRING_32**](STRING_32.md) | The catalog hotel id in the merchant namespace | [optional] [default to null]
**creative_assets_id** | [**STRING_32**](STRING_32.md) | The catalog creative assets id in the merchant namespace | [optional] [default to null]
**errors** | [**LIST [ITEM_VALIDATION_EVENT]**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


