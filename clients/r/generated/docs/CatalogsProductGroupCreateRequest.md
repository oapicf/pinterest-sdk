# openapi::CatalogsProductGroupCreateRequest

Request object for creating a product group.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **character** |  | 
**description** | **character** |  | [optional] 
**is_featured** | **character** | boolean indicator of whether the product group is being featured or not | [optional] [default to FALSE] 
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**feed_id** | **character** | Catalog Feed id pertaining to the catalog product group. | [Pattern: ^\\d+$] 


