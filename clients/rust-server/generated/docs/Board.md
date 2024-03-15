# Board

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [optional] [readonly] [default to None]
**created_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Date and time of board creation. | [optional] [readonly] [default to None]
**board_pins_modified_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Date and time of last board pins modified. | [optional] [readonly] [default to None]
**name** | **String** |  | 
**description** | **String** |  | [optional] [default to None]
**collaborator_count** | **u32** | Count of collaborators on the board. | [optional] [readonly] [default to None]
**pin_count** | **u32** | Count of pins on the board. | [optional] [readonly] [default to None]
**follower_count** | **u32** | Board follower count. | [optional] [readonly] [default to None]
**media** | [***models::BoardMedia**](Board_media.md) |  | [optional] [default to None]
**owner** | [***models::BoardOwner**](Board_owner.md) |  | [optional] [default to None]
**privacy** | **String** | Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a> | [optional] [default to Some("PUBLIC".to_string())]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


