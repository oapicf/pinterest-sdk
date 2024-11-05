# BOARD

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) |  | [optional] [readonly] [default to null]
**created_at** | [**DATE_TIME**](DATE_TIME.md) | Date and time of board creation. | [optional] [readonly] [default to null]
**board_pins_modified_at** | [**DATE_TIME**](DATE_TIME.md) | Date and time of last board pins modified. | [optional] [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) |  | [default to null]
**description** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**collaborator_count** | **INTEGER_32** | Count of collaborators on the board. | [optional] [readonly] [default to null]
**pin_count** | **INTEGER_32** | Count of pins on the board. | [optional] [readonly] [default to null]
**follower_count** | **INTEGER_32** | Board follower count. | [optional] [readonly] [default to null]
**media** | [**BOARD_MEDIA**](Board_media.md) |  | [optional] [default to null]
**owner** | [**BOARD_OWNER**](BoardOwner.md) |  | [optional] [readonly] [default to null]
**privacy** | [**STRING_32**](STRING_32.md) | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; | [optional] [default to PUBLIC]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


