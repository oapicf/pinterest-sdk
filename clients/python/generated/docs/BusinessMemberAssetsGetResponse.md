# BusinessMemberAssetsGetResponse

Paginated response for business member assets with total count metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[AssetIdPermissions]**](AssetIdPermissions.md) |  | 
**total_data_count** | **int** | Total number of assets matching the query | 
**total_data_count_by_status** | [**TotalCountByEntityStatus**](TotalCountByEntityStatus.md) | Breakdown of asset counts by entity status (ad accounts only) | [optional] 

## Example

```python
from pinterestsdk.models.business_member_assets_get_response import BusinessMemberAssetsGetResponse

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessMemberAssetsGetResponse from a JSON string
business_member_assets_get_response_instance = BusinessMemberAssetsGetResponse.from_json(json)
# print the JSON string representation of the object
print(BusinessMemberAssetsGetResponse.to_json())

# convert the object into a dict
business_member_assets_get_response_dict = business_member_assets_get_response_instance.to_dict()
# create an instance of BusinessMemberAssetsGetResponse from a dict
business_member_assets_get_response_from_dict = BusinessMemberAssetsGetResponse.from_dict(business_member_assets_get_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


