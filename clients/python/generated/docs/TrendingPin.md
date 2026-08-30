# TrendingPin

Pin image data for trending topics

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**color** | **str** | Dominant color of the pin image in hex format | 
**height** | **int** | Height of the pin image in pixels | 
**id** | **str** | Unique identifier for the pin | 
**src** | **str** | URL of the pin image | 
**vertical_offset** | **float** | The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom. | [optional] 
**width** | **int** | Width of the pin image in pixels | 

## Example

```python
from pinterestsdk.models.trending_pin import TrendingPin

# TODO update the JSON string below
json = "{}"
# create an instance of TrendingPin from a JSON string
trending_pin_instance = TrendingPin.from_json(json)
# print the JSON string representation of the object
print(TrendingPin.to_json())

# convert the object into a dict
trending_pin_dict = trending_pin_instance.to_dict()
# create an instance of TrendingPin from a dict
trending_pin_from_dict = TrendingPin.from_dict(trending_pin_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


