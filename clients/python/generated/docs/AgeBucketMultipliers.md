# AgeBucketMultipliers

This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age_bucket** | [**TargetingSpecAgeBucket**](TargetingSpecAgeBucket.md) | Age bucket identifier. | [optional] 

## Example

```python
from pinterestsdk.models.age_bucket_multipliers import AgeBucketMultipliers

# TODO update the JSON string below
json = "{}"
# create an instance of AgeBucketMultipliers from a JSON string
age_bucket_multipliers_instance = AgeBucketMultipliers.from_json(json)
# print the JSON string representation of the object
print(AgeBucketMultipliers.to_json())

# convert the object into a dict
age_bucket_multipliers_dict = age_bucket_multipliers_instance.to_dict()
# create an instance of AgeBucketMultipliers from a dict
age_bucket_multipliers_from_dict = AgeBucketMultipliers.from_dict(age_bucket_multipliers_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


