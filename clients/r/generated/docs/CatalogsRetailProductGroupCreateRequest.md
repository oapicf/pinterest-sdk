# openapi::CatalogsRetailProductGroupCreateRequest

Request object for creating a product group.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | [Enum: [RETAIL]] 
**name** | **character** |  | 
**description** | **character** |  | [optional] 
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**catalog_id** | **character** | Catalog id pertaining to the retail product group. | [Pattern: ^\\d+$] 
**country** | [**Country**](Country.md) |  | [Enum: ] 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [Enum: ] 


