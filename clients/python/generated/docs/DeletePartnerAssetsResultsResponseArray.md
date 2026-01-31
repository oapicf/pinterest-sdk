# DeletePartnerAssetsResultsResponseArray


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[DeletePartnerAssetsResult]**](DeletePartnerAssetsResult.md) | List of terminated asset access. | [optional] 

## Example

```python
from pinterestsdk.models.delete_partner_assets_results_response_array import DeletePartnerAssetsResultsResponseArray

# TODO update the JSON string below
json = "{}"
# create an instance of DeletePartnerAssetsResultsResponseArray from a JSON string
delete_partner_assets_results_response_array_instance = DeletePartnerAssetsResultsResponseArray.from_json(json)
# print the JSON string representation of the object
print(DeletePartnerAssetsResultsResponseArray.to_json())

# convert the object into a dict
delete_partner_assets_results_response_array_dict = delete_partner_assets_results_response_array_instance.to_dict()
# create an instance of DeletePartnerAssetsResultsResponseArray from a dict
delete_partner_assets_results_response_array_from_dict = DeletePartnerAssetsResultsResponseArray.from_dict(delete_partner_assets_results_response_array_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


