# CatalogProductGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the catalog product group. | [optional] [default to None]
**merchant_id** | **String** | Merchant ID pertaining to the owner of the catalog product group. | [optional] [default to None]
**name** | **String** | Name of catalog product group | [optional] [default to None]
**filters** | [***serde_json::Value**](.md) | Object holding a list of filters | [optional] [default to None]
**filter_v2** | [***serde_json::Value**](.md) | Object holding a list of filters | [optional] [default to None]
**r#type** | [***models::Board**](Board.md) |  | [optional] [default to None]
**status** | [***models::EntityStatus**](EntityStatus.md) |  | [optional] [default to None]
**feed_profile_id** | **String** | id of the feed profile belonging to this catalog product group | [optional] [default to None]
**created_at** | **i32** | Unix timestamp in seconds of when catalog product group was created. | [optional] [default to None]
**last_update** | **i32** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] [default to None]
**product_count** | **i32** | Amount of products in the catalog product group | [optional] [default to None]
**featured_position** | **i32** | index of the featured position of the catalog product group | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


