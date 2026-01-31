# BOARD_WITH_UPDATE_PRIVACY

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**board_pins_modified_at** | [**DATE_TIME**](DATE_TIME.md) | Date and time of last board pins modified. | [optional] [readonly] [default to null]
**collaborator_count** | **INTEGER_32** | Count of collaborators on the board. | [optional] [readonly] [default to null]
**created_at** | [**DATE_TIME**](DATE_TIME.md) | Date and time of board creation. | [optional] [readonly] [default to null]
**description** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**follower_count** | **INTEGER_32** | Board follower count. | [optional] [readonly] [default to null]
**id** | [**STRING_32**](STRING_32.md) |  | [readonly] [default to null]
**is_ads_only** | **BOOLEAN** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to false]
**media** | [**BOARD_MEDIA**](BoardMedia.md) | Board media. | [optional] [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) |      Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | [default to null]
**owner** | [**BOARD_OWNER**](BoardOwner.md) |  | [optional] [readonly] [default to null]
**pin_count** | **INTEGER_32** | Count of Pins on the board. | [optional] [readonly] [default to null]
**privacy** | [**BOARD_UPDATE_PRIVACY**](BoardUpdatePrivacy.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


