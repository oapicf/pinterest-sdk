# Board
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **board\_pins\_modified\_at** | **Date** | Date and time of last board pins modified. | [optional] [default to null] |
| **collaborator\_count** | **Integer** | Count of collaborators on the board. | [optional] [default to null] |
| **created\_at** | **Date** | Date and time of board creation. | [optional] [default to null] |
| **description** | **String** |  | [optional] [default to null] |
| **follower\_count** | **Integer** | Board follower count. | [optional] [default to null] |
| **id** | **String** |  | [default to null] |
| **is\_ads\_only** | **Boolean** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to false] |
| **media** | [**BoardMedia**](BoardMedia.md) | Board media. | [optional] [default to null] |
| **name** | **String** |      Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | [default to null] |
| **owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [default to null] |
| **pin\_count** | **Integer** | Count of Pins on the board. | [optional] [default to null] |
| **privacy** | [**BoardPrivacy**](BoardPrivacy.md) |     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;.  | [optional] [default to PUBLIC] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

