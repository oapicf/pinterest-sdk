# openapi::CatalogsItemsFilters


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**item_ids** | **array[character]** |  | [Max. items: 100] [Min. items: 1] 
**catalog_id** | **character** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] [Pattern: ^\\d+$] 
**hotel_ids** | **array[character]** |  | [Max. items: 100] [Min. items: 1] 


