# openapi::CatalogsRetailProductGroupUpdateRequest

Request object for updating a retail product group.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | [optional] [Enum: [RETAIL]] 
**country** | [**Country**](Country.md) |  | [optional] [Enum: ] 
**description** | **character** |  | [optional] 
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] [Enum: ] 
**name** | **character** |  | [optional] 


