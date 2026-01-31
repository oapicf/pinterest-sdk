# UpdatePartnerAssetsResultsResponseArray


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[UpdatePartnerAssetsResult]**](UpdatePartnerAssetsResult.md) | List of assigned/updated partner asset access. | [optional] 

## Example

```python
from pinterestsdk.models.update_partner_assets_results_response_array import UpdatePartnerAssetsResultsResponseArray

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePartnerAssetsResultsResponseArray from a JSON string
update_partner_assets_results_response_array_instance = UpdatePartnerAssetsResultsResponseArray.from_json(json)
# print the JSON string representation of the object
print(UpdatePartnerAssetsResultsResponseArray.to_json())

# convert the object into a dict
update_partner_assets_results_response_array_dict = update_partner_assets_results_response_array_instance.to_dict()
# create an instance of UpdatePartnerAssetsResultsResponseArray from a dict
update_partner_assets_results_response_array_from_dict = UpdatePartnerAssetsResultsResponseArray.from_dict(update_partner_assets_results_response_array_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


