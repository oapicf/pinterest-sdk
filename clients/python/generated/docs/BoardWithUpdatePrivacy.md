# BoardWithUpdatePrivacy


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
**name** | **str** |      Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**pin_count** | **int** | Count of Pins on the board. | [optional] [readonly] 
**privacy** | [**BoardUpdatePrivacy**](BoardUpdatePrivacy.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.board_with_update_privacy import BoardWithUpdatePrivacy

# TODO update the JSON string below
json = "{}"
# create an instance of BoardWithUpdatePrivacy from a JSON string
board_with_update_privacy_instance = BoardWithUpdatePrivacy.from_json(json)
# print the JSON string representation of the object
print(BoardWithUpdatePrivacy.to_json())

# convert the object into a dict
board_with_update_privacy_dict = board_with_update_privacy_instance.to_dict()
# create an instance of BoardWithUpdatePrivacy from a dict
board_with_update_privacy_from_dict = BoardWithUpdatePrivacy.from_dict(board_with_update_privacy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


