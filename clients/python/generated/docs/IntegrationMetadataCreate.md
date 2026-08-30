# IntegrationMetadataCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_id_1** | **str** |  | [optional] 
**connected_advertiser_id** | **str** |  | [optional] 
**connected_lba_id** | **str** |  | [optional] 
**connected_merchant_id** | **str** |  | [optional] 
**connected_tag_id** | **str** |  | [optional] 
**external_business_id** | **str** | External business ID for the integration. | [optional] 
**partner_access_token** | **str** |  | [optional] 
**partner_access_token_expiry** | **float** |  | [optional] 
**partner_metadata** | **str** |  | [optional] 
**partner_primary_email** | **str** |  | [optional] 
**partner_refresh_token** | **str** |  | [optional] 
**partner_refresh_token_expiry** | **float** |  | [optional] 
**scopes** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.integration_metadata_create import IntegrationMetadataCreate

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationMetadataCreate from a JSON string
integration_metadata_create_instance = IntegrationMetadataCreate.from_json(json)
# print the JSON string representation of the object
print(IntegrationMetadataCreate.to_json())

# convert the object into a dict
integration_metadata_create_dict = integration_metadata_create_instance.to_dict()
# create an instance of IntegrationMetadataCreate from a dict
integration_metadata_create_from_dict = IntegrationMetadataCreate.from_dict(integration_metadata_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


