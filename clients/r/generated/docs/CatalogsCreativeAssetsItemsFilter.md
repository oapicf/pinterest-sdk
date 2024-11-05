# openapi::CatalogsCreativeAssetsItemsFilter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**creative_assets_ids** | **array[character]** |  | [Max. items: 100] [Min. items: 1] 
**catalog_id** | **character** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] [Pattern: ^\\d+$] 


