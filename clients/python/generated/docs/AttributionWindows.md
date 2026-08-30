# AttributionWindows


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**click_window_days** | **int** |  | [optional] 
**engagement_window_days** | **int** |  | [optional] 
**view_window_days** | **int** |  | [optional] 

## Example

```python
from pinterestsdk.models.attribution_windows import AttributionWindows

# TODO update the JSON string below
json = "{}"
# create an instance of AttributionWindows from a JSON string
attribution_windows_instance = AttributionWindows.from_json(json)
# print the JSON string representation of the object
print(AttributionWindows.to_json())

# convert the object into a dict
attribution_windows_dict = attribution_windows_instance.to_dict()
# create an instance of AttributionWindows from a dict
attribution_windows_from_dict = AttributionWindows.from_dict(attribution_windows_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


