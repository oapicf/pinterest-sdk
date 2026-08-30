# SSIOAccountPMPName

Pinterest marketing partner name.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Salesforce id for PMP | [optional] 
**name** | **str** | Display name | [optional] 

## Example

```python
from pinterestsdk.models.ssio_account_pmp_name import SSIOAccountPMPName

# TODO update the JSON string below
json = "{}"
# create an instance of SSIOAccountPMPName from a JSON string
ssio_account_pmp_name_instance = SSIOAccountPMPName.from_json(json)
# print the JSON string representation of the object
print(SSIOAccountPMPName.to_json())

# convert the object into a dict
ssio_account_pmp_name_dict = ssio_account_pmp_name_instance.to_dict()
# create an instance of SSIOAccountPMPName from a dict
ssio_account_pmp_name_from_dict = SSIOAccountPMPName.from_dict(ssio_account_pmp_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


