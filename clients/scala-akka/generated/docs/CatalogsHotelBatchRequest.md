

# CatalogsHotelBatchRequest

Request object to update catalogs hotel items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogType**](#CatalogType) |  | 
**country** | **Country** |  | 
**language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  | 
**items** | [**Seq&lt;CatalogsHotelBatchItem&gt;**](CatalogsHotelBatchItem.md) | Array with catalogs item operations | 
**catalogId** | **String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog |  [optional]


## Enum: CatalogType
Allowed values: [HOTEL]




