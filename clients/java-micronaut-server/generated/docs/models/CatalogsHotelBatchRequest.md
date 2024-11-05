

# CatalogsHotelBatchRequest

Request object to update catalogs hotel items

The class is defined in **[CatalogsHotelBatchRequest.java](../../src/main/java/org/openapitools/model/CatalogsHotelBatchRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**country** | `Country` |  | 
**language** | [`CatalogsItemsRequestLanguage`](CatalogsItemsRequestLanguage.md) |  | 
**items** | [`List&lt;CatalogsHotelBatchItem&gt;`](CatalogsHotelBatchItem.md) | Array with catalogs item operations | 
**catalogId** | `String` | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog |  [optional property]

## CatalogTypeEnum

Name | Value
---- | -----
HOTEL | `"HOTEL"`






