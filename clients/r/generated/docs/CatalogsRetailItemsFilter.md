# openapi::CatalogsRetailItemsFilter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [RETAIL]] 
**item_ids** | **array[character]** |  | [Max. items: 100] [Min. items: 1] 
**catalog_id** | **character** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog | [optional] [Pattern: ^\\d+$] 


