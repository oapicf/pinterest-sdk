# LocalStore

Local store entity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address_primary** | **str** | Primary address line of the store. | [optional] 
**address_secondary** | **str** | Secondary address line of the store. | [optional] 
**city** | **str** | City where the store is located. | [optional] 
**country** | [**Country**](Country.md) | Country code where the store is located. | 
**created_at** | **datetime** | Creation timestamp | [readonly] 
**id** | **str** | The ID of the local store. | 
**latitude** | **float** | Geographic latitude coordinate of the store. | [optional] 
**longitude** | **float** | Geographic longitude coordinate of the store. | [optional] 
**name** | **str** | The name of the local store. | 
**postal_code** | **str** | Postal or ZIP code of the store. | [optional] 
**region** | **str** | State or region code where the store is located. | [optional] 
**store_code** | **str** | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. | 
**updated_at** | **datetime** | Last update timestamp | [readonly] 

## Example

```python
from openapi_client.models.local_store import LocalStore

# TODO update the JSON string below
json = "{}"
# create an instance of LocalStore from a JSON string
local_store_instance = LocalStore.from_json(json)
# print the JSON string representation of the object
print LocalStore.to_json()

# convert the object into a dict
local_store_dict = local_store_instance.to_dict()
# create an instance of LocalStore from a dict
local_store_from_dict = LocalStore.from_dict(local_store_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


