# Board

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**board_pins_modified_at** | Option<**chrono::DateTime<chrono::FixedOffset>**> | Date and time of last board pins modified. | [optional][readonly]
**collaborator_count** | Option<**i32**> | Count of collaborators on the board. | [optional][readonly]
**created_at** | Option<**chrono::DateTime<chrono::FixedOffset>**> | Date and time of board creation. | [optional][readonly]
**description** | Option<**String**> |  | [optional]
**follower_count** | Option<**i32**> | Board follower count. | [optional][readonly]
**id** | **String** |  | [readonly]
**is_ads_only** | Option<**bool**> | If set to `true`, the board will be ad-only and can store ad-only Pins. | [optional][default to false]
**media** | Option<[**models::BoardMedia**](BoardMedia.md)> | Board media. | [optional][readonly]
**name** | **String** |     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". | 
**owner** | Option<[**models::BoardOwner**](BoardOwner.md)> |  | [optional][readonly]
**pin_count** | Option<**i32**> | Count of Pins on the board. | [optional][readonly]
**privacy** | Option<[**models::BoardPrivacy**](BoardPrivacy.md)> |     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`.  | [optional][default to Public]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


