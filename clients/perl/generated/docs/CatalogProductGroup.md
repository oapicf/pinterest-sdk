# WWW::OpenAPIClient::Object::CatalogProductGroup

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CatalogProductGroup;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | ID of the catalog product group. | [optional] 
**merchant_id** | **string** | Merchant ID pertaining to the owner of the catalog product group. | [optional] 
**name** | **string** | Name of catalog product group | [optional] 
**filters** | **object** | Object holding a list of filters | [optional] 
**filter_v2** | **object** | Object holding a list of filters | [optional] 
**type** | [**Board**](Board.md) |  | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**feed_profile_id** | **string** | id of the feed profile belonging to this catalog product group | [optional] 
**created_at** | **int** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**last_update** | **int** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**product_count** | **int** | Amount of products in the catalog product group | [optional] 
**featured_position** | **int** | index of the featured position of the catalog product group | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


