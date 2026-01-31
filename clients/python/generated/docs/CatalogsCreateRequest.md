# CatalogsCreateRequest

Request object for creating a catalog.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**name** | **str** | A human-friendly name associated to a given catalog. | 

## Example

```python
from pinterestsdk.models.catalogs_create_request import CatalogsCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreateRequest from a JSON string
catalogs_create_request_instance = CatalogsCreateRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsCreateRequest.to_json())

# convert the object into a dict
catalogs_create_request_dict = catalogs_create_request_instance.to_dict()
# create an instance of CatalogsCreateRequest from a dict
catalogs_create_request_from_dict = CatalogsCreateRequest.from_dict(catalogs_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


