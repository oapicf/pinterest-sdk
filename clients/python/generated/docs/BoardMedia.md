# BoardMedia


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image_cover_url** | **str** | Board cover image | [optional] 
**pin_thumbnail_urls** | **List[str]** | Board pin thumbnail urls. | [optional] 

## Example

```python
from pinterestsdk.models.board_media import BoardMedia

# TODO update the JSON string below
json = "{}"
# create an instance of BoardMedia from a JSON string
board_media_instance = BoardMedia.from_json(json)
# print the JSON string representation of the object
print(BoardMedia.to_json())

# convert the object into a dict
board_media_dict = board_media_instance.to_dict()
# create an instance of BoardMedia from a dict
board_media_from_dict = BoardMedia.from_dict(board_media_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


