# LocalStoreBatchUpdate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address_primary** | **str** | Primary address line of the store. | [optional] 
**address_secondary** | **str** | Secondary address line of the store. | [optional] 
**city** | **str** | City where the store is located. | [optional] 
**country** | [**Country**](Country.md) | Country code where the store is located. | [optional] 
**id** | **str** | The ID of the local store. | 
**latitude** | **float** | Geographic latitude coordinate of the store. | [optional] 
**longitude** | **float** | Geographic longitude coordinate of the store. | [optional] 
**name** | **str** | The name of the local store. | [optional] 
**postal_code** | **str** | Postal or ZIP code of the store. | [optional] 
**region** | **str** | State or region code where the store is located. | [optional] 
**store_code** | **str** | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. | [optional] 

## Example

```python
from openapi_client.models.local_store_batch_update import LocalStoreBatchUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of LocalStoreBatchUpdate from a JSON string
local_store_batch_update_instance = LocalStoreBatchUpdate.from_json(json)
# print the JSON string representation of the object
print LocalStoreBatchUpdate.to_json()

# convert the object into a dict
local_store_batch_update_dict = local_store_batch_update_instance.to_dict()
# create an instance of LocalStoreBatchUpdate from a dict
local_store_batch_update_from_dict = LocalStoreBatchUpdate.from_dict(local_store_batch_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


