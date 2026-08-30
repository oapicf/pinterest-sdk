# CatalogsLocalStoresCreate200ResponseInnerData

Created/updated resource on success or error details on failure

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
**exceptions** | [**PinterestLibError**](PinterestLibError.md) |  | 

## Example

```python
from openapi_client.models.catalogs_local_stores_create200_response_inner_data import CatalogsLocalStoresCreate200ResponseInnerData

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsLocalStoresCreate200ResponseInnerData from a JSON string
catalogs_local_stores_create200_response_inner_data_instance = CatalogsLocalStoresCreate200ResponseInnerData.from_json(json)
# print the JSON string representation of the object
print CatalogsLocalStoresCreate200ResponseInnerData.to_json()

# convert the object into a dict
catalogs_local_stores_create200_response_inner_data_dict = catalogs_local_stores_create200_response_inner_data_instance.to_dict()
# create an instance of CatalogsLocalStoresCreate200ResponseInnerData from a dict
catalogs_local_stores_create200_response_inner_data_from_dict = CatalogsLocalStoresCreate200ResponseInnerData.from_dict(catalogs_local_stores_create200_response_inner_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


