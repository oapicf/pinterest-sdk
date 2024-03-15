# CatalogProductGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**String**> | ID of the catalog product group. | [optional]
**merchant_id** | Option<**String**> | Merchant ID pertaining to the owner of the catalog product group. | [optional]
**name** | Option<**String**> | Name of catalog product group | [optional]
**filters** | Option<[**serde_json::Value**](.md)> | Object holding a list of filters | [optional]
**filter_v2** | Option<[**serde_json::Value**](.md)> | Object holding a list of filters | [optional]
**r#type** | Option<[**models::Board**](Board.md)> |  | [optional]
**status** | Option<[**models::EntityStatus**](EntityStatus.md)> |  | [optional]
**feed_profile_id** | Option<**String**> | id of the feed profile belonging to this catalog product group | [optional]
**created_at** | Option<**i32**> | Unix timestamp in seconds of when catalog product group was created. | [optional]
**last_update** | Option<**i32**> | Unix timestamp in seconds of last time catalog product group was updated. | [optional]
**product_count** | Option<**i32**> | Amount of products in the catalog product group | [optional]
**featured_position** | Option<**i32**> | index of the featured position of the catalog product group | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


