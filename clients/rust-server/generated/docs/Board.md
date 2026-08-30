# Board

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**board_pins_modified_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Date and time of last board pins modified. | [optional] [readonly] [default to None]
**collaborator_count** | **u32** | Count of collaborators on the board. | [optional] [readonly] [default to None]
**created_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Date and time of board creation. | [optional] [readonly] [default to None]
**description** | **swagger::Nullable<String>** |  | [optional] [default to None]
**follower_count** | **u32** | Board follower count. | [optional] [readonly] [default to None]
**id** | **String** |  | [readonly] 
**is_ads_only** | **bool** | If set to `true`, the board will be ad-only and can store ad-only Pins. | [optional] [default to Some(false)]
**media** | [***models::BoardMedia**](BoardMedia.md) | Board media. | [optional] [readonly] [default to None]
**name** | **String** |     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". | 
**owner** | [***models::BoardOwner**](BoardOwner.md) |  | [optional] [readonly] [default to None]
**pin_count** | **u32** | Count of Pins on the board. | [optional] [readonly] [default to None]
**privacy** | [***models::BoardPrivacy**](BoardPrivacy.md) |     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


