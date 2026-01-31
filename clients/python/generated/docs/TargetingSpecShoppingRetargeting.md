# TargetingSpecShoppingRetargeting


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exclusion_window** | **int** | Number of days ago to stop lookback timeframe for dynamic retargeting | [optional] 
**lookback_window** | **int** | Number of days ago to start lookback timeframe for dynamic retargeting | [optional] 
**tag_types** | **List[int]** | Event types to target for dynamic retargeting | [optional] 

## Example

```python
from pinterestsdk.models.targeting_spec_shopping_retargeting import TargetingSpecShoppingRetargeting

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingSpecShoppingRetargeting from a JSON string
targeting_spec_shopping_retargeting_instance = TargetingSpecShoppingRetargeting.from_json(json)
# print the JSON string representation of the object
print(TargetingSpecShoppingRetargeting.to_json())

# convert the object into a dict
targeting_spec_shopping_retargeting_dict = targeting_spec_shopping_retargeting_instance.to_dict()
# create an instance of TargetingSpecShoppingRetargeting from a dict
targeting_spec_shopping_retargeting_from_dict = TargetingSpecShoppingRetargeting.from_dict(targeting_spec_shopping_retargeting_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


