# LocalStoreCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address_primary** | **str** | Primary address line of the store. | [optional] 
**address_secondary** | **str** | Secondary address line of the store. | [optional] 
**city** | **str** | City where the store is located. | [optional] 
**country** | [**Country**](Country.md) | Country code where the store is located. | 
**latitude** | **float** | Geographic latitude coordinate of the store. | [optional] 
**longitude** | **float** | Geographic longitude coordinate of the store. | [optional] 
**name** | **str** | The name of the local store. | 
**postal_code** | **str** | Postal or ZIP code of the store. | [optional] 
**region** | **str** | State or region code where the store is located. | [optional] 
**store_code** | **str** | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. | 

## Example

```python
from pinterestsdk.models.local_store_create import LocalStoreCreate

# TODO update the JSON string below
json = "{}"
# create an instance of LocalStoreCreate from a JSON string
local_store_create_instance = LocalStoreCreate.from_json(json)
# print the JSON string representation of the object
print(LocalStoreCreate.to_json())

# convert the object into a dict
local_store_create_dict = local_store_create_instance.to_dict()
# create an instance of LocalStoreCreate from a dict
local_store_create_from_dict = LocalStoreCreate.from_dict(local_store_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


