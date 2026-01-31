# BusinessAssetPartnersGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[UserSingleAssetBinding]**](UserSingleAssetBinding.md) | List of partners with permissions to the asset. | 

## Example

```python
from pinterestsdk.models.business_asset_partners_get200_response import BusinessAssetPartnersGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessAssetPartnersGet200Response from a JSON string
business_asset_partners_get200_response_instance = BusinessAssetPartnersGet200Response.from_json(json)
# print the JSON string representation of the object
print(BusinessAssetPartnersGet200Response.to_json())

# convert the object into a dict
business_asset_partners_get200_response_dict = business_asset_partners_get200_response_instance.to_dict()
# create an instance of BusinessAssetPartnersGet200Response from a dict
business_asset_partners_get200_response_from_dict = BusinessAssetPartnersGet200Response.from_dict(business_asset_partners_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


