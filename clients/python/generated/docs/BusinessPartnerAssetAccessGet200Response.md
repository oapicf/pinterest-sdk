# BusinessPartnerAssetAccessGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[GetPartnerAssetsResponse]**](GetPartnerAssetsResponse.md) | List assets on which you granted access to your partner or assets on which your partner has granted you access. | 

## Example

```python
from pinterestsdk.models.business_partner_asset_access_get200_response import BusinessPartnerAssetAccessGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessPartnerAssetAccessGet200Response from a JSON string
business_partner_asset_access_get200_response_instance = BusinessPartnerAssetAccessGet200Response.from_json(json)
# print the JSON string representation of the object
print(BusinessPartnerAssetAccessGet200Response.to_json())

# convert the object into a dict
business_partner_asset_access_get200_response_dict = business_partner_asset_access_get200_response_instance.to_dict()
# create an instance of BusinessPartnerAssetAccessGet200Response from a dict
business_partner_asset_access_get200_response_from_dict = BusinessPartnerAssetAccessGet200Response.from_dict(business_partner_asset_access_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


