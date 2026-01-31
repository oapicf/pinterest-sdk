# # Board

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**board_pins_modified_at** | **\DateTime** | Date and time of last board pins modified. | [optional] [readonly]
**collaborator_count** | **int** | Count of collaborators on the board. | [optional] [readonly]
**created_at** | **\DateTime** | Date and time of board creation. | [optional] [readonly]
**description** | **string** |  | [optional]
**follower_count** | **int** | Board follower count. | [optional] [readonly]
**id** | **string** |  | [readonly]
**is_ads_only** | **bool** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to false]
**media** | [**\OpenAPI\Client\Model\BoardMedia**](BoardMedia.md) | Board media. | [optional] [readonly]
**name** | **string** | Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. |
**owner** | [**\OpenAPI\Client\Model\BoardOwner**](BoardOwner.md) |  | [optional] [readonly]
**pin_count** | **int** | Count of Pins on the board. | [optional] [readonly]
**privacy** | [**\OpenAPI\Client\Model\BoardPrivacy**](BoardPrivacy.md) | Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
