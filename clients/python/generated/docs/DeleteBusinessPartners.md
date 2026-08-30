# DeleteBusinessPartners


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleted_partners** | **List[str]** |  | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.delete_business_partners import DeleteBusinessPartners

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteBusinessPartners from a JSON string
delete_business_partners_instance = DeleteBusinessPartners.from_json(json)
# print the JSON string representation of the object
print(DeleteBusinessPartners.to_json())

# convert the object into a dict
delete_business_partners_dict = delete_business_partners_instance.to_dict()
# create an instance of DeleteBusinessPartners from a dict
delete_business_partners_from_dict = DeleteBusinessPartners.from_dict(delete_business_partners_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


