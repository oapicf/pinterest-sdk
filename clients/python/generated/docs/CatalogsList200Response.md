# CatalogsList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[Catalog]**](Catalog.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_list200_response import CatalogsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsList200Response from a JSON string
catalogs_list200_response_instance = CatalogsList200Response.from_json(json)
# print the JSON string representation of the object
print(CatalogsList200Response.to_json())

# convert the object into a dict
catalogs_list200_response_dict = catalogs_list200_response_instance.to_dict()
# create an instance of CatalogsList200Response from a dict
catalogs_list200_response_from_dict = CatalogsList200Response.from_dict(catalogs_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


