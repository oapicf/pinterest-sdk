# openapi::CatalogProductGroup

non-promoted catalog product group entity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | ID of the catalog product group. | [optional] 
**merchant_id** | **character** | Merchant ID pertaining to the owner of the catalog product group. | [optional] [Pattern: ^\\d+$] 
**name** | **character** | Name of catalog product group | [optional] 
**filters** | **object** | Object holding a list of filters | [optional] 
**filter_v2** | **object** | Object holding a list of filters | [optional] 
**type** | [**Board**](Board.md) |  | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [Enum: ] 
**feed_profile_id** | **character** | id of the feed profile belonging to this catalog product group | [optional] [Pattern: ^\\d+$] 
**created_at** | **integer** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**last_update** | **integer** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**product_count** | **integer** | Amount of products in the catalog product group | [optional] 
**featured_position** | **integer** | index of the featured position of the catalog product group | [optional] 


