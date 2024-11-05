# openapi::CatalogsItemsPostFilters


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**item_ids** | **array[character]** |  | [Max. items: 1000] [Min. items: 1] 
**catalog_id** | **character** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] [Pattern: ^\\d+$] 
**hotel_ids** | **array[character]** |  | [Max. items: 1000] [Min. items: 1] 
**creative_assets_ids** | **array[character]** |  | [Max. items: 1000] [Min. items: 1] 


