# DeleteBusinessPartnersDelete


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**partner_ids** | **List[str]** | A list of partner ids to be deleted | 
**partner_type** | [**NullablePartnerType**](NullablePartnerType.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.delete_business_partners_delete import DeleteBusinessPartnersDelete

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteBusinessPartnersDelete from a JSON string
delete_business_partners_delete_instance = DeleteBusinessPartnersDelete.from_json(json)
# print the JSON string representation of the object
print(DeleteBusinessPartnersDelete.to_json())

# convert the object into a dict
delete_business_partners_delete_dict = delete_business_partners_delete_instance.to_dict()
# create an instance of DeleteBusinessPartnersDelete from a dict
delete_business_partners_delete_from_dict = DeleteBusinessPartnersDelete.from_dict(delete_business_partners_delete_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


