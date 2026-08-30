# WWW::OpenAPIClient::Object::BoardBase

## Load the model package
```perl
use WWW::OpenAPIClient::Object::BoardBase;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**board_pins_modified_at** | **DATE_TIME** | Date and time of last board pins modified. | [optional] [readonly] 
**collaborator_count** | **int** | Count of collaborators on the board. | [optional] [readonly] 
**created_at** | **DATE_TIME** | Date and time of board creation. | [optional] [readonly] 
**description** | **string** |  | [optional] 
**follower_count** | **int** | Board follower count. | [optional] [readonly] 
**id** | **string** |  | [readonly] 
**is_ads_only** | **boolean** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to false]
**media** | [**BoardMedia**](BoardMedia.md) | Board media. | [optional] [readonly] 
**name** | **string** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**pin_count** | **int** | Count of Pins on the board. | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


