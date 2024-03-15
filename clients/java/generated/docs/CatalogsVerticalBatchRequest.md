

# CatalogsVerticalBatchRequest

A request object that can have multiple operations on a single batch

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogType** | **CatalogsType** |  |  |
|**country** | **Country** |  |  |
|**language** | **Language** |  |  |
|**items** | [**List&lt;CatalogsHotelBatchItem&gt;**](CatalogsHotelBatchItem.md) | Array with catalogs item operations |  |
|**catalogId** | **String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog |  [optional] |



