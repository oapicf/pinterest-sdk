# IntegrationRequestPatch

Schema used for updating the integration metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_id_1** | **str** |  | [optional] 
**connected_advertiser_id** | **str** |  | [optional] 
**connected_lba_id** | **str** |  | [optional] 
**connected_merchant_id** | **str** |  | [optional] 
**connected_tag_id** | **str** |  | [optional] 
**partner_access_token** | **str** |  | [optional] 
**partner_access_token_expiry** | **float** |  | [optional] 
**partner_metadata** | **str** |  | [optional] 
**partner_primary_email** | **str** |  | [optional] 
**partner_refresh_token** | **str** |  | [optional] 
**partner_refresh_token_expiry** | **float** |  | [optional] 
**scopes** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.integration_request_patch import IntegrationRequestPatch

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationRequestPatch from a JSON string
integration_request_patch_instance = IntegrationRequestPatch.from_json(json)
# print the JSON string representation of the object
print(IntegrationRequestPatch.to_json())

# convert the object into a dict
integration_request_patch_dict = integration_request_patch_instance.to_dict()
# create an instance of IntegrationRequestPatch from a dict
integration_request_patch_from_dict = IntegrationRequestPatch.from_dict(integration_request_patch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


