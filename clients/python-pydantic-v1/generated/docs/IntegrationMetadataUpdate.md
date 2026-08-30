# IntegrationMetadataUpdate

Resource create or update operation model.

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
from openapi_client.models.integration_metadata_update import IntegrationMetadataUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationMetadataUpdate from a JSON string
integration_metadata_update_instance = IntegrationMetadataUpdate.from_json(json)
# print the JSON string representation of the object
print IntegrationMetadataUpdate.to_json()

# convert the object into a dict
integration_metadata_update_dict = integration_metadata_update_instance.to_dict()
# create an instance of IntegrationMetadataUpdate from a dict
integration_metadata_update_from_dict = IntegrationMetadataUpdate.from_dict(integration_metadata_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


