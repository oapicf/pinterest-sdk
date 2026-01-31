# SingleInterestTargetingOptionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**child_interests** | **List[str]** |  | [optional] 
**id** | **str** |  | [optional] 
**level** | **int** |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.single_interest_targeting_option_response import SingleInterestTargetingOptionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SingleInterestTargetingOptionResponse from a JSON string
single_interest_targeting_option_response_instance = SingleInterestTargetingOptionResponse.from_json(json)
# print the JSON string representation of the object
print(SingleInterestTargetingOptionResponse.to_json())

# convert the object into a dict
single_interest_targeting_option_response_dict = single_interest_targeting_option_response_instance.to_dict()
# create an instance of SingleInterestTargetingOptionResponse from a dict
single_interest_targeting_option_response_from_dict = SingleInterestTargetingOptionResponse.from_dict(single_interest_targeting_option_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


