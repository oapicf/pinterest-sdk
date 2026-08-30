# DeletePartnerAssetAccessResultsResponseArray


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[DeletePartnerAssetAccessResult]**](DeletePartnerAssetAccessResult.md) | List of terminated partner asset accesses. | [optional] 

## Example

```python
from openapi_client.models.delete_partner_asset_access_results_response_array import DeletePartnerAssetAccessResultsResponseArray

# TODO update the JSON string below
json = "{}"
# create an instance of DeletePartnerAssetAccessResultsResponseArray from a JSON string
delete_partner_asset_access_results_response_array_instance = DeletePartnerAssetAccessResultsResponseArray.from_json(json)
# print the JSON string representation of the object
print DeletePartnerAssetAccessResultsResponseArray.to_json()

# convert the object into a dict
delete_partner_asset_access_results_response_array_dict = delete_partner_asset_access_results_response_array_instance.to_dict()
# create an instance of DeletePartnerAssetAccessResultsResponseArray from a dict
delete_partner_asset_access_results_response_array_from_dict = DeletePartnerAssetAccessResultsResponseArray.from_dict(delete_partner_asset_access_results_response_array_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


