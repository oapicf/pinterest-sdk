# SSIOAccountAddress

Salesforce address information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address_id** | **str** | Salesforce id for address | [optional] 
**display** | **str** | Address display | [optional] 
**order_legal_entity** | **str** | Legal entity for this insertion order | [optional] 
**purpose** | **str** | Purpose for which the address is used, usually Billing or Businness | [optional] 

## Example

```python
from pinterestsdk.models.ssio_account_address import SSIOAccountAddress

# TODO update the JSON string below
json = "{}"
# create an instance of SSIOAccountAddress from a JSON string
ssio_account_address_instance = SSIOAccountAddress.from_json(json)
# print the JSON string representation of the object
print(SSIOAccountAddress.to_json())

# convert the object into a dict
ssio_account_address_dict = ssio_account_address_instance.to_dict()
# create an instance of SSIOAccountAddress from a dict
ssio_account_address_from_dict = SSIOAccountAddress.from_dict(ssio_account_address_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


