# CatalogsLocalStoresDelete200ResponseInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the local store. | 
**status** | [**CampaignAdPreviewDelete200ResponseInnerStatus**](CampaignAdPreviewDelete200ResponseInnerStatus.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_local_stores_delete200_response_inner import CatalogsLocalStoresDelete200ResponseInner

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsLocalStoresDelete200ResponseInner from a JSON string
catalogs_local_stores_delete200_response_inner_instance = CatalogsLocalStoresDelete200ResponseInner.from_json(json)
# print the JSON string representation of the object
print(CatalogsLocalStoresDelete200ResponseInner.to_json())

# convert the object into a dict
catalogs_local_stores_delete200_response_inner_dict = catalogs_local_stores_delete200_response_inner_instance.to_dict()
# create an instance of CatalogsLocalStoresDelete200ResponseInner from a dict
catalogs_local_stores_delete200_response_inner_from_dict = CatalogsLocalStoresDelete200ResponseInner.from_dict(catalogs_local_stores_delete200_response_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


