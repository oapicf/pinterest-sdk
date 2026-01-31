# SSIOAccountItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | [**List[SSIOAccountAddress]**](SSIOAccountAddress.md) | Address information that is associated with this account. | [optional] 
**id** | **str** | Salesforce id for billto_info | [optional] 
**io_terms** | **str** | Salesforce text for IO Terms and Conditions | [optional] 
**io_terms_id** | **str** | Salesforce id for IO Terms and Conditions | [optional] 
**io_type** | **str** | Insertion Order Type - Pinterest Paper or Agency Paper | [optional] 
**row_terms** | **str** | Salesforce text for Rest of the World Terms and Conditions | [optional] 
**row_terms_id** | **str** | Salesforce id for Rest of the World Terms and Conditions | [optional] 
**us_terms** | **str** | Salesforce text for US Terms and Conditions | [optional] 
**us_terms_id** | **str** | Salesforce id for US Terms and Conditions | [optional] 

## Example

```python
from pinterestsdk.models.ssio_account_item import SSIOAccountItem

# TODO update the JSON string below
json = "{}"
# create an instance of SSIOAccountItem from a JSON string
ssio_account_item_instance = SSIOAccountItem.from_json(json)
# print the JSON string representation of the object
print(SSIOAccountItem.to_json())

# convert the object into a dict
ssio_account_item_dict = ssio_account_item_instance.to_dict()
# create an instance of SSIOAccountItem from a dict
ssio_account_item_from_dict = SSIOAccountItem.from_dict(ssio_account_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


