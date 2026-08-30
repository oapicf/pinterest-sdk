# TargetingSpecOperationLocale


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **str** |  | 
**operation** | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  | 
**values** | **List[str]** |  | 

## Example

```python
from openapi_client.models.targeting_spec_operation_locale import TargetingSpecOperationLocale

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingSpecOperationLocale from a JSON string
targeting_spec_operation_locale_instance = TargetingSpecOperationLocale.from_json(json)
# print the JSON string representation of the object
print TargetingSpecOperationLocale.to_json()

# convert the object into a dict
targeting_spec_operation_locale_dict = targeting_spec_operation_locale_instance.to_dict()
# create an instance of TargetingSpecOperationLocale from a dict
targeting_spec_operation_locale_from_dict = TargetingSpecOperationLocale.from_dict(targeting_spec_operation_locale_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


