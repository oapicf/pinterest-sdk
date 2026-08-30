# SSIOAccount

Salesforce account details including bill-to information.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billto_infos** | [**List[SSIOAccountItem]**](SSIOAccountItem.md) | An array of Salesforce account information that includes address, io terms, etc. | [optional] 
**can_edit** | **bool** | Advertiser eligible to update order lines | [optional] 
**currency** | **str** |  | [optional] 
**eligible** | **bool** | Advertiser eligible to create order lines | [optional] 
**error** | **str** | Error indicator from Salesforce which could be \&quot;No Error\&quot; | [optional] 
**pmp_names** | [**List[SSIOAccountPMPName]**](SSIOAccountPMPName.md) |  | [optional] 

## Example

```python
from openapi_client.models.ssio_account import SSIOAccount

# TODO update the JSON string below
json = "{}"
# create an instance of SSIOAccount from a JSON string
ssio_account_instance = SSIOAccount.from_json(json)
# print the JSON string representation of the object
print SSIOAccount.to_json()

# convert the object into a dict
ssio_account_dict = ssio_account_instance.to_dict()
# create an instance of SSIOAccount from a dict
ssio_account_from_dict = SSIOAccount.from_dict(ssio_account_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


