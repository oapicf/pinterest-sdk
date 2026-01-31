# CarouselSlot


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Carousel Pin slot description. | [optional] 
**link** | **str** | Carousel Pin slot link. | [optional] 
**title** | **str** | Carousel Pin slot title. | [optional] 

## Example

```python
from pinterestsdk.models.carousel_slot import CarouselSlot

# TODO update the JSON string below
json = "{}"
# create an instance of CarouselSlot from a JSON string
carousel_slot_instance = CarouselSlot.from_json(json)
# print the JSON string representation of the object
print(CarouselSlot.to_json())

# convert the object into a dict
carousel_slot_dict = carousel_slot_instance.to_dict()
# create an instance of CarouselSlot from a dict
carousel_slot_from_dict = CarouselSlot.from_dict(carousel_slot_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


