# BoardCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**is_ads_only** | **bool** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to False]
**name** | **str** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**privacy** | [**BoardPrivacy**](BoardPrivacy.md) |     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;.  | [optional] 

## Example

```python
from pinterestsdk.models.board_create import BoardCreate

# TODO update the JSON string below
json = "{}"
# create an instance of BoardCreate from a JSON string
board_create_instance = BoardCreate.from_json(json)
# print the JSON string representation of the object
print(BoardCreate.to_json())

# convert the object into a dict
board_create_dict = board_create_instance.to_dict()
# create an instance of BoardCreate from a dict
board_create_from_dict = BoardCreate.from_dict(board_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


