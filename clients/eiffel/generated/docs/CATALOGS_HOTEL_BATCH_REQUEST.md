# CATALOGS_HOTEL_BATCH_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**STRING_32**](STRING_32.md) |  | [default to null]
**country** | [**COUNTRY**](Country.md) |  | [default to null]
**language** | [**CATALOGS_ITEMS_REQUEST_LANGUAGE**](CatalogsItemsRequest_language.md) |  | [default to null]
**items** | [**LIST [CATALOGS_HOTEL_BATCH_ITEM]**](CatalogsHotelBatchItem.md) | Array with catalogs item operations | [default to null]
**catalog_id** | [**STRING_32**](STRING_32.md) | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


