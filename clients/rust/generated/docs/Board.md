# Board

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**String**> |  | [optional][readonly]
**created_at** | Option<**String**> | Date and time of board creation. | [optional][readonly]
**board_pins_modified_at** | Option<**String**> | Date and time of last board pins modified. | [optional][readonly]
**name** | **String** |  | 
**description** | Option<**String**> |  | [optional]
**collaborator_count** | Option<**i32**> | Count of collaborators on the board. | [optional][readonly]
**pin_count** | Option<**i32**> | Count of pins on the board. | [optional][readonly]
**follower_count** | Option<**i32**> | Board follower count. | [optional][readonly]
**media** | Option<[**models::BoardMedia**](Board_media.md)> |  | [optional]
**owner** | Option<[**models::BoardOwner**](BoardOwner.md)> |  | [optional][readonly]
**privacy** | Option<**String**> | Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a> | [optional][default to Public]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


