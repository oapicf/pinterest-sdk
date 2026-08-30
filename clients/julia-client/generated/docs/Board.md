# Board


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`board_pins_modified_at`** | **`ZonedDateTime`** | Date and time of last board pins modified. | [optional] [readonly] [default to nothing]
**`collaborator_count`** | **`Int64`** | Count of collaborators on the board. | [optional] [readonly] [default to nothing]
**`created_at`** | **`ZonedDateTime`** | Date and time of board creation. | [optional] [readonly] [default to nothing]
**`description`** | **`String`** |  | [optional] [default to nothing]
**`follower_count`** | **`Int64`** | Board follower count. | [optional] [readonly] [default to nothing]
**`id`** | **`String`** |  | [readonly] [default to nothing]
**`is_ads_only`** | **`Bool`** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to false]
**`media`** | [**`*BoardMedia`**](BoardMedia.md) | Board media. | [optional] [readonly] [default to nothing]
**`name`** | **`String`** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | [default to nothing]
**`owner`** | [**`*BoardOwner`**](BoardOwner.md) |  | [optional] [readonly] [default to nothing]
**`pin_count`** | **`Int64`** | Count of Pins on the board. | [optional] [readonly] [default to nothing]
**`privacy`** | [**`*BoardPrivacy`**](BoardPrivacy.md) |     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


