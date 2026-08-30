# BoardWithUpdatePrivacyUpdate

Resource create or update operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**name** | **str** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | [optional] 
**privacy** | [**BoardUpdatePrivacy**](BoardUpdatePrivacy.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.board_with_update_privacy_update import BoardWithUpdatePrivacyUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of BoardWithUpdatePrivacyUpdate from a JSON string
board_with_update_privacy_update_instance = BoardWithUpdatePrivacyUpdate.from_json(json)
# print the JSON string representation of the object
print(BoardWithUpdatePrivacyUpdate.to_json())

# convert the object into a dict
board_with_update_privacy_update_dict = board_with_update_privacy_update_instance.to_dict()
# create an instance of BoardWithUpdatePrivacyUpdate from a dict
board_with_update_privacy_update_from_dict = BoardWithUpdatePrivacyUpdate.from_dict(board_with_update_privacy_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


