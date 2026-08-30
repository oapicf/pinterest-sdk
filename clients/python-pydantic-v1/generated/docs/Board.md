# Board


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**board_pins_modified_at** | **datetime** | Date and time of last board pins modified. | [optional] [readonly] 
**collaborator_count** | **int** | Count of collaborators on the board. | [optional] [readonly] 
**created_at** | **datetime** | Date and time of board creation. | [optional] [readonly] 
**description** | **str** |  | [optional] 
**follower_count** | **int** | Board follower count. | [optional] [readonly] 
**id** | **str** |  | [readonly] 
**is_ads_only** | **bool** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to False]
**media** | [**BoardMedia**](BoardMedia.md) | Board media. | [optional] [readonly] 
**name** | **str** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**pin_count** | **int** | Count of Pins on the board. | [optional] [readonly] 
**privacy** | [**BoardPrivacy**](BoardPrivacy.md) |     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;.  | [optional] 

## Example

```python
from openapi_client.models.board import Board

# TODO update the JSON string below
json = "{}"
# create an instance of Board from a JSON string
board_instance = Board.from_json(json)
# print the JSON string representation of the object
print Board.to_json()

# convert the object into a dict
board_dict = board_instance.to_dict()
# create an instance of Board from a dict
board_from_dict = Board.from_dict(board_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


