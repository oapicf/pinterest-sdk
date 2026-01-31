# openapi::CatalogsItemsFilters


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**catalog_id** | **character** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] [Pattern: ^\\d+$] 
**item_ids** | **array[character]** |  | [Max. items: 100] [Min. items: 1] 
**hotel_ids** | **array[character]** |  | [Max. items: 100] [Min. items: 1] 
**creative_assets_ids** | **array[character]** |  | [Max. items: 100] [Min. items: 1] 


