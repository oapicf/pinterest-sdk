# board_base_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**board_pins_modified_at** | **char \*** | Date and time of last board pins modified. | [optional] [readonly] 
**collaborator_count** | **int** | Count of collaborators on the board. | [optional] [readonly] 
**created_at** | **char \*** | Date and time of board creation. | [optional] [readonly] 
**description** | **char \*** |  | [optional] 
**follower_count** | **int** | Board follower count. | [optional] [readonly] 
**id** | **char \*** |  | [readonly] 
**is_ads_only** | **int** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to false]
**media** | [**board_media_t**](board_media.md) \* | Board media. | [optional] [readonly] 
**name** | **char \*** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**owner** | [**board_owner_t**](board_owner.md) \* |  | [optional] [readonly] 
**pin_count** | **int** | Count of Pins on the board. | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


